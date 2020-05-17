package typingsSlinky.p5.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.p5.mod.POINTS
  - typingsSlinky.p5.mod.LINES
  - typingsSlinky.p5.mod.TRIANGLES
  - typingsSlinky.p5.mod.TRIANGLE_FAN
  - typingsSlinky.p5.mod.TRIANGLE_STRIP
  - typingsSlinky.p5.mod.QUADS
  - typingsSlinky.p5.mod.QUAD_STRIP
*/
trait BEGIN_KIND extends js.Object

object BEGIN_KIND {
  @scala.inline
  implicit def apply(value: LINES): BEGIN_KIND = value.asInstanceOf[BEGIN_KIND]
  @scala.inline
  implicit def apply(value: POINTS): BEGIN_KIND = value.asInstanceOf[BEGIN_KIND]
  @scala.inline
  implicit def apply(value: QUADS): BEGIN_KIND = value.asInstanceOf[BEGIN_KIND]
  @scala.inline
  implicit def apply(value: QUAD_STRIP): BEGIN_KIND = value.asInstanceOf[BEGIN_KIND]
  @scala.inline
  implicit def apply(value: TRIANGLES): BEGIN_KIND = value.asInstanceOf[BEGIN_KIND]
  @scala.inline
  implicit def apply(value: TRIANGLE_FAN): BEGIN_KIND = value.asInstanceOf[BEGIN_KIND]
  @scala.inline
  implicit def apply(value: TRIANGLE_STRIP): BEGIN_KIND = value.asInstanceOf[BEGIN_KIND]
}

