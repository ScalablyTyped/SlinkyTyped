package typingsSlinky.messenger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Message extends js.Object {
  /**
    * If the message is associated with an ajax request or is counting down to retry, cancel it.
    */
  def cancel(): Unit = js.native
  /**
    * Hide the message, if it's hidden.
    */
  def hide(): Unit = js.native
  /**
    * Show the message, if it's hidden.
    */
  def show(): Unit = js.native
  /**
    * Update the message with the provided options.
    */
  def update(options: MessageOptions): Unit = js.native
}

object Message {
  @scala.inline
  def apply(cancel: () => Unit, hide: () => Unit, show: () => Unit, update: MessageOptions => Unit): Message = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[Message]
  }
  @scala.inline
  implicit class MessageOps[Self <: Message] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withShow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUpdate(value: MessageOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

