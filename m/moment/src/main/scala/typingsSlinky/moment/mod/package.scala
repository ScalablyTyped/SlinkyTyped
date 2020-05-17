package typingsSlinky.moment

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DurationInputArg2 = typingsSlinky.moment.mod.unitOfTime.DurationConstructor
  type MonthWeekdayFn = js.Function2[
    /* momentToFormat */ typingsSlinky.moment.mod.Moment, 
    /* format */ js.UndefOr[java.lang.String], 
    java.lang.String
  ]
  type WeekdaySimpleFn = js.Function1[/* momentToFormat */ typingsSlinky.moment.mod.Moment, java.lang.String]
}
