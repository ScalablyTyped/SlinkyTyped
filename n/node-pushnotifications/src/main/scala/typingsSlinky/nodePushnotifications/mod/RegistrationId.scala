package typingsSlinky.nodePushnotifications.mod

import typingsSlinky.webPush.mod.PushSubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.webPush.mod.PushSubscription
*/
trait RegistrationId extends js.Object

object RegistrationId {
  @scala.inline
  implicit def apply(value: PushSubscription): RegistrationId = value.asInstanceOf[RegistrationId]
  @scala.inline
  implicit def apply(value: String): RegistrationId = value.asInstanceOf[RegistrationId]
}

