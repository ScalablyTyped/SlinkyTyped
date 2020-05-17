package typingsSlinky.awsSdk.qldbMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.Buffer
  - typingsSlinky.std.Uint8Array
  - typingsSlinky.awsSdk.qldbMod.Blob
  - java.lang.String
*/
trait Digest extends js.Object

object Digest {
  @scala.inline
  implicit def apply(value: Blob): Digest = value.asInstanceOf[Digest]
  @scala.inline
  implicit def apply(value: Buffer): Digest = value.asInstanceOf[Digest]
  @scala.inline
  implicit def apply(value: String): Digest = value.asInstanceOf[Digest]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): Digest = value.asInstanceOf[Digest]
}

