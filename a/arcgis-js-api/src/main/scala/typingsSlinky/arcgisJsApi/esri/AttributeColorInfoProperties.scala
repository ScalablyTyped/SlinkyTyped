package typingsSlinky.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttributeColorInfoProperties extends StObject {
  
  /**
    * The color used to render dots representing the given [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AttributeColorInfo.html#field).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AttributeColorInfo.html#color)
    */
  var color: js.UndefOr[Color_ | js.Array[Double] | String] = js.native
  
  /**
    * The name of the numeric attribute field to represent with dots with the reference dot value provided to the [DotDensityRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#dotValue).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AttributeColorInfo.html#field)
    */
  var field: js.UndefOr[String] = js.native
  
  /**
    * The label used to describe the field or attribute in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AttributeColorInfo.html#label)
    */
  var label: js.UndefOr[String] = js.native
  
  /**
    * An [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression evaluating to a number.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AttributeColorInfo.html#valueExpression)
    */
  var valueExpression: js.UndefOr[String] = js.native
  
  /**
    * The title identifying and describing the associated [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression as defined in the [valueExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AttributeColorInfo.html#valueExpression) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AttributeColorInfo.html#valueExpressionTitle)
    */
  var valueExpressionTitle: js.UndefOr[String] = js.native
}
object AttributeColorInfoProperties {
  
  @scala.inline
  def apply(): AttributeColorInfoProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttributeColorInfoProperties]
  }
  
  @scala.inline
  implicit class AttributeColorInfoPropertiesMutableBuilder[Self <: AttributeColorInfoProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: Color_ | js.Array[Double] | String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value :_*))
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setValueExpression(value: String): Self = StObject.set(x, "valueExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueExpressionTitle(value: String): Self = StObject.set(x, "valueExpressionTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueExpressionTitleUndefined: Self = StObject.set(x, "valueExpressionTitle", js.undefined)
    
    @scala.inline
    def setValueExpressionUndefined: Self = StObject.set(x, "valueExpression", js.undefined)
  }
}
