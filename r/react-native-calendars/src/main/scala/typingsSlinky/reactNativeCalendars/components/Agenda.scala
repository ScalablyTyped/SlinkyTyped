package typingsSlinky.reactNativeCalendars.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactNativeCalendars.mod.AgendaProps
import typingsSlinky.reactNativeCalendars.mod.CalendarMarkingProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. Couldn't find props for TypeRef(QualifiedName(IArray(Name(<intersection>))),IArray(TypeRef(QualifiedName(IArray(Name(typingsSlinky), Name(reactNativeCalendars), Name(mod), Name(AgendaProps))),IArray(TypeRef(QualifiedName(IArray(Name(TItem))),IArray(),NoComments)),NoComments), TypeRef(QualifiedName(IArray(Name(typingsSlinky), Name(reactNativeCalendars), Name(mod), Name(CalendarMarkingProps))),IArray(),NoComments)),NoComments) because: Not a trait */
object Agenda
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactNativeCalendars.mod.Agenda[js.Any]] {
  @JSImport("react-native-calendars", "Agenda")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = AgendaProps[js.Any] with CalendarMarkingProps
}

