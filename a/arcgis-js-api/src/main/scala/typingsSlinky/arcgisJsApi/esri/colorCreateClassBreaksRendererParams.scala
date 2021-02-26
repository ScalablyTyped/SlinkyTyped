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
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.none
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.quantile
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.solid
import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait colorCreateClassBreaksRendererParams extends Object {
  
  /**
    * The [named string](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap) or basemap object of the Esri basemap that will be paired with the output visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createClassBreaksRenderer)
    */
  var basemap: js.UndefOr[String | Basemap] = js.native
  
  /**
    * The classification method used for generating breaks.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createClassBreaksRenderer)
    */
  var classificationMethod: js.UndefOr[`equal-interval` | `natural-breaks` | quantile | `standard-deviation`] = js.native
  
  /**
    * **This option only applies to generating renderers for mesh SceneLayers**.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createClassBreaksRenderer)
    */
  var colorMixMode: js.UndefOr[String] = js.native
  
  /**
    * In authoring apps, the user may select a pre-defined color scheme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createClassBreaksRenderer)
    */
  var colorScheme: js.UndefOr[ColorScheme] = js.native
  
  /**
    * Enables the `defaultSymbol` on the renderer and assigns it to features with no value and features that do not fall within the configured data range.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createClassBreaksRenderer)
    */
  var defaultSymbolEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether to add edges to the output renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createClassBreaksRenderer)
    */
  var edgesType: js.UndefOr[solid | none] = js.native
  
  /**
    * The name of the field whose data will be queried for statistics and classified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createClassBreaksRenderer)
    */
  var field: js.UndefOr[String] = js.native
  
  /**
    * The layer for which the visualization is generated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createClassBreaksRenderer)
    */
  var layer: FeatureLayer | SceneLayer | CSVLayer | GeoJSONLayer = js.native
  
  /**
    * Provides options for setting a title to describe a field instead of using the field name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createClassBreaksRenderer)
    */
  var legendOptions: js.UndefOr[colorCreateClassBreaksRendererParamsLegendOptions] = js.native
  
  /**
    * A maximum value set by the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createClassBreaksRenderer)
    */
  var maxValue: js.UndefOr[Double] = js.native
  
  /**
    * A minimum value set by the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createClassBreaksRenderer)
    */
  var minValue: js.UndefOr[Double] = js.native
  
  /**
    * The name of the field to normalize the values of the given `field`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createClassBreaksRenderer)
    */
  var normalizationField: js.UndefOr[String] = js.native
  
  /**
    * When `normalizationType` is `percent-of-total`, this property contains the total of all data values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createClassBreaksRenderer)
    */
  var normalizationTotal: js.UndefOr[Double] = js.native
  
  /**
    * Indicates how the data is normalized.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createClassBreaksRenderer)
    */
  var normalizationType: js.UndefOr[field | log | `percent-of-total`] = js.native
  
  /**
    * The number of class breaks to generate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createClassBreaksRenderer)
    */
  var numClasses: js.UndefOr[Double] = js.native
  
  /**
    * For polygon layers only.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createClassBreaksRenderer)
    */
  var outlineOptimizationEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Allows for cancelable requests.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createClassBreaksRenderer)
    */
  var signal: js.UndefOr[AbortSignal] = js.native
  
  /**
    * A SQL expression evaluating to a number.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createClassBreaksRenderer)
    */
  var sqlExpression: js.UndefOr[String] = js.native
  
  /**
    * A SQL where clause used to filter features for the statistics query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createClassBreaksRenderer)
    */
  var sqlWhere: js.UndefOr[String] = js.native
  
  /**
    * If a `standard-deviation` classification method is used, then this indicates the interval by which to generate class breaks.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createClassBreaksRenderer)
    */
  var standardDeviationInterval: js.UndefOr[Double] = js.native
  
  /**
    * The type of symbol to generate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createClassBreaksRenderer)
    */
  var symbolType: js.UndefOr[`2d` | `3d-flat` | `3d-volumetric` | `3d-volumetric-uniform`] = js.native
  
  /**
    * An [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression that returns a number.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createClassBreaksRenderer)
    */
  var valueExpression: js.UndefOr[String] = js.native
  
  /**
    * Text describing the value returned from the `valueExpression`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createClassBreaksRenderer)
    */
  var valueExpressionTitle: js.UndefOr[String] = js.native
  
  /**
    * The view where the input layer is rendered.
    *
    * [Read more...](global.html)
    */
  var view: js.UndefOr[View] = js.native
}
object colorCreateClassBreaksRendererParams {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    layer: FeatureLayer | SceneLayer | CSVLayer | GeoJSONLayer,
    propertyIsEnumerable: PropertyKey => Boolean
  ): colorCreateClassBreaksRendererParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), layer = layer.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[colorCreateClassBreaksRendererParams]
  }
  
  @scala.inline
  implicit class colorCreateClassBreaksRendererParamsMutableBuilder[Self <: colorCreateClassBreaksRendererParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBasemap(value: String | Basemap): Self = StObject.set(x, "basemap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasemapUndefined: Self = StObject.set(x, "basemap", js.undefined)
    
    @scala.inline
    def setClassificationMethod(value: `equal-interval` | `natural-breaks` | quantile | `standard-deviation`): Self = StObject.set(x, "classificationMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassificationMethodUndefined: Self = StObject.set(x, "classificationMethod", js.undefined)
    
    @scala.inline
    def setColorMixMode(value: String): Self = StObject.set(x, "colorMixMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorMixModeUndefined: Self = StObject.set(x, "colorMixMode", js.undefined)
    
    @scala.inline
    def setColorScheme(value: ColorScheme): Self = StObject.set(x, "colorScheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorSchemeUndefined: Self = StObject.set(x, "colorScheme", js.undefined)
    
    @scala.inline
    def setDefaultSymbolEnabled(value: Boolean): Self = StObject.set(x, "defaultSymbolEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultSymbolEnabledUndefined: Self = StObject.set(x, "defaultSymbolEnabled", js.undefined)
    
    @scala.inline
    def setEdgesType(value: solid | none): Self = StObject.set(x, "edgesType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgesTypeUndefined: Self = StObject.set(x, "edgesType", js.undefined)
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setLayer(value: FeatureLayer | SceneLayer | CSVLayer | GeoJSONLayer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendOptions(value: colorCreateClassBreaksRendererParamsLegendOptions): Self = StObject.set(x, "legendOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendOptionsUndefined: Self = StObject.set(x, "legendOptions", js.undefined)
    
    @scala.inline
    def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    @scala.inline
    def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
    
    @scala.inline
    def setNormalizationField(value: String): Self = StObject.set(x, "normalizationField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalizationFieldUndefined: Self = StObject.set(x, "normalizationField", js.undefined)
    
    @scala.inline
    def setNormalizationTotal(value: Double): Self = StObject.set(x, "normalizationTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalizationTotalUndefined: Self = StObject.set(x, "normalizationTotal", js.undefined)
    
    @scala.inline
    def setNormalizationType(value: field | log | `percent-of-total`): Self = StObject.set(x, "normalizationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalizationTypeUndefined: Self = StObject.set(x, "normalizationType", js.undefined)
    
    @scala.inline
    def setNumClasses(value: Double): Self = StObject.set(x, "numClasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumClassesUndefined: Self = StObject.set(x, "numClasses", js.undefined)
    
    @scala.inline
    def setOutlineOptimizationEnabled(value: Boolean): Self = StObject.set(x, "outlineOptimizationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineOptimizationEnabledUndefined: Self = StObject.set(x, "outlineOptimizationEnabled", js.undefined)
    
    @scala.inline
    def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    @scala.inline
    def setSqlExpression(value: String): Self = StObject.set(x, "sqlExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqlExpressionUndefined: Self = StObject.set(x, "sqlExpression", js.undefined)
    
    @scala.inline
    def setSqlWhere(value: String): Self = StObject.set(x, "sqlWhere", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqlWhereUndefined: Self = StObject.set(x, "sqlWhere", js.undefined)
    
    @scala.inline
    def setStandardDeviationInterval(value: Double): Self = StObject.set(x, "standardDeviationInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandardDeviationIntervalUndefined: Self = StObject.set(x, "standardDeviationInterval", js.undefined)
    
    @scala.inline
    def setSymbolType(value: `2d` | `3d-flat` | `3d-volumetric` | `3d-volumetric-uniform`): Self = StObject.set(x, "symbolType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolTypeUndefined: Self = StObject.set(x, "symbolType", js.undefined)
    
    @scala.inline
    def setValueExpression(value: String): Self = StObject.set(x, "valueExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueExpressionTitle(value: String): Self = StObject.set(x, "valueExpressionTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueExpressionTitleUndefined: Self = StObject.set(x, "valueExpressionTitle", js.undefined)
    
    @scala.inline
    def setValueExpressionUndefined: Self = StObject.set(x, "valueExpression", js.undefined)
    
    @scala.inline
    def setView(value: View): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
