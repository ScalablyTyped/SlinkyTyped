package typingsSlinky.reactCalendarTimeline.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.moment.mod.Moment
import typingsSlinky.reactCalendarTimeline.mod.DateHeaderProps
import typingsSlinky.reactCalendarTimeline.mod.IntervalRenderer
import typingsSlinky.reactCalendarTimeline.mod.Unit
import typingsSlinky.reactCalendarTimeline.reactCalendarTimelineStrings.primaryHeader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DateHeader
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactCalendarTimeline.mod.DateHeader[js.Any]] {
  @JSImport("react-calendar-timeline", "DateHeader")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, style */
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
    unit: Unit | primaryHeader = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactCalendarTimeline.mod.DateHeader[js.Any]] = {
    val __obj = js.Dynamic.literal()
    if (headerData != null) __obj.updateDynamic("headerData")(headerData.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (intervalRenderer != null) __obj.updateDynamic("intervalRenderer")(js.Any.fromFunction1(intervalRenderer))
    if (labelFormat != null) __obj.updateDynamic("labelFormat")(labelFormat.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactCalendarTimeline.mod.DateHeader[js.Any]]]
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactCalendarTimeline.mod.DateHeader[js.Any]] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactCalendarTimeline.mod.DateHeader[js.Any]](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = DateHeaderProps[js.Any]
}

