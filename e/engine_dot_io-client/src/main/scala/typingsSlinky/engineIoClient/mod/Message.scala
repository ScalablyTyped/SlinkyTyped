package typingsSlinky.engineIoClient.mod

import org.scalajs.dom.raw.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.std.ArrayBuffer
  - typingsSlinky.std.ArrayBufferView
  - typingsSlinky.std.Blob
*/
trait Message extends js.Object

object Message {
  @scala.inline
  implicit def apply(value: js.typedarray.ArrayBuffer): Message = value.asInstanceOf[Message]
  @scala.inline
  implicit def apply(value: js.typedarray.ArrayBufferView): Message = value.asInstanceOf[Message]
  @scala.inline
  implicit def apply(value: Blob): Message = value.asInstanceOf[Message]
  @scala.inline
  implicit def apply(value: String): Message = value.asInstanceOf[Message]
}

