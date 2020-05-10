package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`class-breaks-color`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`class-breaks-size`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`classed-color`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`classed-size`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`decimal-degrees`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`equal-interval`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`natural-breaks`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`nautical-miles`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`standard-deviation`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`univariate-color-size`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.centimeters
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.decimeters
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.feet_
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.inches
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.kilometers_
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.manual
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.meters_
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.miles_
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.millimeters
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.quantile
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.yards
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthoringInfoProperties extends js.Object {
  /**
    * Indicates which classification method was used if a classed color or classed size renderer was generated using one of the Smart Mapping functions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#classificationMethod)
    */
  var classificationMethod: js.UndefOr[`equal-interval` | manual | `natural-breaks` | quantile | `standard-deviation`] = js.native
  /**
    * Indicates the color ramp was used to create the symbols for Unique Value or Class Breaks renderer for Imagery Layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#colorRamp)
    */
  var colorRamp: js.UndefOr[ColorRampProperties] = js.native
  /**
    * A numeric field used for generating a [relationship renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-relationship.html) along with [field2](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#field2). In the default visualization, the values of this field are rendered along the vertical axis of the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#field1)
    */
  var field1: js.UndefOr[AuthoringInfoField1] = js.native
  /**
    * A numeric field used for generating a [relationship renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-relationship.html) along with [field1](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#field1). In the default visualization, the values of this field are rendered along the horizontal axis of the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#field2)
    */
  var field2: js.UndefOr[AuthoringInfoField2] = js.native
  /**
    * An array of string values representing field names used for creating a [predominance renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-predominance.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#fields)
    */
  var fields: js.UndefOr[js.Array[String]] = js.native
  /**
    * The focus of a [relationship renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-relationship.html). This determines the orientation of the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#focus)
    */
  var focus: js.UndefOr[String] = js.native
  /**
    * **Only applicable to renderer used in web scenes.** Indicates the unit used in real-world sizes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#lengthUnit)
    */
  var lengthUnit: js.UndefOr[
    inches | feet_ | yards | miles_ | `nautical-miles` | millimeters | centimeters | decimeters | meters_ | kilometers_ | `decimal-degrees`
  ] = js.native
  /**
    * Indicates the value of the upper handle if a slider was used to generate the dot value for dot density renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#maxSliderValue)
    */
  var maxSliderValue: js.UndefOr[Double] = js.native
  /**
    * Indicates the value of the lower handle if a slider was used to generate the dot value for dot density renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#minSliderValue)
    */
  var minSliderValue: js.UndefOr[Double] = js.native
  /**
    * The number of classes used to classify each field of a [relationship renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-relationship.html). This determines the number of categories in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#numClasses)
    */
  var numClasses: js.UndefOr[Double] = js.native
  /**
    * Indicates the standard deviation interval for each stop in a classed color or classed size renderer that was generated using the `standard-deviation` classification method.  **Possible Values:** 0.25 | 0.33 | 0.5 | 1
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#standardDeviationInterval)
    */
  var standardDeviationInterval: js.UndefOr[Double] = js.native
  /**
    * Indicates the renderer type generated from one of the Smart Mapping functions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#type)
    */
  var `type`: js.UndefOr[
    `class-breaks-size` | `class-breaks-color` | `classed-color` | `classed-size` | typingsSlinky.arcgisJsApi.arcgisJsApiStrings.predominance | typingsSlinky.arcgisJsApi.arcgisJsApiStrings.relationship | `univariate-color-size`
  ] = js.native
  /**
    * Contains authoring properties of visual variables generated from one of the Smart Mapping methods or sliders.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#visualVariables)
    */
  var visualVariables: js.UndefOr[js.Array[AuthoringInfoVisualVariableProperties]] = js.native
}

object AuthoringInfoProperties {
  @scala.inline
  def apply(): AuthoringInfoProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthoringInfoProperties]
  }
  @scala.inline
  implicit class AuthoringInfoPropertiesOps[Self <: AuthoringInfoProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassificationMethod(value: `equal-interval` | manual | `natural-breaks` | quantile | `standard-deviation`): Self = {
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
    def withColorRamp(value: ColorRampProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorRamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorRamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorRamp")(js.undefined)
        ret
    }
    @scala.inline
    def withField1(value: AuthoringInfoField1): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutField1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field1")(js.undefined)
        ret
    }
    @scala.inline
    def withField2(value: AuthoringInfoField2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutField2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field2")(js.undefined)
        ret
    }
    @scala.inline
    def withFields(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withFocus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(js.undefined)
        ret
    }
    @scala.inline
    def withLengthUnit(
      value: inches | feet_ | yards | miles_ | `nautical-miles` | millimeters | centimeters | decimeters | meters_ | kilometers_ | `decimal-degrees`
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lengthUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLengthUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lengthUnit")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxSliderValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSliderValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSliderValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSliderValue")(js.undefined)
        ret
    }
    @scala.inline
    def withMinSliderValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSliderValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinSliderValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSliderValue")(js.undefined)
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
    def withType(
      value: `class-breaks-size` | `class-breaks-color` | `classed-color` | `classed-size` | typingsSlinky.arcgisJsApi.arcgisJsApiStrings.predominance | typingsSlinky.arcgisJsApi.arcgisJsApiStrings.relationship | `univariate-color-size`
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withVisualVariables(value: js.Array[AuthoringInfoVisualVariableProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visualVariables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisualVariables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visualVariables")(js.undefined)
        ret
    }
  }
  
}

