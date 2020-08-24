package typingsSlinky.reactNativeCalendars.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNativeCalendars.mod.AgendaProps
import typingsSlinky.reactNativeCalendars.mod.CalendarMarkingProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Support for combinations of intersection and union types not implemented */
object Agenda {
  @JSImport("react-native-calendars", "Agenda")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[TItem] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeCalendars.mod.Agenda[TItem]]
  
  def apply[TItem](p: AgendaProps[TItem] with CalendarMarkingProps): Builder[TItem] = new Builder[TItem](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make[TItem](companion: Agenda.type): Builder[TItem] = new Builder[TItem](js.Array(this.component, js.Dictionary.empty))()
}

