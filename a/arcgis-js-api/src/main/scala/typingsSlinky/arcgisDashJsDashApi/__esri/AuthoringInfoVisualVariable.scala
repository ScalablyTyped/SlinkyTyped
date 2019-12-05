package typingsSlinky.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
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

@js.native
trait AuthoringInfoVisualVariable
  extends Accessor
     with JSONSupport {
  /**
    * If an age or timeline renderer was generated, indicates the end time of the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfoVisualVariable.html#endTime)
    */
  var endTime: String | Double = js.native
  /**
    * Indicates the field name used for generating the data-driven visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfoVisualVariable.html#field)
    */
  var field: String = js.native
  /**
    * Indicates the value of the upper handle if a slider was used to generate the visual variable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfoVisualVariable.html#maxSliderValue)
    */
  var maxSliderValue: Double = js.native
  /**
    * Indicates the value of the lower handle if a slider was used to generate the visual variable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfoVisualVariable.html#minSliderValue)
    */
  var minSliderValue: Double = js.native
  /**
    * If an age or timeline renderer was generated, indicates the start time of the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfoVisualVariable.html#startTime)
    */
  var startTime: String | Double = js.native
  /**
    * If the UI offers the option to display values based on a ratio or percentage, this indicates which selection was made.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfoVisualVariable.html#style)
    */
  var style: percent | `percent-of-total` | ratio = js.native
  /**
    * Indicates the theme selected by the user when generating a renderer or visual variable with one of the Smart Mapping functions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfoVisualVariable.html#theme)
    */
  var theme: `above-and-below` | `centered-on` | extremes | `high-to-low` = js.native
  /**
    * The type of visual variable generated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfoVisualVariable.html#type)
    */
  var `type`: typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.color | typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.size | typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.opacity = js.native
  /**
    * If an age or timeline renderer was generated, indicates the time units used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfoVisualVariable.html#units)
    */
  var units: seconds | minutes | hours | days | months | years = js.native
}

@JSGlobal("__esri.AuthoringInfoVisualVariable")
@js.native
object AuthoringInfoVisualVariable extends TopLevel[AuthoringInfoVisualVariableConstructor]

