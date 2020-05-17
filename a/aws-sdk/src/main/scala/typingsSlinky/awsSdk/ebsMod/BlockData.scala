package typingsSlinky.awsSdk.ebsMod

import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.Buffer
  - typingsSlinky.std.Uint8Array
  - typingsSlinky.awsSdk.ebsMod.Blob
  - java.lang.String
  - typingsSlinky.node.streamMod.Readable
*/
trait BlockData extends js.Object

object BlockData {
  @scala.inline
  implicit def apply(value: Blob): BlockData = value.asInstanceOf[BlockData]
  @scala.inline
  implicit def apply(value: Buffer): BlockData = value.asInstanceOf[BlockData]
  @scala.inline
  implicit def apply(value: Readable): BlockData = value.asInstanceOf[BlockData]
  @scala.inline
  implicit def apply(value: String): BlockData = value.asInstanceOf[BlockData]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): BlockData = value.asInstanceOf[BlockData]
}

