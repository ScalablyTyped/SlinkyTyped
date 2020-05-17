package typingsSlinky.awsSdk.wafv2Mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.Buffer
  - typingsSlinky.std.Uint8Array
  - typingsSlinky.awsSdk.wafv2Mod.Blob
  - java.lang.String
*/
trait SearchString extends js.Object

object SearchString {
  @scala.inline
  implicit def apply(value: Blob): SearchString = value.asInstanceOf[SearchString]
  @scala.inline
  implicit def apply(value: Buffer): SearchString = value.asInstanceOf[SearchString]
  @scala.inline
  implicit def apply(value: String): SearchString = value.asInstanceOf[SearchString]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): SearchString = value.asInstanceOf[SearchString]
}

