package typingsSlinky.reactDashCalendarDashTimeline.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod.TodayMarkerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TodayMarker
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod.TodayMarker
    ] {
  @JSImport("react-calendar-timeline", "TodayMarker")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(date: js.Date | Double, interval: Int | Double = null, _overrides: StringDictionary[js.Any] = null): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod.TodayMarker
  ] = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TodayMarkerProps
}

