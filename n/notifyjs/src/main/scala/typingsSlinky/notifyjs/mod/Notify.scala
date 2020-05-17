package typingsSlinky.notifyjs.mod

import org.scalajs.dom.raw.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Notify extends js.Object {
  /**
    * Close the notification.
    */
  def close(): Unit = js.native
  /**
    * Remove all event listener.
    */
  def destroy(): Unit = js.native
  def handleEvent(e: Event): Unit = js.native
  def onClickNotification(): Unit = js.native
  def onCloseNotification(): Unit = js.native
  def onErrorNotification(): Unit = js.native
  def onShowNotification(e: Event): Unit = js.native
  /**
    * Show the notification.
    */
  def show(): Unit = js.native
}

object Notify {
  @scala.inline
  def apply(
    close: () => Unit,
    destroy: () => Unit,
    handleEvent: Event => Unit,
    onClickNotification: () => Unit,
    onCloseNotification: () => Unit,
    onErrorNotification: () => Unit,
    onShowNotification: Event => Unit,
    show: () => Unit
  ): Notify = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), destroy = js.Any.fromFunction0(destroy), handleEvent = js.Any.fromFunction1(handleEvent), onClickNotification = js.Any.fromFunction0(onClickNotification), onCloseNotification = js.Any.fromFunction0(onCloseNotification), onErrorNotification = js.Any.fromFunction0(onErrorNotification), onShowNotification = js.Any.fromFunction1(onShowNotification), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[Notify]
  }
  @scala.inline
  implicit class NotifyOps[Self <: Notify] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHandleEvent(value: Event => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleEvent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnClickNotification(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClickNotification")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnCloseNotification(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCloseNotification")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnErrorNotification(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onErrorNotification")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnShowNotification(value: Event => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShowNotification")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

