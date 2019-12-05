package typingsSlinky.reactDashNativeDashCalendars.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNativeDashCalendars.reactDashNativeDashCalendarsMod.AgendaProps
import typingsSlinky.reactDashNativeDashCalendars.reactDashNativeDashCalendarsMod.CalendarMarkingProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(<intersection>))) was not a @ScalaJSDefined trait */
object Agenda
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashNativeDashCalendars.reactDashNativeDashCalendarsMod.Agenda[js.Any]
    ] {
  @JSImport("react-native-calendars", "Agenda")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = AgendaProps[js.Any] with CalendarMarkingProps
}

