package typingsSlinky.itunesconnectanalytics.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalyticsResult extends StObject {
  
  var adamId: String = js.native
  
  var data: js.Array[AnalyticsDataPoint] = js.native
  
  var group: AnalyticsGroup | Null = js.native
  
  var meetsThreshold: Boolean = js.native
  
  var totals: AnalyticsTotals = js.native
}
object AnalyticsResult {
  
  @scala.inline
  def apply(
    adamId: String,
    data: js.Array[AnalyticsDataPoint],
    meetsThreshold: Boolean,
    totals: AnalyticsTotals
  ): AnalyticsResult = {
    val __obj = js.Dynamic.literal(adamId = adamId.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], meetsThreshold = meetsThreshold.asInstanceOf[js.Any], totals = totals.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsResult]
  }
  
  @scala.inline
  implicit class AnalyticsResultMutableBuilder[Self <: AnalyticsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdamId(value: String): Self = StObject.set(x, "adamId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: js.Array[AnalyticsDataPoint]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: AnalyticsDataPoint*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setGroup(value: AnalyticsGroup): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupNull: Self = StObject.set(x, "group", null)
    
    @scala.inline
    def setMeetsThreshold(value: Boolean): Self = StObject.set(x, "meetsThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotals(value: AnalyticsTotals): Self = StObject.set(x, "totals", value.asInstanceOf[js.Any])
  }
}
