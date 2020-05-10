package typingsSlinky.reactNativeNavigation.optionsMod

import typingsSlinky.reactNativeNavigation.reactNativeNavigationStrings.dark
import typingsSlinky.reactNativeNavigation.reactNativeNavigationStrings.light
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsStatusBar extends js.Object {
  /**
    * Set the background color of the status bar
    * #### (Android specific)
    */
  var backgroundColor: js.UndefOr[Color] = js.native
  /**
    * Draw screen behind the status bar
    * #### (Android specific)
    */
  var drawBehind: js.UndefOr[Boolean] = js.native
  /**
    * Set the text color of the status bar
    * @default 'light'
    */
  var style: js.UndefOr[light | dark] = js.native
  /**
    * Set the status bar visibility
    * @default true
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object OptionsStatusBar {
  @scala.inline
  def apply(): OptionsStatusBar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsStatusBar]
  }
  @scala.inline
  implicit class OptionsStatusBarOps[Self <: OptionsStatusBar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawBehind(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawBehind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawBehind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawBehind")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: light | dark): Self = {
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
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
  }
  
}

