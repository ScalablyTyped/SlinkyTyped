package typingsSlinky.rmcTabs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabBar extends js.Object {
  var TabBar: ActiveTextColor = js.native
  var Tabs: BottomTabBarSplitLine = js.native
}

object TabBar {
  @scala.inline
  def apply(TabBar: ActiveTextColor, Tabs: BottomTabBarSplitLine): TabBar = {
    val __obj = js.Dynamic.literal(TabBar = TabBar.asInstanceOf[js.Any], Tabs = Tabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabBar]
  }
  @scala.inline
  implicit class TabBarOps[Self <: TabBar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTabBar(value: ActiveTextColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TabBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabs(value: BottomTabBarSplitLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tabs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

