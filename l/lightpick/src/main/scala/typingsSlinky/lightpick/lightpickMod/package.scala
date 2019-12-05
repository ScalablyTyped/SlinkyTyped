package typingsSlinky.lightpick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object lightpickMod {
  import typingsSlinky.moment.momentMod.Moment
  import typingsSlinky.moment.momentMod.MomentFormatSpecification
  import typingsSlinky.moment.momentMod.MomentInput

  type DisabledDate = InputDate | InputDateRange
  type FormatSpecification = MomentFormatSpecification
  type InputDate = MomentInput | Null
  type InputDateRange = js.Tuple2[InputDate, InputDate]
  type Options = Options_
  type OutputDate = Moment | Null
}
