package typingsSlinky.angularUiNotification.mod.uiNotification

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.angularUiNotification.mod.uiNotification.IMessageOptions
*/
trait Message extends js.Object

object Message {
  @scala.inline
  implicit def apply(value: IMessageOptions): Message = value.asInstanceOf[Message]
  @scala.inline
  implicit def apply(value: String): Message = value.asInstanceOf[Message]
}

