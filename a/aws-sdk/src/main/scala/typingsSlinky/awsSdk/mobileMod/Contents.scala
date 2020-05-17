package typingsSlinky.awsSdk.mobileMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.Buffer
  - typingsSlinky.std.Uint8Array
  - typingsSlinky.awsSdk.mobileMod.Blob
  - java.lang.String
*/
trait Contents extends js.Object

object Contents {
  @scala.inline
  implicit def apply(value: Blob): Contents = value.asInstanceOf[Contents]
  @scala.inline
  implicit def apply(value: Buffer): Contents = value.asInstanceOf[Contents]
  @scala.inline
  implicit def apply(value: String): Contents = value.asInstanceOf[Contents]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): Contents = value.asInstanceOf[Contents]
}

