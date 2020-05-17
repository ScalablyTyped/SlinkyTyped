package typingsSlinky.intercomClient.userMod

import typingsSlinky.intercomClient.anon.Email
import typingsSlinky.intercomClient.anon.Id
import typingsSlinky.intercomClient.anon.Userid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.intercomClient.anon.Id
  - typingsSlinky.intercomClient.anon.Userid
  - typingsSlinky.intercomClient.anon.Email
*/
trait UserIdentifier extends js.Object

object UserIdentifier {
  @scala.inline
  implicit def apply(value: Email): UserIdentifier = value.asInstanceOf[UserIdentifier]
  @scala.inline
  implicit def apply(value: Id): UserIdentifier = value.asInstanceOf[UserIdentifier]
  @scala.inline
  implicit def apply(value: Userid): UserIdentifier = value.asInstanceOf[UserIdentifier]
}

