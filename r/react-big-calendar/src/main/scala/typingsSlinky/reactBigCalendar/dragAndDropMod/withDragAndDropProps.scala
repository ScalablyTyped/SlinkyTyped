package typingsSlinky.reactBigCalendar.dragAndDropMod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.react.mod.DragEvent
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.reactBigCalendar.anon.AllDay
import typingsSlinky.reactBigCalendar.anon.AllDayEnd
import typingsSlinky.reactBigCalendar.anon.Direction
import typingsSlinky.reactBigCalendar.mod.Components_
import typingsSlinky.reactBigCalendar.reactBigCalendarBooleans.`false`
import typingsSlinky.reactBigCalendar.reactBigCalendarBooleans.`true`
import typingsSlinky.reactBigCalendar.reactBigCalendarStrings.ignoreEvents
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait withDragAndDropProps[TEvent /* <: js.Object */, TResource /* <: js.Object */] extends js.Object {
  
  var components: js.UndefOr[Components_[TEvent, TResource]] = js.native
  
  var dragFromOutsideItem: js.UndefOr[
    js.Function0[(/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, js.Date])]
  ] = js.native
  
  var draggableAccessor: js.UndefOr[(/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, Boolean])] = js.native
  
  var elementProps: js.UndefOr[HTMLAttributes[HTMLElement]] = js.native
  
  var onDragOver: js.UndefOr[js.Function1[/* event */ DragEvent[Element], Unit]] = js.native
  
  var onDragStart: js.UndefOr[js.Function1[/* args */ Direction[TEvent], Unit]] = js.native
  
  var onDropFromOutside: js.UndefOr[js.Function1[/* args */ AllDayEnd, Unit]] = js.native
  
  var onEventDrop: js.UndefOr[js.Function1[/* args */ AllDay[TEvent], Unit]] = js.native
  
  var onEventResize: js.UndefOr[js.Function1[/* args */ AllDay[TEvent], Unit]] = js.native
  
  var resizable: js.UndefOr[Boolean] = js.native
  
  var resizableAccessor: js.UndefOr[(/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, Boolean])] = js.native
  
  var selectable: js.UndefOr[`true` | `false` | ignoreEvents] = js.native
  
  var step: js.UndefOr[Double] = js.native
}
object withDragAndDropProps {
  
  @scala.inline
  def apply[TEvent /* <: js.Object */, TResource /* <: js.Object */](): withDragAndDropProps[TEvent, TResource] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[withDragAndDropProps[TEvent, TResource]]
  }
  
  @scala.inline
  implicit class withDragAndDropPropsOps[Self <: withDragAndDropProps[_, _], TEvent /* <: js.Object */, TResource /* <: js.Object */] (val x: Self with (withDragAndDropProps[TEvent, TResource])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setComponents(value: Components_[TEvent, TResource]): Self = this.set("components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponents: Self = this.set("components", js.undefined)
    
    @scala.inline
    def setDragFromOutsideItem(value: () => (/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, js.Date])): Self = this.set("dragFromOutsideItem", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDragFromOutsideItem: Self = this.set("dragFromOutsideItem", js.undefined)
    
    @scala.inline
    def setDraggableAccessorFunction1(value: /* event */ TEvent => Boolean): Self = this.set("draggableAccessor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDraggableAccessor(value: (/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, Boolean])): Self = this.set("draggableAccessor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraggableAccessor: Self = this.set("draggableAccessor", js.undefined)
    
    @scala.inline
    def setElementProps(value: HTMLAttributes[HTMLElement]): Self = this.set("elementProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElementProps: Self = this.set("elementProps", js.undefined)
    
    @scala.inline
    def setOnDragOver(value: /* event */ DragEvent[Element] => Unit): Self = this.set("onDragOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDragOver: Self = this.set("onDragOver", js.undefined)
    
    @scala.inline
    def setOnDragStart(value: /* args */ Direction[TEvent] => Unit): Self = this.set("onDragStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDragStart: Self = this.set("onDragStart", js.undefined)
    
    @scala.inline
    def setOnDropFromOutside(value: /* args */ AllDayEnd => Unit): Self = this.set("onDropFromOutside", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDropFromOutside: Self = this.set("onDropFromOutside", js.undefined)
    
    @scala.inline
    def setOnEventDrop(value: /* args */ AllDay[TEvent] => Unit): Self = this.set("onEventDrop", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnEventDrop: Self = this.set("onEventDrop", js.undefined)
    
    @scala.inline
    def setOnEventResize(value: /* args */ AllDay[TEvent] => Unit): Self = this.set("onEventResize", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnEventResize: Self = this.set("onEventResize", js.undefined)
    
    @scala.inline
    def setResizable(value: Boolean): Self = this.set("resizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizable: Self = this.set("resizable", js.undefined)
    
    @scala.inline
    def setResizableAccessorFunction1(value: /* event */ TEvent => Boolean): Self = this.set("resizableAccessor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResizableAccessor(value: (/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, Boolean])): Self = this.set("resizableAccessor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizableAccessor: Self = this.set("resizableAccessor", js.undefined)
    
    @scala.inline
    def setSelectable(value: `true` | `false` | ignoreEvents): Self = this.set("selectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectable: Self = this.set("selectable", js.undefined)
    
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
  }
}
