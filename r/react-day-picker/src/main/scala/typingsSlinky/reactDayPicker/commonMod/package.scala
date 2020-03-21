package typingsSlinky.reactDayPicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object commonMod {
  type FunctionModifier = js.Function1[/* date */ js.Date, scala.Boolean]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.std.Date
    - typingsSlinky.reactDayPicker.commonMod.RangeModifier
    - typingsSlinky.reactDayPicker.commonMod.BeforeModifier
    - typingsSlinky.reactDayPicker.commonMod.AfterModifier
    - typingsSlinky.reactDayPicker.commonMod.BeforeAfterModifier
    - typingsSlinky.reactDayPicker.commonMod.DaysOfWeekModifier
    - typingsSlinky.reactDayPicker.commonMod.FunctionModifier
    - `js.undefined`
  */
  type Modifier = js.UndefOr[
    typingsSlinky.reactDayPicker.commonMod._Modifier | js.Date | typingsSlinky.reactDayPicker.commonMod.FunctionModifier
  ]
}
