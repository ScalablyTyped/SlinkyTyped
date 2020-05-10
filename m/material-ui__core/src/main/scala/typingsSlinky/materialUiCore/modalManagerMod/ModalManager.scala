package typingsSlinky.materialUiCore.modalManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModalManager extends js.Object {
  def add(modal: js.Any, container: js.Any): Double = js.native
  def isTopModal(modal: js.Any): Boolean = js.native
  def remove(modal: js.Any): Unit = js.native
}

object ModalManager {
  @scala.inline
  def apply(add: (js.Any, js.Any) => Double, isTopModal: js.Any => Boolean, remove: js.Any => Unit): ModalManager = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), isTopModal = js.Any.fromFunction1(isTopModal), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[ModalManager]
  }
  @scala.inline
  implicit class ModalManagerOps[Self <: ModalManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: (js.Any, js.Any) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIsTopModal(value: js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTopModal")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemove(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

