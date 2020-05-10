package typingsSlinky.ky.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.experimental.URL
import typingsSlinky.ky.kyBooleans.`false`
import typingsSlinky.ky.kyStrings.delete
import typingsSlinky.ky.kyStrings.get
import typingsSlinky.ky.kyStrings.head
import typingsSlinky.ky.kyStrings.patch
import typingsSlinky.ky.kyStrings.post
import typingsSlinky.ky.kyStrings.put
import typingsSlinky.std.RequestInit
import typingsSlinky.std.URLSearchParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends RequestInit {
  /**
  	Hooks allow modifications during the request lifecycle. Hook functions may be async and are run serially.
  	*/
  var hooks: js.UndefOr[Hooks] = js.native
  /**
  	Shortcut for sending JSON. Use this instead of the `body` option.
  	Accepts a plain object which will be `JSON.stringify()`'d and the correct header will be set for you.
  	*/
  var json: js.UndefOr[js.Any] = js.native
  /**
  	HTTP method used to make the request.
  	Internally, the standard methods (`GET`, `POST`, `PUT`, `PATCH`, `HEAD` and `DELETE`) are uppercased in order to avoid server errors due to case sensitivity.
  	*/
  @JSName("method")
  var method_Options: js.UndefOr[LiteralUnion[get | post | put | delete | patch | head, String]] = js.native
  /**
  	Download progress event handler.
  	@param chunk - Note: It's empty for the first call.
  	@example
  	```
  	import ky from 'ky';
  	(async () => {
  		await ky('https://example.com', {
  			onDownloadProgress: (progress, chunk) => {
  				// Example output:
  				// `0% - 0 of 1271 bytes`
  				// `100% - 1271 of 1271 bytes`
  				console.log(`${progress.percent * 100}% - ${progress.transferredBytes} of ${progress.totalBytes} bytes`);
  			}
  		});
  	})();
  	```
  	*/
  var onDownloadProgress: js.UndefOr[
    js.Function2[/* progress */ DownloadProgress, /* chunk */ js.typedarray.Uint8Array, Unit]
  ] = js.native
  /**
  	A prefix to prepend to the `input` URL when making the request. It can be any valid URL, either relative or absolute. A trailing slash `/` is optional and will be added automatically, if needed, when it is joined with `input`. Only takes effect when `input` is a string. The `input` argument cannot start with a slash `/` when using this option.
  	Useful when used with [`ky.extend()`](#kyextenddefaultoptions) to create niche-specific Ky-instances.
  	Notes:
  	 - After `prefixUrl` and `input` are joined, the result is resolved against the [base URL](https://developer.mozilla.org/en-US/docs/Web/API/Node/baseURI) of the page (if any).
  	 - Leading slashes in `input` are disallowed when using this option to enforce consistency and avoid confusion about how the `input` URL is handled, given that `input` will not follow the normal URL resolution rules when `prefixUrl` is being used, which changes the meaning of a leading slash.
  	@example
  	```
  	import ky from 'ky';
  	// On https://example.com
  	(async () => {
  		await ky('unicorn', {prefixUrl: '/api'});
  		//=> 'https://example.com/api/unicorn'
  		await ky('unicorn', {prefixUrl: 'https://cats.com'});
  		//=> 'https://cats.com/unicorn'
  	})();
  	```
  	*/
  var prefixUrl: js.UndefOr[URL | String] = js.native
  /**
  	An object representing `limit`, `methods`, `statusCodes` and `maxRetryAfter` fields for maximum retry count, allowed methods, allowed status codes and maximum [`Retry-After`](https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Retry-After) time.
  	If `retry` is a number, it will be used as `limit` and other defaults will remain in place.
  	If `maxRetryAfter` is set to `undefined`, it will use `options.timeout`. If [`Retry-After`](https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Retry-After) header is greater than `maxRetryAfter`, it will cancel the request.
  	Delays between retries is calculated with the function `0.3 * (2 ** (retry - 1)) * 1000`, where `retry` is the attempt number (starts from 1).
  	@example
  	```
  	import ky from 'ky';
  	(async () => {
  		const parsed = await ky('https://example.com', {
  			retry: {
  				limit: 10,
  				methods: ['get'],
  				statusCodes: [413]
  			}
  		}).json();
  	})();
  	```
  	*/
  var retry: js.UndefOr[RetryOptions | Double] = js.native
  /**
  	Search parameters to include in the request URL. Setting this will override all existing search parameters in the input URL.
  	Accepts any value supported by [`URLSearchParams()`](https://developer.mozilla.org/en-US/docs/Web/API/URLSearchParams/URLSearchParams).
  	*/
  var searchParams: js.UndefOr[
    String | (StringDictionary[String | Double | Boolean]) | (js.Array[js.Array[String | Double | Boolean]]) | URLSearchParams
  ] = js.native
  /**
  	Throw a `HTTPError` for error responses (non-2xx status codes).
  	Setting this to `false` may be useful if you are checking for resource availability and are expecting error responses.
  	@default true
  	*/
  var throwHttpErrors: js.UndefOr[Boolean] = js.native
  /**
  	Timeout in milliseconds for getting a response. Can not be greater than 2147483647.
  	If set to `false`, there will be no timeout.
  	@default 10000
  	*/
  var timeout: js.UndefOr[Double | `false`] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHooks(value: Hooks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHooks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hooks")(js.undefined)
        ret
    }
    @scala.inline
    def withJson(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJson: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json")(js.undefined)
        ret
    }
    @scala.inline
    def withMethod(value: LiteralUnion[get | post | put | delete | patch | head, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDownloadProgress(value: (/* progress */ DownloadProgress, /* chunk */ js.typedarray.Uint8Array) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDownloadProgress")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnDownloadProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDownloadProgress")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefixUrlURL(value: URL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefixUrl(value: URL | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefixUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withRetry(value: RetryOptions | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchParams(
      value: String | (StringDictionary[String | Double | Boolean]) | (js.Array[js.Array[String | Double | Boolean]]) | URLSearchParams
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchParams")(js.undefined)
        ret
    }
    @scala.inline
    def withThrowHttpErrors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throwHttpErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThrowHttpErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throwHttpErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
  }
  
}

