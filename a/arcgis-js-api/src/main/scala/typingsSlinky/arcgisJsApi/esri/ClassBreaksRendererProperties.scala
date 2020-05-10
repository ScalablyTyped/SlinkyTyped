package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`percent-of-total`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.field
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.log
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassBreaksRendererProperties
  extends RendererProperties
     with VisualVariablesMixinProperties {
  /**
    * When symbolizing polygon features with graduated symbols, set a [FillSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol.html) on this property to visualize the boundaries of each feature. Use a [FillSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol.html) of varying sizes in the [classBreakInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#classBreakInfos) to indicate the quantity.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#backgroundFillSymbol)
    */
  var backgroundFillSymbol: js.UndefOr[FillSymbolProperties | PolygonSymbol3DProperties] = js.native
  /**
    * Each element in the array is an object that provides information about a class break associated with the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#classBreakInfos)
    */
  var classBreakInfos: js.UndefOr[js.Array[ClassBreakInfoProperties]] = js.native
  /**
    * Label used in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) to describe features assigned the [default symbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#defaultSymbol). The [default symbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#defaultSymbol) is used to draw all features with unspecified, unmatched values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#defaultLabel)
    */
  var defaultLabel: js.UndefOr[String] = js.native
  /**
    * The default symbol assigned to features with a value not matched to a given break. If `null`, unmatched features will not be assigned a symbol.
    * > **Known Limitations**  SceneLayers with a `mesh` [geometryType](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#geometryType) will display unmatching features with a generic symbol even if the `defaultSymbol` is `null`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#defaultSymbol)
    */
  var defaultSymbol: js.UndefOr[SymbolProperties] = js.native
  /**
    * The name of a numeric attribute field whose data determines the symbol of each feature based on the class breaks defined in [classBreakInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#classBreakInfos).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#field)
    */
  var field: js.UndefOr[String] = js.native
  /**
    * An object providing options for displaying the renderer in the Legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#legendOptions)
    */
  var legendOptions: js.UndefOr[ClassBreaksRendererLegendOptions] = js.native
  /**
    * When [normalizationType](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#normalizationType) is `field`, this property contains the attribute field name used for normalization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#normalizationField)
    */
  var normalizationField: js.UndefOr[String] = js.native
  /**
    * When [normalizationType](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#normalizationType) is `percent-of-total`, this property contains the total of all data values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#normalizationTotal)
    */
  var normalizationTotal: js.UndefOr[Double] = js.native
  /**
    * Indicates how the data is normalized. If this property is defined, then the class breaks contain a normalized min/max value instead of the value in the given [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#field). The data value obtained from the field is normalized in one of the following ways before it is compared with the class breaks. See the table below for a list of possible values.
    *
    * Possible Value | Description
    * ---------------|------------
    * field | Divides the data value using the attribute value of the field specified in the [normalizationField](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#normalizationField) property. This value is set by default if the [normalizationField](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#normalizationField) is provided.
    * log | Computes the base 10 logarithm of the data value. This can be a useful approach for some data distributions because it reduces the influence of very large data values.
    * percent-of-total | Divides the data value by the sum of all data values then multiplies by 100. Use [normalizationTotal](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#normalizationTotal) to define the total value by which to normalize. This value is set by default if the [normalizationTotal](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#normalizationTotal) is provided.
    *
    * With the exception of `log` normalization, data normalization creates a ratio by dividing two values. When comparing attribute values between features, normalization minimizes the effect of varying map areas and the number of observations.  For example, dividing the 18 to 30 year old population by the area of a polygon feature yields a density value that can be compared evenly with other features, regardless of their size.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#normalizationType)
    */
  var normalizationType: js.UndefOr[field | log | `percent-of-total`] = js.native
  /**
    * An [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression evaluating to a number. This expression can reference field values using the `$feature` global variable and perform mathematical calculations and logical evaluations at runtime.  This property is typically used as an alternative to [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#field) for data-driven visualizations.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#valueExpression)
    */
  var valueExpression: js.UndefOr[String] = js.native
  /**
    * The title identifying and describing the associated [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression as defined in the [valueExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#valueExpression) property. This is displayed as the title of the corresponding renderer in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) in the absence of a provided `title` in the [legendOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#legendOptions) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#valueExpressionTitle)
    */
  var valueExpressionTitle: js.UndefOr[String] = js.native
}

object ClassBreaksRendererProperties {
  @scala.inline
  def apply(): ClassBreaksRendererProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassBreaksRendererProperties]
  }
  @scala.inline
  implicit class ClassBreaksRendererPropertiesOps[Self <: ClassBreaksRendererProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundFillSymbol(value: FillSymbolProperties | PolygonSymbol3DProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundFillSymbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundFillSymbol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundFillSymbol")(js.undefined)
        ret
    }
    @scala.inline
    def withClassBreakInfos(value: js.Array[ClassBreakInfoProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classBreakInfos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassBreakInfos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classBreakInfos")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultSymbol(value: SymbolProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSymbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSymbol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSymbol")(js.undefined)
        ret
    }
    @scala.inline
    def withField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(js.undefined)
        ret
    }
    @scala.inline
    def withLegendOptions(value: ClassBreaksRendererLegendOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegendOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withNormalizationField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizationField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNormalizationField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizationField")(js.undefined)
        ret
    }
    @scala.inline
    def withNormalizationTotal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizationTotal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNormalizationTotal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizationTotal")(js.undefined)
        ret
    }
    @scala.inline
    def withNormalizationType(value: field | log | `percent-of-total`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNormalizationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizationType")(js.undefined)
        ret
    }
    @scala.inline
    def withValueExpression(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withValueExpressionTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueExpressionTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueExpressionTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueExpressionTitle")(js.undefined)
        ret
    }
  }
  
}

