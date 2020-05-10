package typingsSlinky.materialSelect.adapterMod

import typingsSlinky.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCSelectAdapter extends js.Object {
  def activateBottomLine(): Unit = js.native
  def addClass(className: String): Unit = js.native
  def deactivateBottomLine(): Unit = js.native
  def deregisterInteractionHandler(`type`: String, handler: EventListener): Unit = js.native
  def floatLabel(value: Boolean): Unit = js.native
  def getSelectedIndex(): Double = js.native
  def getValue(): String = js.native
  def registerInteractionHandler(`type`: String, handler: EventListener): Unit = js.native
  def removeClass(className: String): Unit = js.native
  def setDisabled(disabled: Boolean): Unit = js.native
  def setSelectedIndex(index: Double): Unit = js.native
  def setValue(value: String): Unit = js.native
}

object MDCSelectAdapter {
  @scala.inline
  def apply(
    activateBottomLine: () => Unit,
    addClass: String => Unit,
    deactivateBottomLine: () => Unit,
    deregisterInteractionHandler: (String, EventListener) => Unit,
    floatLabel: Boolean => Unit,
    getSelectedIndex: () => Double,
    getValue: () => String,
    registerInteractionHandler: (String, EventListener) => Unit,
    removeClass: String => Unit,
    setDisabled: Boolean => Unit,
    setSelectedIndex: Double => Unit,
    setValue: String => Unit
  ): MDCSelectAdapter = {
    val __obj = js.Dynamic.literal(activateBottomLine = js.Any.fromFunction0(activateBottomLine), addClass = js.Any.fromFunction1(addClass), deactivateBottomLine = js.Any.fromFunction0(deactivateBottomLine), deregisterInteractionHandler = js.Any.fromFunction2(deregisterInteractionHandler), floatLabel = js.Any.fromFunction1(floatLabel), getSelectedIndex = js.Any.fromFunction0(getSelectedIndex), getValue = js.Any.fromFunction0(getValue), registerInteractionHandler = js.Any.fromFunction2(registerInteractionHandler), removeClass = js.Any.fromFunction1(removeClass), setDisabled = js.Any.fromFunction1(setDisabled), setSelectedIndex = js.Any.fromFunction1(setSelectedIndex), setValue = js.Any.fromFunction1(setValue))
    __obj.asInstanceOf[MDCSelectAdapter]
  }
  @scala.inline
  implicit class MDCSelectAdapterOps[Self <: MDCSelectAdapter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivateBottomLine(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activateBottomLine")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAddClass(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addClass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeactivateBottomLine(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deactivateBottomLine")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDeregisterInteractionHandler(value: (String, EventListener) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deregisterInteractionHandler")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFloatLabel(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatLabel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetSelectedIndex(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelectedIndex")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetValue(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRegisterInteractionHandler(value: (String, EventListener) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerInteractionHandler")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRemoveClass(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeClass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetDisabled(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDisabled")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSelectedIndex(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSelectedIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetValue(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValue")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

