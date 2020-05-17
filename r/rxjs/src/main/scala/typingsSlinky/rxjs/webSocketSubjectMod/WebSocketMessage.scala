package typingsSlinky.rxjs.webSocketSubjectMod

import org.scalajs.dom.raw.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.std.ArrayBuffer
  - typingsSlinky.std.Blob
  - typingsSlinky.std.ArrayBufferView
*/
trait WebSocketMessage extends js.Object

object WebSocketMessage {
  @scala.inline
  implicit def apply(value: js.typedarray.ArrayBuffer): WebSocketMessage = value.asInstanceOf[WebSocketMessage]
  @scala.inline
  implicit def apply(value: js.typedarray.ArrayBufferView): WebSocketMessage = value.asInstanceOf[WebSocketMessage]
  @scala.inline
  implicit def apply(value: Blob): WebSocketMessage = value.asInstanceOf[WebSocketMessage]
  @scala.inline
  implicit def apply(value: String): WebSocketMessage = value.asInstanceOf[WebSocketMessage]
}

