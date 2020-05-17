package typingsSlinky.intercomClient.eventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.intercomClient.eventMod.IntercomUserIdId
  - typingsSlinky.intercomClient.eventMod.UserIdId
  - typingsSlinky.intercomClient.eventMod.EmailIdId
*/
trait EventIdentifier extends js.Object

object EventIdentifier {
  @scala.inline
  implicit def apply(value: EmailIdId): EventIdentifier = value.asInstanceOf[EventIdentifier]
  @scala.inline
  implicit def apply(value: IntercomUserIdId): EventIdentifier = value.asInstanceOf[EventIdentifier]
  @scala.inline
  implicit def apply(value: UserIdId): EventIdentifier = value.asInstanceOf[EventIdentifier]
}

