package typingsSlinky.daterangepicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object daterangepickerMod {
  import typingsSlinky.moment.momentMod.Moment

  type DataRangePickerCallback = js.Function3[/* start */ Moment, /* end */ Moment, /* label */ String | Null, Unit]
  type DateOrString = String | Moment | js.Date
}
