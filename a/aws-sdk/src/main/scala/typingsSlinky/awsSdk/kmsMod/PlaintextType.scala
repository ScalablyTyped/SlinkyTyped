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
trait PlaintextType extends js.Object

object PlaintextType {
  @scala.inline
  implicit def apply(value: Blob): PlaintextType = value.asInstanceOf[PlaintextType]
  @scala.inline
  implicit def apply(value: Buffer): PlaintextType = value.asInstanceOf[PlaintextType]
  @scala.inline
  implicit def apply(value: String): PlaintextType = value.asInstanceOf[PlaintextType]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): PlaintextType = value.asInstanceOf[PlaintextType]
}

