package typingsSlinky.moment

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.moment.momentStrings.sameDay
    - typingsSlinky.moment.momentStrings.nextDay
    - typingsSlinky.moment.momentStrings.lastDay
    - typingsSlinky.moment.momentStrings.nextWeek
    - typingsSlinky.moment.momentStrings.lastWeek
    - typingsSlinky.moment.momentStrings.sameElse
    - java.lang.String
  */
  type CalendarKey = typingsSlinky.moment.mod._CalendarKey | java.lang.String
  type CalendarSpecVal = java.lang.String | (js.Function2[
    /* m */ js.UndefOr[typingsSlinky.moment.mod.MomentInput], 
    /* now */ js.UndefOr[typingsSlinky.moment.mod.Moment], 
    java.lang.String
  ])
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.moment.mod.Duration_
    - scala.Double
    - java.lang.String
    - typingsSlinky.moment.mod.FromTo
    - typingsSlinky.moment.mod.DurationInputObject
    - scala.Unit
  */
  type DurationInputArg1 = typingsSlinky.moment.mod._DurationInputArg1 | scala.Double | java.lang.String | scala.Unit
  type DurationInputArg2 = typingsSlinky.moment.mod.unitOfTime.DurationConstructor
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsSlinky.moment.mod.Moment
    - typingsSlinky.moment.mod.Duration_
    - js.Array[java.lang.String]
    - scala.Boolean
  */
  type LocaleSpecifier = typingsSlinky.moment.mod._LocaleSpecifier | js.Array[java.lang.String] | java.lang.String | scala.Boolean
  type MomentFormatSpecification = java.lang.String | typingsSlinky.moment.mod.MomentBuiltinFormat | (js.Array[java.lang.String | typingsSlinky.moment.mod.MomentBuiltinFormat])
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.moment.mod.Moment
    - typingsSlinky.std.Date
    - java.lang.String
    - scala.Double
    - js.Array[scala.Double | java.lang.String]
    - typingsSlinky.moment.mod.MomentInputObject
    - scala.Unit
  */
  type MomentInput = typingsSlinky.moment.mod._MomentInput | (js.Array[scala.Double | java.lang.String]) | js.Date | java.lang.String | scala.Double | scala.Unit
  type MonthWeekdayFn = js.Function2[
    /* momentToFormat */ typingsSlinky.moment.mod.Moment, 
    /* format */ js.UndefOr[java.lang.String], 
    java.lang.String
  ]
  type RelativeTimeFuturePastVal = java.lang.String | (js.Function1[/* relTime */ java.lang.String, java.lang.String])
  type RelativeTimeSpecVal = java.lang.String | (js.Function4[
    /* n */ scala.Double, 
    /* withoutSuffix */ scala.Boolean, 
    /* key */ typingsSlinky.moment.mod.RelativeTimeKey, 
    /* isFuture */ scala.Boolean, 
    java.lang.String
  ])
  type WeekdaySimpleFn = js.Function1[/* momentToFormat */ typingsSlinky.moment.mod.Moment, java.lang.String]
}
