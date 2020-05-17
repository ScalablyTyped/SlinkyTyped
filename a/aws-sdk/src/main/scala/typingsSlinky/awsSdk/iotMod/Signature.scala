package typingsSlinky.awsSdk.iotMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.Buffer
  - typingsSlinky.std.Uint8Array
  - typingsSlinky.awsSdk.iotMod.Blob
  - java.lang.String
*/
trait Signature extends js.Object

object Signature {
  @scala.inline
  implicit def apply(value: Blob): Signature = value.asInstanceOf[Signature]
  @scala.inline
  implicit def apply(value: Buffer): Signature = value.asInstanceOf[Signature]
  @scala.inline
  implicit def apply(value: java.lang.String): Signature = value.asInstanceOf[Signature]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): Signature = value.asInstanceOf[Signature]
}

