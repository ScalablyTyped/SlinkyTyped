package typingsSlinky.nodeMailjet.mod.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostResponseDataTo extends js.Object {
  val Email: String = js.native
  val MessageHref: String = js.native
  val MessageID: Double = js.native
  val MessageUUID: String = js.native
}

object PostResponseDataTo {
  @scala.inline
  def apply(Email: String, MessageHref: String, MessageID: Double, MessageUUID: String): PostResponseDataTo = {
    val __obj = js.Dynamic.literal(Email = Email.asInstanceOf[js.Any], MessageHref = MessageHref.asInstanceOf[js.Any], MessageID = MessageID.asInstanceOf[js.Any], MessageUUID = MessageUUID.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostResponseDataTo]
  }
  @scala.inline
  implicit class PostResponseDataToOps[Self <: PostResponseDataTo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageHref(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessageHref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessageID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageUUID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessageUUID")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

