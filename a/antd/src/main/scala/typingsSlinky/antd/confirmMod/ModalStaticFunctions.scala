package typingsSlinky.antd.confirmMod

import typingsSlinky.antd.anon.Destroy
import typingsSlinky.antd.modalModalMod.ModalFuncProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModalStaticFunctions extends js.Object {
  var confirm: ModalFunc = js.native
  var error: ModalFunc = js.native
  var info: ModalFunc = js.native
  var success: ModalFunc = js.native
  var warn: ModalFunc = js.native
  var warning: ModalFunc = js.native
}

object ModalStaticFunctions {
  @scala.inline
  def apply(
    confirm: /* props */ ModalFuncProps => Destroy,
    error: /* props */ ModalFuncProps => Destroy,
    info: /* props */ ModalFuncProps => Destroy,
    success: /* props */ ModalFuncProps => Destroy,
    warn: /* props */ ModalFuncProps => Destroy,
    warning: /* props */ ModalFuncProps => Destroy
  ): ModalStaticFunctions = {
    val __obj = js.Dynamic.literal(confirm = js.Any.fromFunction1(confirm), error = js.Any.fromFunction1(error), info = js.Any.fromFunction1(info), success = js.Any.fromFunction1(success), warn = js.Any.fromFunction1(warn), warning = js.Any.fromFunction1(warning))
    __obj.asInstanceOf[ModalStaticFunctions]
  }
  @scala.inline
  implicit class ModalStaticFunctionsOps[Self <: ModalStaticFunctions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfirm(value: /* props */ ModalFuncProps => Destroy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirm")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withError(value: /* props */ ModalFuncProps => Destroy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInfo(value: /* props */ ModalFuncProps => Destroy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSuccess(value: /* props */ ModalFuncProps => Destroy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWarn(value: /* props */ ModalFuncProps => Destroy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWarning(value: /* props */ ModalFuncProps => Destroy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

