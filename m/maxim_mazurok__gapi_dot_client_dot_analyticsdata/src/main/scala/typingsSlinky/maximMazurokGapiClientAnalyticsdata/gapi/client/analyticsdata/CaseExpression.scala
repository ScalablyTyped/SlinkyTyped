package typingsSlinky.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CaseExpression extends StObject {
  
  /** Name of a dimension. The name must refer back to a name in dimensions field of the request. */
  var dimensionName: js.UndefOr[String] = js.native
}
object CaseExpression {
  
  @scala.inline
  def apply(): CaseExpression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaseExpression]
  }
  
  @scala.inline
  implicit class CaseExpressionMutableBuilder[Self <: CaseExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDimensionName(value: String): Self = StObject.set(x, "dimensionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionNameUndefined: Self = StObject.set(x, "dimensionName", js.undefined)
  }
}
