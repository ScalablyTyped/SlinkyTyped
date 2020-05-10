package typingsSlinky.materialChips.chipAdapterMod

import org.scalajs.dom.raw.EventTarget
import typingsSlinky.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCChipAdapter extends js.Object {
  def addClass(className: String): Unit = js.native
  def addClassToLeadingIcon(className: String): Unit = js.native
  /**
    * Deregisters an event listener on the root element for a given event.
    */
  def deregisterEventHandler(evtType: String, handler: EventListener): Unit = js.native
  /**
    * Deregisters an event listener on the trailing icon element for a given event.
    */
  def deregisterTrailingIconInteractionHandler(evtType: String, handler: EventListener): Unit = js.native
  /**
    * Returns true if target has className, false otherwise.
    */
  def eventTargetHasClass(target: EventTarget, className: String): Boolean = js.native
  /**
    * Returns the computed property value of the given style property on the root element.
    */
  def getComputedStyleValue(propertyName: String): String = js.native
  def hasClass(className: String): Boolean = js.native
  /**
    * Emits a custom "MDCChip:interaction" event denoting the chip has been
    * interacted with (typically on click or keydown).
    */
  def notifyInteraction(): Unit = js.native
  /**
    * Emits a custom event "MDCChip:removal" denoting the chip will be removed.
    */
  def notifyRemoval(): Unit = js.native
  /**
    * Emits a custom "MDCChip:trailingIconInteraction" event denoting the trailing icon has been
    * interacted with (typically on click or keydown).
    */
  def notifyTrailingIconInteraction(): Unit = js.native
  /**
    * Registers an event listener on the root element for a given event.
    */
  def registerEventHandler(evtType: String, handler: EventListener): Unit = js.native
  /**
    * Registers an event listener on the trailing icon element for a given event.
    */
  def registerTrailingIconInteractionHandler(evtType: String, handler: EventListener): Unit = js.native
  def removeClass(className: String): Unit = js.native
  def removeClassFromLeadingIcon(className: String): Unit = js.native
  /**
    * Sets the property value of the given style property on the root element.
    */
  def setStyleProperty(propertyName: String, value: String): Unit = js.native
}

object MDCChipAdapter {
  @scala.inline
  def apply(
    addClass: String => Unit,
    addClassToLeadingIcon: String => Unit,
    deregisterEventHandler: (String, EventListener) => Unit,
    deregisterTrailingIconInteractionHandler: (String, EventListener) => Unit,
    eventTargetHasClass: (EventTarget, String) => Boolean,
    getComputedStyleValue: String => String,
    hasClass: String => Boolean,
    notifyInteraction: () => Unit,
    notifyRemoval: () => Unit,
    notifyTrailingIconInteraction: () => Unit,
    registerEventHandler: (String, EventListener) => Unit,
    registerTrailingIconInteractionHandler: (String, EventListener) => Unit,
    removeClass: String => Unit,
    removeClassFromLeadingIcon: String => Unit,
    setStyleProperty: (String, String) => Unit
  ): MDCChipAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), addClassToLeadingIcon = js.Any.fromFunction1(addClassToLeadingIcon), deregisterEventHandler = js.Any.fromFunction2(deregisterEventHandler), deregisterTrailingIconInteractionHandler = js.Any.fromFunction2(deregisterTrailingIconInteractionHandler), eventTargetHasClass = js.Any.fromFunction2(eventTargetHasClass), getComputedStyleValue = js.Any.fromFunction1(getComputedStyleValue), hasClass = js.Any.fromFunction1(hasClass), notifyInteraction = js.Any.fromFunction0(notifyInteraction), notifyRemoval = js.Any.fromFunction0(notifyRemoval), notifyTrailingIconInteraction = js.Any.fromFunction0(notifyTrailingIconInteraction), registerEventHandler = js.Any.fromFunction2(registerEventHandler), registerTrailingIconInteractionHandler = js.Any.fromFunction2(registerTrailingIconInteractionHandler), removeClass = js.Any.fromFunction1(removeClass), removeClassFromLeadingIcon = js.Any.fromFunction1(removeClassFromLeadingIcon), setStyleProperty = js.Any.fromFunction2(setStyleProperty))
    __obj.asInstanceOf[MDCChipAdapter]
  }
  @scala.inline
  implicit class MDCChipAdapterOps[Self <: MDCChipAdapter] (val x: Self) extends AnyVal {
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
    def withAddClassToLeadingIcon(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addClassToLeadingIcon")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeregisterEventHandler(value: (String, EventListener) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deregisterEventHandler")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDeregisterTrailingIconInteractionHandler(value: (String, EventListener) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deregisterTrailingIconInteractionHandler")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withEventTargetHasClass(value: (EventTarget, String) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTargetHasClass")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetComputedStyleValue(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getComputedStyleValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHasClass(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasClass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNotifyInteraction(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyInteraction")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNotifyRemoval(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyRemoval")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNotifyTrailingIconInteraction(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyTrailingIconInteraction")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRegisterEventHandler(value: (String, EventListener) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerEventHandler")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRegisterTrailingIconInteractionHandler(value: (String, EventListener) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerTrailingIconInteractionHandler")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRemoveClass(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeClass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveClassFromLeadingIcon(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeClassFromLeadingIcon")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetStyleProperty(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStyleProperty")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

