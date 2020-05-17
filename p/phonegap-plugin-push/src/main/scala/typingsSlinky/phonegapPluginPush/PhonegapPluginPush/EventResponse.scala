package typingsSlinky.phonegapPluginPush.PhonegapPluginPush

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.phonegapPluginPush.PhonegapPluginPush.RegistrationEventResponse
  - typingsSlinky.phonegapPluginPush.PhonegapPluginPush.NotificationEventResponse
  - typingsSlinky.std.Error
*/
trait EventResponse extends js.Object

object EventResponse {
  @scala.inline
  implicit def apply(value: js.Error): EventResponse = value.asInstanceOf[EventResponse]
  @scala.inline
  implicit def apply(value: NotificationEventResponse): EventResponse = value.asInstanceOf[EventResponse]
  @scala.inline
  implicit def apply(value: RegistrationEventResponse): EventResponse = value.asInstanceOf[EventResponse]
}

