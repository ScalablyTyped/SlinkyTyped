package typingsSlinky.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PanResponderGestureState extends js.Object {
  // All `gestureState` accounts for timeStamps up until:
  var _accountsForMovesUpTo: Double = js.native
  /**
    * accumulated distance of the gesture since the touch started
    */
  var dx: Double = js.native
  /**
    * accumulated distance of the gesture since the touch started
    */
  var dy: Double = js.native
  /**
    *  the latest screen coordinates of the recently-moved touch
    */
  var moveX: Double = js.native
  /**
    *  the latest screen coordinates of the recently-moved touch
    */
  var moveY: Double = js.native
  /**
    * Number of touches currently on screen
    */
  var numberActiveTouches: Double = js.native
  /**
    *  ID of the gestureState- persisted as long as there at least one touch on
    */
  var stateID: Double = js.native
  /**
    * current velocity of the gesture
    */
  var vx: Double = js.native
  /**
    * current velocity of the gesture
    */
  var vy: Double = js.native
  /**
    * the screen coordinates of the responder grant
    */
  var x0: Double = js.native
  /**
    * the screen coordinates of the responder grant
    */
  var y0: Double = js.native
}

object PanResponderGestureState {
  @scala.inline
  def apply(
    _accountsForMovesUpTo: Double,
    dx: Double,
    dy: Double,
    moveX: Double,
    moveY: Double,
    numberActiveTouches: Double,
    stateID: Double,
    vx: Double,
    vy: Double,
    x0: Double,
    y0: Double
  ): PanResponderGestureState = {
    val __obj = js.Dynamic.literal(_accountsForMovesUpTo = _accountsForMovesUpTo.asInstanceOf[js.Any], dx = dx.asInstanceOf[js.Any], dy = dy.asInstanceOf[js.Any], moveX = moveX.asInstanceOf[js.Any], moveY = moveY.asInstanceOf[js.Any], numberActiveTouches = numberActiveTouches.asInstanceOf[js.Any], stateID = stateID.asInstanceOf[js.Any], vx = vx.asInstanceOf[js.Any], vy = vy.asInstanceOf[js.Any], x0 = x0.asInstanceOf[js.Any], y0 = y0.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanResponderGestureState]
  }
  @scala.inline
  implicit class PanResponderGestureStateOps[Self <: PanResponderGestureState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_accountsForMovesUpTo(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_accountsForMovesUpTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMoveX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMoveY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberActiveTouches(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberActiveTouches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStateID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX0(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x0")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY0(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y0")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

