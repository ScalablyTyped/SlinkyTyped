package typingsSlinky.awsSdk.secretsmanagerMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.Buffer
  - typingsSlinky.std.Uint8Array
  - typingsSlinky.awsSdk.secretsmanagerMod.Blob
  - java.lang.String
*/
trait SecretBinaryType extends js.Object

object SecretBinaryType {
  @scala.inline
  implicit def apply(value: Blob): SecretBinaryType = value.asInstanceOf[SecretBinaryType]
  @scala.inline
  implicit def apply(value: Buffer): SecretBinaryType = value.asInstanceOf[SecretBinaryType]
  @scala.inline
  implicit def apply(value: String): SecretBinaryType = value.asInstanceOf[SecretBinaryType]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): SecretBinaryType = value.asInstanceOf[SecretBinaryType]
}

