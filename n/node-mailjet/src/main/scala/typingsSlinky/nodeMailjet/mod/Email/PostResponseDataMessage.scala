package typingsSlinky.nodeMailjet.mod.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostResponseDataMessage extends js.Object {
  val Bcc: js.Array[PostResponseDataTo] = js.native
  val Cc: js.Array[PostResponseDataTo] = js.native
  val CustomID: String = js.native
  val Status: String = js.native
  val To: js.Array[PostResponseDataTo] = js.native
}

object PostResponseDataMessage {
  @scala.inline
  def apply(
    Bcc: js.Array[PostResponseDataTo],
    Cc: js.Array[PostResponseDataTo],
    CustomID: String,
    Status: String,
    To: js.Array[PostResponseDataTo]
  ): PostResponseDataMessage = {
    val __obj = js.Dynamic.literal(Bcc = Bcc.asInstanceOf[js.Any], Cc = Cc.asInstanceOf[js.Any], CustomID = CustomID.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostResponseDataMessage]
  }
  @scala.inline
  implicit class PostResponseDataMessageOps[Self <: PostResponseDataMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBcc(value: js.Array[PostResponseDataTo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bcc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCc(value: js.Array[PostResponseDataTo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTo(value: js.Array[PostResponseDataTo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("To")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

