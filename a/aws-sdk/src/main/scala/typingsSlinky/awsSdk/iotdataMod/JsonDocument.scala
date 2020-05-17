package typingsSlinky.awsSdk.iotdataMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.Buffer
  - typingsSlinky.std.Uint8Array
  - typingsSlinky.awsSdk.iotdataMod.Blob
  - java.lang.String
*/
trait JsonDocument extends js.Object

object JsonDocument {
  @scala.inline
  implicit def apply(value: Blob): JsonDocument = value.asInstanceOf[JsonDocument]
  @scala.inline
  implicit def apply(value: Buffer): JsonDocument = value.asInstanceOf[JsonDocument]
  @scala.inline
  implicit def apply(value: String): JsonDocument = value.asInstanceOf[JsonDocument]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): JsonDocument = value.asInstanceOf[JsonDocument]
}

