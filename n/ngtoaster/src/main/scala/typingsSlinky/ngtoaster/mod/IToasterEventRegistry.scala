package typingsSlinky.ngtoaster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IToasterEventRegistry extends js.Object {
  def setup(): Unit = js.native
  def subscribeToClearToastsEvent(onClearToasts: IToastEventListener): Unit = js.native
  def subscribeToNewToastEvent(onNewToast: IToastEventListener): Unit = js.native
  def unsubscribeToClearToastsEvent(onClearToasts: IToastEventListener): Unit = js.native
  def unsubscribeToNewToastEvent(onNewToast: IToastEventListener): Unit = js.native
}

object IToasterEventRegistry {
  @scala.inline
  def apply(
    setup: () => Unit,
    subscribeToClearToastsEvent: IToastEventListener => Unit,
    subscribeToNewToastEvent: IToastEventListener => Unit,
    unsubscribeToClearToastsEvent: IToastEventListener => Unit,
    unsubscribeToNewToastEvent: IToastEventListener => Unit
  ): IToasterEventRegistry = {
    val __obj = js.Dynamic.literal(setup = js.Any.fromFunction0(setup), subscribeToClearToastsEvent = js.Any.fromFunction1(subscribeToClearToastsEvent), subscribeToNewToastEvent = js.Any.fromFunction1(subscribeToNewToastEvent), unsubscribeToClearToastsEvent = js.Any.fromFunction1(unsubscribeToClearToastsEvent), unsubscribeToNewToastEvent = js.Any.fromFunction1(unsubscribeToNewToastEvent))
    __obj.asInstanceOf[IToasterEventRegistry]
  }
  @scala.inline
  implicit class IToasterEventRegistryOps[Self <: IToasterEventRegistry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSetup(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setup")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSubscribeToClearToastsEvent(value: IToastEventListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribeToClearToastsEvent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSubscribeToNewToastEvent(value: IToastEventListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribeToNewToastEvent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUnsubscribeToClearToastsEvent(value: IToastEventListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsubscribeToClearToastsEvent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUnsubscribeToNewToastEvent(value: IToastEventListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsubscribeToNewToastEvent")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

