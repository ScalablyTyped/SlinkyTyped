package typingsSlinky.instagramPrivateApi.insightsServiceAccountResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsightsServiceAccountResponseFollowersTopCitiesGraph extends js.Object {
  
  var data_points: js.Array[InsightsServiceAccountResponseDataPointsItem] = js.native
}
object InsightsServiceAccountResponseFollowersTopCitiesGraph {
  
  @scala.inline
  def apply(data_points: js.Array[InsightsServiceAccountResponseDataPointsItem]): InsightsServiceAccountResponseFollowersTopCitiesGraph = {
    val __obj = js.Dynamic.literal(data_points = data_points.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceAccountResponseFollowersTopCitiesGraph]
  }
  
  @scala.inline
  implicit class InsightsServiceAccountResponseFollowersTopCitiesGraphOps[Self <: InsightsServiceAccountResponseFollowersTopCitiesGraph] (val x: Self) extends AnyVal {
    
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
    def setData_pointsVarargs(value: InsightsServiceAccountResponseDataPointsItem*): Self = this.set("data_points", js.Array(value :_*))
    
    @scala.inline
    def setData_points(value: js.Array[InsightsServiceAccountResponseDataPointsItem]): Self = this.set("data_points", value.asInstanceOf[js.Any])
  }
}
