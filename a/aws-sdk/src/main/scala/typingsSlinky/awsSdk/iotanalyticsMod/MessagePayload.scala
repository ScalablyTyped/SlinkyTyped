package typingsSlinky.awsSdk.iotanalyticsMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.Buffer
  - typingsSlinky.std.Uint8Array
  - typingsSlinky.awsSdk.iotanalyticsMod.Blob
  - java.lang.String
*/
trait MessagePayload extends js.Object

object MessagePayload {
  @scala.inline
  implicit def apply(value: Blob): MessagePayload = value.asInstanceOf[MessagePayload]
  @scala.inline
  implicit def apply(value: Buffer): MessagePayload = value.asInstanceOf[MessagePayload]
  @scala.inline
  implicit def apply(value: String): MessagePayload = value.asInstanceOf[MessagePayload]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): MessagePayload = value.asInstanceOf[MessagePayload]
}

