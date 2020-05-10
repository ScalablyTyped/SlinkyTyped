package typingsSlinky.reactReduxToastr.mod

import typingsSlinky.reactReduxToastr.AnonId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToastrState extends js.Object {
  var confirm: js.UndefOr[AnonId] = js.native
  var toastrs: js.Array[Toastr_] = js.native
}

object ToastrState {
  @scala.inline
  def apply(toastrs: js.Array[Toastr_]): ToastrState = {
    val __obj = js.Dynamic.literal(toastrs = toastrs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastrState]
  }
  @scala.inline
  implicit class ToastrStateOps[Self <: ToastrState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withToastrs(value: js.Array[Toastr_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toastrs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfirm(value: AnonId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfirm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirm")(js.undefined)
        ret
    }
  }
  
}

