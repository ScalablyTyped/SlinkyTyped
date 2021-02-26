package typingsSlinky.instagramPrivateApi.insightsServiceAccountResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsightsServiceAccountResponseDaysHourlyFollowersGraphsItem extends StObject {
  
  var data_points: js.Array[InsightsServiceAccountResponseDataPointsItem] = js.native
  
  var name: String = js.native
}
object InsightsServiceAccountResponseDaysHourlyFollowersGraphsItem {
  
  @scala.inline
  def apply(data_points: js.Array[InsightsServiceAccountResponseDataPointsItem], name: String): InsightsServiceAccountResponseDaysHourlyFollowersGraphsItem = {
    val __obj = js.Dynamic.literal(data_points = data_points.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceAccountResponseDaysHourlyFollowersGraphsItem]
  }
  
  @scala.inline
  implicit class InsightsServiceAccountResponseDaysHourlyFollowersGraphsItemMutableBuilder[Self <: InsightsServiceAccountResponseDaysHourlyFollowersGraphsItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData_points(value: js.Array[InsightsServiceAccountResponseDataPointsItem]): Self = StObject.set(x, "data_points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData_pointsVarargs(value: InsightsServiceAccountResponseDataPointsItem*): Self = StObject.set(x, "data_points", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
