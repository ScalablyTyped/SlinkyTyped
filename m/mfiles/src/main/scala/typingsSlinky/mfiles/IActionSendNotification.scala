package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IActionSendNotification extends js.Object {
  var Message: String = js.native
  var RecipientsEx: IUserOrUserGroupIDExs = js.native
  var Subject: String = js.native
  def Clone(): IActionSendNotification = js.native
}

object IActionSendNotification {
  @scala.inline
  def apply(
    Clone: () => IActionSendNotification,
    Message: String,
    RecipientsEx: IUserOrUserGroupIDExs,
    Subject: String
  ): IActionSendNotification = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Message = Message.asInstanceOf[js.Any], RecipientsEx = RecipientsEx.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[IActionSendNotification]
  }
  @scala.inline
  implicit class IActionSendNotificationOps[Self <: IActionSendNotification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClone(value: () => IActionSendNotification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecipientsEx(value: IUserOrUserGroupIDExs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecipientsEx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Subject")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

