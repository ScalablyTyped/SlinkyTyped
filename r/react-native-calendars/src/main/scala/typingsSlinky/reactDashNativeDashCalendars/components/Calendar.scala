package typingsSlinky.reactDashNativeDashCalendars.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNativeDashCalendars.reactDashNativeDashCalendarsMod.CalendarBaseProps
import typingsSlinky.reactDashNativeDashCalendars.reactDashNativeDashCalendarsMod.CalendarMarkingProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(<intersection>))) was not a @ScalaJSDefined trait */
object Calendar
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashNativeDashCalendars.reactDashNativeDashCalendarsMod.Calendar
    ] {
  @JSImport("react-native-calendars", "Calendar")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = CalendarMarkingProps with CalendarBaseProps
}

