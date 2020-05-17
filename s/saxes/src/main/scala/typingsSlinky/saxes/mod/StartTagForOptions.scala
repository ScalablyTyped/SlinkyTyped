package typingsSlinky.saxes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.saxes.mod.SaxesStartTag
  - typingsSlinky.saxes.mod.SaxesStartTagPlain
  - typingsSlinky.saxes.mod.SaxesStartTagNS
*/
trait StartTagForOptions[O /* <: SaxesOptions */] extends js.Object

object StartTagForOptions {
  @scala.inline
  implicit def apply[O](value: SaxesStartTag): StartTagForOptions[O] = value.asInstanceOf[StartTagForOptions[O]]
  @scala.inline
  implicit def apply[O](value: SaxesStartTagNS): StartTagForOptions[O] = value.asInstanceOf[StartTagForOptions[O]]
  @scala.inline
  implicit def apply[O](value: SaxesStartTagPlain): StartTagForOptions[O] = value.asInstanceOf[StartTagForOptions[O]]
}

