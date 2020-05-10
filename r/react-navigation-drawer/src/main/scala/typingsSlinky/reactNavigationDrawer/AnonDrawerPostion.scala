package typingsSlinky.reactNavigationDrawer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDrawerPostion extends js.Object {
  var drawerPostion: String = js.native
  var drawerType: String = js.native
  var gestureEnabled: Boolean = js.native
  var hideStatusBar: Boolean = js.native
  var keyboardDismissMode: String = js.native
  var statusBarAnimation: String = js.native
  var swipeEdgeWidth: Double = js.native
  var swipeVelocityThreshold: Double = js.native
}

object AnonDrawerPostion {
  @scala.inline
  def apply(
    drawerPostion: String,
    drawerType: String,
    gestureEnabled: Boolean,
    hideStatusBar: Boolean,
    keyboardDismissMode: String,
    statusBarAnimation: String,
    swipeEdgeWidth: Double,
    swipeVelocityThreshold: Double
  ): AnonDrawerPostion = {
    val __obj = js.Dynamic.literal(drawerPostion = drawerPostion.asInstanceOf[js.Any], drawerType = drawerType.asInstanceOf[js.Any], gestureEnabled = gestureEnabled.asInstanceOf[js.Any], hideStatusBar = hideStatusBar.asInstanceOf[js.Any], keyboardDismissMode = keyboardDismissMode.asInstanceOf[js.Any], statusBarAnimation = statusBarAnimation.asInstanceOf[js.Any], swipeEdgeWidth = swipeEdgeWidth.asInstanceOf[js.Any], swipeVelocityThreshold = swipeVelocityThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDrawerPostion]
  }
  @scala.inline
  implicit class AnonDrawerPostionOps[Self <: AnonDrawerPostion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDrawerPostion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawerPostion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDrawerType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawerType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGestureEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gestureEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHideStatusBar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideStatusBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyboardDismissMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardDismissMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusBarAnimation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusBarAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwipeEdgeWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeEdgeWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwipeVelocityThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeVelocityThreshold")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

