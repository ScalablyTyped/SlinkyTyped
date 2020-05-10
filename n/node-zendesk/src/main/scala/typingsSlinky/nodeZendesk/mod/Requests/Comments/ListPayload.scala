package typingsSlinky.nodeZendesk.mod.Requests.Comments

import typingsSlinky.nodeZendesk.mod.PaginablePayload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPayload extends PaginablePayload {
  var comments: js.Array[ResponseModel] = js.native
  var organizations: js.Array[typingsSlinky.nodeZendesk.mod.Tickets.Comments.Organizations.ResponseModel] = js.native
  var users: js.Array[typingsSlinky.nodeZendesk.mod.Requests.Comments.CommentsUsers.ResponseModel] = js.native
}

object ListPayload {
  @scala.inline
  def apply(
    comments: js.Array[ResponseModel],
    count: Double,
    organizations: js.Array[typingsSlinky.nodeZendesk.mod.Tickets.Comments.Organizations.ResponseModel],
    users: js.Array[typingsSlinky.nodeZendesk.mod.Requests.Comments.CommentsUsers.ResponseModel]
  ): ListPayload = {
    val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], organizations = organizations.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPayload]
  }
  @scala.inline
  implicit class ListPayloadOps[Self <: ListPayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComments(value: js.Array[ResponseModel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrganizations(value: js.Array[typingsSlinky.nodeZendesk.mod.Tickets.Comments.Organizations.ResponseModel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organizations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsers(value: js.Array[typingsSlinky.nodeZendesk.mod.Requests.Comments.CommentsUsers.ResponseModel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("users")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

