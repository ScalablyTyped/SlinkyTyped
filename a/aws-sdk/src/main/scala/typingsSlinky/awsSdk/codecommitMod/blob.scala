package typingsSlinky.awsSdk.codecommitMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.Buffer
  - typingsSlinky.std.Uint8Array
  - typingsSlinky.awsSdk.codecommitMod.Blob_
  - java.lang.String
*/
trait blob extends js.Object

object blob {
  @scala.inline
  implicit def apply(value: Blob_): blob = value.asInstanceOf[blob]
  @scala.inline
  implicit def apply(value: Buffer): blob = value.asInstanceOf[blob]
  @scala.inline
  implicit def apply(value: String): blob = value.asInstanceOf[blob]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): blob = value.asInstanceOf[blob]
}

