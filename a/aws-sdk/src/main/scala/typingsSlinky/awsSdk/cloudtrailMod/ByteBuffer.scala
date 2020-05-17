package typingsSlinky.awsSdk.cloudtrailMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.Buffer
  - typingsSlinky.std.Uint8Array
  - typingsSlinky.awsSdk.cloudtrailMod.Blob
  - java.lang.String
*/
trait ByteBuffer extends js.Object

object ByteBuffer {
  @scala.inline
  implicit def apply(value: Blob): ByteBuffer = value.asInstanceOf[ByteBuffer]
  @scala.inline
  implicit def apply(value: Buffer): ByteBuffer = value.asInstanceOf[ByteBuffer]
  @scala.inline
  implicit def apply(value: java.lang.String): ByteBuffer = value.asInstanceOf[ByteBuffer]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): ByteBuffer = value.asInstanceOf[ByteBuffer]
}

