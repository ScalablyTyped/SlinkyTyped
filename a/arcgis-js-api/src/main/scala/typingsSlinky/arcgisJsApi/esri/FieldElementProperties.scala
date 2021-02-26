package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.field
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldElementProperties extends ElementMixinProperties {
  
  /**
    * The [coded value domain](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-CodedValueDomain.html) or [range domain](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RangeDomain.html) of the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-FieldElement.html#domain)
    */
  var domain: js.UndefOr[CodedValueDomainProperties | RangeDomainProperties] = js.native
  
  /**
    * Indicates whether the field can be edited.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-FieldElement.html#editable)
    */
  var editable: js.UndefOr[Boolean] = js.native
  
  /**
    * The field name as defined by the feature layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-FieldElement.html#fieldName)
    */
  var fieldName: js.UndefOr[String] = js.native
  
  /**
    * Contains a hint used to help editors while editing fields.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-FieldElement.html#hint)
    */
  var hint: js.UndefOr[String] = js.native
  
  /**
    * The input user interface to use for the element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-FieldElement.html#input)
    */
  var input: js.UndefOr[TextBoxInputProperties | TextAreaInputProperties | DateTimePickerInputProperties] = js.native
  
  /**
    * A reference to an [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression that returns a boolean value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-FieldElement.html#requiredExpression)
    */
  var requiredExpression: js.UndefOr[String] = js.native
  
  /**
    * Indicates the type of form [element](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-Element.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-FieldElement.html#type)
    */
  var `type`: js.UndefOr[field] = js.native
}
object FieldElementProperties {
  
  @scala.inline
  def apply(): FieldElementProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldElementProperties]
  }
  
  @scala.inline
  implicit class FieldElementPropertiesMutableBuilder[Self <: FieldElementProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomain(value: CodedValueDomainProperties | RangeDomainProperties): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    @scala.inline
    def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    @scala.inline
    def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldNameUndefined: Self = StObject.set(x, "fieldName", js.undefined)
    
    @scala.inline
    def setHint(value: String): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
    
    @scala.inline
    def setInput(value: TextBoxInputProperties | TextAreaInputProperties | DateTimePickerInputProperties): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    @scala.inline
    def setRequiredExpression(value: String): Self = StObject.set(x, "requiredExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredExpressionUndefined: Self = StObject.set(x, "requiredExpression", js.undefined)
    
    @scala.inline
    def setType(value: field): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
