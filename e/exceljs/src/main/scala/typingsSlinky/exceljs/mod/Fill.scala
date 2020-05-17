package typingsSlinky.exceljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.exceljs.mod.FillPattern
  - typingsSlinky.exceljs.mod.FillGradientAngle
  - typingsSlinky.exceljs.mod.FillGradientPath
*/
trait Fill extends js.Object

object Fill {
  @scala.inline
  implicit def apply(value: FillGradientAngle): Fill = value.asInstanceOf[Fill]
  @scala.inline
  implicit def apply(value: FillGradientPath): Fill = value.asInstanceOf[Fill]
  @scala.inline
  implicit def apply(value: FillPattern): Fill = value.asInstanceOf[Fill]
}

