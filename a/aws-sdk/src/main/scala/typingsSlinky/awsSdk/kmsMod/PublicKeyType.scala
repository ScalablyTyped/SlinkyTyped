package typingsSlinky.awsSdk.kmsMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.Buffer
  - typingsSlinky.std.Uint8Array
  - typingsSlinky.awsSdk.kmsMod.Blob
  - java.lang.String
*/
trait PublicKeyType extends js.Object

object PublicKeyType {
  @scala.inline
  implicit def apply(value: Blob): PublicKeyType = value.asInstanceOf[PublicKeyType]
  @scala.inline
  implicit def apply(value: Buffer): PublicKeyType = value.asInstanceOf[PublicKeyType]
  @scala.inline
  implicit def apply(value: String): PublicKeyType = value.asInstanceOf[PublicKeyType]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): PublicKeyType = value.asInstanceOf[PublicKeyType]
}

