package typingsSlinky.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormTemplateProperties extends StObject {
  
  /**
    * The description of the form.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html#description)
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * An array of [form element](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-Element.html) objects that represent an ordered list of form elements.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html#elements)
    */
  var elements: js.UndefOr[js.Array[ElementProperties]] = js.native
  
  /**
    * An array of objects or [ExpressionInfo[]](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-ExpressionInfo.html) that reference [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expressions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html#expressionInfos)
    */
  var expressionInfos: js.UndefOr[js.Array[ExpressionInfoProperties]] = js.native
  
  /**
    * The string template for defining how to format the title used in a popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html#title)
    */
  var title: js.UndefOr[String] = js.native
}
object FormTemplateProperties {
  
  @scala.inline
  def apply(): FormTemplateProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormTemplateProperties]
  }
  
  @scala.inline
  implicit class FormTemplatePropertiesMutableBuilder[Self <: FormTemplateProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setElements(value: js.Array[ElementProperties]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
    
    @scala.inline
    def setElementsVarargs(value: ElementProperties*): Self = StObject.set(x, "elements", js.Array(value :_*))
    
    @scala.inline
    def setExpressionInfos(value: js.Array[ExpressionInfoProperties]): Self = StObject.set(x, "expressionInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionInfosUndefined: Self = StObject.set(x, "expressionInfos", js.undefined)
    
    @scala.inline
    def setExpressionInfosVarargs(value: ExpressionInfoProperties*): Self = StObject.set(x, "expressionInfos", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
