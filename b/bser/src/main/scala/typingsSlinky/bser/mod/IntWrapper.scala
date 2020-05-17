package typingsSlinky.bser.mod

import typingsSlinky.nodeInt64.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - typingsSlinky.nodeInt64.mod.^
*/
trait IntWrapper extends AnyWrapper

object IntWrapper {
  @scala.inline
  implicit def apply(value: Double): IntWrapper = value.asInstanceOf[IntWrapper]
  @scala.inline
  implicit def apply(value: ^): IntWrapper = value.asInstanceOf[IntWrapper]
}

