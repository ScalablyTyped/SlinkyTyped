package typingsSlinky.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartYAxisItemLabelsRotation extends StObject {
  
  var align: js.UndefOr[String] = js.native
  
  var angle: js.UndefOr[Double] = js.native
}
object ChartYAxisItemLabelsRotation {
  
  @scala.inline
  def apply(): ChartYAxisItemLabelsRotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartYAxisItemLabelsRotation]
  }
  
  @scala.inline
  implicit class ChartYAxisItemLabelsRotationMutableBuilder[Self <: ChartYAxisItemLabelsRotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
  }
}
