package typingsSlinky.antd.hookModalMod

import typingsSlinky.antd.modalModalMod.ModalFuncProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HookModalProps extends js.Object {
  var config: ModalFuncProps = js.native
  def afterClose(): Unit = js.native
}

object HookModalProps {
  @scala.inline
  def apply(afterClose: () => Unit, config: ModalFuncProps): HookModalProps = {
    val __obj = js.Dynamic.literal(afterClose = js.Any.fromFunction0(afterClose), config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[HookModalProps]
  }
  @scala.inline
  implicit class HookModalPropsOps[Self <: HookModalProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterClose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withConfig(value: ModalFuncProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

