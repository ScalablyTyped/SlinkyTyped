package typingsSlinky.nodeZendesk.mod.Requests.Comments

import typingsSlinky.nodeZendesk.mod.PaginablePayload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPayload extends PaginablePayload {
  var comments: js.Array[ResponseModel]
  var organizations: js.Array[typingsSlinky.nodeZendesk.mod.Tickets.Comments.Organizations.ResponseModel]
  var users: js.Array[typingsSlinky.nodeZendesk.mod.Requests.Comments.CommentsUsers.ResponseModel]
}

object ListPayload {
  @scala.inline
  def apply(
    comments: js.Array[ResponseModel],
    count: Double,
    organizations: js.Array[typingsSlinky.nodeZendesk.mod.Tickets.Comments.Organizations.ResponseModel],
    users: js.Array[typingsSlinky.nodeZendesk.mod.Requests.Comments.CommentsUsers.ResponseModel],
    next_page: Double = null.asInstanceOf[Double],
    previous_page: Double = null.asInstanceOf[Double]
  ): ListPayload = {
    val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], organizations = organizations.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any], next_page = next_page.asInstanceOf[js.Any], previous_page = previous_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPayload]
  }
}

