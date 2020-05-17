package typingsSlinky.p5.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.p5.mod.CORNER
  - typingsSlinky.p5.mod.CORNERS
  - typingsSlinky.p5.mod.CENTER
  - typingsSlinky.p5.mod.RADIUS
*/
trait RECT_MODE extends js.Object

object RECT_MODE {
  @scala.inline
  implicit def apply(value: CENTER): RECT_MODE = value.asInstanceOf[RECT_MODE]
  @scala.inline
  implicit def apply(value: CORNER): RECT_MODE = value.asInstanceOf[RECT_MODE]
  @scala.inline
  implicit def apply(value: CORNERS): RECT_MODE = value.asInstanceOf[RECT_MODE]
  @scala.inline
  implicit def apply(value: RADIUS): RECT_MODE = value.asInstanceOf[RECT_MODE]
}

