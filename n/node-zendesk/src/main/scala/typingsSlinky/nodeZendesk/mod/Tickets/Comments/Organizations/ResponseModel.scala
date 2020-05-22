package typingsSlinky.nodeZendesk.mod.Tickets.Comments.Organizations

import typingsSlinky.nodeZendesk.mod.PersistableModel
import typingsSlinky.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseModel extends PersistableModel {
  val name: String
}

object ResponseModel {
  @scala.inline
  def apply(id: ZendeskID, name: String): ResponseModel = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseModel]
  }
}

