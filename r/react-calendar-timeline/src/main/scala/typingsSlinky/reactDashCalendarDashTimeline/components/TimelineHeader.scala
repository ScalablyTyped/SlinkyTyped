package typingsSlinky.reactDashCalendarDashTimeline.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.react.reactMod.Ref
import typingsSlinky.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod.TimelineHeaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TimelineHeader
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod.TimelineHeader
    ] {
  @JSImport("react-calendar-timeline", "TimelineHeader")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    calendarHeaderClassName: String = null,
    calendarHeaderStyle: CSSProperties = null,
    headerRef: Ref[_] = null,
    style: CSSProperties = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod.TimelineHeader
  ] = {
    val __obj = js.Dynamic.literal()
    if (calendarHeaderClassName != null) __obj.updateDynamic("calendarHeaderClassName")(calendarHeaderClassName.asInstanceOf[js.Any])
    if (calendarHeaderStyle != null) __obj.updateDynamic("calendarHeaderStyle")(calendarHeaderStyle.asInstanceOf[js.Any])
    if (headerRef != null) __obj.updateDynamic("headerRef")(headerRef.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod.TimelineHeader
  ] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod.TimelineHeader](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = TimelineHeaderProps
}

