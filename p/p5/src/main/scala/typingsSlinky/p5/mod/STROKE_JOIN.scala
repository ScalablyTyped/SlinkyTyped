package typingsSlinky.p5.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.p5.mod.MITER
  - typingsSlinky.p5.mod.BEVEL
  - typingsSlinky.p5.mod.ROUND
*/
trait STROKE_JOIN extends js.Object

object STROKE_JOIN {
  @scala.inline
  implicit def apply(value: BEVEL): STROKE_JOIN = value.asInstanceOf[STROKE_JOIN]
  @scala.inline
  implicit def apply(value: MITER): STROKE_JOIN = value.asInstanceOf[STROKE_JOIN]
  @scala.inline
  implicit def apply(value: ROUND): STROKE_JOIN = value.asInstanceOf[STROKE_JOIN]
}

