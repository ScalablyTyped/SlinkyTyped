package typingsSlinky.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait popupExpressionInfoProperties extends StObject {
  
  /**
    * An [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression evaluating to either a string, number, dictionary, or array.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-ExpressionInfo.html#expression)
    */
  var expression: js.UndefOr[String] = js.native
  
  /**
    * The name of the expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-ExpressionInfo.html#name)
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Indicates the return type of the Arcade expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-ExpressionInfo.html#returnType)
    */
  var returnType: js.UndefOr[String | Double] = js.native
  
  /**
    * The title used to describe the value returned by the expression in the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-ExpressionInfo.html#title)
    */
  var title: js.UndefOr[String] = js.native
}
object popupExpressionInfoProperties {
  
  @scala.inline
  def apply(): popupExpressionInfoProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[popupExpressionInfoProperties]
  }
  
  @scala.inline
  implicit class popupExpressionInfoPropertiesMutableBuilder[Self <: popupExpressionInfoProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setReturnType(value: String | Double): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnTypeUndefined: Self = StObject.set(x, "returnType", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
