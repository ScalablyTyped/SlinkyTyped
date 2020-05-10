package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`above-and-below`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`centered-on`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`high-to-low`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`percent-of-total`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.days
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.extremes
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.hours
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.minutes
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.months
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.percent
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.ratio
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.seconds
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.years
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthoringInfoVisualVariableProperties extends js.Object {
  /**
    * If an age or timeline renderer was generated, indicates the end time of the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfoVisualVariable.html#endTime)
    */
  var endTime: js.UndefOr[String | Double] = js.native
  /**
    * Indicates the field name used for generating the data-driven visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfoVisualVariable.html#field)
    */
  var field: js.UndefOr[String] = js.native
  /**
    * Indicates the value of the upper handle if a slider was used to generate the visual variable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfoVisualVariable.html#maxSliderValue)
    */
  var maxSliderValue: js.UndefOr[Double] = js.native
  /**
    * Indicates the value of the lower handle if a slider was used to generate the visual variable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfoVisualVariable.html#minSliderValue)
    */
  var minSliderValue: js.UndefOr[Double] = js.native
  /**
    * If an age or timeline renderer was generated, indicates the start time of the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfoVisualVariable.html#startTime)
    */
  var startTime: js.UndefOr[String | Double] = js.native
  /**
    * If the UI offers the option to display values based on a ratio or percentage, this indicates which selection was made.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfoVisualVariable.html#style)
    */
  var style: js.UndefOr[percent | `percent-of-total` | ratio] = js.native
  /**
    * Indicates the theme selected by the user when generating a renderer or visual variable with one of the Smart Mapping functions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfoVisualVariable.html#theme)
    */
  var theme: js.UndefOr[`above-and-below` | `centered-on` | extremes | `high-to-low`] = js.native
  /**
    * The type of visual variable generated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfoVisualVariable.html#type)
    */
  var `type`: js.UndefOr[
    typingsSlinky.arcgisJsApi.arcgisJsApiStrings.color | typingsSlinky.arcgisJsApi.arcgisJsApiStrings.size | typingsSlinky.arcgisJsApi.arcgisJsApiStrings.opacity
  ] = js.native
  /**
    * If an age or timeline renderer was generated, indicates the time units used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfoVisualVariable.html#units)
    */
  var units: js.UndefOr[seconds | minutes | hours | days | months | years] = js.native
}

object AuthoringInfoVisualVariableProperties {
  @scala.inline
  def apply(): AuthoringInfoVisualVariableProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthoringInfoVisualVariableProperties]
  }
  @scala.inline
  implicit class AuthoringInfoVisualVariablePropertiesOps[Self <: AuthoringInfoVisualVariableProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndTime(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(js.undefined)
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
    def withStartTime(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: percent | `percent-of-total` | ratio): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: `above-and-below` | `centered-on` | extremes | `high-to-low`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
    @scala.inline
    def withType(
      value: typingsSlinky.arcgisJsApi.arcgisJsApiStrings.color | typingsSlinky.arcgisJsApi.arcgisJsApiStrings.size | typingsSlinky.arcgisJsApi.arcgisJsApiStrings.opacity
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
    def withUnits(value: seconds | minutes | hours | days | months | years): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("units")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("units")(js.undefined)
        ret
    }
  }
  
}

