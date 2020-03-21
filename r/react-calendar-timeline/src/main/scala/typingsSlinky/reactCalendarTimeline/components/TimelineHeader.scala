package typingsSlinky.reactCalendarTimeline.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactCalendarTimeline.mod.TimelineHeaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TimelineHeader
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactCalendarTimeline.mod.TimelineHeader] {
  @JSImport("react-calendar-timeline", "TimelineHeader")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, style */
  def apply(
    calendarHeaderClassName: String = null,
    calendarHeaderStyle: CSSProperties = null,
    headerRef: Ref[_] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactCalendarTimeline.mod.TimelineHeader] = {
    val __obj = js.Dynamic.literal()
    if (calendarHeaderClassName != null) __obj.updateDynamic("calendarHeaderClassName")(calendarHeaderClassName.asInstanceOf[js.Any])
    if (calendarHeaderStyle != null) __obj.updateDynamic("calendarHeaderStyle")(calendarHeaderStyle.asInstanceOf[js.Any])
    if (headerRef != null) __obj.updateDynamic("headerRef")(headerRef.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactCalendarTimeline.mod.TimelineHeader] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactCalendarTimeline.mod.TimelineHeader](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = TimelineHeaderProps
}

