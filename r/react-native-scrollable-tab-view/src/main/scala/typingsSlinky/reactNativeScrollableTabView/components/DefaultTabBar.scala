package typingsSlinky.reactNativeScrollableTabView.components

import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.anon.Layout
import typingsSlinky.reactNative.mod.Animated.Value
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeScrollableTabView.anon.TabBarPropsDefaultTabBarP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DefaultTabBar {
  
  @JSImport("react-native-scrollable-tab-view", "DefaultTabBar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeScrollableTabView.mod.DefaultTabBar] {
    
    @scala.inline
    def activeTab(value: Double): this.type = set("activeTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def activeTextColor(value: String): this.type = set("activeTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def backgroundColor(value: String): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def containerWidth(value: Double): this.type = set("containerWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def goToPage(value: /* pageNumber */ Double => Unit): this.type = set("goToPage", js.Any.fromFunction1(value))
    
    @scala.inline
    def inactiveTextColor(value: String): this.type = set("inactiveTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderTab(
      value: (/* name */ String, /* pageIndex */ Double, /* isTabActive */ Boolean, /* onPressHandler */ js.Function1[/* pageNumber */ Double, Unit], /* onLayoutHandler */ js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, Layout], Unit]]) => ReactElement
    ): this.type = set("renderTab", js.Any.fromFunction5(value))
    
    @scala.inline
    def scrollValue(value: Value): this.type = set("scrollValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: ViewStyle): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabStyle(value: ViewStyle): this.type = set("tabStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabs(value: js.Array[ReactElement]): this.type = set("tabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabsVarargs(value: ReactElement*): this.type = set("tabs", js.Array(value :_*))
    
    @scala.inline
    def textStyle(value: TextStyle): this.type = set("textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def underlineStyle(value: ViewStyle): this.type = set("underlineStyle", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: DefaultTabBar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TabBarPropsDefaultTabBarP): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
