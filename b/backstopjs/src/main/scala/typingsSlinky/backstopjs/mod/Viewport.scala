package typingsSlinky.backstopjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.backstopjs.mod.ViewportNext
  - typingsSlinky.backstopjs.mod.ViewportLegacy
*/
trait Viewport extends js.Object

object Viewport {
  @scala.inline
  implicit def apply(value: ViewportLegacy): Viewport = value.asInstanceOf[Viewport]
  @scala.inline
  implicit def apply(value: ViewportNext): Viewport = value.asInstanceOf[Viewport]
}

