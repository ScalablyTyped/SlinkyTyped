package typingsSlinky.reactRouterNavigation.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactRouterNavigation.mod.BottomNavigationProps
import typingsSlinky.reactRouterNavigation.mod.TabSubViewProps
import typingsSlinky.reactRouterNavigation.reactRouterNavigationStrings.bottom
import typingsSlinky.reactRouterNavigation.reactRouterNavigationStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BottomNavigation {
  
  @JSImport("react-router-navigation", "BottomNavigation")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactRouterNavigation.mod.BottomNavigation] {
    
    @scala.inline
    def childrenVarargs(value: ReactElement*): this.type = set("children", js.Array(value :_*))
    
    @scala.inline
    def children(value: js.Array[ReactElement]): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hideTabBar(value: Boolean): this.type = set("hideTabBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelStyle(value: StyleProp[TextStyle]): this.type = set("labelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelStyleNull: this.type = set("labelStyle", null)
    
    @scala.inline
    def `lazy`(value: Boolean): this.type = set("lazy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderLabel(value: /* props */ TabSubViewProps => ReactElement): this.type = set("renderLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def renderTabBar(value: /* props */ TabSubViewProps => ReactElement): this.type = set("renderTabBar", js.Any.fromFunction1(value))
    
    @scala.inline
    def renderTabIcon(value: /* props */ TabSubViewProps => ReactElement): this.type = set("renderTabIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleNull: this.type = set("style", null)
    
    @scala.inline
    def tabActiveTintColor(value: String): this.type = set("tabActiveTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabBarIndicatorStyle(value: StyleProp[ViewStyle]): this.type = set("tabBarIndicatorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabBarIndicatorStyleNull: this.type = set("tabBarIndicatorStyle", null)
    
    @scala.inline
    def tabBarPosition(value: top | bottom): this.type = set("tabBarPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabBarStyle(value: StyleProp[ViewStyle]): this.type = set("tabBarStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabBarStyleNull: this.type = set("tabBarStyle", null)
    
    @scala.inline
    def tabStyle(value: StyleProp[ViewStyle]): this.type = set("tabStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabStyleNull: this.type = set("tabStyle", null)
    
    @scala.inline
    def tabTintColor(value: String): this.type = set("tabTintColor", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: BottomNavigationProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: BottomNavigation.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
