package typingsSlinky.nodeFetch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.ArrayBuffer
  - typingsSlinky.std.ArrayBufferView
  - typingsSlinky.nodeFetch.mod.Blob
  - java.lang.String
*/
trait BlobPart extends js.Object

object BlobPart {
  @scala.inline
  implicit def apply(value: js.typedarray.ArrayBuffer): BlobPart = value.asInstanceOf[BlobPart]
  @scala.inline
  implicit def apply(value: js.typedarray.ArrayBufferView): BlobPart = value.asInstanceOf[BlobPart]
  @scala.inline
  implicit def apply(value: Blob): BlobPart = value.asInstanceOf[BlobPart]
  @scala.inline
  implicit def apply(value: String): BlobPart = value.asInstanceOf[BlobPart]
}

