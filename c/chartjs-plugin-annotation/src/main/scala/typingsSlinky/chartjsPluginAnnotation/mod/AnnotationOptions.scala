package typingsSlinky.chartjsPluginAnnotation.mod

import typingsSlinky.chartjsPluginAnnotation.chartjsPluginAnnotationStrings.box
import typingsSlinky.chartjsPluginAnnotation.chartjsPluginAnnotationStrings.horizontal
import typingsSlinky.chartjsPluginAnnotation.chartjsPluginAnnotationStrings.line
import typingsSlinky.chartjsPluginAnnotation.chartjsPluginAnnotationStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.chartjsPluginAnnotation.mod.LineAnnotationOptions
  - typingsSlinky.chartjsPluginAnnotation.mod.BoxAnnotationOptions
*/
trait AnnotationOptions extends js.Object
object AnnotationOptions {
  
  @scala.inline
  def LineAnnotationOptions(mode: horizontal | vertical, scaleID: String, `type`: line, value: ChartPointValue): AnnotationOptions = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], scaleID = scaleID.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationOptions]
  }
  
  @scala.inline
  def BoxAnnotationOptions(
    `type`: box,
    xMax: ChartPointValue,
    xMin: ChartPointValue,
    yMax: ChartPointValue,
    yMin: ChartPointValue
  ): AnnotationOptions = {
    val __obj = js.Dynamic.literal(xMax = xMax.asInstanceOf[js.Any], xMin = xMin.asInstanceOf[js.Any], yMax = yMax.asInstanceOf[js.Any], yMin = yMin.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationOptions]
  }
}
