package typingsSlinky.materialCheckbox.adapterMod

import typingsSlinky.materialSelectionControl.mod.MDCSelectionControlState
import typingsSlinky.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCCheckboxAdapter extends js.Object {
  def addClass(className: String): Unit = js.native
  def deregisterAnimationEndHandler(handler: EventListener): Unit = js.native
  def deregisterChangeHandler(handler: EventListener): Unit = js.native
  def forceLayout(): Unit = js.native
  def getNativeControl(): MDCSelectionControlState = js.native
  def isAttachedToDOM(): Boolean = js.native
  def registerAnimationEndHandler(handler: EventListener): Unit = js.native
  def registerChangeHandler(handler: EventListener): Unit = js.native
  def removeClass(className: String): Unit = js.native
  def removeNativeControlAttr(attr: String): Unit = js.native
  def setNativeControlAttr(attr: String, value: String): Unit = js.native
}

object MDCCheckboxAdapter {
  @scala.inline
  def apply(
    addClass: String => Unit,
    deregisterAnimationEndHandler: EventListener => Unit,
    deregisterChangeHandler: EventListener => Unit,
    forceLayout: () => Unit,
    getNativeControl: () => MDCSelectionControlState,
    isAttachedToDOM: () => Boolean,
    registerAnimationEndHandler: EventListener => Unit,
    registerChangeHandler: EventListener => Unit,
    removeClass: String => Unit,
    removeNativeControlAttr: String => Unit,
    setNativeControlAttr: (String, String) => Unit
  ): MDCCheckboxAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), deregisterAnimationEndHandler = js.Any.fromFunction1(deregisterAnimationEndHandler), deregisterChangeHandler = js.Any.fromFunction1(deregisterChangeHandler), forceLayout = js.Any.fromFunction0(forceLayout), getNativeControl = js.Any.fromFunction0(getNativeControl), isAttachedToDOM = js.Any.fromFunction0(isAttachedToDOM), registerAnimationEndHandler = js.Any.fromFunction1(registerAnimationEndHandler), registerChangeHandler = js.Any.fromFunction1(registerChangeHandler), removeClass = js.Any.fromFunction1(removeClass), removeNativeControlAttr = js.Any.fromFunction1(removeNativeControlAttr), setNativeControlAttr = js.Any.fromFunction2(setNativeControlAttr))
    __obj.asInstanceOf[MDCCheckboxAdapter]
  }
  @scala.inline
  implicit class MDCCheckboxAdapterOps[Self <: MDCCheckboxAdapter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddClass(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addClass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeregisterAnimationEndHandler(value: EventListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deregisterAnimationEndHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeregisterChangeHandler(value: EventListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deregisterChangeHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withForceLayout(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceLayout")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetNativeControl(value: () => MDCSelectionControlState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNativeControl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsAttachedToDOM(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAttachedToDOM")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRegisterAnimationEndHandler(value: EventListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerAnimationEndHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRegisterChangeHandler(value: EventListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerChangeHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveClass(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeClass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveNativeControlAttr(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeNativeControlAttr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetNativeControlAttr(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setNativeControlAttr")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

