package typingsSlinky.reactBigCalendar.components

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import slinky.core.SyntheticEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactBigCalendar.anon.Action
import typingsSlinky.reactBigCalendar.mod.NavigateAction
import typingsSlinky.reactBigCalendar.mod.TimeGridProps
import typingsSlinky.reactBigCalendar.mod.View
import typingsSlinky.reactBigCalendar.mod.stringOrDate
import typingsSlinky.reactBigCalendar.reactBigCalendarStrings.ignoreEvents
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TimeGrid {
  
  @scala.inline
  def apply[TEvent /* <: js.Object */, TResource /* <: js.Object */](eventOffset: Double): Builder[TEvent, TResource] = {
    val __props = js.Dynamic.literal(eventOffset = eventOffset.asInstanceOf[js.Any])
    new Builder[TEvent, TResource](js.Array(this.component, __props.asInstanceOf[TimeGridProps[TEvent, TResource]]))
  }
  
  @JSImport("react-big-calendar", "TimeGrid")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder[TEvent /* <: js.Object */, TResource /* <: js.Object */] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactBigCalendar.mod.TimeGrid[TEvent, TResource]] {
    
    @scala.inline
    def accessors(value: js.Object): this.type = set("accessors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def components(value: js.Object): this.type = set("components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dayLayoutAlgorithm(value: js.Any): this.type = set("dayLayoutAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def events(value: js.Array[TEvent]): this.type = set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def eventsVarargs(value: TEvent*): this.type = set("events", js.Array(value :_*))
    
    @scala.inline
    def getDrilldownView(
      value: (/* targetDate */ js.Date, /* currentViewName */ View, /* configuredViewNames */ js.Array[View]) => Unit
    ): this.type = set("getDrilldownView", js.Any.fromFunction3(value))
    
    @scala.inline
    def getDrilldownViewNull: this.type = set("getDrilldownView", null)
    
    @scala.inline
    def getNow(value: () => js.Date): this.type = set("getNow", js.Any.fromFunction0(value))
    
    @scala.inline
    def getters(value: js.Object): this.type = set("getters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def localizer(value: js.Object): this.type = set("localizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def longPressThreshold(value: Double): this.type = set("longPressThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def max(value: stringOrDate): this.type = set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxDate(value: js.Date): this.type = set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def min(value: stringOrDate): this.type = set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minDate(value: js.Date): this.type = set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDoubleClickEvent(value: (TEvent, /* e */ SyntheticEvent[Event, HTMLElement]) => Unit): this.type = set("onDoubleClickEvent", js.Any.fromFunction2(value))
    
    @scala.inline
    def onDrillDown(value: (/* date */ js.Date, /* view */ View) => Unit): this.type = set("onDrillDown", js.Any.fromFunction2(value))
    
    @scala.inline
    def onKeyPressEvent(value: /* repeated */ js.Any => _): this.type = set("onKeyPressEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def onNavigate(value: /* action */ NavigateAction => Unit): this.type = set("onNavigate", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSelectEnd(value: /* repeated */ js.Any => _): this.type = set("onSelectEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSelectEvent(value: (TEvent, /* e */ SyntheticEvent[Event, HTMLElement]) => Unit): this.type = set("onSelectEvent", js.Any.fromFunction2(value))
    
    @scala.inline
    def onSelectSlot(value: /* slotInfo */ Action => Unit): this.type = set("onSelectSlot", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSelectStart(value: /* repeated */ js.Any => _): this.type = set("onSelectStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def range(value: js.Array[_]): this.type = set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rangeVarargs(value: js.Any*): this.type = set("range", js.Array(value :_*))
    
    @scala.inline
    def resources(value: js.Array[TResource]): this.type = set("resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def resourcesVarargs(value: TResource*): this.type = set("resources", js.Array(value :_*))
    
    @scala.inline
    def rtl(value: Boolean): this.type = set("rtl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollToTime(value: js.Date): this.type = set("scrollToTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectable(value: Boolean | ignoreEvents): this.type = set("selectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selected(value: js.Object): this.type = set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showMultiDayTimes(value: Boolean): this.type = set("showMultiDayTimes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def step(value: Double): this.type = set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def timeslots(value: Double): this.type = set("timeslots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps[TEvent /* <: js.Object */, TResource /* <: js.Object */](p: TimeGridProps[TEvent, TResource]): Builder[TEvent, TResource] = new Builder[TEvent, TResource](js.Array(this.component, p.asInstanceOf[js.Any]))
}
