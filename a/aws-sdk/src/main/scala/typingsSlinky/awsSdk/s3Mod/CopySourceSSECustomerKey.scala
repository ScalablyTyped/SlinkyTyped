package typingsSlinky.awsSdk.s3Mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.Buffer
  - typingsSlinky.std.Uint8Array
  - typingsSlinky.awsSdk.s3Mod.Blob
  - java.lang.String
*/
trait CopySourceSSECustomerKey extends js.Object

object CopySourceSSECustomerKey {
  @scala.inline
  implicit def apply(value: Blob): CopySourceSSECustomerKey = value.asInstanceOf[CopySourceSSECustomerKey]
  @scala.inline
  implicit def apply(value: Buffer): CopySourceSSECustomerKey = value.asInstanceOf[CopySourceSSECustomerKey]
  @scala.inline
  implicit def apply(value: String): CopySourceSSECustomerKey = value.asInstanceOf[CopySourceSSECustomerKey]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): CopySourceSSECustomerKey = value.asInstanceOf[CopySourceSSECustomerKey]
}

