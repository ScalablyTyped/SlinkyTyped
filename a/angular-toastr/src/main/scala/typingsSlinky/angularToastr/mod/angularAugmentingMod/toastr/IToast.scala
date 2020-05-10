package typingsSlinky.angularToastr.mod.angularAugmentingMod.toastr

import typingsSlinky.angular.mod.IAugmentedJQuery
import typingsSlinky.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IToast extends js.Object {
  var el: IAugmentedJQuery = js.native
  var iconClass: String = js.native
  var isOpened: Boolean = js.native
  var open: IPromise[_] = js.native
  var scope: IToastScope = js.native
  var toastId: Double = js.native
}

object IToast {
  @scala.inline
  def apply(
    el: IAugmentedJQuery,
    iconClass: String,
    isOpened: Boolean,
    open: IPromise[_],
    scope: IToastScope,
    toastId: Double
  ): IToast = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any], iconClass = iconClass.asInstanceOf[js.Any], isOpened = isOpened.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], toastId = toastId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IToast]
  }
  @scala.inline
  implicit class IToastOps[Self <: IToast] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEl(value: IAugmentedJQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("el")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIconClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsOpened(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpened")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpen(value: IPromise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScope(value: IToastScope): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToastId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toastId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

