package typingsSlinky.imgurRestApi.ImgurRestApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountNotifications extends js.Object {
  var messages: js.Array[Notification[Conversation]] = js.native
  var replies: js.Array[Notification[Comment]] = js.native
}

object AccountNotifications {
  @scala.inline
  def apply(messages: js.Array[Notification[Conversation]], replies: js.Array[Notification[Comment]]): AccountNotifications = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any], replies = replies.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountNotifications]
  }
  @scala.inline
  implicit class AccountNotificationsOps[Self <: AccountNotifications] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessages(value: js.Array[Notification[Conversation]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplies(value: js.Array[Notification[Comment]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replies")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

