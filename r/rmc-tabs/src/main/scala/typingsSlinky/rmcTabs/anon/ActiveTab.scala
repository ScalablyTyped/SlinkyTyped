package typingsSlinky.rmcTabs.anon

import typingsSlinky.rmcTabs.propsTypeMod.PropsType
import typingsSlinky.rmcTabs.tabsBaseMod.StateType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveTab[S /* <: StateType */, P /* <: PropsType */] extends js.Object {
  var activeTab: /* import warning: importer.ImportType#apply Failed type conversion: S['currentTab'] */ js.Any = js.native
  var animated: Boolean = js.native
  var goToTab: js.Any = js.native
  var instanceId: Double = js.native
  var onTabClick: /* import warning: importer.ImportType#apply Failed type conversion: P['onTabClick'] */ js.Any = js.native
  var tabBarActiveTextColor: /* import warning: importer.ImportType#apply Failed type conversion: P['tabBarActiveTextColor'] */ js.Any = js.native
  var tabBarBackgroundColor: /* import warning: importer.ImportType#apply Failed type conversion: P['tabBarBackgroundColor'] */ js.Any = js.native
  var tabBarInactiveTextColor: /* import warning: importer.ImportType#apply Failed type conversion: P['tabBarInactiveTextColor'] */ js.Any = js.native
  var tabBarPosition: /* import warning: importer.ImportType#apply Failed type conversion: P['tabBarPosition'] */ js.Any = js.native
  var tabBarTextStyle: /* import warning: importer.ImportType#apply Failed type conversion: P['tabBarTextStyle'] */ js.Any = js.native
  var tabBarUnderlineStyle: /* import warning: importer.ImportType#apply Failed type conversion: P['tabBarUnderlineStyle'] */ js.Any = js.native
  var tabs: /* import warning: importer.ImportType#apply Failed type conversion: P['tabs'] */ js.Any = js.native
}

object ActiveTab {
  @scala.inline
  def apply[S, P](
    activeTab: /* import warning: importer.ImportType#apply Failed type conversion: S['currentTab'] */ js.Any,
    animated: Boolean,
    goToTab: js.Any,
    instanceId: Double,
    onTabClick: /* import warning: importer.ImportType#apply Failed type conversion: P['onTabClick'] */ js.Any,
    tabBarActiveTextColor: /* import warning: importer.ImportType#apply Failed type conversion: P['tabBarActiveTextColor'] */ js.Any,
    tabBarBackgroundColor: /* import warning: importer.ImportType#apply Failed type conversion: P['tabBarBackgroundColor'] */ js.Any,
    tabBarInactiveTextColor: /* import warning: importer.ImportType#apply Failed type conversion: P['tabBarInactiveTextColor'] */ js.Any,
    tabBarPosition: /* import warning: importer.ImportType#apply Failed type conversion: P['tabBarPosition'] */ js.Any,
    tabBarTextStyle: /* import warning: importer.ImportType#apply Failed type conversion: P['tabBarTextStyle'] */ js.Any,
    tabBarUnderlineStyle: /* import warning: importer.ImportType#apply Failed type conversion: P['tabBarUnderlineStyle'] */ js.Any,
    tabs: /* import warning: importer.ImportType#apply Failed type conversion: P['tabs'] */ js.Any
  ): ActiveTab[S, P] = {
    val __obj = js.Dynamic.literal(activeTab = activeTab.asInstanceOf[js.Any], animated = animated.asInstanceOf[js.Any], goToTab = goToTab.asInstanceOf[js.Any], instanceId = instanceId.asInstanceOf[js.Any], onTabClick = onTabClick.asInstanceOf[js.Any], tabBarActiveTextColor = tabBarActiveTextColor.asInstanceOf[js.Any], tabBarBackgroundColor = tabBarBackgroundColor.asInstanceOf[js.Any], tabBarInactiveTextColor = tabBarInactiveTextColor.asInstanceOf[js.Any], tabBarPosition = tabBarPosition.asInstanceOf[js.Any], tabBarTextStyle = tabBarTextStyle.asInstanceOf[js.Any], tabBarUnderlineStyle = tabBarUnderlineStyle.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveTab[S, P]]
  }
  @scala.inline
  implicit class ActiveTabOps[Self[s, p] <: ActiveTab[s, p], S, P] (val x: Self[S, P]) extends AnyVal {
    @scala.inline
    def duplicate: Self[S, P] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[S, P]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[S, P]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[S, P]) with Other]
    @scala.inline
    def withActiveTab(
      value: /* import warning: importer.ImportType#apply Failed type conversion: S['currentTab'] */ js.Any
    ): Self[S, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeTab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimated(value: Boolean): Self[S, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGoToTab(value: js.Any): Self[S, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goToTab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstanceId(value: Double): Self[S, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnTabClick(
      value: /* import warning: importer.ImportType#apply Failed type conversion: P['onTabClick'] */ js.Any
    ): Self[S, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTabClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabBarActiveTextColor(
      value: /* import warning: importer.ImportType#apply Failed type conversion: P['tabBarActiveTextColor'] */ js.Any
    ): Self[S, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBarActiveTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabBarBackgroundColor(
      value: /* import warning: importer.ImportType#apply Failed type conversion: P['tabBarBackgroundColor'] */ js.Any
    ): Self[S, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBarBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabBarInactiveTextColor(
      value: /* import warning: importer.ImportType#apply Failed type conversion: P['tabBarInactiveTextColor'] */ js.Any
    ): Self[S, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBarInactiveTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabBarPosition(
      value: /* import warning: importer.ImportType#apply Failed type conversion: P['tabBarPosition'] */ js.Any
    ): Self[S, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBarPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabBarTextStyle(
      value: /* import warning: importer.ImportType#apply Failed type conversion: P['tabBarTextStyle'] */ js.Any
    ): Self[S, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBarTextStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabBarUnderlineStyle(
      value: /* import warning: importer.ImportType#apply Failed type conversion: P['tabBarUnderlineStyle'] */ js.Any
    ): Self[S, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBarUnderlineStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabs(value: /* import warning: importer.ImportType#apply Failed type conversion: P['tabs'] */ js.Any): Self[S, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

