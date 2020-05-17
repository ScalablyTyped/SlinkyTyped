package typingsSlinky.postcss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.postcss.mod.Root_
  - typingsSlinky.postcss.mod.AtRule_
  - typingsSlinky.postcss.mod.Rule_
*/
trait Container extends js.Object

object Container {
  @scala.inline
  implicit def apply(value: AtRule_): Container = value.asInstanceOf[Container]
  @scala.inline
  implicit def apply(value: Root_): Container = value.asInstanceOf[Container]
  @scala.inline
  implicit def apply(value: Rule_): Container = value.asInstanceOf[Container]
}

