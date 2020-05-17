package typingsSlinky.awsSdk.iamMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.Buffer
  - typingsSlinky.std.Uint8Array
  - typingsSlinky.awsSdk.iamMod.Blob
  - java.lang.String
*/
trait BootstrapDatum extends js.Object

object BootstrapDatum {
  @scala.inline
  implicit def apply(value: Blob): BootstrapDatum = value.asInstanceOf[BootstrapDatum]
  @scala.inline
  implicit def apply(value: Buffer): BootstrapDatum = value.asInstanceOf[BootstrapDatum]
  @scala.inline
  implicit def apply(value: String): BootstrapDatum = value.asInstanceOf[BootstrapDatum]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): BootstrapDatum = value.asInstanceOf[BootstrapDatum]
}

