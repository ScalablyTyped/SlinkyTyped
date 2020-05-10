package typingsSlinky.angularResource.mod.angularAugmentingMod.resource

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IResourceInterceptor extends js.Object {
  var response: js.UndefOr[js.Function1[/* response */ IResourceResponse, _]] = js.native
  var responseError: js.UndefOr[js.Function1[/* rejection */ js.Any, _]] = js.native
}

object IResourceInterceptor {
  @scala.inline
  def apply(): IResourceInterceptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IResourceInterceptor]
  }
  @scala.inline
  implicit class IResourceInterceptorOps[Self <: IResourceInterceptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResponse(value: /* response */ IResourceResponse => _): Self = {
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
    def withResponseError(value: /* rejection */ js.Any => _): Self = {
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

