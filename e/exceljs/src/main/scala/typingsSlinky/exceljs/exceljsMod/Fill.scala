package typingsSlinky.exceljs.exceljsMod

import typingsSlinky.exceljs.Anon_Left
import typingsSlinky.exceljs.exceljsStrings.angle
import typingsSlinky.exceljs.exceljsStrings.gradient
import typingsSlinky.exceljs.exceljsStrings.path
import typingsSlinky.exceljs.exceljsStrings.pattern
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.exceljs.exceljsMod.FillPattern
  - typings.exceljs.exceljsMod.FillGradientAngle
  - typings.exceljs.exceljsMod.FillGradientPath
*/
trait Fill extends js.Object

object Fill {
  @scala.inline
  def FillPattern(fgColor: Partial[Color], pattern: FillPatterns, `type`: pattern, bgColor: Partial[Color] = null): Fill = {
    val __obj = js.Dynamic.literal(fgColor = fgColor.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bgColor != null) __obj.updateDynamic("bgColor")(bgColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fill]
  }
  @scala.inline
  def FillGradientAngle(degree: Double, gradient: angle, stops: js.Array[GradientStop], `type`: gradient): Fill = {
    val __obj = js.Dynamic.literal(degree = degree.asInstanceOf[js.Any], gradient = gradient.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fill]
  }
  @scala.inline
  def FillGradientPath(center: Anon_Left, gradient: path, stops: js.Array[GradientStop], `type`: gradient): Fill = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], gradient = gradient.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fill]
  }
}

