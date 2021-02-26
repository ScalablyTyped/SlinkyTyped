package typingsSlinky.antDesignReactNative

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import typingsSlinky.antDesignReactNative.anon.Animated
import typingsSlinky.antDesignReactNative.anon.TypeofDefaultTabBar
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.horizontal
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.vertical
import typingsSlinky.antDesignReactNative.libStyleMod.WithThemeStyles
import typingsSlinky.antDesignReactNative.styleTabsMod.TabsStyle
import typingsSlinky.antDesignReactNative.tabsPropsTypeMod.PropsType
import typingsSlinky.antDesignReactNative.tabsPropsTypeMod.TabData
import typingsSlinky.react.mod.PureComponent
import typingsSlinky.reactNative.anon.Layout
import typingsSlinky.reactNative.mod.Animated.Value
import typingsSlinky.reactNative.mod.NativeScrollEvent
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNativeCommunityViewpager.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabsTabsMod {
  
  @JSImport("@ant-design/react-native/lib/tabs/Tabs", "Tabs")
  @js.native
  class Tabs protected ()
    extends PureComponent[TabsProps, StateType, js.Any] {
    def this(props: PropsType) = this()
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MTabs(nextProps: PropsType): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MTabs(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MTabs(): Unit = js.native
    
    def getOffsetIndex(current: Double, width: Double): Double = js.native
    def getOffsetIndex(current: Double, width: Double, threshold: Double): Double = js.native
    
    def getSubElement(
      tab: TabData,
      index: Double,
      subElements: js.Function2[/* defaultPrefix */ String, /* allPrefix */ String, StringDictionary[_]]
    ): js.Any = js.native
    def getSubElement(
      tab: TabData,
      index: Double,
      subElements: js.Function2[/* defaultPrefix */ String, /* allPrefix */ String, StringDictionary[_]],
      defaultPrefix: js.UndefOr[scala.Nothing],
      allPrefix: String
    ): js.Any = js.native
    def getSubElement(
      tab: TabData,
      index: Double,
      subElements: js.Function2[/* defaultPrefix */ String, /* allPrefix */ String, StringDictionary[_]],
      defaultPrefix: String
    ): js.Any = js.native
    def getSubElement(
      tab: TabData,
      index: Double,
      subElements: js.Function2[/* defaultPrefix */ String, /* allPrefix */ String, StringDictionary[_]],
      defaultPrefix: String,
      allPrefix: String
    ): js.Any = js.native
    
    def getSubElements(): js.Function2[
        /* defaultPrefix */ js.UndefOr[String], 
        /* allPrefix */ js.UndefOr[String], 
        StringDictionary[ReactElement]
      ] = js.native
    
    def getTabBarBaseProps(): Animated = js.native
    
    def getTabIndex(props: PropsType): Double = js.native
    
    def goToTab(index: Double): Boolean = js.native
    def goToTab(index: Double, force: js.UndefOr[scala.Nothing], newState: js.Any): Boolean = js.native
    def goToTab(index: Double, force: Boolean): Boolean = js.native
    def goToTab(index: Double, force: Boolean, newState: js.Any): Boolean = js.native
    
    def handleLayout(e: SyntheticEvent[NodeHandle, Layout]): Unit = js.native
    
    var instanceId: Double = js.native
    
    def isTabVertical(): Boolean = js.native
    @JSName("isTabVertical")
    def isTabVertical_horizontal(direction: horizontal): Boolean = js.native
    @JSName("isTabVertical")
    def isTabVertical_vertical(direction: vertical): Boolean = js.native
    
    /** compatible for different between react and preact in `setState`. */
    var nextCurrentTab: js.Any = js.native
    
    def onMomentumScrollEnd(e: SyntheticEvent[NodeHandle, NativeScrollEvent]): Unit = js.native
    
    var prevCurrentTab: Double = js.native
    
    def renderContent(): ReactElement = js.native
    def renderContent(
      getSubElements: js.Function2[
          /* defaultPrefix */ js.UndefOr[String], 
          /* allPrefix */ js.UndefOr[String], 
          StringDictionary[ReactElement]
        ]
    ): ReactElement = js.native
    
    def renderTabBar(tabBarProps: js.Any, DefaultTabBar: ReactComponentClass[js.Object]): js.UndefOr[js.Object | Null] = js.native
    
    def scrollTo(index: Double): Unit = js.native
    def scrollTo(index: Double, animated: Boolean): Unit = js.native
    
    def shouldRenderTab(idx: Double): Boolean = js.native
    
    var tabCache: NumberDictionary[ReactElement] = js.native
    
    def tabClickGoToTab(index: Double): Unit = js.native
    
    var viewPager: default | Null = js.native
  }
  /* static members */
  object Tabs {
    
    @JSImport("@ant-design/react-native/lib/tabs/Tabs", "Tabs")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/tabs/Tabs", "Tabs.DefaultTabBar")
    @js.native
    def DefaultTabBar: TypeofDefaultTabBar = js.native
    @scala.inline
    def DefaultTabBar_=(x: TypeofDefaultTabBar): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultTabBar")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/react-native/lib/tabs/Tabs", "Tabs.defaultProps")
    @js.native
    def defaultProps: PropsType = js.native
    @scala.inline
    def defaultProps_=(x: PropsType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait StateType extends StObject {
    
    var containerWidth: Double = js.native
    
    var currentTab: Double = js.native
    
    var scrollValue: Value = js.native
    
    var scrollX: Value = js.native
  }
  object StateType {
    
    @scala.inline
    def apply(containerWidth: Double, currentTab: Double, scrollValue: Value, scrollX: Value): StateType = {
      val __obj = js.Dynamic.literal(containerWidth = containerWidth.asInstanceOf[js.Any], currentTab = currentTab.asInstanceOf[js.Any], scrollValue = scrollValue.asInstanceOf[js.Any], scrollX = scrollX.asInstanceOf[js.Any])
      __obj.asInstanceOf[StateType]
    }
    
    @scala.inline
    implicit class StateTypeMutableBuilder[Self <: StateType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainerWidth(value: Double): Self = StObject.set(x, "containerWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentTab(value: Double): Self = StObject.set(x, "currentTab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollValue(value: Value): Self = StObject.set(x, "scrollValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollX(value: Value): Self = StObject.set(x, "scrollX", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TabsProps
    extends PropsType
       with WithThemeStyles[TabsStyle]
  object TabsProps {
    
    @scala.inline
    def apply(tabs: js.Array[TabData]): TabsProps = {
      val __obj = js.Dynamic.literal(tabs = tabs.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabsProps]
    }
  }
}
