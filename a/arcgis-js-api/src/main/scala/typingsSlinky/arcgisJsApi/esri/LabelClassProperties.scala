package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`above-after`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`above-along`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`above-before`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`above-center`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`above-end`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`above-left`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`above-right`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`above-start`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`always-horizontal`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`below-after`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`below-along`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`below-before`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`below-center`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`below-end`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`below-left`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`below-right`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`below-start`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`center-after`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`center-along`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`center-before`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`center-center`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`center-end`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`center-left`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`center-right`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`center-start`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.none
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.static
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelClassProperties extends StObject {
  
  /**
    * Defines how labels should be placed relative to one another.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#deconflictionStrategy)
    */
  var deconflictionStrategy: js.UndefOr[none | static] = js.native
  
  /**
    * Defines the content of label text for [MapImageLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#labelExpression)
    */
  var labelExpression: js.UndefOr[String] = js.native
  
  /**
    * Defines the content of label text for [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#labelExpressionInfo)
    */
  var labelExpressionInfo: js.UndefOr[LabelClassLabelExpressionInfo] = js.native
  
  /**
    * The position of the label.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#labelPlacement)
    */
  var labelPlacement: js.UndefOr[
    `above-center` | `above-left` | `above-right` | `below-center` | `below-left` | `below-right` | `center-center` | `center-left` | `center-right` | `above-after` | `above-along` | `above-before` | `above-start` | `above-end` | `below-after` | `below-along` | `below-before` | `below-start` | `below-end` | `center-after` | `center-along` | `center-before` | `center-start` | `center-end` | `always-horizontal`
  ] = js.native
  
  /**
    * The maximum scale (most zoomed in) at which labels are visible in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#maxScale)
    */
  var maxScale: js.UndefOr[Double] = js.native
  
  /**
    * The minimum scale (most zoomed out) at which labels are visible in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#minScale)
    */
  var minScale: js.UndefOr[Double] = js.native
  
  /**
    * Defines the symbol used for rendering the label.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#symbol)
    */
  var symbol: js.UndefOr[TextSymbolProperties | LabelSymbol3DProperties] = js.native
  
  /**
    * Indicates whether to use domain names if the fields in the [labelExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#labelExpression) or [labelExpressionInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#labelExpressionInfo) have domains.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#useCodedValues)
    */
  var useCodedValues: js.UndefOr[Boolean] = js.native
  
  /**
    * A SQL where clause used to determine the features to which the label class should be applied.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#where)
    */
  var where: js.UndefOr[String] = js.native
}
object LabelClassProperties {
  
  @scala.inline
  def apply(): LabelClassProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelClassProperties]
  }
  
  @scala.inline
  implicit class LabelClassPropertiesMutableBuilder[Self <: LabelClassProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeconflictionStrategy(value: none | static): Self = StObject.set(x, "deconflictionStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeconflictionStrategyUndefined: Self = StObject.set(x, "deconflictionStrategy", js.undefined)
    
    @scala.inline
    def setLabelExpression(value: String): Self = StObject.set(x, "labelExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelExpressionInfo(value: LabelClassLabelExpressionInfo): Self = StObject.set(x, "labelExpressionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelExpressionInfoUndefined: Self = StObject.set(x, "labelExpressionInfo", js.undefined)
    
    @scala.inline
    def setLabelExpressionUndefined: Self = StObject.set(x, "labelExpression", js.undefined)
    
    @scala.inline
    def setLabelPlacement(
      value: `above-center` | `above-left` | `above-right` | `below-center` | `below-left` | `below-right` | `center-center` | `center-left` | `center-right` | `above-after` | `above-along` | `above-before` | `above-start` | `above-end` | `below-after` | `below-along` | `below-before` | `below-start` | `below-end` | `center-after` | `center-along` | `center-before` | `center-start` | `center-end` | `always-horizontal`
    ): Self = StObject.set(x, "labelPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelPlacementUndefined: Self = StObject.set(x, "labelPlacement", js.undefined)
    
    @scala.inline
    def setMaxScale(value: Double): Self = StObject.set(x, "maxScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxScaleUndefined: Self = StObject.set(x, "maxScale", js.undefined)
    
    @scala.inline
    def setMinScale(value: Double): Self = StObject.set(x, "minScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinScaleUndefined: Self = StObject.set(x, "minScale", js.undefined)
    
    @scala.inline
    def setSymbol(value: TextSymbolProperties | LabelSymbol3DProperties): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
    
    @scala.inline
    def setUseCodedValues(value: Boolean): Self = StObject.set(x, "useCodedValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseCodedValuesUndefined: Self = StObject.set(x, "useCodedValues", js.undefined)
    
    @scala.inline
    def setWhere(value: String): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhereUndefined: Self = StObject.set(x, "where", js.undefined)
  }
}
