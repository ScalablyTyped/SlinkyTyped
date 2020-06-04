package typingsSlinky.antd.hookModalMod

import typingsSlinky.antd.modalModalMod.ModalFuncProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HookModalRef extends js.Object {
  def destroy(): Unit
  def update(config: ModalFuncProps): Unit
}

object HookModalRef {
  @scala.inline
  def apply(destroy: () => Unit, update: ModalFuncProps => Unit): HookModalRef = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[HookModalRef]
  }
  @scala.inline
  implicit class HookModalRefOps[Self <: HookModalRef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def setUpdate(value: ModalFuncProps => Unit): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

