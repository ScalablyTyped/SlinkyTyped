package typingsSlinky.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMPrimitiveOverride extends StObject {
  
  /**
    * The expression.
    */
  var expression: js.UndefOr[String] = js.native
  
  /**
    * The primitive name this override applies to.
    */
  var primitiveName: js.UndefOr[String] = js.native
  
  /**
    * The property name in the primitive this override applies to.
    */
  var propertyName: js.UndefOr[String] = js.native
  
  var `type`: typingsSlinky.arcgisJsApi.arcgisJsApiStrings.CIMPrimitiveOverride = js.native
  
  /**
    * ExpressionInfo that contains the Arcade expression that returns value as a number or a string depending on the PropertyName.
    */
  var valueExpressionInfo: js.UndefOr[CIMExpressionInfo] = js.native
}
object CIMPrimitiveOverride {
  
  @scala.inline
  def apply(`type`: typingsSlinky.arcgisJsApi.arcgisJsApiStrings.CIMPrimitiveOverride): CIMPrimitiveOverride = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMPrimitiveOverride]
  }
  
  @scala.inline
  implicit class CIMPrimitiveOverrideMutableBuilder[Self <: CIMPrimitiveOverride] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    @scala.inline
    def setPrimitiveName(value: String): Self = StObject.set(x, "primitiveName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimitiveNameUndefined: Self = StObject.set(x, "primitiveName", js.undefined)
    
    @scala.inline
    def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyNameUndefined: Self = StObject.set(x, "propertyName", js.undefined)
    
    @scala.inline
    def setType(value: typingsSlinky.arcgisJsApi.arcgisJsApiStrings.CIMPrimitiveOverride): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueExpressionInfo(value: CIMExpressionInfo): Self = StObject.set(x, "valueExpressionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueExpressionInfoUndefined: Self = StObject.set(x, "valueExpressionInfo", js.undefined)
  }
}
