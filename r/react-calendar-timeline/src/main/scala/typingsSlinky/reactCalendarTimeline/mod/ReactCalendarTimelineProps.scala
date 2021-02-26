package typingsSlinky.reactCalendarTimeline.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import slinky.core.SyntheticEvent
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactCalendarTimelineProps[CustomItem /* <: TimelineItemBase[_] */, CustomGroup /* <: TimelineGroupBase */] extends StObject {
  
  var canChangeGroup: js.UndefOr[Boolean] = js.native
  
  var canMove: js.UndefOr[Boolean] = js.native
  
  var canResize: js.UndefOr[`false` | `true` | left | right | both] = js.native
  
  var clickTolerance: js.UndefOr[Double] = js.native
  
  var defaultTimeEnd: js.UndefOr[js.Date | Moment] = js.native
  
  var defaultTimeStart: js.UndefOr[js.Date | Moment] = js.native
  
  var dragSnap: js.UndefOr[Double] = js.native
  
  var groupRenderer: js.UndefOr[
    js.Function1[/* props */ ReactCalendarGroupRendererProps[CustomGroup], ReactElement]
  ] = js.native
  
  var groups: js.Array[CustomGroup] = js.native
  
  // Fields that are in propTypes but not documented
  var headerRef: js.UndefOr[Ref[_]] = js.native
  
  var horizontalLineClassNamesForGroup: js.UndefOr[js.Function1[/* group */ CustomGroup, js.Array[String]]] = js.native
  
  var itemHeightRatio: js.UndefOr[Double] = js.native
  
  var itemRenderer: js.UndefOr[
    js.Function1[/* props */ ReactCalendarItemRendererProps[CustomItem], ReactElement]
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
  
  var rightSidebarContent: js.UndefOr[ReactElement] = js.native
  
  var rightSidebarWidth: js.UndefOr[Double] = js.native
  
  var scrollRef: js.UndefOr[Ref[_]] = js.native
  
  var selected: js.UndefOr[js.Array[Double]] = js.native
  
  var sidebarContent: js.UndefOr[ReactElement] = js.native
  
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
  def apply[CustomItem /* <: TimelineItemBase[_] */, CustomGroup /* <: TimelineGroupBase */](groups: js.Array[CustomGroup], items: js.Array[CustomItem]): ReactCalendarTimelineProps[CustomItem, CustomGroup] = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactCalendarTimelineProps[CustomItem, CustomGroup]]
  }
  
  @scala.inline
  implicit class ReactCalendarTimelinePropsMutableBuilder[Self <: ReactCalendarTimelineProps[_, _], CustomItem /* <: TimelineItemBase[_] */, CustomGroup /* <: TimelineGroupBase */] (val x: Self with (ReactCalendarTimelineProps[CustomItem, CustomGroup])) extends AnyVal {
    
    @scala.inline
    def setCanChangeGroup(value: Boolean): Self = StObject.set(x, "canChangeGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanChangeGroupUndefined: Self = StObject.set(x, "canChangeGroup", js.undefined)
    
    @scala.inline
    def setCanMove(value: Boolean): Self = StObject.set(x, "canMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanMoveUndefined: Self = StObject.set(x, "canMove", js.undefined)
    
    @scala.inline
    def setCanResize(value: `false` | `true` | left | right | both): Self = StObject.set(x, "canResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanResizeUndefined: Self = StObject.set(x, "canResize", js.undefined)
    
    @scala.inline
    def setClickTolerance(value: Double): Self = StObject.set(x, "clickTolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickToleranceUndefined: Self = StObject.set(x, "clickTolerance", js.undefined)
    
    @scala.inline
    def setDefaultTimeEnd(value: js.Date | Moment): Self = StObject.set(x, "defaultTimeEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultTimeEndDate(value: js.Date): Self = StObject.set(x, "defaultTimeEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultTimeEndUndefined: Self = StObject.set(x, "defaultTimeEnd", js.undefined)
    
    @scala.inline
    def setDefaultTimeStart(value: js.Date | Moment): Self = StObject.set(x, "defaultTimeStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultTimeStartDate(value: js.Date): Self = StObject.set(x, "defaultTimeStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultTimeStartUndefined: Self = StObject.set(x, "defaultTimeStart", js.undefined)
    
    @scala.inline
    def setDragSnap(value: Double): Self = StObject.set(x, "dragSnap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragSnapUndefined: Self = StObject.set(x, "dragSnap", js.undefined)
    
    @scala.inline
    def setGroupRenderer(value: /* props */ ReactCalendarGroupRendererProps[CustomGroup] => ReactElement): Self = StObject.set(x, "groupRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGroupRendererUndefined: Self = StObject.set(x, "groupRenderer", js.undefined)
    
    @scala.inline
    def setGroups(value: js.Array[CustomGroup]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsVarargs(value: CustomGroup*): Self = StObject.set(x, "groups", js.Array(value :_*))
    
    @scala.inline
    def setHeaderRef(value: Ref[_]): Self = StObject.set(x, "headerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderRefFunction1(value: /* instance */ _ | Null => scala.Unit): Self = StObject.set(x, "headerRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeaderRefNull: Self = StObject.set(x, "headerRef", null)
    
    @scala.inline
    def setHeaderRefRefObject(value: ReactRef[_]): Self = StObject.set(x, "headerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderRefUndefined: Self = StObject.set(x, "headerRef", js.undefined)
    
    @scala.inline
    def setHorizontalLineClassNamesForGroup(value: /* group */ CustomGroup => js.Array[String]): Self = StObject.set(x, "horizontalLineClassNamesForGroup", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHorizontalLineClassNamesForGroupUndefined: Self = StObject.set(x, "horizontalLineClassNamesForGroup", js.undefined)
    
    @scala.inline
    def setItemHeightRatio(value: Double): Self = StObject.set(x, "itemHeightRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemHeightRatioUndefined: Self = StObject.set(x, "itemHeightRatio", js.undefined)
    
    @scala.inline
    def setItemRenderer(value: /* props */ ReactCalendarItemRendererProps[CustomItem] => ReactElement): Self = StObject.set(x, "itemRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setItemRendererUndefined: Self = StObject.set(x, "itemRenderer", js.undefined)
    
    @scala.inline
    def setItemTouchSendsClick(value: Boolean): Self = StObject.set(x, "itemTouchSendsClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemTouchSendsClickUndefined: Self = StObject.set(x, "itemTouchSendsClick", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[CustomItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: CustomItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKeys(value: TimelineKeys): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    @scala.inline
    def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
    
    @scala.inline
    def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
    
    @scala.inline
    def setMinResizeWidth(value: Double): Self = StObject.set(x, "minResizeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinResizeWidthUndefined: Self = StObject.set(x, "minResizeWidth", js.undefined)
    
    @scala.inline
    def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
    
    @scala.inline
    def setMoveResizeValidator(
      value: (/* action */ move | resize, /* itemId */ Id, /* time */ Double, /* resizeEdge */ left | right) => Double
    ): Self = StObject.set(x, "moveResizeValidator", js.Any.fromFunction4(value))
    
    @scala.inline
    def setMoveResizeValidatorUndefined: Self = StObject.set(x, "moveResizeValidator", js.undefined)
    
    @scala.inline
    def setOnBoundsChange(value: (/* canvasTimeStart */ Double, /* canvasTimeEnd */ Double) => _): Self = StObject.set(x, "onBoundsChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnBoundsChangeUndefined: Self = StObject.set(x, "onBoundsChange", js.undefined)
    
    @scala.inline
    def setOnCanvasClick(value: (/* groupId */ Id, /* time */ Double, /* e */ SyntheticEvent[Event, Element]) => scala.Unit): Self = StObject.set(x, "onCanvasClick", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnCanvasClickUndefined: Self = StObject.set(x, "onCanvasClick", js.undefined)
    
    @scala.inline
    def setOnCanvasContextMenu(value: (/* groupId */ Id, /* time */ Double, /* e */ SyntheticEvent[Event, Element]) => scala.Unit): Self = StObject.set(x, "onCanvasContextMenu", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnCanvasContextMenuUndefined: Self = StObject.set(x, "onCanvasContextMenu", js.undefined)
    
    @scala.inline
    def setOnCanvasDoubleClick(value: (/* groupId */ Id, /* time */ Double, /* e */ SyntheticEvent[Event, Element]) => scala.Unit): Self = StObject.set(x, "onCanvasDoubleClick", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnCanvasDoubleClickUndefined: Self = StObject.set(x, "onCanvasDoubleClick", js.undefined)
    
    @scala.inline
    def setOnItemClick(value: (/* itemId */ Id, /* e */ SyntheticEvent[Event, Element], /* time */ Double) => scala.Unit): Self = StObject.set(x, "onItemClick", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnItemClickUndefined: Self = StObject.set(x, "onItemClick", js.undefined)
    
    @scala.inline
    def setOnItemContextMenu(value: (/* itemId */ Id, /* e */ SyntheticEvent[Event, Element], /* time */ Double) => scala.Unit): Self = StObject.set(x, "onItemContextMenu", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnItemContextMenuUndefined: Self = StObject.set(x, "onItemContextMenu", js.undefined)
    
    @scala.inline
    def setOnItemDeselect(value: /* e */ SyntheticEvent[Event, Element] => scala.Unit): Self = StObject.set(x, "onItemDeselect", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnItemDeselectUndefined: Self = StObject.set(x, "onItemDeselect", js.undefined)
    
    @scala.inline
    def setOnItemDoubleClick(value: (/* itemId */ Id, /* e */ SyntheticEvent[Event, Element], /* time */ Double) => scala.Unit): Self = StObject.set(x, "onItemDoubleClick", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnItemDoubleClickUndefined: Self = StObject.set(x, "onItemDoubleClick", js.undefined)
    
    @scala.inline
    def setOnItemDrag(value: /* itemDragObject */ OnItemDragObjectMove | OnItemDragObjectResize => scala.Unit): Self = StObject.set(x, "onItemDrag", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnItemDragUndefined: Self = StObject.set(x, "onItemDrag", js.undefined)
    
    @scala.inline
    def setOnItemMove(value: (/* itemId */ Id, /* dragTime */ Double, /* newGroupOrder */ Double) => scala.Unit): Self = StObject.set(x, "onItemMove", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnItemMoveUndefined: Self = StObject.set(x, "onItemMove", js.undefined)
    
    @scala.inline
    def setOnItemResize(value: (/* itemId */ Id, /* endTimeOrStartTime */ Double, /* edge */ left | right) => scala.Unit): Self = StObject.set(x, "onItemResize", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnItemResizeUndefined: Self = StObject.set(x, "onItemResize", js.undefined)
    
    @scala.inline
    def setOnItemSelect(value: (/* itemId */ Id, /* e */ js.Any, /* time */ Double) => scala.Unit): Self = StObject.set(x, "onItemSelect", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnItemSelectUndefined: Self = StObject.set(x, "onItemSelect", js.undefined)
    
    @scala.inline
    def setOnTimeChange(
      value: (/* visibleTimeStart */ Double, /* visibleTimeEnd */ Double, /* updateScrollCanvas */ js.Function2[/* start */ Double, /* end */ Double, scala.Unit]) => _
    ): Self = StObject.set(x, "onTimeChange", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnTimeChangeUndefined: Self = StObject.set(x, "onTimeChange", js.undefined)
    
    @scala.inline
    def setOnZoom(value: /* timelineContext */ TimelineContext => scala.Unit): Self = StObject.set(x, "onZoom", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnZoomUndefined: Self = StObject.set(x, "onZoom", js.undefined)
    
    @scala.inline
    def setResizeDetector(value: /* containerResizeDetector */ js.Any => scala.Unit): Self = StObject.set(x, "resizeDetector", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResizeDetectorUndefined: Self = StObject.set(x, "resizeDetector", js.undefined)
    
    @scala.inline
    def setRightSidebarContent(value: ReactElement): Self = StObject.set(x, "rightSidebarContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightSidebarContentReactElement(value: ReactElement): Self = StObject.set(x, "rightSidebarContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightSidebarContentUndefined: Self = StObject.set(x, "rightSidebarContent", js.undefined)
    
    @scala.inline
    def setRightSidebarWidth(value: Double): Self = StObject.set(x, "rightSidebarWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightSidebarWidthUndefined: Self = StObject.set(x, "rightSidebarWidth", js.undefined)
    
    @scala.inline
    def setScrollRef(value: Ref[_]): Self = StObject.set(x, "scrollRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollRefFunction1(value: /* instance */ _ | Null => scala.Unit): Self = StObject.set(x, "scrollRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setScrollRefNull: Self = StObject.set(x, "scrollRef", null)
    
    @scala.inline
    def setScrollRefRefObject(value: ReactRef[_]): Self = StObject.set(x, "scrollRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollRefUndefined: Self = StObject.set(x, "scrollRef", js.undefined)
    
    @scala.inline
    def setSelected(value: js.Array[Double]): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    @scala.inline
    def setSelectedVarargs(value: Double*): Self = StObject.set(x, "selected", js.Array(value :_*))
    
    @scala.inline
    def setSidebarContent(value: ReactElement): Self = StObject.set(x, "sidebarContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSidebarContentReactElement(value: ReactElement): Self = StObject.set(x, "sidebarContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSidebarContentUndefined: Self = StObject.set(x, "sidebarContent", js.undefined)
    
    @scala.inline
    def setSidebarWidth(value: Double): Self = StObject.set(x, "sidebarWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSidebarWidthUndefined: Self = StObject.set(x, "sidebarWidth", js.undefined)
    
    @scala.inline
    def setStackItems(value: Boolean): Self = StObject.set(x, "stackItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackItemsUndefined: Self = StObject.set(x, "stackItems", js.undefined)
    
    @scala.inline
    def setTimeSteps(value: TimelineTimeSteps): Self = StObject.set(x, "timeSteps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeStepsUndefined: Self = StObject.set(x, "timeSteps", js.undefined)
    
    @scala.inline
    def setTraditionalZoom(value: Boolean): Self = StObject.set(x, "traditionalZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTraditionalZoomUndefined: Self = StObject.set(x, "traditionalZoom", js.undefined)
    
    @scala.inline
    def setUseResizeHandle(value: Boolean): Self = StObject.set(x, "useResizeHandle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseResizeHandleUndefined: Self = StObject.set(x, "useResizeHandle", js.undefined)
    
    @scala.inline
    def setVerticalLineClassNamesForTime(value: (/* start */ Double, /* end */ Double) => js.UndefOr[js.Array[String]]): Self = StObject.set(x, "verticalLineClassNamesForTime", js.Any.fromFunction2(value))
    
    @scala.inline
    def setVerticalLineClassNamesForTimeUndefined: Self = StObject.set(x, "verticalLineClassNamesForTime", js.undefined)
    
    @scala.inline
    def setVisibleTimeEnd(value: js.Date | Moment | Double): Self = StObject.set(x, "visibleTimeEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleTimeEndDate(value: js.Date): Self = StObject.set(x, "visibleTimeEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleTimeEndUndefined: Self = StObject.set(x, "visibleTimeEnd", js.undefined)
    
    @scala.inline
    def setVisibleTimeStart(value: js.Date | Moment | Double): Self = StObject.set(x, "visibleTimeStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleTimeStartDate(value: js.Date): Self = StObject.set(x, "visibleTimeStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleTimeStartUndefined: Self = StObject.set(x, "visibleTimeStart", js.undefined)
  }
}
