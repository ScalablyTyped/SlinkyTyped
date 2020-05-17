package typingsSlinky.awsSdk.snsMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.Buffer
  - typingsSlinky.std.Uint8Array
  - typingsSlinky.awsSdk.snsMod.Blob
  - java.lang.String
*/
trait Binary extends js.Object

object Binary {
  @scala.inline
  implicit def apply(value: Blob): Binary = value.asInstanceOf[Binary]
  @scala.inline
  implicit def apply(value: Buffer): Binary = value.asInstanceOf[Binary]
  @scala.inline
  implicit def apply(value: java.lang.String): Binary = value.asInstanceOf[Binary]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): Binary = value.asInstanceOf[Binary]
}

