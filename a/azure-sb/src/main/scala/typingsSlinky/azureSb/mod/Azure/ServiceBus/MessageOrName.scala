package typingsSlinky.azureSb.mod.Azure.ServiceBus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.azureSb.mod.Azure.ServiceBus.Message
  - java.lang.String
*/
trait MessageOrName extends js.Object

object MessageOrName {
  @scala.inline
  implicit def apply(value: Message): MessageOrName = value.asInstanceOf[MessageOrName]
  @scala.inline
  implicit def apply(value: String): MessageOrName = value.asInstanceOf[MessageOrName]
}

