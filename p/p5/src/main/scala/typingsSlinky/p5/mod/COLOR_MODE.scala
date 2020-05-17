package typingsSlinky.p5.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.p5.mod.RGB
  - typingsSlinky.p5.mod.HSB
  - typingsSlinky.p5.mod.HSL
*/
trait COLOR_MODE extends js.Object

object COLOR_MODE {
  @scala.inline
  implicit def apply(value: HSB): COLOR_MODE = value.asInstanceOf[COLOR_MODE]
  @scala.inline
  implicit def apply(value: HSL): COLOR_MODE = value.asInstanceOf[COLOR_MODE]
  @scala.inline
  implicit def apply(value: RGB): COLOR_MODE = value.asInstanceOf[COLOR_MODE]
}

