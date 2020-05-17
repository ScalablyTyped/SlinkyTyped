package typingsSlinky.momentMini

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DurationInputArg2 = typingsSlinky.momentMini.mod.unitOfTime.DurationConstructor
  type MonthWeekdayFn = js.Function2[
    /* momentToFormat */ typingsSlinky.momentMini.mod.Moment, 
    /* format */ js.UndefOr[java.lang.String], 
    java.lang.String
  ]
  type WeekdaySimpleFn = js.Function1[/* momentToFormat */ typingsSlinky.momentMini.mod.Moment, java.lang.String]
}
