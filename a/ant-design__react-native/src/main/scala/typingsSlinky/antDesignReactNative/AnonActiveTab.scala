package typingsSlinky.antDesignReactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonActiveTab extends js.Object {
  var activeTab: Double = js.native
  var animated: Boolean = js.native
  var dynamicTabUnderlineWidth: Boolean = js.native
  var page: Double = js.native
  var tabBarActiveTextColor: String = js.native
  var tabBarBackgroundColor: String = js.native
  var tabBarInactiveTextColor: String = js.native
  var tabs: js.Array[scala.Nothing] = js.native
  def goToTab(): Unit = js.native
}

object AnonActiveTab {
  @scala.inline
  def apply(
    activeTab: Double,
    animated: Boolean,
    dynamicTabUnderlineWidth: Boolean,
    goToTab: () => Unit,
    page: Double,
    tabBarActiveTextColor: String,
    tabBarBackgroundColor: String,
    tabBarInactiveTextColor: String,
    tabs: js.Array[scala.Nothing]
  ): AnonActiveTab = {
    val __obj = js.Dynamic.literal(activeTab = activeTab.asInstanceOf[js.Any], animated = animated.asInstanceOf[js.Any], dynamicTabUnderlineWidth = dynamicTabUnderlineWidth.asInstanceOf[js.Any], goToTab = js.Any.fromFunction0(goToTab), page = page.asInstanceOf[js.Any], tabBarActiveTextColor = tabBarActiveTextColor.asInstanceOf[js.Any], tabBarBackgroundColor = tabBarBackgroundColor.asInstanceOf[js.Any], tabBarInactiveTextColor = tabBarInactiveTextColor.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonActiveTab]
  }
  @scala.inline
  implicit class AnonActiveTabOps[Self <: AnonActiveTab] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveTab(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeTab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDynamicTabUnderlineWidth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicTabUnderlineWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGoToTab(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goToTab")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabBarActiveTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBarActiveTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabBarBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBarBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabBarInactiveTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBarInactiveTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabs(value: js.Array[scala.Nothing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

