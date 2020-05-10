package typingsSlinky.materialFloatingLabel.adapterMod

import typingsSlinky.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCFloatingLabelAdapter extends js.Object {
  /**
    * Adds a class to the label element.
    */
  def addClass(className: String): Unit = js.native
  /**
    * Deregisters an event listener on the root element for a given event.
    */
  def deregisterInteractionHandler(evtType: String, handler: EventListener): Unit = js.native
  /**
    * Returns the width of the label element.
    */
  def getWidth(): Double = js.native
  /**
    * Registers an event listener on the root element for a given event.
    */
  def registerInteractionHandler(evtType: String, handler: EventListener): Unit = js.native
  /**
    * Removes a class from the label element.
    */
  def removeClass(className: String): Unit = js.native
}

object MDCFloatingLabelAdapter {
  @scala.inline
  def apply(
    addClass: String => Unit,
    deregisterInteractionHandler: (String, EventListener) => Unit,
    getWidth: () => Double,
    registerInteractionHandler: (String, EventListener) => Unit,
    removeClass: String => Unit
  ): MDCFloatingLabelAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), deregisterInteractionHandler = js.Any.fromFunction2(deregisterInteractionHandler), getWidth = js.Any.fromFunction0(getWidth), registerInteractionHandler = js.Any.fromFunction2(registerInteractionHandler), removeClass = js.Any.fromFunction1(removeClass))
    __obj.asInstanceOf[MDCFloatingLabelAdapter]
  }
  @scala.inline
  implicit class MDCFloatingLabelAdapterOps[Self <: MDCFloatingLabelAdapter] (val x: Self) extends AnyVal {
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
    def withDeregisterInteractionHandler(value: (String, EventListener) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deregisterInteractionHandler")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetWidth(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWidth")(js.Any.fromFunction0(value))
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
  }
  
}

