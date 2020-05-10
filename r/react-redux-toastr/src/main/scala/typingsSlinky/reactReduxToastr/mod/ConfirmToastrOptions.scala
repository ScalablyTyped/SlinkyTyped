package typingsSlinky.reactReduxToastr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfirmToastrOptions extends js.Object {
  var disableCancel: js.UndefOr[Boolean] = js.native
  var onCancel: js.UndefOr[js.Function0[Unit]] = js.native
  var onOk: js.UndefOr[js.Function0[Unit]] = js.native
}

object ConfirmToastrOptions {
  @scala.inline
  def apply(): ConfirmToastrOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfirmToastrOptions]
  }
  @scala.inline
  implicit class ConfirmToastrOptionsOps[Self <: ConfirmToastrOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisableCancel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableCancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableCancel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCancel(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCancel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCancel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOk(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOk")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnOk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOk")(js.undefined)
        ret
    }
  }
  
}

