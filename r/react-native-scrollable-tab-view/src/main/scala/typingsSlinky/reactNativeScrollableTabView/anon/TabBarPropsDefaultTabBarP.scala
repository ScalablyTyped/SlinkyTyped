package typingsSlinky.reactNativeScrollableTabView.anon

import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.anon.Layout
import typingsSlinky.reactNative.mod.Animated.Value
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeScrollableTabView.mod.RenderTabProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-native-scrollable-tab-view.react-native-scrollable-tab-view.TabBarProps<react-native-scrollable-tab-view.react-native-scrollable-tab-view.DefaultTabBarProps> */
@js.native
trait TabBarPropsDefaultTabBarP extends js.Object {
  
  var activeTab: js.UndefOr[Double] = js.native
  
  var activeTextColor: js.UndefOr[String] = js.native
  
  var backgroundColor: js.UndefOr[String] = js.native
  
  var containerWidth: js.UndefOr[Double] = js.native
  
  var goToPage: js.UndefOr[js.Function1[/* pageNumber */ Double, Unit]] = js.native
  
  var inactiveTextColor: js.UndefOr[String] = js.native
  
  var renderTab: js.UndefOr[RenderTabProperties] = js.native
  
  var scrollValue: js.UndefOr[Value] = js.native
  
  var style: js.UndefOr[ViewStyle] = js.native
  
  var tabStyle: js.UndefOr[ViewStyle] = js.native
  
  var tabs: js.UndefOr[js.Array[ReactElement]] = js.native
  
  var textStyle: js.UndefOr[TextStyle] = js.native
  
  var underlineStyle: js.UndefOr[ViewStyle] = js.native
}
object TabBarPropsDefaultTabBarP {
  
  @scala.inline
  def apply(): TabBarPropsDefaultTabBarP = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabBarPropsDefaultTabBarP]
  }
  
  @scala.inline
  implicit class TabBarPropsDefaultTabBarPOps[Self <: TabBarPropsDefaultTabBarP] (val x: Self) extends AnyVal {
    
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
    def deleteActiveTab: Self = this.set("activeTab", js.undefined)
    
    @scala.inline
    def setActiveTextColor(value: String): Self = this.set("activeTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveTextColor: Self = this.set("activeTextColor", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setContainerWidth(value: Double): Self = this.set("containerWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerWidth: Self = this.set("containerWidth", js.undefined)
    
    @scala.inline
    def setGoToPage(value: /* pageNumber */ Double => Unit): Self = this.set("goToPage", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGoToPage: Self = this.set("goToPage", js.undefined)
    
    @scala.inline
    def setInactiveTextColor(value: String): Self = this.set("inactiveTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInactiveTextColor: Self = this.set("inactiveTextColor", js.undefined)
    
    @scala.inline
    def setRenderTab(
      value: (/* name */ String, /* pageIndex */ Double, /* isTabActive */ Boolean, /* onPressHandler */ js.Function1[/* pageNumber */ Double, Unit], /* onLayoutHandler */ js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, Layout], Unit]]) => ReactElement
    ): Self = this.set("renderTab", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteRenderTab: Self = this.set("renderTab", js.undefined)
    
    @scala.inline
    def setScrollValue(value: Value): Self = this.set("scrollValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollValue: Self = this.set("scrollValue", js.undefined)
    
    @scala.inline
    def setStyle(value: ViewStyle): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTabStyle(value: ViewStyle): Self = this.set("tabStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabStyle: Self = this.set("tabStyle", js.undefined)
    
    @scala.inline
    def setTabsVarargs(value: ReactElement*): Self = this.set("tabs", js.Array(value :_*))
    
    @scala.inline
    def setTabs(value: js.Array[ReactElement]): Self = this.set("tabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabs: Self = this.set("tabs", js.undefined)
    
    @scala.inline
    def setTextStyle(value: TextStyle): Self = this.set("textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextStyle: Self = this.set("textStyle", js.undefined)
    
    @scala.inline
    def setUnderlineStyle(value: ViewStyle): Self = this.set("underlineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderlineStyle: Self = this.set("underlineStyle", js.undefined)
  }
}
