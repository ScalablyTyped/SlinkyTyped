package typingsSlinky.nodeDashZendesk.nodeDashZendeskMod.Requests.Comments

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponsePayload extends js.Object {
  val comment: typingsSlinky.nodeDashZendesk.nodeDashZendeskMod.Requests.Comments.ResponseModel
}

object ResponsePayload {
  @scala.inline
  def apply(comment: typingsSlinky.nodeDashZendesk.nodeDashZendeskMod.Requests.Comments.ResponseModel): ResponsePayload = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResponsePayload]
  }
}

