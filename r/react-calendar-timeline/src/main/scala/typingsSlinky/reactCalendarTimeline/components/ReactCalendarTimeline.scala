package typingsSlinky.reactCalendarTimeline.components

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.moment.mod.Moment
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactCalendarTimeline.mod.Id
import typingsSlinky.reactCalendarTimeline.mod.OnItemDragObjectMove
import typingsSlinky.reactCalendarTimeline.mod.OnItemDragObjectResize
import typingsSlinky.reactCalendarTimeline.mod.ReactCalendarGroupRendererProps
import typingsSlinky.reactCalendarTimeline.mod.ReactCalendarItemRendererProps
import typingsSlinky.reactCalendarTimeline.mod.ReactCalendarTimelineProps
import typingsSlinky.reactCalendarTimeline.mod.TimelineContext
import typingsSlinky.reactCalendarTimeline.mod.TimelineGroupBase
import typingsSlinky.reactCalendarTimeline.mod.TimelineItemBase
import typingsSlinky.reactCalendarTimeline.mod.TimelineKeys
import typingsSlinky.reactCalendarTimeline.mod.TimelineTimeSteps
import typingsSlinky.reactCalendarTimeline.mod.default
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

object ReactCalendarTimeline {
  
  @scala.inline
  def apply[CustomItem /* <: TimelineItemBase[js.Any] */, CustomGroup /* <: TimelineGroupBase */](groups: js.Array[CustomGroup], items: js.Array[CustomItem]): Builder[CustomItem, CustomGroup] = {
    val __props = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    new Builder[CustomItem, CustomGroup](js.Array(this.component, __props.asInstanceOf[ReactCalendarTimelineProps[CustomItem, CustomGroup]]))
  }
  
  @JSImport("react-calendar-timeline", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder[CustomItem /* <: TimelineItemBase[js.Any] */, CustomGroup /* <: TimelineGroupBase */] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default[CustomItem, CustomGroup]] {
    
    @scala.inline
    def canChangeGroup(value: Boolean): this.type = set("canChangeGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def canMove(value: Boolean): this.type = set("canMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def canResize(value: `false` | `true` | left | right | both): this.type = set("canResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def clickTolerance(value: Double): this.type = set("clickTolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultTimeEnd(value: js.Date | Moment): this.type = set("defaultTimeEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultTimeEndDate(value: js.Date): this.type = set("defaultTimeEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultTimeStart(value: js.Date | Moment): this.type = set("defaultTimeStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultTimeStartDate(value: js.Date): this.type = set("defaultTimeStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dragSnap(value: Double): this.type = set("dragSnap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def groupRenderer(value: /* props */ ReactCalendarGroupRendererProps[CustomGroup] => ReactElement): this.type = set("groupRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def headerRef(value: Ref[_]): this.type = set("headerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def headerRefFunction1(value: /* instance */ _ | Null => Unit): this.type = set("headerRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def headerRefNull: this.type = set("headerRef", null)
    
    @scala.inline
    def headerRefRefObject(value: ReactRef[_]): this.type = set("headerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def horizontalLineClassNamesForGroup(value: CustomGroup => js.Array[String]): this.type = set("horizontalLineClassNamesForGroup", js.Any.fromFunction1(value))
    
    @scala.inline
    def itemHeightRatio(value: Double): this.type = set("itemHeightRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemRenderer(value: /* props */ ReactCalendarItemRendererProps[CustomItem] => ReactElement): this.type = set("itemRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def itemTouchSendsClick(value: Boolean): this.type = set("itemTouchSendsClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def keys(value: TimelineKeys): this.type = set("keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def lineHeight(value: Double): this.type = set("lineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxZoom(value: Double): this.type = set("maxZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minResizeWidth(value: Double): this.type = set("minResizeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minZoom(value: Double): this.type = set("minZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def moveResizeValidator(
      value: (/* action */ move | resize, /* itemId */ Id, /* time */ Double, /* resizeEdge */ left | right) => Double
    ): this.type = set("moveResizeValidator", js.Any.fromFunction4(value))
    
    @scala.inline
    def onBoundsChange(value: (/* canvasTimeStart */ Double, /* canvasTimeEnd */ Double) => _): this.type = set("onBoundsChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def onCanvasClick(value: (/* groupId */ Id, /* time */ Double, /* e */ SyntheticEvent[Event, Element]) => Unit): this.type = set("onCanvasClick", js.Any.fromFunction3(value))
    
    @scala.inline
    def onCanvasContextMenu(value: (/* groupId */ Id, /* time */ Double, /* e */ SyntheticEvent[Event, Element]) => Unit): this.type = set("onCanvasContextMenu", js.Any.fromFunction3(value))
    
    @scala.inline
    def onCanvasDoubleClick(value: (/* groupId */ Id, /* time */ Double, /* e */ SyntheticEvent[Event, Element]) => Unit): this.type = set("onCanvasDoubleClick", js.Any.fromFunction3(value))
    
    @scala.inline
    def onItemClick(value: (/* itemId */ Id, /* e */ SyntheticEvent[Event, Element], /* time */ Double) => Unit): this.type = set("onItemClick", js.Any.fromFunction3(value))
    
    @scala.inline
    def onItemContextMenu(value: (/* itemId */ Id, /* e */ SyntheticEvent[Event, Element], /* time */ Double) => Unit): this.type = set("onItemContextMenu", js.Any.fromFunction3(value))
    
    @scala.inline
    def onItemDeselect(value: /* e */ SyntheticEvent[Event, Element] => Unit): this.type = set("onItemDeselect", js.Any.fromFunction1(value))
    
    @scala.inline
    def onItemDoubleClick(value: (/* itemId */ Id, /* e */ SyntheticEvent[Event, Element], /* time */ Double) => Unit): this.type = set("onItemDoubleClick", js.Any.fromFunction3(value))
    
    @scala.inline
    def onItemDrag(value: /* itemDragObject */ OnItemDragObjectMove | OnItemDragObjectResize => Unit): this.type = set("onItemDrag", js.Any.fromFunction1(value))
    
    @scala.inline
    def onItemMove(value: (/* itemId */ Id, /* dragTime */ Double, /* newGroupOrder */ Double) => Unit): this.type = set("onItemMove", js.Any.fromFunction3(value))
    
    @scala.inline
    def onItemResize(value: (/* itemId */ Id, /* endTimeOrStartTime */ Double, /* edge */ left | right) => Unit): this.type = set("onItemResize", js.Any.fromFunction3(value))
    
    @scala.inline
    def onItemSelect(value: (/* itemId */ Id, /* e */ js.Any, /* time */ Double) => Unit): this.type = set("onItemSelect", js.Any.fromFunction3(value))
    
    @scala.inline
    def onTimeChange(
      value: (/* visibleTimeStart */ Double, /* visibleTimeEnd */ Double, /* updateScrollCanvas */ js.Function2[/* start */ Double, /* end */ Double, Unit]) => _
    ): this.type = set("onTimeChange", js.Any.fromFunction3(value))
    
    @scala.inline
    def onZoom(value: /* timelineContext */ TimelineContext => Unit): this.type = set("onZoom", js.Any.fromFunction1(value))
    
    @scala.inline
    def resizeDetector(value: /* containerResizeDetector */ js.Any => Unit): this.type = set("resizeDetector", js.Any.fromFunction1(value))
    
    @scala.inline
    def rightSidebarContent(value: ReactElement): this.type = set("rightSidebarContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rightSidebarContentReactElement(value: ReactElement): this.type = set("rightSidebarContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rightSidebarWidth(value: Double): this.type = set("rightSidebarWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollRef(value: Ref[_]): this.type = set("scrollRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollRefFunction1(value: /* instance */ _ | Null => Unit): this.type = set("scrollRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def scrollRefNull: this.type = set("scrollRef", null)
    
    @scala.inline
    def scrollRefRefObject(value: ReactRef[_]): this.type = set("scrollRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selected(value: js.Array[Double]): this.type = set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectedVarargs(value: Double*): this.type = set("selected", js.Array(value :_*))
    
    @scala.inline
    def sidebarContent(value: ReactElement): this.type = set("sidebarContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sidebarContentReactElement(value: ReactElement): this.type = set("sidebarContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sidebarWidth(value: Double): this.type = set("sidebarWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stackItems(value: Boolean): this.type = set("stackItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def timeSteps(value: TimelineTimeSteps): this.type = set("timeSteps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def traditionalZoom(value: Boolean): this.type = set("traditionalZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def useResizeHandle(value: Boolean): this.type = set("useResizeHandle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def verticalLineClassNamesForTime(value: (/* start */ Double, /* end */ Double) => js.UndefOr[js.Array[String]]): this.type = set("verticalLineClassNamesForTime", js.Any.fromFunction2(value))
    
    @scala.inline
    def visibleTimeEnd(value: js.Date | Moment | Double): this.type = set("visibleTimeEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def visibleTimeEndDate(value: js.Date): this.type = set("visibleTimeEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def visibleTimeStart(value: js.Date | Moment | Double): this.type = set("visibleTimeStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def visibleTimeStartDate(value: js.Date): this.type = set("visibleTimeStart", value.asInstanceOf[js.Any])
  }
  
  def withProps[CustomItem /* <: TimelineItemBase[js.Any] */, CustomGroup /* <: TimelineGroupBase */](p: ReactCalendarTimelineProps[CustomItem, CustomGroup]): Builder[CustomItem, CustomGroup] = new Builder[CustomItem, CustomGroup](js.Array(this.component, p.asInstanceOf[js.Any]))
}
