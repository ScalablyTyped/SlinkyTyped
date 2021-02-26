package typingsSlinky.antDesignReactNative.anon

import slinky.core.facade.ReactElement
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.bottom
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.top
import typingsSlinky.antDesignReactNative.tabsPropsTypeMod.TabData
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Animated extends StObject {
  
  var activeTab: Double = js.native
  
  var animated: Boolean = js.native
  
  var goToTab: js.Any = js.native
  
  var instanceId: Double = js.native
  
  var onTabClick: js.UndefOr[js.Function2[/* tab */ TabData, /* index */ Double, Unit]] = js.native
  
  var renderTab: js.UndefOr[js.Function1[/* tab */ TabData, ReactElement]] = js.native
  
  var renderUnderline: js.UndefOr[js.Function1[/* style */ js.Any, ReactElement]] = js.native
  
  var tabBarActiveTextColor: js.UndefOr[String] = js.native
  
  var tabBarBackgroundColor: js.UndefOr[String] = js.native
  
  var tabBarInactiveTextColor: js.UndefOr[String] = js.native
  
  var tabBarPosition: js.UndefOr[top | bottom] = js.native
  
  var tabBarTextStyle: StyleProp[TextStyle] = js.native
  
  var tabBarUnderlineStyle: StyleProp[ViewStyle] = js.native
  
  var tabs: js.Array[TabData] = js.native
}
object Animated {
  
  @scala.inline
  def apply(activeTab: Double, animated: Boolean, goToTab: js.Any, instanceId: Double, tabs: js.Array[TabData]): Animated = {
    val __obj = js.Dynamic.literal(activeTab = activeTab.asInstanceOf[js.Any], animated = animated.asInstanceOf[js.Any], goToTab = goToTab.asInstanceOf[js.Any], instanceId = instanceId.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animated]
  }
  
  @scala.inline
  implicit class AnimatedMutableBuilder[Self <: Animated] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveTab(value: Double): Self = StObject.set(x, "activeTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoToTab(value: js.Any): Self = StObject.set(x, "goToTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceId(value: Double): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTabClick(value: (/* tab */ TabData, /* index */ Double) => Unit): Self = StObject.set(x, "onTabClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnTabClickUndefined: Self = StObject.set(x, "onTabClick", js.undefined)
    
    @scala.inline
    def setRenderTab(value: /* tab */ TabData => ReactElement): Self = StObject.set(x, "renderTab", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderTabUndefined: Self = StObject.set(x, "renderTab", js.undefined)
    
    @scala.inline
    def setRenderUnderline(value: /* style */ js.Any => ReactElement): Self = StObject.set(x, "renderUnderline", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderUnderlineUndefined: Self = StObject.set(x, "renderUnderline", js.undefined)
    
    @scala.inline
    def setTabBarActiveTextColor(value: String): Self = StObject.set(x, "tabBarActiveTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabBarActiveTextColorUndefined: Self = StObject.set(x, "tabBarActiveTextColor", js.undefined)
    
    @scala.inline
    def setTabBarBackgroundColor(value: String): Self = StObject.set(x, "tabBarBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabBarBackgroundColorUndefined: Self = StObject.set(x, "tabBarBackgroundColor", js.undefined)
    
    @scala.inline
    def setTabBarInactiveTextColor(value: String): Self = StObject.set(x, "tabBarInactiveTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabBarInactiveTextColorUndefined: Self = StObject.set(x, "tabBarInactiveTextColor", js.undefined)
    
    @scala.inline
    def setTabBarPosition(value: top | bottom): Self = StObject.set(x, "tabBarPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabBarPositionUndefined: Self = StObject.set(x, "tabBarPosition", js.undefined)
    
    @scala.inline
    def setTabBarTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "tabBarTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabBarTextStyleNull: Self = StObject.set(x, "tabBarTextStyle", null)
    
    @scala.inline
    def setTabBarTextStyleUndefined: Self = StObject.set(x, "tabBarTextStyle", js.undefined)
    
    @scala.inline
    def setTabBarUnderlineStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "tabBarUnderlineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabBarUnderlineStyleNull: Self = StObject.set(x, "tabBarUnderlineStyle", null)
    
    @scala.inline
    def setTabBarUnderlineStyleUndefined: Self = StObject.set(x, "tabBarUnderlineStyle", js.undefined)
    
    @scala.inline
    def setTabs(value: js.Array[TabData]): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabsVarargs(value: TabData*): Self = StObject.set(x, "tabs", js.Array(value :_*))
  }
}
