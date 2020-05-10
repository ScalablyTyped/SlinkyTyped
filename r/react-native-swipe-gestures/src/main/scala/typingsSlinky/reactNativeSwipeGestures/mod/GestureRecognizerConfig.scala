package typingsSlinky.reactNativeSwipeGestures.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GestureRecognizerConfig extends js.Object {
  /**
    * Absolute offset that shouldn't be breached for swipe to be triggered (dy for horizontal swipe, dx for vertical swipe)
    * @default 80
    */
  var directionalOffsetThreshold: js.UndefOr[Double] = js.native
  /**
    * Absolute distance that should be breached for the gesture to not be considered a click (dx or dy properties of gestureState)
    * @default 5
    */
  var gestureIsClickThreshold: js.UndefOr[Double] = js.native
  /**
    * Velocity that has to be breached in order for swipe to be triggered (vx and vy properties of gestureState)
    * @default 0.3
    */
  var velocityThreshold: js.UndefOr[Double] = js.native
}

object GestureRecognizerConfig {
  @scala.inline
  def apply(): GestureRecognizerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GestureRecognizerConfig]
  }
  @scala.inline
  implicit class GestureRecognizerConfigOps[Self <: GestureRecognizerConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirectionalOffsetThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionalOffsetThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectionalOffsetThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionalOffsetThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withGestureIsClickThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gestureIsClickThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGestureIsClickThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gestureIsClickThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withVelocityThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("velocityThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVelocityThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("velocityThreshold")(js.undefined)
        ret
    }
  }
  
}

