package typingsSlinky.reactRouterNavigation.components

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactRouter.mod.RouterProps
import typingsSlinky.reactRouterNavigation.mod.TabBarProps
import typingsSlinky.reactRouterNavigation.mod.TabProps
import typingsSlinky.reactRouterNavigation.mod.TabSubViewProps
import typingsSlinky.reactRouterNavigation.reactRouterNavigationStrings.bottom
import typingsSlinky.reactRouterNavigation.reactRouterNavigationStrings.top
import typingsSlinky.reactRouterNavigationCore.mod.RouteProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tab {
  
  @JSImport("react-router-navigation", "Tab")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def childrenReactElement(value: ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def childrenFunction1(value: /* props */ RouterProps => ReactElement): this.type = set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def children(value: (js.Function1[/* props */ RouterProps, ReactElement]) | ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def component(value: ReactComponentClass[RouterProps]): this.type = set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def exact(value: Boolean): this.type = set("exact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hideTabBar(value: Boolean): this.type = set("hideTabBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelStyle(value: StyleProp[TextStyle]): this.type = set("labelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelStyleNull: this.type = set("labelStyle", null)
    
    @scala.inline
    def onIndexChange(value: /* index */ Double => Unit): this.type = set("onIndexChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onReset(value: /* props */ TabBarProps with RouteProps => Unit): this.type = set("onReset", js.Any.fromFunction1(value))
    
    @scala.inline
    def path(value: String): this.type = set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def render(value: /* props */ RouterProps => ReactElement): this.type = set("render", js.Any.fromFunction1(value))
    
    @scala.inline
    def renderLabel(value: /* props */ TabSubViewProps => ReactElement): this.type = set("renderLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def renderTabBar(value: /* props */ TabSubViewProps => ReactElement): this.type = set("renderTabBar", js.Any.fromFunction1(value))
    
    @scala.inline
    def renderTabIcon(value: /* props */ TabSubViewProps => ReactElement): this.type = set("renderTabIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def strict(value: Boolean): this.type = set("strict", value.asInstanceOf[js.Any])
    
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
  
  def withProps(p: TabProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Tab.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
