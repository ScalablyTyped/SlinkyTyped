package typingsSlinky.reactNativeCalendars

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AgendaItemsMap[TItem] = org.scalablytyped.runtime.StringDictionary[js.Array[TItem]]
  type CalendarThemeIdStyle = org.scalablytyped.runtime.StringDictionary[
    typingsSlinky.reactNative.mod.ViewStyle | typingsSlinky.reactNative.mod.TextStyle
  ]
  type DateCallbackHandler = js.Function1[/* date */ typingsSlinky.reactNativeCalendars.mod.DateObject, scala.Unit]
}
