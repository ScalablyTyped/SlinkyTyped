package typingsSlinky.awsSdk.wafMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.Buffer
  - typingsSlinky.std.Uint8Array
  - typingsSlinky.awsSdk.wafMod.Blob
  - java.lang.String
*/
trait ByteMatchTargetString extends js.Object

object ByteMatchTargetString {
  @scala.inline
  implicit def apply(value: Blob): ByteMatchTargetString = value.asInstanceOf[ByteMatchTargetString]
  @scala.inline
  implicit def apply(value: Buffer): ByteMatchTargetString = value.asInstanceOf[ByteMatchTargetString]
  @scala.inline
  implicit def apply(value: String): ByteMatchTargetString = value.asInstanceOf[ByteMatchTargetString]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): ByteMatchTargetString = value.asInstanceOf[ByteMatchTargetString]
}

