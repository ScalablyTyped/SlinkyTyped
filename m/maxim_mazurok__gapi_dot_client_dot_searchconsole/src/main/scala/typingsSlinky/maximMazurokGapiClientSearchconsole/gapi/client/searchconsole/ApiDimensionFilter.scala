package typingsSlinky.maximMazurokGapiClientSearchconsole.gapi.client.searchconsole

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApiDimensionFilter extends StObject {
  
  var dimension: js.UndefOr[String] = js.native
  
  var expression: js.UndefOr[String] = js.native
  
  var operator: js.UndefOr[String] = js.native
}
object ApiDimensionFilter {
  
  @scala.inline
  def apply(): ApiDimensionFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiDimensionFilter]
  }
  
  @scala.inline
  implicit class ApiDimensionFilterMutableBuilder[Self <: ApiDimensionFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDimension(value: String): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionUndefined: Self = StObject.set(x, "dimension", js.undefined)
    
    @scala.inline
    def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    @scala.inline
    def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
  }
}
