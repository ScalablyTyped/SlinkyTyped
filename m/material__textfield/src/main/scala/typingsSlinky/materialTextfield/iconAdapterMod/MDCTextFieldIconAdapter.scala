package typingsSlinky.materialTextfield.iconAdapterMod

import typingsSlinky.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCTextFieldIconAdapter extends js.Object {
  /**
    * Deregisters an event listener on the icon element for a given event.
    */
  def deregisterInteractionHandler(evtType: String, handler: EventListener): Unit = js.native
  /**
    * Gets the value of an attribute on the icon element.
    */
  def getAttr(attr: String): String = js.native
  /**
    * Emits a custom event "MDCTextField:icon" denoting a user has clicked the icon.
    */
  def notifyIconAction(): Unit = js.native
  /**
    * Registers an event listener on the icon element for a given event.
    */
  def registerInteractionHandler(evtType: String, handler: EventListener): Unit = js.native
  /**
    * Removes an attribute from the icon element.
    */
  def removeAttr(attr: String): Unit = js.native
  /**
    * Sets an attribute on the icon element.
    */
  def setAttr(attr: String, value: String): Unit = js.native
}

object MDCTextFieldIconAdapter {
  @scala.inline
  def apply(
    deregisterInteractionHandler: (String, EventListener) => Unit,
    getAttr: String => String,
    notifyIconAction: () => Unit,
    registerInteractionHandler: (String, EventListener) => Unit,
    removeAttr: String => Unit,
    setAttr: (String, String) => Unit
  ): MDCTextFieldIconAdapter = {
    val __obj = js.Dynamic.literal(deregisterInteractionHandler = js.Any.fromFunction2(deregisterInteractionHandler), getAttr = js.Any.fromFunction1(getAttr), notifyIconAction = js.Any.fromFunction0(notifyIconAction), registerInteractionHandler = js.Any.fromFunction2(registerInteractionHandler), removeAttr = js.Any.fromFunction1(removeAttr), setAttr = js.Any.fromFunction2(setAttr))
    __obj.asInstanceOf[MDCTextFieldIconAdapter]
  }
  @scala.inline
  implicit class MDCTextFieldIconAdapterOps[Self <: MDCTextFieldIconAdapter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeregisterInteractionHandler(value: (String, EventListener) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deregisterInteractionHandler")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetAttr(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNotifyIconAction(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyIconAction")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRegisterInteractionHandler(value: (String, EventListener) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerInteractionHandler")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRemoveAttr(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAttr")(js.Any.fromFunction1(value))
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

