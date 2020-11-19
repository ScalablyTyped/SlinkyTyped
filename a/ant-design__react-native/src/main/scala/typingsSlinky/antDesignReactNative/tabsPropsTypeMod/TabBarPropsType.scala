package typingsSlinky.antDesignReactNative.tabsPropsTypeMod

import slinky.core.facade.ReactElement
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.bottom
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.left
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.right
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.top
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabBarPropsType extends js.Object {
  
  /** current active tab */
  var activeTab: Double = js.native
  
  /** use animate | default: true */
  var animated: Boolean = js.native
  
  /** call this function to switch tab */
  def goToTab(index: Double): Unit = js.native
  
  var instanceId: Double = js.native
  
  /** on tab click */
  var onTabClick: js.UndefOr[js.Function2[/* tab */ TabData, /* index */ Double, Unit]] = js.native
  
  /** page size of tabbar's tab | default: 5 */
  var page: js.UndefOr[Double] = js.native
  
  /** render the tab of tabbar */
  var renderTab: js.UndefOr[js.Function1[/* tab */ TabData, ReactElement]] = js.native
  
  /** render the underline of tabbar */
  var renderUnderline: js.UndefOr[js.Function1[/* style */ js.Any, ReactElement]] = js.native
  
  /** tabBar active text color */
  var tabBarActiveTextColor: js.UndefOr[String] = js.native
  
  /** tabBar background color */
  var tabBarBackgroundColor: js.UndefOr[String] = js.native
  
  /** tabBar inactive text color */
  var tabBarInactiveTextColor: js.UndefOr[String] = js.native
  
  /** tabBar's position | defualt: top */
  var tabBarPosition: js.UndefOr[top | bottom | left | right] = js.native
  
  /** tabBar text style */
  var tabBarTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  /** tabBar underline style */
  var tabBarUnderlineStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  /** tabs data */
  var tabs: js.Array[TabData] = js.native
}
object TabBarPropsType {
  
  @scala.inline
  def apply(
    activeTab: Double,
    animated: Boolean,
    goToTab: Double => Unit,
    instanceId: Double,
    tabs: js.Array[TabData]
  ): TabBarPropsType = {
    val __obj = js.Dynamic.literal(activeTab = activeTab.asInstanceOf[js.Any], animated = animated.asInstanceOf[js.Any], goToTab = js.Any.fromFunction1(goToTab), instanceId = instanceId.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabBarPropsType]
  }
  
  @scala.inline
  implicit class TabBarPropsTypeOps[Self <: TabBarPropsType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActiveTab(value: Double): Self = this.set("activeTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimated(value: Boolean): Self = this.set("animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoToTab(value: Double => Unit): Self = this.set("goToTab", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInstanceId(value: Double): Self = this.set("instanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabsVarargs(value: TabData*): Self = this.set("tabs", js.Array(value :_*))
    
    @scala.inline
    def setTabs(value: js.Array[TabData]): Self = this.set("tabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTabClick(value: (/* tab */ TabData, /* index */ Double) => Unit): Self = this.set("onTabClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnTabClick: Self = this.set("onTabClick", js.undefined)
    
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    
    @scala.inline
    def setRenderTab(value: /* tab */ TabData => ReactElement): Self = this.set("renderTab", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderTab: Self = this.set("renderTab", js.undefined)
    
    @scala.inline
    def setRenderUnderline(value: /* style */ js.Any => ReactElement): Self = this.set("renderUnderline", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderUnderline: Self = this.set("renderUnderline", js.undefined)
    
    @scala.inline
    def setTabBarActiveTextColor(value: String): Self = this.set("tabBarActiveTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabBarActiveTextColor: Self = this.set("tabBarActiveTextColor", js.undefined)
    
    @scala.inline
    def setTabBarBackgroundColor(value: String): Self = this.set("tabBarBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabBarBackgroundColor: Self = this.set("tabBarBackgroundColor", js.undefined)
    
    @scala.inline
    def setTabBarInactiveTextColor(value: String): Self = this.set("tabBarInactiveTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabBarInactiveTextColor: Self = this.set("tabBarInactiveTextColor", js.undefined)
    
    @scala.inline
    def setTabBarPosition(value: top | bottom | left | right): Self = this.set("tabBarPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabBarPosition: Self = this.set("tabBarPosition", js.undefined)
    
    @scala.inline
    def setTabBarTextStyle(value: StyleProp[TextStyle]): Self = this.set("tabBarTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabBarTextStyle: Self = this.set("tabBarTextStyle", js.undefined)
    
    @scala.inline
    def setTabBarTextStyleNull: Self = this.set("tabBarTextStyle", null)
    
    @scala.inline
    def setTabBarUnderlineStyle(value: StyleProp[ViewStyle]): Self = this.set("tabBarUnderlineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabBarUnderlineStyle: Self = this.set("tabBarUnderlineStyle", js.undefined)
    
    @scala.inline
    def setTabBarUnderlineStyleNull: Self = this.set("tabBarUnderlineStyle", null)
  }
}
