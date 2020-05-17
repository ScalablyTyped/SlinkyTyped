package typingsSlinky.googleCloudStorage.fileMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.node.Buffer
  - typingsSlinky.googleCloudStorage.fileMod.EncryptionKeyOptions
*/
trait RotateEncryptionKeyOptions extends js.Object

object RotateEncryptionKeyOptions {
  @scala.inline
  implicit def apply(value: Buffer): RotateEncryptionKeyOptions = value.asInstanceOf[RotateEncryptionKeyOptions]
  @scala.inline
  implicit def apply(value: EncryptionKeyOptions): RotateEncryptionKeyOptions = value.asInstanceOf[RotateEncryptionKeyOptions]
  @scala.inline
  implicit def apply(value: String): RotateEncryptionKeyOptions = value.asInstanceOf[RotateEncryptionKeyOptions]
}

