package typingsSlinky.ngTable.interceptorMod

import typingsSlinky.ngTable.ngTableParamsMod.NgTableParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IInterceptor[T] extends js.Object {
  var response: js.UndefOr[js.Function2[/* data */ js.Any, /* params */ NgTableParams[T], _]] = js.native
  var responseError: js.UndefOr[js.Function2[/* reason */ js.Any, /* params */ NgTableParams[T], _]] = js.native
}

object IInterceptor {
  @scala.inline
  def apply[T](): IInterceptor[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInterceptor[T]]
  }
  @scala.inline
  implicit class IInterceptorOps[Self[t] <: IInterceptor[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withResponse(value: (/* data */ js.Any, /* params */ NgTableParams[T]) => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutResponse: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseError(value: (/* reason */ js.Any, /* params */ NgTableParams[T]) => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseError")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutResponseError: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseError")(js.undefined)
        ret
    }
  }
  
}

