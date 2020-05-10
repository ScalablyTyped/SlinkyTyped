package typingsSlinky.materialDialog.adapterMod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.EventTarget
import typingsSlinky.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCDialogAdapter extends js.Object {
  def addBodyClass(className: String): Unit = js.native
  def addClass(className: String): Unit = js.native
  def deregisterDocumentKeydownHandler(handler: EventListener): Unit = js.native
  def deregisterInteractionHandler(evt: String, handler: EventListener): Unit = js.native
  def deregisterSurfaceInteractionHandler(evt: String, handler: EventListener): Unit = js.native
  def deregisterTransitionEndHandler(handler: EventListener): Unit = js.native
  def eventTargetHasClass(target: EventTarget, className: String): Boolean = js.native
  def isDialog(el: Element): Boolean = js.native
  def notifyAccept(): Unit = js.native
  def notifyCancel(): Unit = js.native
  def registerDocumentKeydownHandler(handler: EventListener): Unit = js.native
  def registerInteractionHandler(evt: String, handler: EventListener): Unit = js.native
  def registerSurfaceInteractionHandler(evt: String, handler: EventListener): Unit = js.native
  def registerTransitionEndHandler(handler: EventListener): Unit = js.native
  def removeBodyClass(className: String): Unit = js.native
  def removeClass(className: String): Unit = js.native
  def trapFocusOnSurface(): Unit = js.native
  def untrapFocusOnSurface(): Unit = js.native
}

object MDCDialogAdapter {
  @scala.inline
  def apply(
    addBodyClass: String => Unit,
    addClass: String => Unit,
    deregisterDocumentKeydownHandler: EventListener => Unit,
    deregisterInteractionHandler: (String, EventListener) => Unit,
    deregisterSurfaceInteractionHandler: (String, EventListener) => Unit,
    deregisterTransitionEndHandler: EventListener => Unit,
    eventTargetHasClass: (EventTarget, String) => Boolean,
    isDialog: Element => Boolean,
    notifyAccept: () => Unit,
    notifyCancel: () => Unit,
    registerDocumentKeydownHandler: EventListener => Unit,
    registerInteractionHandler: (String, EventListener) => Unit,
    registerSurfaceInteractionHandler: (String, EventListener) => Unit,
    registerTransitionEndHandler: EventListener => Unit,
    removeBodyClass: String => Unit,
    removeClass: String => Unit,
    trapFocusOnSurface: () => Unit,
    untrapFocusOnSurface: () => Unit
  ): MDCDialogAdapter = {
    val __obj = js.Dynamic.literal(addBodyClass = js.Any.fromFunction1(addBodyClass), addClass = js.Any.fromFunction1(addClass), deregisterDocumentKeydownHandler = js.Any.fromFunction1(deregisterDocumentKeydownHandler), deregisterInteractionHandler = js.Any.fromFunction2(deregisterInteractionHandler), deregisterSurfaceInteractionHandler = js.Any.fromFunction2(deregisterSurfaceInteractionHandler), deregisterTransitionEndHandler = js.Any.fromFunction1(deregisterTransitionEndHandler), eventTargetHasClass = js.Any.fromFunction2(eventTargetHasClass), isDialog = js.Any.fromFunction1(isDialog), notifyAccept = js.Any.fromFunction0(notifyAccept), notifyCancel = js.Any.fromFunction0(notifyCancel), registerDocumentKeydownHandler = js.Any.fromFunction1(registerDocumentKeydownHandler), registerInteractionHandler = js.Any.fromFunction2(registerInteractionHandler), registerSurfaceInteractionHandler = js.Any.fromFunction2(registerSurfaceInteractionHandler), registerTransitionEndHandler = js.Any.fromFunction1(registerTransitionEndHandler), removeBodyClass = js.Any.fromFunction1(removeBodyClass), removeClass = js.Any.fromFunction1(removeClass), trapFocusOnSurface = js.Any.fromFunction0(trapFocusOnSurface), untrapFocusOnSurface = js.Any.fromFunction0(untrapFocusOnSurface))
    __obj.asInstanceOf[MDCDialogAdapter]
  }
  @scala.inline
  implicit class MDCDialogAdapterOps[Self <: MDCDialogAdapter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddBodyClass(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addBodyClass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddClass(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addClass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeregisterDocumentKeydownHandler(value: EventListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deregisterDocumentKeydownHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeregisterInteractionHandler(value: (String, EventListener) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deregisterInteractionHandler")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDeregisterSurfaceInteractionHandler(value: (String, EventListener) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deregisterSurfaceInteractionHandler")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDeregisterTransitionEndHandler(value: EventListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deregisterTransitionEndHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEventTargetHasClass(value: (EventTarget, String) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTargetHasClass")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIsDialog(value: Element => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDialog")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNotifyAccept(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyAccept")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNotifyCancel(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyCancel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRegisterDocumentKeydownHandler(value: EventListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerDocumentKeydownHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRegisterInteractionHandler(value: (String, EventListener) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerInteractionHandler")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRegisterSurfaceInteractionHandler(value: (String, EventListener) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerSurfaceInteractionHandler")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRegisterTransitionEndHandler(value: EventListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerTransitionEndHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveBodyClass(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeBodyClass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveClass(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeClass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTrapFocusOnSurface(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trapFocusOnSurface")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUntrapFocusOnSurface(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("untrapFocusOnSurface")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

