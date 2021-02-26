package typingsSlinky.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartCategoryAxisItemLabelsRotation extends StObject {
  
  var align: js.UndefOr[String] = js.native
  
  var angle: js.UndefOr[Double | String] = js.native
}
object ChartCategoryAxisItemLabelsRotation {
  
  @scala.inline
  def apply(): ChartCategoryAxisItemLabelsRotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartCategoryAxisItemLabelsRotation]
  }
  
  @scala.inline
  implicit class ChartCategoryAxisItemLabelsRotationMutableBuilder[Self <: ChartCategoryAxisItemLabelsRotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setAngle(value: Double | String): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
  }
}
