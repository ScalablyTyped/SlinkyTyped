package typingsSlinky.reactTouch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HoldableProps extends js.Object {
  /** @see defineHold */
  var config: js.UndefOr[HoldableConfig] = js.native
  var onHoldComplete: js.UndefOr[js.Function0[Unit]] = js.native
  var onHoldProgress: js.UndefOr[js.Function0[Unit]] = js.native
  var onMouseDown: js.UndefOr[js.Function0[Unit]] = js.native
  var onTouchStart: js.UndefOr[js.Function0[Unit]] = js.native
}

object HoldableProps {
  @scala.inline
  def apply(): HoldableProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HoldableProps]
  }
  @scala.inline
  implicit class HoldablePropsOps[Self <: HoldableProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfig(value: HoldableConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.undefined)
        ret
    }
    @scala.inline
    def withOnHoldComplete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHoldComplete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnHoldComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHoldComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withOnHoldProgress(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHoldProgress")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnHoldProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHoldProgress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseDown(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseDown")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnMouseDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTouchStart(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchStart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnTouchStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchStart")(js.undefined)
        ret
    }
  }
  
}

