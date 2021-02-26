package typingsSlinky.antDesignReactNative

import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import typingsSlinky.antDesignReactNative.anon.ActiveTab
import typingsSlinky.antDesignReactNative.libStyleMod.Theme
import typingsSlinky.antDesignReactNative.libStyleMod.WithThemeStyles
import typingsSlinky.antDesignReactNative.tabsPropsTypeMod.TabBarPropsType
import typingsSlinky.antDesignReactNative.tabsPropsTypeMod.TabData
import typingsSlinky.antDesignReactNative.tabsStyleMod.TabBarStyle
import typingsSlinky.react.mod.PureComponent
import typingsSlinky.reactNative.anon.Layout
import typingsSlinky.reactNative.mod.Animated.Value
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNative.mod.ScrollView
import typingsSlinky.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultTabBarMod {
  
  @JSImport("@ant-design/react-native/lib/tabs/DefaultTabBar", "DefaultTabBar")
  @js.native
  class DefaultTabBar protected ()
    extends PureComponent[PropsType, StateType, js.Any] {
    def this(props: PropsType) = this()
    
    var _containerMeasurements: js.Any = js.native
    
    var _scrollView: ScrollView = js.native
    
    var _tabContainerMeasurements: js.Any = js.native
    
    var _tabsMeasurements: js.Array[_] = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MDefaultTabBar(): Unit = js.native
    
    def measureTab(page: Double, event: js.Any): Unit = js.native
    
    def necessarilyMeasurementsCompleted(position: Double, isLastTab: Boolean): js.Any = js.native
    
    def onContainerLayout(e: SyntheticEvent[NodeHandle, Layout]): Unit = js.native
    
    def onPress(index: Double): Unit = js.native
    
    def onTabContainerLayout(e: SyntheticEvent[NodeHandle, Layout]): Unit = js.native
    
    def renderTab(
      tab: TabData,
      index: Double,
      width: Double,
      onLayoutHandler: js.Any,
      styles: TabBarStyle,
      theme: Theme
    ): ReactElement = js.native
    
    def updateTabPanel(position: Double, pageOffset: Double): Unit = js.native
    
    def updateTabUnderline(position: Double, pageOffset: Double, tabCount: Double): Unit = js.native
    
    def updateView(offset: js.Any): Unit = js.native
  }
  /* static members */
  object DefaultTabBar {
    
    @JSImport("@ant-design/react-native/lib/tabs/DefaultTabBar", "DefaultTabBar")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/tabs/DefaultTabBar", "DefaultTabBar.defaultProps")
    @js.native
    def defaultProps: ActiveTab = js.native
    @scala.inline
    def defaultProps_=(x: ActiveTab): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait PropsType
    extends TabBarPropsType
       with WithThemeStyles[TabBarStyle] {
    
    /** default: false */
    var dynamicTabUnderlineWidth: js.UndefOr[Boolean] = js.native
    
    var keyboardShouldPersistTaps: js.UndefOr[Boolean] = js.native
    
    var scrollValue: js.UndefOr[js.Any] = js.native
    
    var tabStyle: js.UndefOr[ViewStyle] = js.native
    
    var tabsContainerStyle: js.UndefOr[ViewStyle] = js.native
  }
  object PropsType {
    
    @scala.inline
    def apply(
      activeTab: Double,
      animated: Boolean,
      goToTab: Double => Unit,
      instanceId: Double,
      tabs: js.Array[TabData]
    ): PropsType = {
      val __obj = js.Dynamic.literal(activeTab = activeTab.asInstanceOf[js.Any], animated = animated.asInstanceOf[js.Any], goToTab = js.Any.fromFunction1(goToTab), instanceId = instanceId.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropsType]
    }
    
    @scala.inline
    implicit class PropsTypeMutableBuilder[Self <: PropsType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDynamicTabUnderlineWidth(value: Boolean): Self = StObject.set(x, "dynamicTabUnderlineWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDynamicTabUnderlineWidthUndefined: Self = StObject.set(x, "dynamicTabUnderlineWidth", js.undefined)
      
      @scala.inline
      def setKeyboardShouldPersistTaps(value: Boolean): Self = StObject.set(x, "keyboardShouldPersistTaps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardShouldPersistTapsUndefined: Self = StObject.set(x, "keyboardShouldPersistTaps", js.undefined)
      
      @scala.inline
      def setScrollValue(value: js.Any): Self = StObject.set(x, "scrollValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollValueUndefined: Self = StObject.set(x, "scrollValue", js.undefined)
      
      @scala.inline
      def setTabStyle(value: ViewStyle): Self = StObject.set(x, "tabStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabStyleUndefined: Self = StObject.set(x, "tabStyle", js.undefined)
      
      @scala.inline
      def setTabsContainerStyle(value: ViewStyle): Self = StObject.set(x, "tabsContainerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabsContainerStyleUndefined: Self = StObject.set(x, "tabsContainerStyle", js.undefined)
    }
  }
  
  @js.native
  trait StateType extends StObject {
    
    var _containerWidth: Double = js.native
    
    var _leftTabUnderline: Value = js.native
    
    var _tabContainerWidth: Double = js.native
    
    var _widthTabUnderline: Value = js.native
  }
  object StateType {
    
    @scala.inline
    def apply(
      _containerWidth: Double,
      _leftTabUnderline: Value,
      _tabContainerWidth: Double,
      _widthTabUnderline: Value
    ): StateType = {
      val __obj = js.Dynamic.literal(_containerWidth = _containerWidth.asInstanceOf[js.Any], _leftTabUnderline = _leftTabUnderline.asInstanceOf[js.Any], _tabContainerWidth = _tabContainerWidth.asInstanceOf[js.Any], _widthTabUnderline = _widthTabUnderline.asInstanceOf[js.Any])
      __obj.asInstanceOf[StateType]
    }
    
    @scala.inline
    implicit class StateTypeMutableBuilder[Self <: StateType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_containerWidth(value: Double): Self = StObject.set(x, "_containerWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_leftTabUnderline(value: Value): Self = StObject.set(x, "_leftTabUnderline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_tabContainerWidth(value: Double): Self = StObject.set(x, "_tabContainerWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_widthTabUnderline(value: Value): Self = StObject.set(x, "_widthTabUnderline", value.asInstanceOf[js.Any])
    }
  }
}
