package typingsSlinky.arcgisJsApi.esri

import org.scalajs.dom.experimental.AbortSignal
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`2d`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`3d-flat`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`3d-volumetric-uniform`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`3d-volumetric`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`equal-interval`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`natural-breaks`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`percent-of-total`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`standard-deviation`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.field
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.log
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.quantile
import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait sizeCreateClassBreaksRendererParams extends Object {
  
  /**
    * The [named string](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap) or basemap object of the Esri basemap that will be paired with the output visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createClassBreaksRenderer)
    */
  var basemap: js.UndefOr[String | Basemap] = js.native
  
  /**
    * The classification method used for generating breaks.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createClassBreaksRenderer)
    */
  var classificationMethod: js.UndefOr[`equal-interval` | `natural-breaks` | quantile | `standard-deviation`] = js.native
  
  /**
    * Enables the `defaultSymbol` on the renderer and assigns it to features with no value and features that do not fall within the configured data range.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createClassBreaksRenderer)
    */
  var defaultSymbolEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The name of the field whose data will be queried for statistics and classified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createClassBreaksRenderer)
    */
  var field: String = js.native
  
  /**
    * The layer for which the visualization is generated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createClassBreaksRenderer)
    */
  var layer: FeatureLayer | SceneLayer | CSVLayer | GeoJSONLayer = js.native
  
  /**
    * Provides options for setting a title to describe a field instead of using the field name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createClassBreaksRenderer)
    */
  var legendOptions: js.UndefOr[sizeCreateClassBreaksRendererParamsLegendOptions] = js.native
  
  /**
    * A maximum value set by the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createClassBreaksRenderer)
    */
  var maxValue: js.UndefOr[Double] = js.native
  
  /**
    * A minimum value set by the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createClassBreaksRenderer)
    */
  var minValue: js.UndefOr[Double] = js.native
  
  /**
    * The name of the field to normalize the values of the given `field`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createClassBreaksRenderer)
    */
  var normalizationField: js.UndefOr[String] = js.native
  
  /**
    * When `normalizationType` is `percent-of-total`, this property contains the total of all data values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createClassBreaksRenderer)
    */
  var normalizationTotal: js.UndefOr[Double] = js.native
  
  /**
    * Indicates how the data is normalized.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createClassBreaksRenderer)
    */
  var normalizationType: js.UndefOr[field | log | `percent-of-total`] = js.native
  
  /**
    * The number of class breaks to generate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createClassBreaksRenderer)
    */
  var numClasses: js.UndefOr[Double] = js.native
  
  /**
    * Only for polygon layers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createClassBreaksRenderer)
    */
  var outlineOptimizationEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Allows for cancelable requests.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createClassBreaksRenderer)
    */
  var signal: js.UndefOr[AbortSignal] = js.native
  
  /**
    * In authoring apps, the user may select a pre-defined size scheme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createClassBreaksRenderer)
    */
  var sizeScheme: js.UndefOr[SizeScheme] = js.native
  
  /**
    * A SQL expression evaluating to a number.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createClassBreaksRenderer)
    */
  var sqlExpression: js.UndefOr[String] = js.native
  
  /**
    * A SQL where clause used to filter features for the statistics query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createClassBreaksRenderer)
    */
  var sqlWhere: js.UndefOr[String] = js.native
  
  /**
    * If a `standard-deviation` classification method is used, then this indicates the interval by which to generate class breaks.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createClassBreaksRenderer)
    */
  var standardDeviationInterval: js.UndefOr[Double] = js.native
  
  /**
    * The type of symbol to generate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createClassBreaksRenderer)
    */
  var symbolType: js.UndefOr[`2d` | `3d-flat` | `3d-volumetric` | `3d-volumetric-uniform`] = js.native
  
  /**
    * An [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression that returns a number.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createClassBreaksRenderer)
    */
  var valueExpression: js.UndefOr[String] = js.native
  
  /**
    * Text describing the value returned from the `valueExpression`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createClassBreaksRenderer)
    */
  var valueExpressionTitle: js.UndefOr[String] = js.native
  
  /**
    * The view where the input layer is rendered.
    *
    * [Read more...](global.html)
    */
  var view: js.UndefOr[View] = js.native
}
object sizeCreateClassBreaksRendererParams {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    field: String,
    hasOwnProperty: PropertyKey => Boolean,
    layer: FeatureLayer | SceneLayer | CSVLayer | GeoJSONLayer,
    propertyIsEnumerable: PropertyKey => Boolean
  ): sizeCreateClassBreaksRendererParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), layer = layer.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[sizeCreateClassBreaksRendererParams]
  }
  
  @scala.inline
  implicit class sizeCreateClassBreaksRendererParamsOps[Self <: sizeCreateClassBreaksRendererParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayer(value: FeatureLayer | SceneLayer | CSVLayer | GeoJSONLayer): Self = this.set("layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasemap(value: String | Basemap): Self = this.set("basemap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasemap: Self = this.set("basemap", js.undefined)
    
    @scala.inline
    def setClassificationMethod(value: `equal-interval` | `natural-breaks` | quantile | `standard-deviation`): Self = this.set("classificationMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassificationMethod: Self = this.set("classificationMethod", js.undefined)
    
    @scala.inline
    def setDefaultSymbolEnabled(value: Boolean): Self = this.set("defaultSymbolEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultSymbolEnabled: Self = this.set("defaultSymbolEnabled", js.undefined)
    
    @scala.inline
    def setLegendOptions(value: sizeCreateClassBreaksRendererParamsLegendOptions): Self = this.set("legendOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegendOptions: Self = this.set("legendOptions", js.undefined)
    
    @scala.inline
    def setMaxValue(value: Double): Self = this.set("maxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxValue: Self = this.set("maxValue", js.undefined)
    
    @scala.inline
    def setMinValue(value: Double): Self = this.set("minValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinValue: Self = this.set("minValue", js.undefined)
    
    @scala.inline
    def setNormalizationField(value: String): Self = this.set("normalizationField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNormalizationField: Self = this.set("normalizationField", js.undefined)
    
    @scala.inline
    def setNormalizationTotal(value: Double): Self = this.set("normalizationTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNormalizationTotal: Self = this.set("normalizationTotal", js.undefined)
    
    @scala.inline
    def setNormalizationType(value: field | log | `percent-of-total`): Self = this.set("normalizationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNormalizationType: Self = this.set("normalizationType", js.undefined)
    
    @scala.inline
    def setNumClasses(value: Double): Self = this.set("numClasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumClasses: Self = this.set("numClasses", js.undefined)
    
    @scala.inline
    def setOutlineOptimizationEnabled(value: Boolean): Self = this.set("outlineOptimizationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutlineOptimizationEnabled: Self = this.set("outlineOptimizationEnabled", js.undefined)
    
    @scala.inline
    def setSignal(value: AbortSignal): Self = this.set("signal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignal: Self = this.set("signal", js.undefined)
    
    @scala.inline
    def setSizeScheme(value: SizeScheme): Self = this.set("sizeScheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizeScheme: Self = this.set("sizeScheme", js.undefined)
    
    @scala.inline
    def setSqlExpression(value: String): Self = this.set("sqlExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSqlExpression: Self = this.set("sqlExpression", js.undefined)
    
    @scala.inline
    def setSqlWhere(value: String): Self = this.set("sqlWhere", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSqlWhere: Self = this.set("sqlWhere", js.undefined)
    
    @scala.inline
    def setStandardDeviationInterval(value: Double): Self = this.set("standardDeviationInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStandardDeviationInterval: Self = this.set("standardDeviationInterval", js.undefined)
    
    @scala.inline
    def setSymbolType(value: `2d` | `3d-flat` | `3d-volumetric` | `3d-volumetric-uniform`): Self = this.set("symbolType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbolType: Self = this.set("symbolType", js.undefined)
    
    @scala.inline
    def setValueExpression(value: String): Self = this.set("valueExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueExpression: Self = this.set("valueExpression", js.undefined)
    
    @scala.inline
    def setValueExpressionTitle(value: String): Self = this.set("valueExpressionTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueExpressionTitle: Self = this.set("valueExpressionTitle", js.undefined)
    
    @scala.inline
    def setView(value: View): Self = this.set("view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
}
