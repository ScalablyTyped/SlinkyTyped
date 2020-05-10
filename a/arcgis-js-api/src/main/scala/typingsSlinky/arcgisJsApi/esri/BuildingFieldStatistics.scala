package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildingFieldStatistics extends Object {
  /**
    * Name of the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingSummaryStatistics.html#BuildingFieldStatistics)
    */
  var fieldName: String = js.native
  /**
    * Label of the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingSummaryStatistics.html#BuildingFieldStatistics)
    */
  var label: String = js.native
  /**
    * Maximum value of the field for numeric values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingSummaryStatistics.html#BuildingFieldStatistics)
    */
  var max: Double = js.native
  /**
    * Minimum value of the field for numeric values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingSummaryStatistics.html#BuildingFieldStatistics)
    */
  var min: Double = js.native
  /**
    * Model Name of the field. This can be used to identify certain special fields, like floor number, or phase id.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingSummaryStatistics.html#BuildingFieldStatistics)
    */
  var modelName: String = js.native
  /**
    * List of the most frequent values of the field. This is not guaranteed to be a complete list of all values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingSummaryStatistics.html#BuildingFieldStatistics)
    */
  var mostFrequentValues: js.Array[Double | String] = js.native
  /**
    * List of sublayer ids where this field is available.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingSummaryStatistics.html#BuildingFieldStatistics)
    */
  var subLayerIds: js.Array[Double] = js.native
}

object BuildingFieldStatistics {
  @scala.inline
  def apply(
    constructor: js.Function,
    fieldName: String,
    hasOwnProperty: PropertyKey => Boolean,
    label: String,
    max: Double,
    min: Double,
    modelName: String,
    mostFrequentValues: js.Array[Double | String],
    propertyIsEnumerable: PropertyKey => Boolean,
    subLayerIds: js.Array[Double]
  ): BuildingFieldStatistics = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], fieldName = fieldName.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), label = label.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], modelName = modelName.asInstanceOf[js.Any], mostFrequentValues = mostFrequentValues.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), subLayerIds = subLayerIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildingFieldStatistics]
  }
  @scala.inline
  implicit class BuildingFieldStatisticsOps[Self <: BuildingFieldStatistics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFieldName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModelName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMostFrequentValues(value: js.Array[Double | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mostFrequentValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubLayerIds(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subLayerIds")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

