package typingsSlinky.arcgisDashJsDashApi.__esri

import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`above-and-below`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`centered-on`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`high-to-low`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`percent-of-total`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.days
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.extremes
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.hours
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.minutes
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.months
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.percent
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.ratio
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.seconds
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.years
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthoringInfoVisualVariableProperties extends js.Object {
  /**
    * If an age or timeline renderer was generated, indicates the end time of the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfoVisualVariable.html#endTime)
    */
  var endTime: js.UndefOr[String | Double] = js.undefined
  /**
    * Indicates the field name used for generating the data-driven visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfoVisualVariable.html#field)
    */
  var field: js.UndefOr[String] = js.undefined
  /**
    * Indicates the value of the upper handle if a slider was used to generate the visual variable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfoVisualVariable.html#maxSliderValue)
    */
  var maxSliderValue: js.UndefOr[Double] = js.undefined
  /**
    * Indicates the value of the lower handle if a slider was used to generate the visual variable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfoVisualVariable.html#minSliderValue)
    */
  var minSliderValue: js.UndefOr[Double] = js.undefined
  /**
    * If an age or timeline renderer was generated, indicates the start time of the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfoVisualVariable.html#startTime)
    */
  var startTime: js.UndefOr[String | Double] = js.undefined
  /**
    * If the UI offers the option to display values based on a ratio or percentage, this indicates which selection was made.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfoVisualVariable.html#style)
    */
  var style: js.UndefOr[percent | `percent-of-total` | ratio] = js.undefined
  /**
    * Indicates the theme selected by the user when generating a renderer or visual variable with one of the Smart Mapping functions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfoVisualVariable.html#theme)
    */
  var theme: js.UndefOr[`above-and-below` | `centered-on` | extremes | `high-to-low`] = js.undefined
  /**
    * The type of visual variable generated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfoVisualVariable.html#type)
    */
  var `type`: js.UndefOr[
    typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.color | typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.size | typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.opacity
  ] = js.undefined
  /**
    * If an age or timeline renderer was generated, indicates the time units used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfoVisualVariable.html#units)
    */
  var units: js.UndefOr[seconds | minutes | hours | days | months | years] = js.undefined
}

object AuthoringInfoVisualVariableProperties {
  @scala.inline
  def apply(
    endTime: String | Double = null,
    field: String = null,
    maxSliderValue: Int | Double = null,
    minSliderValue: Int | Double = null,
    startTime: String | Double = null,
    style: percent | `percent-of-total` | ratio = null,
    theme: `above-and-below` | `centered-on` | extremes | `high-to-low` = null,
    `type`: typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.color | typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.size | typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.opacity = null,
    units: seconds | minutes | hours | days | months | years = null
  ): AuthoringInfoVisualVariableProperties = {
    val __obj = js.Dynamic.literal()
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (maxSliderValue != null) __obj.updateDynamic("maxSliderValue")(maxSliderValue.asInstanceOf[js.Any])
    if (minSliderValue != null) __obj.updateDynamic("minSliderValue")(minSliderValue.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (units != null) __obj.updateDynamic("units")(units.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthoringInfoVisualVariableProperties]
  }
}

