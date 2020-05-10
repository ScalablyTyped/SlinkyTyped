package typingsSlinky.fullcalendarVue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object optionsMod {
  type AllowFunc = js.Function2[/* span */ js.Any, /* movingEvent */ js.Any, scala.Boolean]
  type CustomButtons = org.scalablytyped.runtime.StringDictionary[typingsSlinky.fullcalendarVue.optionsMod.CustomButton]
  type DateInput = js.Date | java.lang.String | scala.Double | js.Array[scala.Double]
  type DurationInput = typingsSlinky.fullcalendarVue.optionsMod.DurationObjectInput | java.lang.String | scala.Double
  type FormatterInput = js.Object | java.lang.String | typingsSlinky.fullcalendarVue.optionsMod.FuncFormatterFunc
  type FuncFormatterFunc = js.Function1[/* arg */ js.Any, java.lang.String]
  type LocaleCodeArg = java.lang.String | js.Array[java.lang.String]
  type LocaleSingularArg = typingsSlinky.fullcalendarVue.optionsMod.LocaleCodeArg | typingsSlinky.fullcalendarVue.optionsMod.RawLocale
  type OverlapFunc = js.Function2[/* stillEvent */ js.Any, /* movingEvent */ js.Any, scala.Boolean]
}
