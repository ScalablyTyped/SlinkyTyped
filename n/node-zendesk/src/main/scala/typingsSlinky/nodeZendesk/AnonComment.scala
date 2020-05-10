package typingsSlinky.nodeZendesk

import typingsSlinky.nodeZendesk.mod.Tickets.CreateModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonComment extends js.Object {
  var comment: AnonBody = js.native
  var ticket: CreateModel = js.native
}

object AnonComment {
  @scala.inline
  def apply(comment: AnonBody, ticket: CreateModel): AnonComment = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], ticket = ticket.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonComment]
  }
  @scala.inline
  implicit class AnonCommentOps[Self <: AnonComment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComment(value: AnonBody): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTicket(value: CreateModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticket")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

