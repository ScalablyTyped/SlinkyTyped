package typingsSlinky.reactNativeScrollableTabView.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.ScrollViewProps
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeScrollableTabView.anon.TabBarProps
import typingsSlinky.reactNativeScrollableTabView.mod.ChangeTabProperties
import typingsSlinky.reactNativeScrollableTabView.mod.ScrollableTabViewProperties
import typingsSlinky.reactNativeScrollableTabView.mod.default
import typingsSlinky.reactNativeScrollableTabView.reactNativeScrollableTabViewBooleans.`false`
import typingsSlinky.reactNativeScrollableTabView.reactNativeScrollableTabViewStrings.bottom
import typingsSlinky.reactNativeScrollableTabView.reactNativeScrollableTabViewStrings.overlayBottom
import typingsSlinky.reactNativeScrollableTabView.reactNativeScrollableTabViewStrings.overlayTop
import typingsSlinky.reactNativeScrollableTabView.reactNativeScrollableTabViewStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeScrollableTabView {
  
  @JSImport("react-native-scrollable-tab-view", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def contentProps(value: ScrollViewProps): this.type = set("contentProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def initialPage(value: Double): this.type = set("initialPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def locked(value: Boolean): this.type = set("locked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChangeTab(value: /* value */ ChangeTabProperties => Unit): this.type = set("onChangeTab", js.Any.fromFunction1(value))
    
    @scala.inline
    def onScroll(value: /* value */ Double => Unit): this.type = set("onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def page(value: Double): this.type = set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prerenderingSiblingsNumber(value: Double): this.type = set("prerenderingSiblingsNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderTabBarFunction1(value: /* props */ TabBarProps => ReactElement): this.type = set("renderTabBar", js.Any.fromFunction1(value))
    
    @scala.inline
    def renderTabBar(value: (js.Function1[/* props */ TabBarProps, ReactElement]) | `false`): this.type = set("renderTabBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollWithoutAnimation(value: Boolean): this.type = set("scrollWithoutAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleNull: this.type = set("style", null)
    
    @scala.inline
    def tabBarActiveTextColor(value: String): this.type = set("tabBarActiveTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabBarBackgroundColor(value: String): this.type = set("tabBarBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabBarInactiveTextColor(value: String): this.type = set("tabBarInactiveTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabBarPosition(value: top | bottom | overlayTop | overlayBottom): this.type = set("tabBarPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabBarTextStyle(value: StyleProp[TextStyle]): this.type = set("tabBarTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabBarTextStyleNull: this.type = set("tabBarTextStyle", null)
    
    @scala.inline
    def tabBarUnderlineStyle(value: StyleProp[ViewStyle]): this.type = set("tabBarUnderlineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabBarUnderlineStyleNull: this.type = set("tabBarUnderlineStyle", null)
  }
  
  def withProps(p: ScrollableTabViewProperties): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ReactNativeScrollableTabView.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
