package typingsSlinky.awsSdk.gameliftMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.Buffer
  - typingsSlinky.std.Uint8Array
  - typingsSlinky.awsSdk.gameliftMod.Blob
  - java.lang.String
*/
trait ZipBlob extends js.Object

object ZipBlob {
  @scala.inline
  implicit def apply(value: Blob): ZipBlob = value.asInstanceOf[ZipBlob]
  @scala.inline
  implicit def apply(value: Buffer): ZipBlob = value.asInstanceOf[ZipBlob]
  @scala.inline
  implicit def apply(value: String): ZipBlob = value.asInstanceOf[ZipBlob]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): ZipBlob = value.asInstanceOf[ZipBlob]
}

