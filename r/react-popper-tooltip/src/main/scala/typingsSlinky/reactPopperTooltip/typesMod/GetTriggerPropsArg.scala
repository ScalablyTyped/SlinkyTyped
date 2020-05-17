package typingsSlinky.reactPopperTooltip.typesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import slinky.core.SyntheticEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTriggerPropsArg
  extends /* key */ StringDictionary[js.Any] {
  var onBlur: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, Element], Unit]] = js.native
  var onClick: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, Element], Unit]] = js.native
  var onContextMenu: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, Element], Unit]] = js.native
  var onFocus: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, Element], Unit]] = js.native
  var onMouseEnter: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, Element], Unit]] = js.native
  var onMouseLeave: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, Element], Unit]] = js.native
  var onMouseMove: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, Element], Unit]] = js.native
  var onTouchEnd: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, Element], Unit]] = js.native
}

object GetTriggerPropsArg {
  @scala.inline
  def apply(): GetTriggerPropsArg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTriggerPropsArg]
  }
  @scala.inline
  implicit class GetTriggerPropsArgOps[Self <: GetTriggerPropsArg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnBlur(value: /* event */ SyntheticEvent[Event, Element] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(value: /* event */ SyntheticEvent[Event, Element] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnContextMenu(value: /* event */ SyntheticEvent[Event, Element] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContextMenu")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnContextMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContextMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFocus(value: /* event */ SyntheticEvent[Event, Element] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseEnter(value: /* event */ SyntheticEvent[Event, Element] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseLeave(value: /* event */ SyntheticEvent[Event, Element] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseMove(value: /* event */ SyntheticEvent[Event, Element] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseMove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseMove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTouchEnd(value: /* event */ SyntheticEvent[Event, Element] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTouchEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchEnd")(js.undefined)
        ret
    }
  }
  
}

