package typingsSlinky.antd.actionButtonMod

import typingsSlinky.antd.buttonButtonMod.ButtonType
import typingsSlinky.antd.buttonButtonMod.NativeButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionButtonProps extends js.Object {
  var actionFn: js.UndefOr[js.Function1[/* repeated */ js.Any, _ | js.Thenable[_]]] = js.native
  var autoFocus: js.UndefOr[Boolean] = js.native
  var buttonProps: js.UndefOr[NativeButtonProps] = js.native
  var closeModal: js.Function = js.native
  var `type`: js.UndefOr[ButtonType] = js.native
}

object ActionButtonProps {
  @scala.inline
  def apply(closeModal: js.Function): ActionButtonProps = {
    val __obj = js.Dynamic.literal(closeModal = closeModal.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionButtonProps]
  }
  @scala.inline
  implicit class ActionButtonPropsOps[Self <: ActionButtonProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloseModal(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeModal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActionFn(value: /* repeated */ js.Any => _ | js.Thenable[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionFn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutActionFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionFn")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonProps(value: NativeButtonProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonProps")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: ButtonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

