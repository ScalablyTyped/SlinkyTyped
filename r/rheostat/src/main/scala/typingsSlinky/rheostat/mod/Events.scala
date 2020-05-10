package typingsSlinky.rheostat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Events extends js.Object {
  var getNextHandlePosition: js.UndefOr[js.Function2[/* handleIdx */ Double, /* percentPosition */ Double, Double]] = js.native
  var onChange: js.UndefOr[js.Function1[/* publicState */ PublicState, _]] = js.native
  var onClick: js.UndefOr[js.Function0[_]] = js.native
  var onKeyPress: js.UndefOr[js.Function0[_]] = js.native
  var onSliderDragEnd: js.UndefOr[js.Function0[_]] = js.native
  var onSliderDragMove: js.UndefOr[js.Function0[_]] = js.native
  var onSliderDragStart: js.UndefOr[js.Function0[_]] = js.native
  var onValuesUpdated: js.UndefOr[js.Function1[/* publicState */ PublicState, _]] = js.native
}

object Events {
  @scala.inline
  def apply(): Events = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Events]
  }
  @scala.inline
  implicit class EventsOps[Self <: Events] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetNextHandlePosition(value: (/* handleIdx */ Double, /* percentPosition */ Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNextHandlePosition")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetNextHandlePosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNextHandlePosition")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: /* publicState */ PublicState => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyPress(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyPress")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnKeyPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyPress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSliderDragEnd(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSliderDragEnd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnSliderDragEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSliderDragEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSliderDragMove(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSliderDragMove")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnSliderDragMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSliderDragMove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSliderDragStart(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSliderDragStart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnSliderDragStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSliderDragStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnValuesUpdated(value: /* publicState */ PublicState => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValuesUpdated")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnValuesUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValuesUpdated")(js.undefined)
        ret
    }
  }
  
}

