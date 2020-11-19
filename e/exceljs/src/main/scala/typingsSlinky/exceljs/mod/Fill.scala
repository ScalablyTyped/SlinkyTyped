package typingsSlinky.exceljs.mod

import typingsSlinky.exceljs.anon.Left
import typingsSlinky.exceljs.anon.PartialColor
import typingsSlinky.exceljs.exceljsStrings.angle
import typingsSlinky.exceljs.exceljsStrings.gradient
import typingsSlinky.exceljs.exceljsStrings.path
import typingsSlinky.exceljs.exceljsStrings.pattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.exceljs.mod.FillPattern
  - typingsSlinky.exceljs.mod.FillGradientAngle
  - typingsSlinky.exceljs.mod.FillGradientPath
*/
trait Fill extends js.Object
object Fill {
  
  @scala.inline
  def FillPattern(fgColor: PartialColor, pattern: FillPatterns, `type`: pattern): Fill = {
    val __obj = js.Dynamic.literal(fgColor = fgColor.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fill]
  }
  
  @scala.inline
  def FillGradientAngle(degree: Double, gradient: angle, stops: js.Array[GradientStop], `type`: gradient): Fill = {
    val __obj = js.Dynamic.literal(degree = degree.asInstanceOf[js.Any], gradient = gradient.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fill]
  }
  
  @scala.inline
  def FillGradientPath(center: Left, gradient: path, stops: js.Array[GradientStop], `type`: gradient): Fill = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], gradient = gradient.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fill]
  }
}
