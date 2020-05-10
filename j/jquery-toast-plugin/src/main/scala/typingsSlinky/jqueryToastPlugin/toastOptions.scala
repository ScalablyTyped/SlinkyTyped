package typingsSlinky.jqueryToastPlugin

import typingsSlinky.jqueryToastPlugin.jqueryToastPluginBooleans.`false`
import typingsSlinky.jqueryToastPlugin.jqueryToastPluginStrings.`bottom-center`
import typingsSlinky.jqueryToastPlugin.jqueryToastPluginStrings.`bottom-left`
import typingsSlinky.jqueryToastPlugin.jqueryToastPluginStrings.`bottom-right`
import typingsSlinky.jqueryToastPlugin.jqueryToastPluginStrings.`mid-center`
import typingsSlinky.jqueryToastPlugin.jqueryToastPluginStrings.`top-center`
import typingsSlinky.jqueryToastPlugin.jqueryToastPluginStrings.`top-left`
import typingsSlinky.jqueryToastPlugin.jqueryToastPluginStrings.`top-right`
import typingsSlinky.jqueryToastPlugin.jqueryToastPluginStrings.center
import typingsSlinky.jqueryToastPlugin.jqueryToastPluginStrings.error
import typingsSlinky.jqueryToastPlugin.jqueryToastPluginStrings.fade
import typingsSlinky.jqueryToastPlugin.jqueryToastPluginStrings.info
import typingsSlinky.jqueryToastPlugin.jqueryToastPluginStrings.left
import typingsSlinky.jqueryToastPlugin.jqueryToastPluginStrings.plain
import typingsSlinky.jqueryToastPlugin.jqueryToastPluginStrings.right
import typingsSlinky.jqueryToastPlugin.jqueryToastPluginStrings.slide
import typingsSlinky.jqueryToastPlugin.jqueryToastPluginStrings.success
import typingsSlinky.jqueryToastPlugin.jqueryToastPluginStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait toastOptions extends js.Object {
  var afterHidden: js.UndefOr[js.Function0[_]] = js.native
  var afterShown: js.UndefOr[js.Function0[_]] = js.native
  var allowToastClose: js.UndefOr[Boolean] = js.native
  var beforeHide: js.UndefOr[js.Function0[_]] = js.native
  var beforeShow: js.UndefOr[js.Function0[_]] = js.native
  var bgColor: js.UndefOr[String] = js.native
  var heading: js.UndefOr[String] = js.native
  var hideAfter: js.UndefOr[Double | `false`] = js.native
  var icon: js.UndefOr[info | warning | error | success] = js.native
  var loader: js.UndefOr[Boolean] = js.native
  var loaderBg: js.UndefOr[String] = js.native
  var position: js.UndefOr[
    `bottom-left` | `bottom-right` | `bottom-center` | `top-right` | `top-left` | `top-center` | `mid-center` | CustomPosition
  ] = js.native
  var showHideTransition: js.UndefOr[fade | slide | plain] = js.native
  var stack: js.UndefOr[Double | `false`] = js.native
  var text: String = js.native
  var textAlign: js.UndefOr[left | right | center] = js.native
  var textColor: js.UndefOr[String] = js.native
}

object toastOptions {
  @scala.inline
  def apply(text: String): toastOptions = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[toastOptions]
  }
  @scala.inline
  implicit class toastOptionsOps[Self <: toastOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterHidden(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterHidden")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAfterHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterShown(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterShown")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAfterShown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterShown")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowToastClose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowToastClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowToastClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowToastClose")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeHide(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeHide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutBeforeHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeHide")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeShow(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeShow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutBeforeShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeShow")(js.undefined)
        ret
    }
    @scala.inline
    def withBgColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBgColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgColor")(js.undefined)
        ret
    }
    @scala.inline
    def withHeading(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heading")(js.undefined)
        ret
    }
    @scala.inline
    def withHideAfter(value: Double | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withIcon(value: info | warning | error | success): Self = {
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
    def withLoader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loader")(js.undefined)
        ret
    }
    @scala.inline
    def withLoaderBg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loaderBg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoaderBg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loaderBg")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(
      value: `bottom-left` | `bottom-right` | `bottom-center` | `top-right` | `top-left` | `top-center` | `mid-center` | CustomPosition
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withShowHideTransition(value: fade | slide | plain): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHideTransition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowHideTransition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHideTransition")(js.undefined)
        ret
    }
    @scala.inline
    def withStack(value: Double | `false`): Self = {
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
    def withTextAlign(value: left | right | center): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textColor")(js.undefined)
        ret
    }
  }
  
}

