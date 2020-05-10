package typingsSlinky.moxios.mod

import typingsSlinky.axios.mod.AxiosRequestConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends js.Object {
  var config: AxiosRequestConfig = js.native
  var headers: js.Any = js.native
  var responseType: String = js.native
  var timeout: Double = js.native
  var url: String = js.native
  var withCredentials: Boolean = js.native
  /**
    * Respond to this request with a specified result
    *
    * @param res The data representing the result of the request
    * @return A Promise that resolves once the response is ready
    */
  def respondWith(res: Item): js.Promise[Response] = js.native
  /**
    * Respond to this request with a timeout result
    *
    * @return A Promise that rejects with a timeout result
    */
  def respondWithTimeout(): js.Promise[Response] = js.native
}

object Request {
  @scala.inline
  def apply(
    config: AxiosRequestConfig,
    headers: js.Any,
    respondWith: Item => js.Promise[Response],
    respondWithTimeout: () => js.Promise[Response],
    responseType: String,
    timeout: Double,
    url: String,
    withCredentials: Boolean
  ): Request = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], respondWith = js.Any.fromFunction1(respondWith), respondWithTimeout = js.Any.fromFunction0(respondWithTimeout), responseType = responseType.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], withCredentials = withCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
  @scala.inline
  implicit class RequestOps[Self <: Request] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfig(value: AxiosRequestConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaders(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRespondWith(value: Item => js.Promise[Response]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("respondWith")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRespondWithTimeout(value: () => js.Promise[Response]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("respondWithTimeout")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withResponseType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWithCredentials(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withCredentials")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

