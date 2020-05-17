package typingsSlinky.awsSdk.sesv2Mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.Buffer
  - typingsSlinky.std.Uint8Array
  - typingsSlinky.awsSdk.sesv2Mod.Blob
  - java.lang.String
*/
trait RawMessageData extends js.Object

object RawMessageData {
  @scala.inline
  implicit def apply(value: Blob): RawMessageData = value.asInstanceOf[RawMessageData]
  @scala.inline
  implicit def apply(value: Buffer): RawMessageData = value.asInstanceOf[RawMessageData]
  @scala.inline
  implicit def apply(value: String): RawMessageData = value.asInstanceOf[RawMessageData]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): RawMessageData = value.asInstanceOf[RawMessageData]
}

