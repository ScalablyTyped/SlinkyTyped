package typingsSlinky.iobroker.mod.global.ioBroker

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.std.Record[java.lang.String, js.Any]
*/
trait MessagePayload extends js.Object

object MessagePayload {
  @scala.inline
  implicit def apply(value: Record[String, js.Any]): MessagePayload = value.asInstanceOf[MessagePayload]
  @scala.inline
  implicit def apply(value: String): MessagePayload = value.asInstanceOf[MessagePayload]
}

