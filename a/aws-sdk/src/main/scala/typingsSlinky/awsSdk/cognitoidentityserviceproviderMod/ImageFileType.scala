package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.Buffer
  - typingsSlinky.std.Uint8Array
  - typingsSlinky.awsSdk.cognitoidentityserviceproviderMod.Blob
  - java.lang.String
*/
trait ImageFileType extends js.Object

object ImageFileType {
  @scala.inline
  implicit def apply(value: Blob): ImageFileType = value.asInstanceOf[ImageFileType]
  @scala.inline
  implicit def apply(value: Buffer): ImageFileType = value.asInstanceOf[ImageFileType]
  @scala.inline
  implicit def apply(value: String): ImageFileType = value.asInstanceOf[ImageFileType]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): ImageFileType = value.asInstanceOf[ImageFileType]
}

