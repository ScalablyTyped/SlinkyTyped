package typingsSlinky.arcgisJsApi.esri

import org.scalajs.dom.experimental.AbortSignal
import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait classBreaksClassBreaksParams extends Object {
  /**
    * The method for classifying the data. See the table below for a list of possible values.
    *
    * | Possible Value | Description |
    * |---------------|------------ |
    * | natural-breaks | Data values that cluster are placed into a single class. Class breaks occur where gaps exist between clusters. You should use this method if your data is unevenly distributed; that is, many features have the same or similar values and there are gaps between groups of values. |
    * | equal-interval | Each class has an equal range of values; in other words, the difference between the high and low value is equal for each class. You should use this method if your data is evenly distributed and you want to emphasize the difference in values between the features. |
    * | quantile | Each class has roughly the same number of features. If your data is evenly distributed and you want to emphasize the difference in relative position between features, you should use the quantile classification method. If, for example, the point values are divided into five classes, points in the highest class would fall into the top fifth of all points.  |
    * | standard-deviation | Class breaks are placed above and below the mean value at intervals of `1`, `0.5`, or `0.25` standard deviations until all the data values are included in a class.  |
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-classBreaks.html#classBreaks)
    */
  var classificationMethod: js.UndefOr[String] = js.native
  /**
    * A subset of features for which to generate the class breaks.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-classBreaks.html#classBreaks)
    */
  var features: js.UndefOr[js.Array[Graphic]] = js.native
  /**
    * The class breaks will be generated based on values of this field. If a field is provided, the values from the given field from all features will be queried in the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-classBreaks.html#classBreaks)
    */
  var field: js.UndefOr[String] = js.native
  /**
    * The layer from which to generate class breaks.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-classBreaks.html#classBreaks)
    */
  var layer: FeatureLayer | SceneLayer | CSVLayer | PointCloudLayer | GeoJSONLayer = js.native
  /**
    * The maximum bounding value for the class breaks definition. Use this in conjunction with `minValue` to generate class breaks between lower and upper bounds.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-classBreaks.html#classBreaks)
    */
  var maxValue: js.UndefOr[Double] = js.native
  /**
    * The minimum bounding value for the class breaks definition. Use this in conjunction with `maxValue` to generate class breaks between lower and upper bounds.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-classBreaks.html#classBreaks)
    */
  var minValue: js.UndefOr[Double] = js.native
  /**
    * The field by which to normalize the values returned from the given `field`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-classBreaks.html#classBreaks)
    */
  var normalizationField: js.UndefOr[String] = js.native
  /**
    * Indicates the number of classes to generate for the class breaks definition.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-classBreaks.html#classBreaks)
    */
  var numClasses: js.UndefOr[Double] = js.native
  /**
    * Allows for cancelable requests. If canceled, the promise will be rejected with an error named `AbortError`. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-classBreaks.html#classBreaks)
    */
  var signal: js.UndefOr[AbortSignal] = js.native
  /**
    * A SQL expression evaluating to a number.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-classBreaks.html#classBreaks)
    */
  var sqlExpression: js.UndefOr[String] = js.native
  /**
    * A SQL where clause used to filter features for the statistics query. For example, this is useful in situations where you want to avoid dividing by zero as is the case with creating a predominance visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-classBreaks.html#classBreaks)
    */
  var sqlWhere: js.UndefOr[String] = js.native
  /**
    * When `classificationMethod = "standard-deviation"`, this sets the interval at which each class break should be set (e.g. `0.25`, `0.33`, `0.5`, `1`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-classBreaks.html#classBreaks)
    */
  var standardDeviationInterval: js.UndefOr[Double] = js.native
  /**
    * An [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression that returns a number. This expression can reference field values using the `$feature` global variable. This property overrides the `field` property and therefore is used instead of an input `field` value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-classBreaks.html#classBreaks)
    */
  var valueExpression: js.UndefOr[String] = js.native
  /**
    * A [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) or [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) instance is required when a `valueExpression` is specified.
    *
    * [Read more...](global.html)
    */
  var view: js.UndefOr[View] = js.native
}

object classBreaksClassBreaksParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    layer: FeatureLayer | SceneLayer | CSVLayer | PointCloudLayer | GeoJSONLayer,
    propertyIsEnumerable: PropertyKey => Boolean
  ): classBreaksClassBreaksParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), layer = layer.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[classBreaksClassBreaksParams]
  }
  @scala.inline
  implicit class classBreaksClassBreaksParamsOps[Self <: classBreaksClassBreaksParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLayer(value: FeatureLayer | SceneLayer | CSVLayer | PointCloudLayer | GeoJSONLayer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassificationMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classificationMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassificationMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classificationMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withFeatures(value: js.Array[Graphic]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features")(js.undefined)
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
    def withMaxValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValue")(js.undefined)
        ret
    }
    @scala.inline
    def withMinValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValue")(js.undefined)
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
    def withNumClasses(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numClasses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumClasses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numClasses")(js.undefined)
        ret
    }
    @scala.inline
    def withSignal(value: AbortSignal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signal")(js.undefined)
        ret
    }
    @scala.inline
    def withSqlExpression(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sqlExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSqlExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sqlExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withSqlWhere(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sqlWhere")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSqlWhere: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sqlWhere")(js.undefined)
        ret
    }
    @scala.inline
    def withStandardDeviationInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standardDeviationInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStandardDeviationInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standardDeviationInterval")(js.undefined)
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
    def withView(value: View): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(js.undefined)
        ret
    }
  }
  
}

