package typingsSlinky.materialTab.adapterMod

import typingsSlinky.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCTabAdapter extends js.Object {
  /**
    * Adds the given className to the root element.
    */
  def addClass(className: String): Unit = js.native
  /**
    * Deregisters an event listener on the root element for a given event.
    */
  def deregisterEventHandler(evtType: String, handler: EventListener): Unit = js.native
  /**
    * Returns whether the root element has the given className.
    */
  def hasClass(className: String): Boolean = js.native
  /**
    * Registers an event listener on the root element for a given event.
    */
  def registerEventHandler(evtType: String, handler: EventListener): Unit = js.native
  /**
    * Removes the given className from the root element.
    */
  def removeClass(className: String): Unit = js.native
  /**
    * Sets the given attrName of the root element to the given value.
    */
  def setAttr(attr: String, value: String): Unit = js.native
}

object MDCTabAdapter {
  @scala.inline
  def apply(
    addClass: String => Unit,
    deregisterEventHandler: (String, EventListener) => Unit,
    hasClass: String => Boolean,
    registerEventHandler: (String, EventListener) => Unit,
    removeClass: String => Unit,
    setAttr: (String, String) => Unit
  ): MDCTabAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), deregisterEventHandler = js.Any.fromFunction2(deregisterEventHandler), hasClass = js.Any.fromFunction1(hasClass), registerEventHandler = js.Any.fromFunction2(registerEventHandler), removeClass = js.Any.fromFunction1(removeClass), setAttr = js.Any.fromFunction2(setAttr))
    __obj.asInstanceOf[MDCTabAdapter]
  }
  @scala.inline
  implicit class MDCTabAdapterOps[Self <: MDCTabAdapter] (val x: Self) extends AnyVal {
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
    def withDeregisterEventHandler(value: (String, EventListener) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deregisterEventHandler")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withHasClass(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasClass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRegisterEventHandler(value: (String, EventListener) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerEventHandler")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRemoveClass(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeClass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetAttr(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAttr")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

