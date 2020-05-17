package typingsSlinky.awsSdk.acmpcaMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.Buffer
  - typingsSlinky.std.Uint8Array
  - typingsSlinky.awsSdk.acmpcaMod.Blob
  - java.lang.String
*/
trait CsrBlob extends js.Object

object CsrBlob {
  @scala.inline
  implicit def apply(value: Blob): CsrBlob = value.asInstanceOf[CsrBlob]
  @scala.inline
  implicit def apply(value: Buffer): CsrBlob = value.asInstanceOf[CsrBlob]
  @scala.inline
  implicit def apply(value: java.lang.String): CsrBlob = value.asInstanceOf[CsrBlob]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): CsrBlob = value.asInstanceOf[CsrBlob]
}

