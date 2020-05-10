package typingsSlinky.reactSwipeable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwipeableOptions extends js.Object {
  // Configuration Props
  var delta: js.UndefOr[Double] = js.native
  // Event handler/callbacks
  var onSwiped: js.UndefOr[SwipeCallback] = js.native
  var onSwipedDown: js.UndefOr[SwipeCallback] = js.native
  var onSwipedLeft: js.UndefOr[SwipeCallback] = js.native
  var onSwipedRight: js.UndefOr[SwipeCallback] = js.native
  var onSwipedUp: js.UndefOr[SwipeCallback] = js.native
  var onSwiping: js.UndefOr[SwipeCallback] = js.native
  var preventDefaultTouchmoveEvent: js.UndefOr[Boolean] = js.native
  var rotationAngle: js.UndefOr[Double] = js.native
  var trackMouse: js.UndefOr[Boolean] = js.native
  var trackTouch: js.UndefOr[Boolean] = js.native
}

object SwipeableOptions {
  @scala.inline
  def apply(): SwipeableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwipeableOptions]
  }
  @scala.inline
  implicit class SwipeableOptionsOps[Self <: SwipeableOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelta(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delta")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSwiped(value: /* eventData */ EventData => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwiped")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSwiped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwiped")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSwipedDown(value: /* eventData */ EventData => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipedDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSwipedDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipedDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSwipedLeft(value: /* eventData */ EventData => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipedLeft")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSwipedLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipedLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSwipedRight(value: /* eventData */ EventData => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipedRight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSwipedRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipedRight")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSwipedUp(value: /* eventData */ EventData => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipedUp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSwipedUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipedUp")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSwiping(value: /* eventData */ EventData => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwiping")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSwiping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwiping")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventDefaultTouchmoveEvent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefaultTouchmoveEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventDefaultTouchmoveEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefaultTouchmoveEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withRotationAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotationAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotationAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotationAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackMouse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackMouse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackMouse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackMouse")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackTouch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackTouch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackTouch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackTouch")(js.undefined)
        ret
    }
  }
  
}

