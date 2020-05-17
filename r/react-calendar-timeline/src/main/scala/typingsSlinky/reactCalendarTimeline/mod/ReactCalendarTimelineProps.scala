package typingsSlinky.reactCalendarTimeline.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.moment.mod.Moment
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactCalendarTimeline.reactCalendarTimelineBooleans.`false`
import typingsSlinky.reactCalendarTimeline.reactCalendarTimelineBooleans.`true`
import typingsSlinky.reactCalendarTimeline.reactCalendarTimelineStrings.both
import typingsSlinky.reactCalendarTimeline.reactCalendarTimelineStrings.left
import typingsSlinky.reactCalendarTimeline.reactCalendarTimelineStrings.move
import typingsSlinky.reactCalendarTimeline.reactCalendarTimelineStrings.resize
import typingsSlinky.reactCalendarTimeline.reactCalendarTimelineStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactCalendarTimelineProps[CustomItem /* <: TimelineItemBase[_] */, CustomGroup /* <: TimelineGroupBase */] extends js.Object {
  var canChangeGroup: js.UndefOr[Boolean] = js.native
  var canMove: js.UndefOr[Boolean] = js.native
  var canResize: js.UndefOr[`false` | `true` | left | right | both] = js.native
  var clickTolerance: js.UndefOr[Double] = js.native
  var defaultTimeEnd: js.UndefOr[js.Date | Moment] = js.native
  var defaultTimeStart: js.UndefOr[js.Date | Moment] = js.native
  var dragSnap: js.UndefOr[Double] = js.native
  var groupRenderer: js.UndefOr[
    js.Function1[/* props */ ReactCalendarGroupRendererProps[CustomGroup], TagMod[Any]]
  ] = js.native
  var groups: js.Array[CustomGroup] = js.native
  // Fields that are in propTypes but not documented
  var headerRef: js.UndefOr[Ref[_]] = js.native
  var horizontalLineClassNamesForGroup: js.UndefOr[js.Function1[/* group */ CustomGroup, js.Array[String]]] = js.native
  var itemHeightRatio: js.UndefOr[Double] = js.native
  var itemRenderer: js.UndefOr[
    js.Function1[/* props */ ReactCalendarItemRendererProps[CustomItem], TagMod[Any]]
  ] = js.native
  var itemTouchSendsClick: js.UndefOr[Boolean] = js.native
  var items: js.Array[CustomItem] = js.native
  var keys: js.UndefOr[TimelineKeys] = js.native
  var lineHeight: js.UndefOr[Double] = js.native
  var maxZoom: js.UndefOr[Double] = js.native
  var minResizeWidth: js.UndefOr[Double] = js.native
  var minZoom: js.UndefOr[Double] = js.native
  var moveResizeValidator: js.UndefOr[
    js.Function4[
      /* action */ move | resize, 
      /* itemId */ Id, 
      /* time */ Double, 
      /* resizeEdge */ left | right, 
      Double
    ]
  ] = js.native
  var onBoundsChange: js.UndefOr[js.Function2[/* canvasTimeStart */ Double, /* canvasTimeEnd */ Double, _]] = js.native
  var onCanvasClick: js.UndefOr[
    js.Function3[
      /* groupId */ Id, 
      /* time */ Double, 
      /* e */ SyntheticEvent[Event, Element], 
      scala.Unit
    ]
  ] = js.native
  var onCanvasContextMenu: js.UndefOr[
    js.Function3[
      /* groupId */ Id, 
      /* time */ Double, 
      /* e */ SyntheticEvent[Event, Element], 
      scala.Unit
    ]
  ] = js.native
  var onCanvasDoubleClick: js.UndefOr[
    js.Function3[
      /* groupId */ Id, 
      /* time */ Double, 
      /* e */ SyntheticEvent[Event, Element], 
      scala.Unit
    ]
  ] = js.native
  var onItemClick: js.UndefOr[
    js.Function3[/* itemId */ Id, /* e */ SyntheticEvent[Event, Element], /* time */ Double, scala.Unit]
  ] = js.native
  var onItemContextMenu: js.UndefOr[
    js.Function3[/* itemId */ Id, /* e */ SyntheticEvent[Event, Element], /* time */ Double, scala.Unit]
  ] = js.native
  var onItemDeselect: js.UndefOr[js.Function1[/* e */ SyntheticEvent[Event, Element], scala.Unit]] = js.native
  var onItemDoubleClick: js.UndefOr[
    js.Function3[/* itemId */ Id, /* e */ SyntheticEvent[Event, Element], /* time */ Double, scala.Unit]
  ] = js.native
  var onItemDrag: js.UndefOr[
    js.Function1[/* itemDragObject */ OnItemDragObjectMove | OnItemDragObjectResize, scala.Unit]
  ] = js.native
  var onItemMove: js.UndefOr[
    js.Function3[/* itemId */ Id, /* dragTime */ Double, /* newGroupOrder */ Double, scala.Unit]
  ] = js.native
  var onItemResize: js.UndefOr[
    js.Function3[/* itemId */ Id, /* endTimeOrStartTime */ Double, /* edge */ left | right, scala.Unit]
  ] = js.native
  var onItemSelect: js.UndefOr[js.Function3[/* itemId */ Id, /* e */ js.Any, /* time */ Double, scala.Unit]] = js.native
  var onTimeChange: js.UndefOr[
    js.Function3[
      /* visibleTimeStart */ Double, 
      /* visibleTimeEnd */ Double, 
      /* updateScrollCanvas */ js.Function2[/* start */ Double, /* end */ Double, scala.Unit], 
      _
    ]
  ] = js.native
  var onZoom: js.UndefOr[js.Function1[/* timelineContext */ TimelineContext, scala.Unit]] = js.native
  var resizeDetector: js.UndefOr[js.Function1[/* containerResizeDetector */ js.Any, scala.Unit]] = js.native
  var rightSidebarContent: js.UndefOr[TagMod[Any]] = js.native
  var rightSidebarWidth: js.UndefOr[Double] = js.native
  var scrollRef: js.UndefOr[Ref[_]] = js.native
  var selected: js.UndefOr[js.Array[Double]] = js.native
  var sidebarContent: js.UndefOr[TagMod[Any]] = js.native
  var sidebarWidth: js.UndefOr[Double] = js.native
  var stackItems: js.UndefOr[Boolean] = js.native
  var timeSteps: js.UndefOr[TimelineTimeSteps] = js.native
  var traditionalZoom: js.UndefOr[Boolean] = js.native
  var useResizeHandle: js.UndefOr[Boolean] = js.native
  var verticalLineClassNamesForTime: js.UndefOr[js.Function2[/* start */ Double, /* end */ Double, js.UndefOr[js.Array[String]]]] = js.native
  var visibleTimeEnd: js.UndefOr[js.Date | Moment | Double] = js.native
  var visibleTimeStart: js.UndefOr[js.Date | Moment | Double] = js.native
}

object ReactCalendarTimelineProps {
  @scala.inline
  def apply[CustomItem, CustomGroup](groups: js.Array[CustomGroup], items: js.Array[CustomItem]): ReactCalendarTimelineProps[CustomItem, CustomGroup] = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactCalendarTimelineProps[CustomItem, CustomGroup]]
  }
  @scala.inline
  implicit class ReactCalendarTimelinePropsOps[Self[customitem, customgroup] <: ReactCalendarTimelineProps[customitem, customgroup], CustomItem, CustomGroup] (val x: Self[CustomItem, CustomGroup]) extends AnyVal {
    @scala.inline
    def duplicate: Self[CustomItem, CustomGroup] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[CustomItem, CustomGroup]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[CustomItem, CustomGroup]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[CustomItem, CustomGroup]) with Other]
    @scala.inline
    def withGroups(value: js.Array[CustomGroup]): Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(value: js.Array[CustomItem]): Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanChangeGroup(value: Boolean): Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canChangeGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanChangeGroup: Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canChangeGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withCanMove(value: Boolean): Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canMove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanMove: Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canMove")(js.undefined)
        ret
    }
    @scala.inline
    def withCanResize(value: `false` | `true` | left | right | both): Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanResize: Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canResize")(js.undefined)
        ret
    }
    @scala.inline
    def withClickTolerance(value: Double): Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickTolerance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickTolerance: Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickTolerance")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultTimeEndDate(value: js.Date): Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTimeEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultTimeEnd(value: js.Date | Moment): Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTimeEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultTimeEnd: Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTimeEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultTimeStartDate(value: js.Date): Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTimeStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultTimeStart(value: js.Date | Moment): Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTimeStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultTimeStart: Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTimeStart")(js.undefined)
        ret
    }
    @scala.inline
    def withDragSnap(value: Double): Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragSnap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragSnap: Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragSnap")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupRenderer(value: /* props */ ReactCalendarGroupRendererProps[CustomGroup] => TagMod[Any]): Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupRenderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGroupRenderer: Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderRefRefObject(value: ReactRef[_]): Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderRefFunction1(value: /* instance */ _ | Null => scala.Unit): Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHeaderRef(value: Ref[_]): Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderRef: Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerRef")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderRefNull: Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerRef")(null)
        ret
    }
    @scala.inline
    def withHorizontalLineClassNamesForGroup(value: /* group */ CustomGroup => js.Array[String]): Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalLineClassNamesForGroup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHorizontalLineClassNamesForGroup: Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalLineClassNamesForGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withItemHeightRatio(value: Double): Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemHeightRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemHeightRatio: Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemHeightRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withItemRenderer(value: /* props */ ReactCalendarItemRendererProps[CustomItem] => TagMod[Any]): Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemRenderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutItemRenderer: Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withItemTouchSendsClick(value: Boolean): Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemTouchSendsClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemTouchSendsClick: Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemTouchSendsClick")(js.undefined)
        ret
    }
    @scala.inline
    def withKeys(value: TimelineKeys): Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeys: Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(js.undefined)
        ret
    }
    @scala.inline
    def withLineHeight(value: Double): Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineHeight: Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxZoom(value: Double): Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxZoom: Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withMinResizeWidth(value: Double): Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minResizeWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinResizeWidth: Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minResizeWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMinZoom(value: Double): Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinZoom: Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withMoveResizeValidator(
      value: (/* action */ move | resize, /* itemId */ Id, /* time */ Double, /* resizeEdge */ left | right) => Double
    ): Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveResizeValidator")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutMoveResizeValidator: Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveResizeValidator")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBoundsChange(value: (/* canvasTimeStart */ Double, /* canvasTimeEnd */ Double) => _): Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBoundsChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnBoundsChange: Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBoundsChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCanvasClick(value: (/* groupId */ Id, /* time */ Double, /* e */ SyntheticEvent[Event, Element]) => scala.Unit): Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCanvasClick")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnCanvasClick: Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCanvasClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCanvasContextMenu(value: (/* groupId */ Id, /* time */ Double, /* e */ SyntheticEvent[Event, Element]) => scala.Unit): Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCanvasContextMenu")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnCanvasContextMenu: Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCanvasContextMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCanvasDoubleClick(value: (/* groupId */ Id, /* time */ Double, /* e */ SyntheticEvent[Event, Element]) => scala.Unit): Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCanvasDoubleClick")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnCanvasDoubleClick: Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCanvasDoubleClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnItemClick(value: (/* itemId */ Id, /* e */ SyntheticEvent[Event, Element], /* time */ Double) => scala.Unit): Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemClick")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnItemClick: Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnItemContextMenu(value: (/* itemId */ Id, /* e */ SyntheticEvent[Event, Element], /* time */ Double) => scala.Unit): Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemContextMenu")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnItemContextMenu: Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemContextMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withOnItemDeselect(value: /* e */ SyntheticEvent[Event, Element] => scala.Unit): Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemDeselect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnItemDeselect: Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemDeselect")(js.undefined)
        ret
    }
    @scala.inline
    def withOnItemDoubleClick(value: (/* itemId */ Id, /* e */ SyntheticEvent[Event, Element], /* time */ Double) => scala.Unit): Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemDoubleClick")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnItemDoubleClick: Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemDoubleClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnItemDrag(value: /* itemDragObject */ OnItemDragObjectMove | OnItemDragObjectResize => scala.Unit): Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemDrag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnItemDrag: Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withOnItemMove(value: (/* itemId */ Id, /* dragTime */ Double, /* newGroupOrder */ Double) => scala.Unit): Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemMove")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnItemMove: Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemMove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnItemResize(value: (/* itemId */ Id, /* endTimeOrStartTime */ Double, /* edge */ left | right) => scala.Unit): Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemResize")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnItemResize: Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemResize")(js.undefined)
        ret
    }
    @scala.inline
    def withOnItemSelect(value: (/* itemId */ Id, /* e */ js.Any, /* time */ Double) => scala.Unit): Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemSelect")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnItemSelect: Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTimeChange(
      value: (/* visibleTimeStart */ Double, /* visibleTimeEnd */ Double, /* updateScrollCanvas */ js.Function2[/* start */ Double, /* end */ Double, scala.Unit]) => _
    ): Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTimeChange")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnTimeChange: Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTimeChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnZoom(value: /* timelineContext */ TimelineContext => scala.Unit): Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onZoom")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnZoom: Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withResizeDetector(value: /* containerResizeDetector */ js.Any => scala.Unit): Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeDetector")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutResizeDetector: Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeDetector")(js.undefined)
        ret
    }
    @scala.inline
    def withRightSidebarContentReactElement(value: ReactElement): Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightSidebarContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRightSidebarContent(value: TagMod[Any]): Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightSidebarContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightSidebarContent: Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightSidebarContent")(js.undefined)
        ret
    }
    @scala.inline
    def withRightSidebarWidth(value: Double): Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightSidebarWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightSidebarWidth: Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightSidebarWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollRefRefObject(value: ReactRef[_]): Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollRefFunction1(value: /* instance */ _ | Null => scala.Unit): Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withScrollRef(value: Ref[_]): Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollRef: Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollRef")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollRefNull: Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollRef")(null)
        ret
    }
    @scala.inline
    def withSelected(value: js.Array[Double]): Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelected: Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(js.undefined)
        ret
    }
    @scala.inline
    def withSidebarContentReactElement(value: ReactElement): Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebarContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSidebarContent(value: TagMod[Any]): Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebarContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSidebarContent: Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebarContent")(js.undefined)
        ret
    }
    @scala.inline
    def withSidebarWidth(value: Double): Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebarWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSidebarWidth: Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebarWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withStackItems(value: Boolean): Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackItems: Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackItems")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeSteps(value: TimelineTimeSteps): Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeSteps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeSteps: Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeSteps")(js.undefined)
        ret
    }
    @scala.inline
    def withTraditionalZoom(value: Boolean): Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traditionalZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTraditionalZoom: Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traditionalZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withUseResizeHandle(value: Boolean): Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useResizeHandle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseResizeHandle: Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useResizeHandle")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalLineClassNamesForTime(value: (/* start */ Double, /* end */ Double) => js.UndefOr[js.Array[String]]): Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalLineClassNamesForTime")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutVerticalLineClassNamesForTime: Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalLineClassNamesForTime")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibleTimeEndDate(value: js.Date): Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleTimeEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisibleTimeEnd(value: js.Date | Moment | Double): Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleTimeEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibleTimeEnd: Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleTimeEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibleTimeStartDate(value: js.Date): Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleTimeStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisibleTimeStart(value: js.Date | Moment | Double): Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleTimeStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibleTimeStart: Self[CustomItem, CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleTimeStart")(js.undefined)
        ret
    }
  }
  
}

