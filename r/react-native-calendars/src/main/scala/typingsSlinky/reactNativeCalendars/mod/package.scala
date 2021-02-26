package typingsSlinky.reactNativeCalendars

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AgendaItemsMap[TItem] = org.scalablytyped.runtime.StringDictionary[js.Array[TItem]]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactNativeCalendars.mod.MultiDotMarkingProps
    - typingsSlinky.reactNativeCalendars.mod.DotMarkingProps
    - typingsSlinky.reactNativeCalendars.mod.PeriodMarkingProps
    - typingsSlinky.reactNativeCalendars.mod.MultiPeriodMarkingProps
    - typingsSlinky.reactNativeCalendars.mod.CustomMarkingProps
    - js.Object
  */
  type CalendarMarkingProps = typingsSlinky.reactNativeCalendars.mod._CalendarMarkingProps | js.Object
  
  type CalendarProps = typingsSlinky.reactNativeCalendars.mod.CalendarMarkingProps with typingsSlinky.reactNativeCalendars.mod.CalendarBaseProps with typingsSlinky.reactNativeCalendars.anon.EnableSwipeMonths
  
  type CalendarThemeIdStyle = org.scalablytyped.runtime.StringDictionary[
    typingsSlinky.reactNative.mod.ViewStyle | typingsSlinky.reactNative.mod.TextStyle
  ]
  
  type DateCallbackHandler = js.Function1[/* date */ typingsSlinky.reactNativeCalendars.mod.DateObject, scala.Unit]
  
  type TCalendarDate = js.Date | typingsSlinky.reactNativeCalendars.mod.DateObject | scala.Double | java.lang.String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XDate */ js.Any)
}
