package typingsSlinky.reactNativeCalendars.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactNativeCalendars.mod.CalendarListBaseProps
import typingsSlinky.reactNativeCalendars.mod.CalendarMarkingProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Support for combinations of intersection and union types not implemented */
object CalendarList {
  
  def apply(p: CalendarMarkingProps with CalendarListBaseProps): Default[tag.type, typingsSlinky.reactNativeCalendars.mod.CalendarList] = new Default[tag.type, typingsSlinky.reactNativeCalendars.mod.CalendarList](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("react-native-calendars", "CalendarList")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: CalendarList.type): Default[tag.type, typingsSlinky.reactNativeCalendars.mod.CalendarList] = new Default[tag.type, typingsSlinky.reactNativeCalendars.mod.CalendarList](js.Array(this.component, js.Dictionary.empty))()
}
