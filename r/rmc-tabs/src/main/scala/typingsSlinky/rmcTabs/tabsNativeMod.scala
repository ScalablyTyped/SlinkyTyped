package typingsSlinky.rmcTabs

import org.scalablytyped.runtime.StringDictionary
import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.mod.Animated.Value
import typingsSlinky.reactNative.mod.ScrollView
import typingsSlinky.rmcTabs.anon.Component
import typingsSlinky.rmcTabs.anon.TabBar
import typingsSlinky.rmcTabs.anon.TypeofDefaultTabBar
import typingsSlinky.rmcTabs.modelsMod.Models.TabData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabsNativeMod {
  
  @JSImport("rmc-tabs/lib/Tabs.native", "Tabs")
  @js.native
  class Tabs protected ()
    extends typingsSlinky.rmcTabs.tabsBaseMod.Tabs[PropsType, StateType] {
    def this(props: PropsType) = this()
    
    var AnimatedScrollView: ScrollView = js.native
    
    def goToTab(index: Double, force: js.UndefOr[scala.Nothing], animated: Boolean): Boolean = js.native
    def goToTab(index: Double, force: Boolean, animated: Boolean): Boolean = js.native
    
    def handleLayout(
      e: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RN.LayoutChangeEvent */ js.Any
    ): Unit = js.native
    
    def onMomentumScrollEnd(
      e: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RN.NativeSyntheticEvent<RN.NativeScrollEvent> */ js.Any
    ): Unit = js.native
    
    def onScroll(): Unit = js.native
    def onScroll(
      evt: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RN.NativeSyntheticEvent<RN.NativeScrollEvent> */ js.Any
    ): Unit = js.native
    
    def renderContent(): ReactElement = js.native
    def renderContent(
      getSubElements: js.Function2[
          /* defaultPrefix */ js.UndefOr[String], 
          /* allPrefix */ js.UndefOr[String], 
          StringDictionary[ReactElement]
        ]
    ): ReactElement = js.native
    
    def scrollTo(index: Double): Unit = js.native
    def scrollTo(index: Double, animated: Boolean): Unit = js.native
    
    var scrollView: Component = js.native
    
    def setScrollView(sv: js.Any): Unit = js.native
  }
  /* static members */
  object Tabs {
    
    @JSImport("rmc-tabs/lib/Tabs.native", "Tabs")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rmc-tabs/lib/Tabs.native", "Tabs.DefaultTabBar")
    @js.native
    def DefaultTabBar: TypeofDefaultTabBar = js.native
    @scala.inline
    def DefaultTabBar_=(x: TypeofDefaultTabBar): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultTabBar")(x.asInstanceOf[js.Any])
    
    @JSImport("rmc-tabs/lib/Tabs.native", "Tabs.defaultProps")
    @js.native
    def defaultProps: PropsType = js.native
    @scala.inline
    def defaultProps_=(x: PropsType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait PropsType
    extends typingsSlinky.rmcTabs.propsTypeMod.PropsType {
    
    var children: js.UndefOr[js.Any] = js.native
    
    var keyboardShouldPersistTaps: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RN.ViewStyle */ js.Any
      ] = js.native
    
    var styles: js.UndefOr[TabBar] = js.native
  }
  object PropsType {
    
    @scala.inline
    def apply(tabs: js.Array[TabData]): PropsType = {
      val __obj = js.Dynamic.literal(tabs = tabs.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropsType]
    }
    
    @scala.inline
    implicit class PropsTypeMutableBuilder[Self <: PropsType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setKeyboardShouldPersistTaps(value: Boolean): Self = StObject.set(x, "keyboardShouldPersistTaps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardShouldPersistTapsUndefined: Self = StObject.set(x, "keyboardShouldPersistTaps", js.undefined)
      
      @scala.inline
      def setStyle(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RN.ViewStyle */ js.Any
      ): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setStyles(value: TabBar): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  @js.native
  trait StateType
    extends typingsSlinky.rmcTabs.tabsBaseMod.StateType {
    
    var containerWidth: Double = js.native
    
    var scrollValue: Value = js.native
    
    var scrollX: Value = js.native
  }
}
