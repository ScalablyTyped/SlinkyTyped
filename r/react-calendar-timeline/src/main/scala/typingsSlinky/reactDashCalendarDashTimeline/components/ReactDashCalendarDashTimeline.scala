package typingsSlinky.reactDashCalendarDashTimeline.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.moment.momentMod.Moment
import typingsSlinky.react.reactMod.Ref
import typingsSlinky.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod.OnItemDragObjectMove
import typingsSlinky.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod.OnItemDragObjectResize
import typingsSlinky.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod.ReactCalendarGroupRendererProps
import typingsSlinky.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod.ReactCalendarItemRendererProps
import typingsSlinky.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod.ReactCalendarTimelineProps
import typingsSlinky.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod.TimelineContext
import typingsSlinky.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod.TimelineGroupBase
import typingsSlinky.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod.TimelineItemBase
import typingsSlinky.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod.TimelineKeys
import typingsSlinky.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod.TimelineTimeSteps
import typingsSlinky.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod.default
import typingsSlinky.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineNumbers.`false`
import typingsSlinky.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineNumbers.`true`
import typingsSlinky.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineStrings.both
import typingsSlinky.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineStrings.left
import typingsSlinky.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineStrings.move
import typingsSlinky.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineStrings.resize
import typingsSlinky.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashCalendarDashTimeline
  extends ExternalComponentWithAttributesWithRefType[tag.type, default[js.Any, js.Any]] {
  @JSImport("react-calendar-timeline", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply[CustomItem /* <: TimelineItemBase[js.Any] */, CustomGroup /* <: TimelineGroupBase */](
    groups: js.Array[CustomGroup],
    items: js.Array[CustomItem],
    canChangeGroup: js.UndefOr[Boolean] = js.undefined,
    canMove: js.UndefOr[Boolean] = js.undefined,
    canResize: `false` | `true` | left | right | both = null,
    clickTolerance: Int | Double = null,
    defaultTimeEnd: js.Date | Moment = null,
    defaultTimeStart: js.Date | Moment = null,
    dragSnap: Int | Double = null,
    groupRenderer: /* props */ ReactCalendarGroupRendererProps[CustomGroup] => TagMod[Any] = null,
    headerRef: Ref[_] = null,
    horizontalLineClassNamesForGroup: CustomGroup => js.Array[String] = null,
    itemHeightRatio: Int | Double = null,
    itemRenderer: /* props */ ReactCalendarItemRendererProps[CustomItem] => TagMod[Any] = null,
    itemTouchSendsClick: js.UndefOr[Boolean] = js.undefined,
    keys: TimelineKeys = null,
    lineHeight: Int | Double = null,
    maxZoom: Int | Double = null,
    minResizeWidth: Int | Double = null,
    minZoom: Int | Double = null,
    moveResizeValidator: (/* action */ move | resize, /* itemId */ Double, /* time */ Double, /* resizeEdge */ left | right) => Double = null,
    onBoundsChange: (/* canvasTimeStart */ Double, /* canvasTimeEnd */ Double) => _ = null,
    onCanvasClick: (/* groupId */ Double, /* time */ Double, /* e */ SyntheticEvent[Event, org.scalajs.dom.raw.Element]) => Unit = null,
    onCanvasContextMenu: (CustomGroup, /* time */ Double, /* e */ SyntheticEvent[Event, org.scalajs.dom.raw.Element]) => Unit = null,
    onCanvasDoubleClick: (CustomGroup, /* time */ Double, /* e */ SyntheticEvent[Event, org.scalajs.dom.raw.Element]) => Unit = null,
    onItemClick: (/* itemId */ Double, /* e */ SyntheticEvent[Event, org.scalajs.dom.raw.Element], /* time */ Double) => Unit = null,
    onItemContextMenu: (/* itemId */ Double, /* e */ SyntheticEvent[Event, org.scalajs.dom.raw.Element], /* time */ Double) => Unit = null,
    onItemDeselect: /* e */ SyntheticEvent[Event, org.scalajs.dom.raw.Element] => Unit = null,
    onItemDoubleClick: (/* itemId */ Double, /* e */ SyntheticEvent[Event, org.scalajs.dom.raw.Element], /* time */ Double) => Unit = null,
    onItemDrag: /* itemDragObject */ OnItemDragObjectMove | OnItemDragObjectResize => Unit = null,
    onItemMove: (/* itemId */ Double, /* dragTime */ Double, /* newGroupOrder */ Double) => Unit = null,
    onItemResize: (/* itemId */ Double, /* endTimeOrStartTime */ Double, /* edge */ left | right) => Unit = null,
    onItemSelect: (/* itemId */ Double, /* e */ js.Any, /* time */ Double) => Unit = null,
    onTimeChange: (/* visibleTimeStart */ Double, /* visibleTimeEnd */ Double, /* updateScrollCanvas */ js.Function2[/* start */ Double, /* end */ Double, Unit]) => _ = null,
    onZoom: /* timelineContext */ TimelineContext => Unit = null,
    resizeDetector: /* containerResizeDetector */ js.Any => Unit = null,
    rightSidebarContent: TagMod[Any] = null,
    rightSidebarWidth: Int | Double = null,
    scrollRef: Ref[_] = null,
    selected: js.Array[Double] = null,
    sidebarContent: TagMod[Any] = null,
    sidebarWidth: Int | Double = null,
    stackItems: js.UndefOr[Boolean] = js.undefined,
    timeSteps: TimelineTimeSteps = null,
    traditionalZoom: js.UndefOr[Boolean] = js.undefined,
    useResizeHandle: js.UndefOr[Boolean] = js.undefined,
    verticalLineClassNamesForTime: (/* start */ Double, /* end */ Double) => js.UndefOr[js.Array[String]] = null,
    visibleTimeEnd: js.Date | Moment = null,
    visibleTimeStart: js.Date | Moment = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default[js.Any, js.Any]] = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    if (!js.isUndefined(canChangeGroup)) __obj.updateDynamic("canChangeGroup")(canChangeGroup.asInstanceOf[js.Any])
    if (!js.isUndefined(canMove)) __obj.updateDynamic("canMove")(canMove.asInstanceOf[js.Any])
    if (canResize != null) __obj.updateDynamic("canResize")(canResize.asInstanceOf[js.Any])
    if (clickTolerance != null) __obj.updateDynamic("clickTolerance")(clickTolerance.asInstanceOf[js.Any])
    if (defaultTimeEnd != null) __obj.updateDynamic("defaultTimeEnd")(defaultTimeEnd.asInstanceOf[js.Any])
    if (defaultTimeStart != null) __obj.updateDynamic("defaultTimeStart")(defaultTimeStart.asInstanceOf[js.Any])
    if (dragSnap != null) __obj.updateDynamic("dragSnap")(dragSnap.asInstanceOf[js.Any])
    if (groupRenderer != null) __obj.updateDynamic("groupRenderer")(js.Any.fromFunction1(groupRenderer))
    if (headerRef != null) __obj.updateDynamic("headerRef")(headerRef.asInstanceOf[js.Any])
    if (horizontalLineClassNamesForGroup != null) __obj.updateDynamic("horizontalLineClassNamesForGroup")(js.Any.fromFunction1(horizontalLineClassNamesForGroup))
    if (itemHeightRatio != null) __obj.updateDynamic("itemHeightRatio")(itemHeightRatio.asInstanceOf[js.Any])
    if (itemRenderer != null) __obj.updateDynamic("itemRenderer")(js.Any.fromFunction1(itemRenderer))
    if (!js.isUndefined(itemTouchSendsClick)) __obj.updateDynamic("itemTouchSendsClick")(itemTouchSendsClick.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minResizeWidth != null) __obj.updateDynamic("minResizeWidth")(minResizeWidth.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (moveResizeValidator != null) __obj.updateDynamic("moveResizeValidator")(js.Any.fromFunction4(moveResizeValidator))
    if (onBoundsChange != null) __obj.updateDynamic("onBoundsChange")(js.Any.fromFunction2(onBoundsChange))
    if (onCanvasClick != null) __obj.updateDynamic("onCanvasClick")(js.Any.fromFunction3(onCanvasClick))
    if (onCanvasContextMenu != null) __obj.updateDynamic("onCanvasContextMenu")(js.Any.fromFunction3(onCanvasContextMenu))
    if (onCanvasDoubleClick != null) __obj.updateDynamic("onCanvasDoubleClick")(js.Any.fromFunction3(onCanvasDoubleClick))
    if (onItemClick != null) __obj.updateDynamic("onItemClick")(js.Any.fromFunction3(onItemClick))
    if (onItemContextMenu != null) __obj.updateDynamic("onItemContextMenu")(js.Any.fromFunction3(onItemContextMenu))
    if (onItemDeselect != null) __obj.updateDynamic("onItemDeselect")(js.Any.fromFunction1(onItemDeselect))
    if (onItemDoubleClick != null) __obj.updateDynamic("onItemDoubleClick")(js.Any.fromFunction3(onItemDoubleClick))
    if (onItemDrag != null) __obj.updateDynamic("onItemDrag")(js.Any.fromFunction1(onItemDrag))
    if (onItemMove != null) __obj.updateDynamic("onItemMove")(js.Any.fromFunction3(onItemMove))
    if (onItemResize != null) __obj.updateDynamic("onItemResize")(js.Any.fromFunction3(onItemResize))
    if (onItemSelect != null) __obj.updateDynamic("onItemSelect")(js.Any.fromFunction3(onItemSelect))
    if (onTimeChange != null) __obj.updateDynamic("onTimeChange")(js.Any.fromFunction3(onTimeChange))
    if (onZoom != null) __obj.updateDynamic("onZoom")(js.Any.fromFunction1(onZoom))
    if (resizeDetector != null) __obj.updateDynamic("resizeDetector")(js.Any.fromFunction1(resizeDetector))
    if (rightSidebarContent != null) __obj.updateDynamic("rightSidebarContent")(rightSidebarContent.asInstanceOf[js.Any])
    if (rightSidebarWidth != null) __obj.updateDynamic("rightSidebarWidth")(rightSidebarWidth.asInstanceOf[js.Any])
    if (scrollRef != null) __obj.updateDynamic("scrollRef")(scrollRef.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (sidebarContent != null) __obj.updateDynamic("sidebarContent")(sidebarContent.asInstanceOf[js.Any])
    if (sidebarWidth != null) __obj.updateDynamic("sidebarWidth")(sidebarWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(stackItems)) __obj.updateDynamic("stackItems")(stackItems.asInstanceOf[js.Any])
    if (timeSteps != null) __obj.updateDynamic("timeSteps")(timeSteps.asInstanceOf[js.Any])
    if (!js.isUndefined(traditionalZoom)) __obj.updateDynamic("traditionalZoom")(traditionalZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(useResizeHandle)) __obj.updateDynamic("useResizeHandle")(useResizeHandle.asInstanceOf[js.Any])
    if (verticalLineClassNamesForTime != null) __obj.updateDynamic("verticalLineClassNamesForTime")(js.Any.fromFunction2(verticalLineClassNamesForTime))
    if (visibleTimeEnd != null) __obj.updateDynamic("visibleTimeEnd")(visibleTimeEnd.asInstanceOf[js.Any])
    if (visibleTimeStart != null) __obj.updateDynamic("visibleTimeStart")(visibleTimeStart.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod.default[js.Any, js.Any]]]
  }
  type Props = ReactCalendarTimelineProps[js.Any, js.Any]
}

