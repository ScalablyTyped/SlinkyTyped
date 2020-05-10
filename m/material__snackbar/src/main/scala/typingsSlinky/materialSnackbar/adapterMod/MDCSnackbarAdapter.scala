package typingsSlinky.materialSnackbar.adapterMod

import typingsSlinky.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCSnackbarAdapter extends js.Object {
  def addClass(className: String): Unit = js.native
  def deregisterActionClickHandler(handler: EventListener): Unit = js.native
  def deregisterCapturedBlurHandler(handler: EventListener): Unit = js.native
  def deregisterCapturedInteractionHandler(evtType: String, handler: EventListener): Unit = js.native
  def deregisterTransitionEndHandler(handler: EventListener): Unit = js.native
  def deregisterVisibilityChangeHandler(handler: EventListener): Unit = js.native
  def notifyHide(): Unit = js.native
  def notifyShow(): Unit = js.native
  def registerActionClickHandler(handler: EventListener): Unit = js.native
  def registerCapturedBlurHandler(handler: EventListener): Unit = js.native
  def registerCapturedInteractionHandler(evtType: String, handler: EventListener): Unit = js.native
  def registerTransitionEndHandler(handler: EventListener): Unit = js.native
  def registerVisibilityChangeHandler(handler: EventListener): Unit = js.native
  def removeClass(className: String): Unit = js.native
  def setActionAriaHidden(): Unit = js.native
  def setActionText(actionText: String): Unit = js.native
  def setAriaHidden(): Unit = js.native
  def setFocus(): Unit = js.native
  def setMessageText(message: String): Unit = js.native
  def unsetActionAriaHidden(): Unit = js.native
  def unsetAriaHidden(): Unit = js.native
  def visibilityIsHidden(): Boolean = js.native
}

object MDCSnackbarAdapter {
  @scala.inline
  def apply(
    addClass: String => Unit,
    deregisterActionClickHandler: EventListener => Unit,
    deregisterCapturedBlurHandler: EventListener => Unit,
    deregisterCapturedInteractionHandler: (String, EventListener) => Unit,
    deregisterTransitionEndHandler: EventListener => Unit,
    deregisterVisibilityChangeHandler: EventListener => Unit,
    notifyHide: () => Unit,
    notifyShow: () => Unit,
    registerActionClickHandler: EventListener => Unit,
    registerCapturedBlurHandler: EventListener => Unit,
    registerCapturedInteractionHandler: (String, EventListener) => Unit,
    registerTransitionEndHandler: EventListener => Unit,
    registerVisibilityChangeHandler: EventListener => Unit,
    removeClass: String => Unit,
    setActionAriaHidden: () => Unit,
    setActionText: String => Unit,
    setAriaHidden: () => Unit,
    setFocus: () => Unit,
    setMessageText: String => Unit,
    unsetActionAriaHidden: () => Unit,
    unsetAriaHidden: () => Unit,
    visibilityIsHidden: () => Boolean
  ): MDCSnackbarAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), deregisterActionClickHandler = js.Any.fromFunction1(deregisterActionClickHandler), deregisterCapturedBlurHandler = js.Any.fromFunction1(deregisterCapturedBlurHandler), deregisterCapturedInteractionHandler = js.Any.fromFunction2(deregisterCapturedInteractionHandler), deregisterTransitionEndHandler = js.Any.fromFunction1(deregisterTransitionEndHandler), deregisterVisibilityChangeHandler = js.Any.fromFunction1(deregisterVisibilityChangeHandler), notifyHide = js.Any.fromFunction0(notifyHide), notifyShow = js.Any.fromFunction0(notifyShow), registerActionClickHandler = js.Any.fromFunction1(registerActionClickHandler), registerCapturedBlurHandler = js.Any.fromFunction1(registerCapturedBlurHandler), registerCapturedInteractionHandler = js.Any.fromFunction2(registerCapturedInteractionHandler), registerTransitionEndHandler = js.Any.fromFunction1(registerTransitionEndHandler), registerVisibilityChangeHandler = js.Any.fromFunction1(registerVisibilityChangeHandler), removeClass = js.Any.fromFunction1(removeClass), setActionAriaHidden = js.Any.fromFunction0(setActionAriaHidden), setActionText = js.Any.fromFunction1(setActionText), setAriaHidden = js.Any.fromFunction0(setAriaHidden), setFocus = js.Any.fromFunction0(setFocus), setMessageText = js.Any.fromFunction1(setMessageText), unsetActionAriaHidden = js.Any.fromFunction0(unsetActionAriaHidden), unsetAriaHidden = js.Any.fromFunction0(unsetAriaHidden), visibilityIsHidden = js.Any.fromFunction0(visibilityIsHidden))
    __obj.asInstanceOf[MDCSnackbarAdapter]
  }
  @scala.inline
  implicit class MDCSnackbarAdapterOps[Self <: MDCSnackbarAdapter] (val x: Self) extends AnyVal {
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
    def withDeregisterActionClickHandler(value: EventListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deregisterActionClickHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeregisterCapturedBlurHandler(value: EventListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deregisterCapturedBlurHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeregisterCapturedInteractionHandler(value: (String, EventListener) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deregisterCapturedInteractionHandler")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDeregisterTransitionEndHandler(value: EventListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deregisterTransitionEndHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeregisterVisibilityChangeHandler(value: EventListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deregisterVisibilityChangeHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNotifyHide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyHide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNotifyShow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyShow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRegisterActionClickHandler(value: EventListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerActionClickHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRegisterCapturedBlurHandler(value: EventListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerCapturedBlurHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRegisterCapturedInteractionHandler(value: (String, EventListener) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerCapturedInteractionHandler")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRegisterTransitionEndHandler(value: EventListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerTransitionEndHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRegisterVisibilityChangeHandler(value: EventListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerVisibilityChangeHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveClass(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeClass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetActionAriaHidden(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setActionAriaHidden")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetActionText(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setActionText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetAriaHidden(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAriaHidden")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetFocus(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFocus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetMessageText(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMessageText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUnsetActionAriaHidden(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsetActionAriaHidden")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUnsetAriaHidden(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsetAriaHidden")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withVisibilityIsHidden(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibilityIsHidden")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

