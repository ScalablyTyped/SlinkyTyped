package typingsSlinky.itunesconnectanalytics.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryGroup extends StObject {
  
  var dimension: typingsSlinky.itunesconnectanalytics.mod.dimension = js.native
  
  var limit: js.UndefOr[Double] = js.native
  
  var metric: js.UndefOr[measures] = js.native
  
  var rank: js.UndefOr[String] = js.native
}
object QueryGroup {
  
  @scala.inline
  def apply(dimension: dimension): QueryGroup = {
    val __obj = js.Dynamic.literal(dimension = dimension.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryGroup]
  }
  
  @scala.inline
  implicit class QueryGroupMutableBuilder[Self <: QueryGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDimension(value: dimension): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setMetric(value: measures): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
    
    @scala.inline
    def setRank(value: String): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRankUndefined: Self = StObject.set(x, "rank", js.undefined)
  }
}
