package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoundedMinMax extends Object {
  /**
    * See [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#field).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#BoundedMinMax)
    */
  var field: js.UndefOr[String] = js.native
  /**
    * See [maxDataValue](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#maxDataValue).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#BoundedMinMax)
    */
  var maxDataValue: Double = js.native
  /**
    * The size used to render a feature containing the maximum data value.
    *   * When setting a number, sizes are expressed in points for all 2D symbols and 3D flat symbol layers; size is expressed in meters for all 3D volumetric symbols.
    *   * String values are only supported for 2D symbols and 3D flat symbol layers. Strings may specify size in either points or pixels (e.g. `minSize: "16pt"`, `minSize: "12px"`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#BoundedMinMax)
    */
  var maxSize: String | Double = js.native
  /**
    * See [minDataValue](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#minDataValue).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#BoundedMinMax)
    */
  var minDataValue: Double = js.native
  /**
    * The size used to render a feature containing the minimum data value.
    *   * When setting a number, sizes are expressed in points for all 2D symbols and 3D flat symbol layers; size is expressed in meters for all 3D volumetric symbols.
    *   * String values are only supported for 2D symbols and 3D flat symbol layers. Strings may specify size in either points or pixels (e.g. `minSize: "16pt"`, `minSize: "12px"`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#BoundedMinMax)
    */
  var minSize: String | Double = js.native
  /**
    * See [normalizationField](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#normalizationField).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#BoundedMinMax)
    */
  var normalizationField: js.UndefOr[String] = js.native
  /**
    * Value must be `size`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#BoundedMinMax)
    */
  var `type`: String = js.native
  /**
    * See [valueExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#valueExpression).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#BoundedMinMax)
    */
  var valueExpression: js.UndefOr[String] = js.native
  /**
    * See [valueExpressionTitle](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#valueExpressionTitle).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#BoundedMinMax)
    */
  var valueExpressionTitle: js.UndefOr[String] = js.native
}

object BoundedMinMax {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    maxDataValue: Double,
    maxSize: String | Double,
    minDataValue: Double,
    minSize: String | Double,
    propertyIsEnumerable: PropertyKey => Boolean,
    `type`: String
  ): BoundedMinMax = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), maxDataValue = maxDataValue.asInstanceOf[js.Any], maxSize = maxSize.asInstanceOf[js.Any], minDataValue = minDataValue.asInstanceOf[js.Any], minSize = minSize.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoundedMinMax]
  }
  @scala.inline
  implicit class BoundedMinMaxOps[Self <: BoundedMinMax] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxDataValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDataValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxSize(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinDataValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDataValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinSize(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
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

