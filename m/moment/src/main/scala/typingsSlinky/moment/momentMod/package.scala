package typingsSlinky.moment

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object momentMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.moment.momentStrings.sameDay
    - typingsSlinky.moment.momentStrings.nextDay
    - typingsSlinky.moment.momentStrings.lastDay
    - typingsSlinky.moment.momentStrings.nextWeek
    - typingsSlinky.moment.momentStrings.lastWeek
    - typingsSlinky.moment.momentStrings.sameElse
    - java.lang.String
  */
  type CalendarKey = typingsSlinky.moment.momentMod._CalendarKey | java.lang.String
  
  type CalendarSpecVal = java.lang.String | (js.Function2[
    /* m */ js.UndefOr[typingsSlinky.moment.momentMod.MomentInput], 
    /* now */ js.UndefOr[typingsSlinky.moment.momentMod.Moment], 
    java.lang.String
  ])
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.moment.momentMod.Duration_
    - scala.Double
    - java.lang.String
    - typingsSlinky.moment.momentMod.FromTo
    - typingsSlinky.moment.momentMod.DurationInputObject
    - scala.Null
    - js.UndefOr[scala.Nothing]
  */
  type DurationInputArg1 = js.UndefOr[
    typingsSlinky.moment.momentMod._DurationInputArg1 | scala.Double | java.lang.String | scala.Null
  ]
  
  type DurationInputArg2 = typingsSlinky.moment.momentMod.unitOfTime.DurationConstructor
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsSlinky.moment.momentMod.Moment
    - typingsSlinky.moment.momentMod.Duration_
    - js.Array[java.lang.String]
    - scala.Boolean
  */
  type LocaleSpecifier = typingsSlinky.moment.momentMod._LocaleSpecifier | js.Array[java.lang.String] | java.lang.String | scala.Boolean
  
  type MomentFormatSpecification = java.lang.String | typingsSlinky.moment.momentMod.MomentBuiltinFormat | (js.Array[java.lang.String | typingsSlinky.moment.momentMod.MomentBuiltinFormat])
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.moment.momentMod.Moment
    - typingsSlinky.std.Date
    - java.lang.String
    - scala.Double
    - js.Array[scala.Double | java.lang.String]
    - typingsSlinky.moment.momentMod.MomentInputObject
    - scala.Null
    - js.UndefOr[scala.Nothing]
  */
  type MomentInput = js.UndefOr[
    typingsSlinky.moment.momentMod._MomentInput | (js.Array[scala.Double | java.lang.String]) | js.Date | java.lang.String | scala.Double | scala.Null
  ]
  
  type MonthWeekdayFn = js.Function2[
    /* momentToFormat */ typingsSlinky.moment.momentMod.Moment, 
    /* format */ js.UndefOr[java.lang.String], 
    java.lang.String
  ]
  
  type RelativeTimeFuturePastVal = java.lang.String | (js.Function1[/* relTime */ java.lang.String, java.lang.String])
  
  type RelativeTimeSpecVal = java.lang.String | (js.Function4[
    /* n */ scala.Double, 
    /* withoutSuffix */ scala.Boolean, 
    /* key */ typingsSlinky.moment.momentMod.RelativeTimeKey, 
    /* isFuture */ scala.Boolean, 
    java.lang.String
  ])
  
  type WeekdaySimpleFn = js.Function1[/* momentToFormat */ typingsSlinky.moment.momentMod.Moment, java.lang.String]
}
