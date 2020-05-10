package typingsSlinky.intercomClient.visitorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.intercomClient.AnonId
  - typingsSlinky.intercomClient.AnonUserid
*/
trait VisitorIdentifier extends js.Object

object VisitorIdentifier {
  @scala.inline
  def AnonId(id: String): VisitorIdentifier = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitorIdentifier]
  }
  @scala.inline
  def AnonUserid(user_id: String): VisitorIdentifier = {
    val __obj = js.Dynamic.literal(user_id = user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitorIdentifier]
  }
}

