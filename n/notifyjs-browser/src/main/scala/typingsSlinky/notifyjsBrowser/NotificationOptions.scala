package typingsSlinky.notifyjsBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationOptions extends js.Object {
  // show the arrow pointing at the element
  var arrowShow: Boolean = js.native
  // arrow size in pixels
  var arrowSize: Double = js.native
  // whether to auto-hide the notification
  var autoHide: Boolean = js.native
  // if autoHide, hide after milliseconds
  var autoHideDelay: Double = js.native
  // default class (string or [string])
  var className: String = js.native
  // whether to hide the notification on click
  var clickToHide: Boolean = js.native
  // default positions
  var elementPosition: String = js.native
  // padding between element and notification
  var gap: Double = js.native
  var globalPosition: String = js.native
  // hide animation
  var hideAnimation: String = js.native
  // hide animation duration
  var hideDuration: Double = js.native
  // position defines the notification position though uses the defaults below
  var position: String = js.native
  // show animation
  var showAnimation: String = js.native
  // show animation duration
  var showDuration: Double = js.native
  // default style
  var style: String = js.native
}

object NotificationOptions {
  @scala.inline
  def apply(
    arrowShow: Boolean,
    arrowSize: Double,
    autoHide: Boolean,
    autoHideDelay: Double,
    className: String,
    clickToHide: Boolean,
    elementPosition: String,
    gap: Double,
    globalPosition: String,
    hideAnimation: String,
    hideDuration: Double,
    position: String,
    showAnimation: String,
    showDuration: Double,
    style: String
  ): NotificationOptions = {
    val __obj = js.Dynamic.literal(arrowShow = arrowShow.asInstanceOf[js.Any], arrowSize = arrowSize.asInstanceOf[js.Any], autoHide = autoHide.asInstanceOf[js.Any], autoHideDelay = autoHideDelay.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], clickToHide = clickToHide.asInstanceOf[js.Any], elementPosition = elementPosition.asInstanceOf[js.Any], gap = gap.asInstanceOf[js.Any], globalPosition = globalPosition.asInstanceOf[js.Any], hideAnimation = hideAnimation.asInstanceOf[js.Any], hideDuration = hideDuration.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], showAnimation = showAnimation.asInstanceOf[js.Any], showDuration = showDuration.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationOptions]
  }
  @scala.inline
  implicit class NotificationOptionsOps[Self <: NotificationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrowShow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowShow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArrowSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoHide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoHideDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHideDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClickToHide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickToHide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElementPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGap(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlobalPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHideAnimation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHideDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowAnimation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

