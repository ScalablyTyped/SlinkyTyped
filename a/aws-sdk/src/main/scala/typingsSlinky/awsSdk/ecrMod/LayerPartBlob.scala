package typingsSlinky.awsSdk.ecrMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.Buffer
  - typingsSlinky.std.Uint8Array
  - typingsSlinky.awsSdk.ecrMod.Blob
  - java.lang.String
*/
trait LayerPartBlob extends js.Object

object LayerPartBlob {
  @scala.inline
  implicit def apply(value: Blob): LayerPartBlob = value.asInstanceOf[LayerPartBlob]
  @scala.inline
  implicit def apply(value: Buffer): LayerPartBlob = value.asInstanceOf[LayerPartBlob]
  @scala.inline
  implicit def apply(value: String): LayerPartBlob = value.asInstanceOf[LayerPartBlob]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): LayerPartBlob = value.asInstanceOf[LayerPartBlob]
}

