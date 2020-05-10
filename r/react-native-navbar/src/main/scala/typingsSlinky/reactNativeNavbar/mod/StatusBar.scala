package typingsSlinky.reactNativeNavbar.mod

import typingsSlinky.reactNativeNavbar.reactNativeNavbarStrings.`light-content`
import typingsSlinky.reactNativeNavbar.reactNativeNavbarStrings.fade
import typingsSlinky.reactNativeNavbar.reactNativeNavbarStrings.none
import typingsSlinky.reactNativeNavbar.reactNativeNavbarStrings.slide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatusBar extends js.Object {
  var hidden: js.UndefOr[Boolean] = js.native
  var hideAnimation: js.UndefOr[fade | slide | none] = js.native
  var showAnimation: js.UndefOr[fade | slide | none] = js.native
  var style: js.UndefOr[
    `light-content` | typingsSlinky.reactNativeNavbar.reactNativeNavbarStrings.default
  ] = js.native
  var tintColor: js.UndefOr[String] = js.native
}

object StatusBar {
  @scala.inline
  def apply(): StatusBar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatusBar]
  }
  @scala.inline
  implicit class StatusBarOps[Self <: StatusBar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(js.undefined)
        ret
    }
    @scala.inline
    def withHideAnimation(value: fade | slide | none): Self = {
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
    def withShowAnimation(value: fade | slide | none): Self = {
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
    def withStyle(value: `light-content` | typingsSlinky.reactNativeNavbar.reactNativeNavbarStrings.default): Self = {
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
    @scala.inline
    def withTintColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tintColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTintColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tintColor")(js.undefined)
        ret
    }
  }
  
}

