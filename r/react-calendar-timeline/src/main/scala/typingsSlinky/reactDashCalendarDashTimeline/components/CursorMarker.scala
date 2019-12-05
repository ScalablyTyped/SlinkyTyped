package typingsSlinky.reactDashCalendarDashTimeline.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod.CursorMarkerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(typingsSlinky), Name(reactDashCalendarDashTimeline), Name(reactDashCalendarDashTimelineMod), Name(CursorMarkerProps))) was not a @ScalaJSDefined trait */
object CursorMarker
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod.CursorMarker
    ] {
  @JSImport("react-calendar-timeline", "CursorMarker")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = CursorMarkerProps
}

