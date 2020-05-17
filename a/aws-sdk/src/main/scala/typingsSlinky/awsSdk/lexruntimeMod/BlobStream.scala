package typingsSlinky.awsSdk.lexruntimeMod

import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.Buffer
  - typingsSlinky.std.Uint8Array
  - typingsSlinky.awsSdk.lexruntimeMod.Blob
  - java.lang.String
  - typingsSlinky.node.streamMod.Readable
*/
trait BlobStream extends js.Object

object BlobStream {
  @scala.inline
  implicit def apply(value: Blob): BlobStream = value.asInstanceOf[BlobStream]
  @scala.inline
  implicit def apply(value: Buffer): BlobStream = value.asInstanceOf[BlobStream]
  @scala.inline
  implicit def apply(value: Readable): BlobStream = value.asInstanceOf[BlobStream]
  @scala.inline
  implicit def apply(value: java.lang.String): BlobStream = value.asInstanceOf[BlobStream]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): BlobStream = value.asInstanceOf[BlobStream]
}

