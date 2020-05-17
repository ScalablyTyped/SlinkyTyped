package typingsSlinky.awsSdk.acmMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.Buffer
  - typingsSlinky.std.Uint8Array
  - typingsSlinky.awsSdk.acmMod.Blob
  - java.lang.String
*/
trait PrivateKeyBlob extends js.Object

object PrivateKeyBlob {
  @scala.inline
  implicit def apply(value: Blob): PrivateKeyBlob = value.asInstanceOf[PrivateKeyBlob]
  @scala.inline
  implicit def apply(value: Buffer): PrivateKeyBlob = value.asInstanceOf[PrivateKeyBlob]
  @scala.inline
  implicit def apply(value: java.lang.String): PrivateKeyBlob = value.asInstanceOf[PrivateKeyBlob]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): PrivateKeyBlob = value.asInstanceOf[PrivateKeyBlob]
}

