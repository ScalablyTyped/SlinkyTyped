package typingsSlinky.reactDashCalendarDashTimeline.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod.SidebarHeaderProps
import typingsSlinky.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineStrings.left
import typingsSlinky.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SidebarHeader
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod.SidebarHeader[js.Any]
    ] {
  @JSImport("react-calendar-timeline", "SidebarHeader")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply[Data](headerData: Data = null, variant: left | right = null, _overrides: StringDictionary[js.Any] = null): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod.SidebarHeader[js.Any]
  ] = {
    val __obj = js.Dynamic.literal()
    if (headerData != null) __obj.updateDynamic("headerData")(headerData.asInstanceOf[js.Any])
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod.SidebarHeader[js.Any]]]
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod.SidebarHeader[js.Any]
  ] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod.SidebarHeader[js.Any]](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = SidebarHeaderProps[js.Any]
}

