package typingsSlinky.rmcTabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTabBar extends js.Object {
  var TabBar: AnonActiveTextColor = js.native
  var Tabs: AnonBottomTabBarSplitLine = js.native
}

object AnonTabBar {
  @scala.inline
  def apply(TabBar: AnonActiveTextColor, Tabs: AnonBottomTabBarSplitLine): AnonTabBar = {
    val __obj = js.Dynamic.literal(TabBar = TabBar.asInstanceOf[js.Any], Tabs = Tabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTabBar]
  }
  @scala.inline
  implicit class AnonTabBarOps[Self <: AnonTabBar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTabBar(value: AnonActiveTextColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TabBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabs(value: AnonBottomTabBarSplitLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tabs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

