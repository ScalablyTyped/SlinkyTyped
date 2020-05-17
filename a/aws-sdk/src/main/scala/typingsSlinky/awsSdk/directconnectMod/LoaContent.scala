package typingsSlinky.awsSdk.directconnectMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.Buffer
  - typingsSlinky.std.Uint8Array
  - typingsSlinky.awsSdk.directconnectMod.Blob
  - java.lang.String
*/
trait LoaContent extends js.Object

object LoaContent {
  @scala.inline
  implicit def apply(value: Blob): LoaContent = value.asInstanceOf[LoaContent]
  @scala.inline
  implicit def apply(value: Buffer): LoaContent = value.asInstanceOf[LoaContent]
  @scala.inline
  implicit def apply(value: String): LoaContent = value.asInstanceOf[LoaContent]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): LoaContent = value.asInstanceOf[LoaContent]
}

