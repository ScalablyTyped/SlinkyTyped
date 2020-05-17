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
import scala.scalajs.js.annotation._

@js.native
trait withDragAndDropProps[TEvent /* <: js.Object */] extends js.Object {
  var components: js.UndefOr[Components_[TEvent]] = js.native
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
  def apply[TEvent](): withDragAndDropProps[TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[withDragAndDropProps[TEvent]]
  }
  @scala.inline
  implicit class withDragAndDropPropsOps[Self[tevent] <: withDragAndDropProps[tevent], TEvent] (val x: Self[TEvent]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TEvent] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TEvent]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TEvent] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TEvent] with Other]
    @scala.inline
    def withComponents(value: Components_[TEvent]): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("components")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponents: Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("components")(js.undefined)
        ret
    }
    @scala.inline
    def withDragFromOutsideItem(value: () => (/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, js.Date])): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragFromOutsideItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDragFromOutsideItem: Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragFromOutsideItem")(js.undefined)
        ret
    }
    @scala.inline
    def withDraggableAccessorFunction1(value: /* event */ TEvent => Boolean): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggableAccessor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDraggableAccessor(value: (/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, Boolean])): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggableAccessor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggableAccessor: Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggableAccessor")(js.undefined)
        ret
    }
    @scala.inline
    def withElementProps(value: HTMLAttributes[HTMLElement]): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElementProps: Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementProps")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragOver(value: /* event */ DragEvent[Element] => Unit): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragOver")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragOver: Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragOver")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragStart(value: /* args */ Direction[TEvent] => Unit): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragStart: Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDropFromOutside(value: /* args */ AllDayEnd => Unit): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDropFromOutside")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDropFromOutside: Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDropFromOutside")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEventDrop(value: /* args */ AllDay[TEvent] => Unit): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEventDrop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEventDrop: Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEventDrop")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEventResize(value: /* args */ AllDay[TEvent] => Unit): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEventResize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEventResize: Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEventResize")(js.undefined)
        ret
    }
    @scala.inline
    def withResizable(value: Boolean): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizable: Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizable")(js.undefined)
        ret
    }
    @scala.inline
    def withResizableAccessorFunction1(value: /* event */ TEvent => Boolean): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizableAccessor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResizableAccessor(value: (/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, Boolean])): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizableAccessor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizableAccessor: Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizableAccessor")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectable(value: `true` | `false` | ignoreEvents): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectable: Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectable")(js.undefined)
        ret
    }
    @scala.inline
    def withStep(value: Double): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStep: Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(js.undefined)
        ret
    }
  }
  
}

