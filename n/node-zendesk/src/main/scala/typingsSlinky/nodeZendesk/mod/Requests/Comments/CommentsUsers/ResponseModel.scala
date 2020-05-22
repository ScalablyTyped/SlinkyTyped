package typingsSlinky.nodeZendesk.mod.Requests.Comments.CommentsUsers

import typingsSlinky.nodeZendesk.mod.Attachments.Model
import typingsSlinky.nodeZendesk.mod.PersistableModel
import typingsSlinky.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseModel extends PersistableModel {
  val agent: Boolean
  val name: String
  val organization_id: Double | Null
  val photo: Model | Null
}

object ResponseModel {
  @scala.inline
  def apply(
    agent: Boolean,
    id: ZendeskID,
    name: String,
    organization_id: Double = null.asInstanceOf[Double],
    photo: Model = null
  ): ResponseModel = {
    val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], organization_id = organization_id.asInstanceOf[js.Any], photo = photo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseModel]
  }
}

