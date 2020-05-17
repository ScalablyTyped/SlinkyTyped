package typingsSlinky.awsSdk.mediastoredataMod

import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.Buffer
  - typingsSlinky.std.Uint8Array
  - typingsSlinky.awsSdk.mediastoredataMod.Blob
  - java.lang.String
  - typingsSlinky.node.streamMod.Readable
*/
trait PayloadBlob extends js.Object

object PayloadBlob {
  @scala.inline
  implicit def apply(value: Blob): PayloadBlob = value.asInstanceOf[PayloadBlob]
  @scala.inline
  implicit def apply(value: Buffer): PayloadBlob = value.asInstanceOf[PayloadBlob]
  @scala.inline
  implicit def apply(value: Readable): PayloadBlob = value.asInstanceOf[PayloadBlob]
  @scala.inline
  implicit def apply(value: String): PayloadBlob = value.asInstanceOf[PayloadBlob]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): PayloadBlob = value.asInstanceOf[PayloadBlob]
}

