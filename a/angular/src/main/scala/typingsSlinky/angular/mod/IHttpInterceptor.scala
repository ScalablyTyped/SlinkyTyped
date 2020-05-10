package typingsSlinky.angular.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHttpInterceptor extends js.Object {
  var request: js.UndefOr[
    js.Function1[/* config */ IRequestConfig, IRequestConfig | IPromise[IRequestConfig]]
  ] = js.native
  var requestError: js.UndefOr[js.Function1[/* rejection */ js.Any, IRequestConfig | IPromise[IRequestConfig]]] = js.native
  var response: js.UndefOr[
    js.Function1[/* response */ IHttpResponse[_], IPromise[IHttpResponse[_]] | IHttpResponse[_]]
  ] = js.native
  var responseError: js.UndefOr[
    js.Function1[/* rejection */ js.Any, IPromise[IHttpResponse[_]] | IHttpResponse[_]]
  ] = js.native
}

object IHttpInterceptor {
  @scala.inline
  def apply(): IHttpInterceptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHttpInterceptor]
  }
  @scala.inline
  implicit class IHttpInterceptorOps[Self <: IHttpInterceptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequest(value: /* config */ IRequestConfig => IRequestConfig | IPromise[IRequestConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestError(value: /* rejection */ js.Any => IRequestConfig | IPromise[IRequestConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRequestError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestError")(js.undefined)
        ret
    }
    @scala.inline
    def withResponse(value: /* response */ IHttpResponse[_] => IPromise[IHttpResponse[_]] | IHttpResponse[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseError(value: /* rejection */ js.Any => IPromise[IHttpResponse[_]] | IHttpResponse[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutResponseError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseError")(js.undefined)
        ret
    }
  }
  
}

