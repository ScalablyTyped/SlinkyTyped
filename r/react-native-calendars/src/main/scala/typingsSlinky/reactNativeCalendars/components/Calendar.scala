package typingsSlinky.reactNativeCalendars.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactNativeCalendars.mod.CalendarBaseProps
import typingsSlinky.reactNativeCalendars.mod.CalendarMarkingProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Support for combinations of intersection and union types not implemented */
object Calendar {
  
  @JSImport("react-native-calendars", "Calendar")
  @js.native
  object component extends js.Object
  
  def apply(p: CalendarMarkingProps with CalendarBaseProps): Default[tag.type, typingsSlinky.reactNativeCalendars.mod.Calendar] = new Default[tag.type, typingsSlinky.reactNativeCalendars.mod.Calendar](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Calendar.type): Default[tag.type, typingsSlinky.reactNativeCalendars.mod.Calendar] = new Default[tag.type, typingsSlinky.reactNativeCalendars.mod.Calendar](js.Array(this.component, js.Dictionary.empty))()
}
