package typingsSlinky.ky.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hooks extends js.Object {
  /**
  	This hook enables you to read and optionally modify the response. The hook function receives normalized input, options, and a clone of the response as arguments. The return value of the hook function will be used by Ky as the response object if it's an instance of [`Response`](https://developer.mozilla.org/en-US/docs/Web/API/Response).
  	@default []
  	@example
  	```
  	import ky from 'ky';
  	(async () => {
  		await ky('https://example.com', {
  			hooks: {
  				afterResponse: [
  					(_input, _options, response) => {
  						// You could do something with the response, for example, logging.
  						log(response);
  						// Or return a `Response` instance to overwrite the response.
  						return new Response('A different response', {status: 200});
  					},
  					// Or retry with a fresh token on a 403 error
  					async (input, options, response) => {
  						if (response.status === 403) {
  							// Get a fresh token
  							const token = await ky('https://example.com/token').text();
  							// Retry with the token
  							options.headers.set('Authorization', `token ${token}`);
  							return ky(input, options);
  						}
  					}
  				]
  			}
  		});
  	})();
  	```
  	*/
  var afterResponse: js.UndefOr[js.Array[AfterResponseHook]] = js.native
  /**
  	This hook enables you to modify the request right before it is sent. Ky will make no further changes to the request after this. The hook function receives normalized input and options as arguments. You could, for example, modify `options.headers` here.
  	A [`Response`](https://developer.mozilla.org/en-US/docs/Web/API/Response) can be returned from this hook to completely avoid making a HTTP request. This can be used to mock a request, check an internal cache, etc. An **important** consideration when returning a `Response` from this hook is that all the following hooks will be skipped, so **ensure you only return a `Response` from the last hook**.
  	@default []
  	*/
  var beforeRequest: js.UndefOr[js.Array[BeforeRequestHook]] = js.native
  /**
  	This hook enables you to modify the request right before retry. Ky will make no further changes to the request after this. The hook function receives the normalized input and options, an error instance and the retry count as arguments. You could, for example, modify `options.headers` here.
  	@example
  	```
  	import ky from 'ky';
  	(async () => {
  		await ky('https://example.com', {
  			hooks: {
  				beforeRetry: [
  					async (input, options, errors, retryCount) => {
  						const token = await ky('https://example.com/refresh-token');
  						options.headers.set('Authorization', `token ${token}`);
  					}
  				]
  			}
  		});
  	})();
  	```
  	@default []
  	*/
  var beforeRetry: js.UndefOr[js.Array[BeforeRetryHook]] = js.native
}

object Hooks {
  @scala.inline
  def apply(): Hooks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hooks]
  }
  @scala.inline
  implicit class HooksOps[Self <: Hooks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterResponse(value: js.Array[AfterResponseHook]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeRequest(value: js.Array[BeforeRequestHook]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeforeRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeRetry(value: js.Array[BeforeRetryHook]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRetry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeforeRetry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRetry")(js.undefined)
        ret
    }
  }
  
}

