package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RampTitle extends Object {
  /**
    * The field name used in a visual variable of a renderer. This is used in the generated title of the corresponding ramp in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RampTitle)
    */
  var field: String = js.native
  /**
    * If provided, the normalization field name used in a visual variable of a renderer. This is used in the generated title of the corresponding ramp in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RampTitle)
    */
  var normField: String = js.native
  /**
    * If `true`, the legend formats to display the field and normalization field as a ratio.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RampTitle)
    */
  var ratio: Boolean = js.native
  /**
    * If `true`, the legend formats to display the field and normalization field as a percentage.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RampTitle)
    */
  var ratioPercent: Boolean = js.native
  /**
    * If `true`, the legend formats to display the field and normalization field as a percentage of total.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RampTitle)
    */
  var ratioPercentTotal: Boolean = js.native
}

object RampTitle {
  @scala.inline
  def apply(
    constructor: js.Function,
    field: String,
    hasOwnProperty: PropertyKey => Boolean,
    normField: String,
    propertyIsEnumerable: PropertyKey => Boolean,
    ratio: Boolean,
    ratioPercent: Boolean,
    ratioPercentTotal: Boolean
  ): RampTitle = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), normField = normField.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), ratio = ratio.asInstanceOf[js.Any], ratioPercent = ratioPercent.asInstanceOf[js.Any], ratioPercentTotal = ratioPercentTotal.asInstanceOf[js.Any])
    __obj.asInstanceOf[RampTitle]
  }
  @scala.inline
  implicit class RampTitleOps[Self <: RampTitle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNormField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRatio(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRatioPercent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratioPercent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRatioPercentTotal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratioPercentTotal")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

