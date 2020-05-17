package typingsSlinky.messenger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Messenger extends js.Object {
  /**
    * Hides all messages.
    */
  def hideAll(): Unit = js.native
  /**
    * Posts a message.
    */
  def post(options: MessageOptions): Message = js.native
}

object Messenger {
  @scala.inline
  def apply(hideAll: () => Unit, post: MessageOptions => Message): Messenger = {
    val __obj = js.Dynamic.literal(hideAll = js.Any.fromFunction0(hideAll), post = js.Any.fromFunction1(post))
    __obj.asInstanceOf[Messenger]
  }
  @scala.inline
  implicit class MessengerOps[Self <: Messenger] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHideAll(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideAll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPost(value: MessageOptions => Message): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

