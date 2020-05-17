package typingsSlinky.mithril.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mithril.mod.Child
  - typingsSlinky.mithril.mod.ChildArray
*/
trait Children extends js.Object

object Children {
  @scala.inline
  implicit def apply(value: Child): Children = value.asInstanceOf[Children]
  @scala.inline
  implicit def apply(value: ChildArray): Children = value.asInstanceOf[Children]
}

