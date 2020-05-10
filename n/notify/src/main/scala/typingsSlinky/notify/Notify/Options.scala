package typingsSlinky.notify.Notify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Show the arrow pointing at the element. Default is true.
    */
  var arrowShow: js.UndefOr[Boolean] = js.native
  /**
    * Arrow size in pixels. Default is 5.
    */
  var arrowSize: js.UndefOr[Double] = js.native
  /**
    * Whether to auto-hide the notification (after autoHideDelay milliseconds). Default is true.
    */
  var autoHide: js.UndefOr[Boolean] = js.native
  /**
    * If autoHide, hide after milliseconds. Default is 5000.
    */
  var autoHideDelay: js.UndefOr[Double] = js.native
  /**
    * Class of the notification (string or [string]). Default is 'error'.
    *
    * Notify looks through the classes defined in the given style and will apply the CSS
    * attributes of that style. Additionally, a CSS class of "notifyjs-<style name>-<class name>"
    * will be applied.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Whether to hide the notification on click. Default is true.
    */
  var clickToHide: js.UndefOr[Boolean] = js.native
  /**
    * Position of the notification when created relative to an element. Default is 'bottom left'.
    */
  var elementPosition: js.UndefOr[String] = js.native
  /**
    * Padding in px between element and notification. Deafult is 2.
    */
  var gap: js.UndefOr[Double] = js.native
  /**
    * Position of the notification when created globally. Default is 'top right'.
    */
  var globalPosition: js.UndefOr[String] = js.native
  /**
    * Animation when notification is hidden. Default is 'slideUp'.
    */
  var hideAnimation: js.UndefOr[String] = js.native
  /**
    * Duration for hide animation, in milliseconds. Default is 200.
    */
  var hideDuration: js.UndefOr[Double] = js.native
  /**
    * Animation when notification is shown. Default is 'slideDown'.
    */
  var showAnimation: js.UndefOr[String] = js.native
  /**
    * Duration show animation, in milliseconds. Default is 400.
    */
  var showDuration: js.UndefOr[Double] = js.native
  /**
    * Style of the notification. Default is 'bootstrap'.
    *
    * For more information on styles, refer to Notify.StyleDefinition.
    */
  var style: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def withoutArrowShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowShow")(js.undefined)
        ret
    }
    @scala.inline
    def withArrowSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowSize")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoHide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHide")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoHideDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHideDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoHideDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHideDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withClickToHide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickToHide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickToHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickToHide")(js.undefined)
        ret
    }
    @scala.inline
    def withElementPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElementPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withGap(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gap")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withHideAnimation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withHideDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withShowAnimation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withShowDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

