package typingsSlinky.eonasdanDashBootstrapDashDatetimepicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object eonasdanDashBootstrapDashDatetimepickerMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.moment.momentMod.Moment

  type DateComparable = String | js.Date | Moment
  type FromTo = js.Tuple2[Moment, Moment]
  type IndexedDates = StringDictionary[Boolean]
  type IndexedHours = StringDictionary[Boolean]
  type ParseInputDateFunction = js.Function1[/* inputDate */ String, Moment]
}
