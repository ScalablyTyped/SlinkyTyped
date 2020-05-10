package typingsSlinky.reactBigCalendar.mod

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.reactBigCalendar.AnonDayProp
import typingsSlinky.reactBigCalendar.AnonEnd
import typingsSlinky.reactBigCalendar.CSSPropertiesxOffsetnumbe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventWrapperProps[TEvent /* <: js.Object */] extends js.Object {
  var accessors: AnonEnd[TEvent] = js.native
  var className: String = js.native
  var continuesEarlier: Boolean = js.native
  var continuesLater: Boolean = js.native
  var event: TEvent = js.native
  var getters: AnonDayProp[TEvent] = js.native
  var isRtl: Boolean = js.native
  var label: String = js.native
  var selected: Boolean = js.native
  // https://github.com/intljusticemission/react-big-calendar/blob/27a2656b40ac8729634d24376dff8ea781a66d50/src/TimeGridEvent.js#L28
  var style: js.UndefOr[CSSPropertiesxOffsetnumbe] = js.native
  def onClick(e: SyntheticMouseEvent[HTMLElement]): Unit = js.native
  def onDoubleClick(e: SyntheticMouseEvent[HTMLElement]): Unit = js.native
}

object EventWrapperProps {
  @scala.inline
  def apply[TEvent](
    accessors: AnonEnd[TEvent],
    className: String,
    continuesEarlier: Boolean,
    continuesLater: Boolean,
    event: TEvent,
    getters: AnonDayProp[TEvent],
    isRtl: Boolean,
    label: String,
    onClick: SyntheticMouseEvent[HTMLElement] => Unit,
    onDoubleClick: SyntheticMouseEvent[HTMLElement] => Unit,
    selected: Boolean
  ): EventWrapperProps[TEvent] = {
    val __obj = js.Dynamic.literal(accessors = accessors.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], continuesEarlier = continuesEarlier.asInstanceOf[js.Any], continuesLater = continuesLater.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], getters = getters.asInstanceOf[js.Any], isRtl = isRtl.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), onDoubleClick = js.Any.fromFunction1(onDoubleClick), selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventWrapperProps[TEvent]]
  }
  @scala.inline
  implicit class EventWrapperPropsOps[Self[tevent] <: EventWrapperProps[tevent], TEvent] (val x: Self[TEvent]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TEvent] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TEvent]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TEvent] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TEvent] with Other]
    @scala.inline
    def withAccessors(value: AnonEnd[TEvent]): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassName(value: String): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContinuesEarlier(value: Boolean): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continuesEarlier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContinuesLater(value: Boolean): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continuesLater")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvent(value: TEvent): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetters(value: AnonDayProp[TEvent]): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsRtl(value: Boolean): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRtl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnClick(value: SyntheticMouseEvent[HTMLElement] => Unit): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnDoubleClick(value: SyntheticMouseEvent[HTMLElement] => Unit): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDoubleClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSelected(value: Boolean): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyle(value: CSSPropertiesxOffsetnumbe): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

