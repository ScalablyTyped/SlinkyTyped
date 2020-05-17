package typingsSlinky.awsSdk.supportMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.Buffer
  - typingsSlinky.std.Uint8Array
  - typingsSlinky.awsSdk.supportMod.Blob
  - java.lang.String
*/
trait Data extends js.Object

object Data {
  @scala.inline
  implicit def apply(value: Blob): Data = value.asInstanceOf[Data]
  @scala.inline
  implicit def apply(value: Buffer): Data = value.asInstanceOf[Data]
  @scala.inline
  implicit def apply(value: java.lang.String): Data = value.asInstanceOf[Data]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): Data = value.asInstanceOf[Data]
}

