package typingsSlinky.awsSdk.documentClientMod.DocumentClient

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.Buffer
  - typingsSlinky.std.Uint8Array
  - typingsSlinky.awsSdk.documentClientMod.DocumentClient.Blob
  - java.lang.String
*/
trait BinaryAttributeValue extends js.Object

object BinaryAttributeValue {
  @scala.inline
  implicit def apply(value: Blob): BinaryAttributeValue = value.asInstanceOf[BinaryAttributeValue]
  @scala.inline
  implicit def apply(value: Buffer): BinaryAttributeValue = value.asInstanceOf[BinaryAttributeValue]
  @scala.inline
  implicit def apply(value: java.lang.String): BinaryAttributeValue = value.asInstanceOf[BinaryAttributeValue]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): BinaryAttributeValue = value.asInstanceOf[BinaryAttributeValue]
}

