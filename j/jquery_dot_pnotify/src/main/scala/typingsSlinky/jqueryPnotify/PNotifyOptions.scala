package typingsSlinky.jqueryPnotify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PNotifyOptions extends js.Object {
  /**
    * Additional classes to be added to the notice. (For custom styling.)
    */
  var addclass: js.UndefOr[String] = js.native
  /**
    * Speed at which the notice animates in and out. "slow", "def" or "normal", "fast" or number of milliseconds.
    */
  var animate_speed: js.UndefOr[String] = js.native
  /**
    * The animation to use when displaying and hiding the notice. "none" and "fade" are supported through CSS. 
    * Others are supported through the Animate module and Animate.css.
    */ 
  var animation: js.UndefOr[String] = js.native
  /**
    * Display the notice when it is created. Turn this off to add notifications to the history without displaying them.
    */
  var auto_display: js.UndefOr[Boolean] = js.native
  var buttons: js.UndefOr[AnonCloserhover] = js.native
  /**
    * Support for PNotifyconfirm options
    */
  var confirm: js.UndefOr[PNotifyconfirm] = js.native
  /**
    * Class to be added to the notice for corner styling.
    */
  var cornerclass: js.UndefOr[String] = js.native
  /**
    * Delay in milliseconds before the notice is removed.
    */
  var delay: js.UndefOr[Double] = js.native
  /**
    * After a delay, remove the notice, set to false for sticky note.
    */
  var hide: js.UndefOr[Boolean] = js.native
  /**
    * Display a pull down menu to redisplay previous notices, and place the notice in the history.
    */
  var history: js.UndefOr[Boolean] = js.native
  /**
    * Set icon to true to use the default icon for the selected style/type, false for no icon, or a string for your own icon class.
    */
  var icon: js.UndefOr[js.Any] = js.native
  /**
    * Change new lines to br tags.
    */
  var insert_brs: js.UndefOr[Boolean] = js.native
  /**
    * The various displayed text, helps facilitating internationalization.
    */
  var labels: js.UndefOr[PNotifyLabel] = js.native
  /**
    * Maximum number of notifications to have onscreen.
    */
  var maxonscreen: js.UndefOr[Double] = js.native
  /**
    * Minimum height of the notice. It will expand to fit content.
    */
  var min_height: js.UndefOr[String] = js.native
  /**
    * Reset the hide timer if the mouse moves over the notice.
    */
  var mouse_reset: js.UndefOr[Boolean] = js.native
  var nonblock: js.UndefOr[AnonNonblock] = js.native
  /**
    * Opacity of the notice.
    */
  var opacity: js.UndefOr[Double] = js.native
  /**
    * Specify a specific duration of position animation
    */
  var position_animate_speed: js.UndefOr[Double] = js.native
  /**
    * Remove the notice's elements from the DOM after it is removed.
    */
  var remove: js.UndefOr[Boolean] = js.native
  /**
    * Display a drop shadow.
    */
  var shadow: js.UndefOr[Boolean] = js.native
  /**
    * The stack on which the notices will be placed. Also controls the direction the notices stack.
    */
  var stack: js.UndefOr[PNotifyStack] = js.native
  /**
    * What styling classes to use. (Can be either "brighttheme", "jqueryui", "bootstrap2", "bootstrap3", "fontawesome" or a custom style object)
    */
  var styling: js.UndefOr[StylingOptions] = js.native
  /**
    * The notice's text. Either boolean false or string
    */
  var text: js.UndefOr[String | Boolean] = js.native
  /**
    * Whether to escape the content of the text. (Not allow HTML.)
    */
  var text_escape: js.UndefOr[Boolean] = js.native
  /**
    * The notice's title. Either boolean false or string
    */
  var title: js.UndefOr[String | Boolean] = js.native
  /**
    * Whether to escape the content of the title. (Not allow HTML.)
    */
  var title_escape: js.UndefOr[Boolean] = js.native
  /**
    * Type of the notice. "notice", "info", "success", or "error".
    */
  var `type`: js.UndefOr[NoticeTypeOptions] = js.native
  /**
    * Width of the notice.
    */
  var width: js.UndefOr[String] = js.native
}

object PNotifyOptions {
  @scala.inline
  def apply(): PNotifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PNotifyOptions]
  }
  @scala.inline
  implicit class PNotifyOptionsOps[Self <: PNotifyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddclass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addclass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddclass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addclass")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimate_speed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate_speed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimate_speed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate_speed")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(js.undefined)
        ret
    }
    @scala.inline
    def withAuto_display(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto_display")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuto_display: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto_display")(js.undefined)
        ret
    }
    @scala.inline
    def withButtons(value: AnonCloserhover): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(js.undefined)
        ret
    }
    @scala.inline
    def withConfirm(value: PNotifyconfirm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfirm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirm")(js.undefined)
        ret
    }
    @scala.inline
    def withCornerclass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cornerclass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCornerclass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cornerclass")(js.undefined)
        ret
    }
    @scala.inline
    def withDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withHide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.undefined)
        ret
    }
    @scala.inline
    def withHistory(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("history")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHistory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("history")(js.undefined)
        ret
    }
    @scala.inline
    def withIcon(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withInsert_brs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert_brs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsert_brs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert_brs")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: PNotifyLabel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxonscreen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxonscreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxonscreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxonscreen")(js.undefined)
        ret
    }
    @scala.inline
    def withMin_height(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min_height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin_height: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min_height")(js.undefined)
        ret
    }
    @scala.inline
    def withMouse_reset(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouse_reset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMouse_reset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouse_reset")(js.undefined)
        ret
    }
    @scala.inline
    def withNonblock(value: AnonNonblock): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonblock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonblock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonblock")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition_animate_speed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position_animate_speed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition_animate_speed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position_animate_speed")(js.undefined)
        ret
    }
    @scala.inline
    def withRemove(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.undefined)
        ret
    }
    @scala.inline
    def withShadow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadow")(js.undefined)
        ret
    }
    @scala.inline
    def withStack(value: PNotifyStack): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stack")(js.undefined)
        ret
    }
    @scala.inline
    def withStyling(value: StylingOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styling")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withText_escape(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text_escape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText_escape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text_escape")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle_escape(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title_escape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle_escape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title_escape")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: NoticeTypeOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

