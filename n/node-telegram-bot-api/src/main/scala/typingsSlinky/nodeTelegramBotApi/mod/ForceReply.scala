package typingsSlinky.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForceReply extends js.Object {
  var force_reply: Boolean = js.native
  var selective: js.UndefOr[Boolean] = js.native
}

object ForceReply {
  @scala.inline
  def apply(force_reply: Boolean): ForceReply = {
    val __obj = js.Dynamic.literal(force_reply = force_reply.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForceReply]
  }
  @scala.inline
  implicit class ForceReplyOps[Self <: ForceReply] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForce_reply(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force_reply")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelective(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selective")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelective: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selective")(js.undefined)
        ret
    }
  }
  
}

