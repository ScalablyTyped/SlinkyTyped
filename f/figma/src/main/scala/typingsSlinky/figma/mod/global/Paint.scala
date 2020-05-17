package typingsSlinky.figma.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.figma.mod.global.SolidPaint
  - typingsSlinky.figma.mod.global.GradientPaint
  - typingsSlinky.figma.mod.global.ImagePaint
*/
trait Paint extends js.Object

object Paint {
  @scala.inline
  implicit def apply(value: GradientPaint): Paint = value.asInstanceOf[Paint]
  @scala.inline
  implicit def apply(value: ImagePaint): Paint = value.asInstanceOf[Paint]
  @scala.inline
  implicit def apply(value: SolidPaint): Paint = value.asInstanceOf[Paint]
}

