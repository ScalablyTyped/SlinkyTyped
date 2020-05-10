package typingsSlinky.analyticsNode.mod.AnalyticsNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.analyticsNode.AnonUserId
  - typingsSlinky.analyticsNode.AnonAnonymousId
*/
trait Identity extends js.Object

object Identity {
  @scala.inline
  def AnonUserId(userId: String | Double): Identity = {
    val __obj = js.Dynamic.literal(userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Identity]
  }
  @scala.inline
  def AnonAnonymousId(anonymousId: String | Double): Identity = {
    val __obj = js.Dynamic.literal(anonymousId = anonymousId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Identity]
  }
}

