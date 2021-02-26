package typingsSlinky.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DimensionOrderBy extends StObject {
  
  /** A dimension name in the request to order by. */
  var dimensionName: js.UndefOr[String] = js.native
  
  /** Controls the rule for dimension value ordering. */
  var orderType: js.UndefOr[String] = js.native
}
object DimensionOrderBy {
  
  @scala.inline
  def apply(): DimensionOrderBy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DimensionOrderBy]
  }
  
  @scala.inline
  implicit class DimensionOrderByMutableBuilder[Self <: DimensionOrderBy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDimensionName(value: String): Self = StObject.set(x, "dimensionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionNameUndefined: Self = StObject.set(x, "dimensionName", js.undefined)
    
    @scala.inline
    def setOrderType(value: String): Self = StObject.set(x, "orderType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderTypeUndefined: Self = StObject.set(x, "orderType", js.undefined)
  }
}
