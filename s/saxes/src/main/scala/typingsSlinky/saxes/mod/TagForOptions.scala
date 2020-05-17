package typingsSlinky.saxes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.saxes.mod.SaxesTag
  - typingsSlinky.saxes.mod.SaxesTagPlain
  - typingsSlinky.saxes.mod.SaxesTagNS
*/
trait TagForOptions[O /* <: SaxesOptions */] extends js.Object

object TagForOptions {
  @scala.inline
  implicit def apply[O](value: SaxesTag): TagForOptions[O] = value.asInstanceOf[TagForOptions[O]]
  @scala.inline
  implicit def apply[O](value: SaxesTagNS): TagForOptions[O] = value.asInstanceOf[TagForOptions[O]]
  @scala.inline
  implicit def apply[O](value: SaxesTagPlain): TagForOptions[O] = value.asInstanceOf[TagForOptions[O]]
}

