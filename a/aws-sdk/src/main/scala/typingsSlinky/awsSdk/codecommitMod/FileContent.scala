package typingsSlinky.awsSdk.codecommitMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.Buffer
  - typingsSlinky.std.Uint8Array
  - typingsSlinky.awsSdk.codecommitMod.Blob_
  - java.lang.String
*/
trait FileContent extends js.Object

object FileContent {
  @scala.inline
  implicit def apply(value: Blob_): FileContent = value.asInstanceOf[FileContent]
  @scala.inline
  implicit def apply(value: Buffer): FileContent = value.asInstanceOf[FileContent]
  @scala.inline
  implicit def apply(value: String): FileContent = value.asInstanceOf[FileContent]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): FileContent = value.asInstanceOf[FileContent]
}

