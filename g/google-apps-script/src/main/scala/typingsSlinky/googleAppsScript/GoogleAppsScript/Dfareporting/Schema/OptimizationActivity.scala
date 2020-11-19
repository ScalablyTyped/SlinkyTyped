package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptimizationActivity extends js.Object {
  
  var floodlightActivityId: js.UndefOr[String] = js.native
  
  var floodlightActivityIdDimensionValue: js.UndefOr[DimensionValue] = js.native
  
  var weight: js.UndefOr[Double] = js.native
}
object OptimizationActivity {
  
  @scala.inline
  def apply(): OptimizationActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptimizationActivity]
  }
  
  @scala.inline
  implicit class OptimizationActivityOps[Self <: OptimizationActivity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFloodlightActivityId(value: String): Self = this.set("floodlightActivityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloodlightActivityId: Self = this.set("floodlightActivityId", js.undefined)
    
    @scala.inline
    def setFloodlightActivityIdDimensionValue(value: DimensionValue): Self = this.set("floodlightActivityIdDimensionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloodlightActivityIdDimensionValue: Self = this.set("floodlightActivityIdDimensionValue", js.undefined)
    
    @scala.inline
    def setWeight(value: Double): Self = this.set("weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
  }
}
