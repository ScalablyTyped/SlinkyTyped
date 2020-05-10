package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassBreaksResult extends Object {
  /**
    * An array of objects describing the class breaks generated from the [classBreaks()](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-classBreaks.html#classBreaks) method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-classBreaks.html#ClassBreaksResult)
    */
  var classBreakInfos: js.Array[ClassBreak] = js.native
  /**
    * The maximum value of features in the dataset. This will be the upper bound of the highest class break.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-classBreaks.html#ClassBreaksResult)
    */
  var maxValue: Double = js.native
  /**
    * The minimum value of features in the dataset. This will be the lower bound of the lowest class break.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-classBreaks.html#ClassBreaksResult)
    */
  var minValue: Double = js.native
  /**
    * The normalization total if `normalizationType` is set to `percent-of-total` when generating class breaks with [createClassBreaksRenderer()](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#createClassBreaksRenderer).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-classBreaks.html#ClassBreaksResult)
    */
  var normalizationTotal: Double = js.native
}

object ClassBreaksResult {
  @scala.inline
  def apply(
    classBreakInfos: js.Array[ClassBreak],
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    maxValue: Double,
    minValue: Double,
    normalizationTotal: Double,
    propertyIsEnumerable: PropertyKey => Boolean
  ): ClassBreaksResult = {
    val __obj = js.Dynamic.literal(classBreakInfos = classBreakInfos.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), maxValue = maxValue.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any], normalizationTotal = normalizationTotal.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[ClassBreaksResult]
  }
  @scala.inline
  implicit class ClassBreaksResultOps[Self <: ClassBreaksResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassBreakInfos(value: js.Array[ClassBreak]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classBreakInfos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNormalizationTotal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizationTotal")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

