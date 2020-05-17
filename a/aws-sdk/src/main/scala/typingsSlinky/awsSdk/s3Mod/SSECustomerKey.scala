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
trait SSECustomerKey extends js.Object

object SSECustomerKey {
  @scala.inline
  implicit def apply(value: Blob): SSECustomerKey = value.asInstanceOf[SSECustomerKey]
  @scala.inline
  implicit def apply(value: Buffer): SSECustomerKey = value.asInstanceOf[SSECustomerKey]
  @scala.inline
  implicit def apply(value: String): SSECustomerKey = value.asInstanceOf[SSECustomerKey]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): SSECustomerKey = value.asInstanceOf[SSECustomerKey]
}

