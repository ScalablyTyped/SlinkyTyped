package typingsSlinky.antd

import typingsSlinky.antd.confirmMod.ModalFunc
import typingsSlinky.antd.modalModalMod.ModalFuncProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Omit<antd.antd/lib/modal/confirm.ModalStaticFunctions, 'warn'> */
@js.native
trait OmitModalStaticFunctionsw extends js.Object {
  var confirm: ModalFunc = js.native
  var error: ModalFunc = js.native
  var info: ModalFunc = js.native
  var success: ModalFunc = js.native
  var warning: ModalFunc = js.native
}

object OmitModalStaticFunctionsw {
  @scala.inline
  def apply(
    confirm: /* props */ ModalFuncProps => AnonDestroy,
    error: /* props */ ModalFuncProps => AnonDestroy,
    info: /* props */ ModalFuncProps => AnonDestroy,
    success: /* props */ ModalFuncProps => AnonDestroy,
    warning: /* props */ ModalFuncProps => AnonDestroy
  ): OmitModalStaticFunctionsw = {
    val __obj = js.Dynamic.literal(confirm = js.Any.fromFunction1(confirm), error = js.Any.fromFunction1(error), info = js.Any.fromFunction1(info), success = js.Any.fromFunction1(success), warning = js.Any.fromFunction1(warning))
    __obj.asInstanceOf[OmitModalStaticFunctionsw]
  }
  @scala.inline
  implicit class OmitModalStaticFunctionswOps[Self <: OmitModalStaticFunctionsw] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfirm(value: /* props */ ModalFuncProps => AnonDestroy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirm")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withError(value: /* props */ ModalFuncProps => AnonDestroy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInfo(value: /* props */ ModalFuncProps => AnonDestroy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSuccess(value: /* props */ ModalFuncProps => AnonDestroy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWarning(value: /* props */ ModalFuncProps => AnonDestroy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

