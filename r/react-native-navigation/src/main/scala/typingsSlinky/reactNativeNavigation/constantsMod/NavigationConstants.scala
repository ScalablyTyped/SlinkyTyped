package typingsSlinky.reactNativeNavigation.constantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationConstants extends js.Object {
  var backButtonId: String = js.native
  var bottomTabsHeight: Double = js.native
  var statusBarHeight: Double = js.native
  var topBarHeight: Double = js.native
}

object NavigationConstants {
  @scala.inline
  def apply(backButtonId: String, bottomTabsHeight: Double, statusBarHeight: Double, topBarHeight: Double): NavigationConstants = {
    val __obj = js.Dynamic.literal(backButtonId = backButtonId.asInstanceOf[js.Any], bottomTabsHeight = bottomTabsHeight.asInstanceOf[js.Any], statusBarHeight = statusBarHeight.asInstanceOf[js.Any], topBarHeight = topBarHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationConstants]
  }
  @scala.inline
  implicit class NavigationConstantsOps[Self <: NavigationConstants] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackButtonId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backButtonId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBottomTabsHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomTabsHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusBarHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusBarHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopBarHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topBarHeight")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

