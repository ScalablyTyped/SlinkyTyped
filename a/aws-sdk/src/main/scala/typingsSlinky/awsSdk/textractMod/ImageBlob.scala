package typingsSlinky.awsSdk.textractMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.Buffer
  - typingsSlinky.std.Uint8Array
  - typingsSlinky.awsSdk.textractMod.Blob
  - java.lang.String
*/
trait ImageBlob extends js.Object

object ImageBlob {
  @scala.inline
  implicit def apply(value: Blob): ImageBlob = value.asInstanceOf[ImageBlob]
  @scala.inline
  implicit def apply(value: Buffer): ImageBlob = value.asInstanceOf[ImageBlob]
  @scala.inline
  implicit def apply(value: java.lang.String): ImageBlob = value.asInstanceOf[ImageBlob]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): ImageBlob = value.asInstanceOf[ImageBlob]
}

