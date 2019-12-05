package typingsSlinky.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.centuries
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.days
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.decades
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.hours
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.milliseconds
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.minutes
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.months
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.seconds
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.weeks
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.years
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeInterval extends JSONSupport {
  /**
    * Temporal units.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeInterval.html#unit)
    *
    * @default milliseconds
    */
  var unit: milliseconds | seconds | minutes | hours | days | weeks | months | years | decades | centuries
  /**
    * The numerical value of the time extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeInterval.html#value)
    *
    * @default 0
    */
  var value: Double
}

@JSGlobal("__esri.TimeInterval")
@js.native
object TimeInterval extends TopLevel[TimeIntervalConstructor]

