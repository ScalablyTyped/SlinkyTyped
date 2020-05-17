package typingsSlinky.p5.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.p5.mod.P2D
  - typingsSlinky.p5.mod.WEBGL
*/
trait GRAPHICS_RENDERER extends js.Object

object GRAPHICS_RENDERER {
  @scala.inline
  implicit def apply(value: P2D): GRAPHICS_RENDERER = value.asInstanceOf[GRAPHICS_RENDERER]
  @scala.inline
  implicit def apply(value: WEBGL): GRAPHICS_RENDERER = value.asInstanceOf[GRAPHICS_RENDERER]
}

