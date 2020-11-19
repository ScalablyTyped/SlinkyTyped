package typingsSlinky.momentMini

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.momentMini.momentMiniStrings.sameDay
    - typingsSlinky.momentMini.momentMiniStrings.nextDay
    - typingsSlinky.momentMini.momentMiniStrings.lastDay
    - typingsSlinky.momentMini.momentMiniStrings.nextWeek
    - typingsSlinky.momentMini.momentMiniStrings.lastWeek
    - typingsSlinky.momentMini.momentMiniStrings.sameElse
    - java.lang.String
  */
  type CalendarKey = typingsSlinky.momentMini.mod._CalendarKey | java.lang.String
  
  type CalendarSpecVal = java.lang.String | (js.Function2[
    /* m */ js.UndefOr[typingsSlinky.momentMini.mod.MomentInput], 
    /* now */ js.UndefOr[typingsSlinky.momentMini.mod.Moment], 
    java.lang.String
  ])
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.momentMini.mod.Duration_
    - scala.Double
    - java.lang.String
    - typingsSlinky.momentMini.mod.FromTo
    - typingsSlinky.momentMini.mod.DurationInputObject
    - scala.Unit
  */
  type DurationInputArg1 = typingsSlinky.momentMini.mod._DurationInputArg1 | scala.Double | java.lang.String | scala.Unit
  
  type DurationInputArg2 = typingsSlinky.momentMini.mod.unitOfTime.DurationConstructor
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsSlinky.momentMini.mod.Moment
    - typingsSlinky.momentMini.mod.Duration_
    - js.Array[java.lang.String]
    - scala.Boolean
  */
  type LocaleSpecifier = typingsSlinky.momentMini.mod._LocaleSpecifier | js.Array[java.lang.String] | java.lang.String | scala.Boolean
  
  type MomentFormatSpecification = java.lang.String | typingsSlinky.momentMini.mod.MomentBuiltinFormat | (js.Array[java.lang.String | typingsSlinky.momentMini.mod.MomentBuiltinFormat])
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.momentMini.mod.Moment
    - typingsSlinky.std.Date
    - java.lang.String
    - scala.Double
    - js.Array[scala.Double | java.lang.String]
    - typingsSlinky.momentMini.mod.MomentInputObject
    - scala.Unit
  */
  type MomentInput = typingsSlinky.momentMini.mod._MomentInput | (js.Array[scala.Double | java.lang.String]) | js.Date | java.lang.String | scala.Double | scala.Unit
  
  type MonthWeekdayFn = js.Function2[
    /* momentToFormat */ typingsSlinky.momentMini.mod.Moment, 
    /* format */ js.UndefOr[java.lang.String], 
    java.lang.String
  ]
  
  type RelativeTimeFuturePastVal = java.lang.String | (js.Function1[/* relTime */ java.lang.String, java.lang.String])
  
  type RelativeTimeSpecVal = java.lang.String | (js.Function4[
    /* n */ scala.Double, 
    /* withoutSuffix */ scala.Boolean, 
    /* key */ typingsSlinky.momentMini.mod.RelativeTimeKey, 
    /* isFuture */ scala.Boolean, 
    java.lang.String
  ])
  
  type WeekdaySimpleFn = js.Function1[/* momentToFormat */ typingsSlinky.momentMini.mod.Moment, java.lang.String]
}
