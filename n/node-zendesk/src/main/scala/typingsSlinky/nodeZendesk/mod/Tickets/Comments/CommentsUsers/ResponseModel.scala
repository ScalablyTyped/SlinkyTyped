package typingsSlinky.nodeZendesk.mod.Tickets.Comments.CommentsUsers

import typingsSlinky.nodeZendesk.mod.Attachments.Model
import typingsSlinky.nodeZendesk.mod.Users.Role
import typingsSlinky.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseModel
  extends typingsSlinky.nodeZendesk.mod.Requests.Comments.CommentsUsers.ResponseModel {
  val role: Role
}

object ResponseModel {
  @scala.inline
  def apply(
    agent: Boolean,
    id: ZendeskID,
    name: String,
    role: Role,
    organization_id: Double = null.asInstanceOf[Double],
    photo: Model = null
  ): ResponseModel = {
    val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], organization_id = organization_id.asInstanceOf[js.Any], photo = photo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseModel]
  }
}

