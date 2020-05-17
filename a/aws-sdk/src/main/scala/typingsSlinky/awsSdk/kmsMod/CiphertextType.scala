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
trait CiphertextType extends js.Object

object CiphertextType {
  @scala.inline
  implicit def apply(value: Blob): CiphertextType = value.asInstanceOf[CiphertextType]
  @scala.inline
  implicit def apply(value: Buffer): CiphertextType = value.asInstanceOf[CiphertextType]
  @scala.inline
  implicit def apply(value: String): CiphertextType = value.asInstanceOf[CiphertextType]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): CiphertextType = value.asInstanceOf[CiphertextType]
}

