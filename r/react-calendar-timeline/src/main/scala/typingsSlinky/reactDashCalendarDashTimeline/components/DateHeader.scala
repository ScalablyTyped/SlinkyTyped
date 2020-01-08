package typingsSlinky.reactDashCalendarDashTimeline.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.moment.momentMod.Moment
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod.DateHeaderProps
import typingsSlinky.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod.IntervalRenderer
import typingsSlinky.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod.Unit
import typingsSlinky.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineStrings.primaryHeader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DateHeader
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod.DateHeader[js.Any]
    ] {
  @JSImport("react-calendar-timeline", "DateHeader")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply[Data](
    headerData: Data = null,
    height: Int | Double = null,
    intervalRenderer: /* props */ js.UndefOr[IntervalRenderer[Data]] => TagMod[Any] = null,
    labelFormat: String | (js.Function3[
      /* hasStartTimeEndTime */ js.Tuple2[Moment, Moment], 
      /* unit */ Unit, 
      /* labelWidth */ Double, 
      String
    ]) = null,
    style: CSSProperties = null,
    unit: Unit | primaryHeader = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod.DateHeader[js.Any]
  ] = {
    val __obj = js.Dynamic.literal()
    if (headerData != null) __obj.updateDynamic("headerData")(headerData.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (intervalRenderer != null) __obj.updateDynamic("intervalRenderer")(js.Any.fromFunction1(intervalRenderer))
    if (labelFormat != null) __obj.updateDynamic("labelFormat")(labelFormat.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod.DateHeader[js.Any]]]
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod.DateHeader[js.Any]
  ] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod.DateHeader[js.Any]](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = DateHeaderProps[js.Any]
}

