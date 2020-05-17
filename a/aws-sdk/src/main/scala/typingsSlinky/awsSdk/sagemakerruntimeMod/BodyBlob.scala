package typingsSlinky.awsSdk.sagemakerruntimeMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.Buffer
  - typingsSlinky.std.Uint8Array
  - typingsSlinky.awsSdk.sagemakerruntimeMod.Blob
  - java.lang.String
*/
trait BodyBlob extends js.Object

object BodyBlob {
  @scala.inline
  implicit def apply(value: Blob): BodyBlob = value.asInstanceOf[BodyBlob]
  @scala.inline
  implicit def apply(value: Buffer): BodyBlob = value.asInstanceOf[BodyBlob]
  @scala.inline
  implicit def apply(value: String): BodyBlob = value.asInstanceOf[BodyBlob]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): BodyBlob = value.asInstanceOf[BodyBlob]
}

