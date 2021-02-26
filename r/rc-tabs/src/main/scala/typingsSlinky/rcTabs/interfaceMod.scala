package typingsSlinky.rcTabs

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.rcTabs.anon.Direction
import typingsSlinky.rcTabs.anon.Event
import typingsSlinky.rcTabs.anon.Height
import typingsSlinky.rcTabs.rcTabsStrings.add
import typingsSlinky.rcTabs.rcTabsStrings.remove
import typingsSlinky.rcTabs.tabPaneMod.TabPaneProps
import typingsSlinky.react.mod.Key
import typingsSlinky.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfaceMod {
  
  @js.native
  trait AnimatedConfig extends StObject {
    
    var inkBar: js.UndefOr[Boolean] = js.native
    
    var tabPane: js.UndefOr[Boolean] = js.native
  }
  object AnimatedConfig {
    
    @scala.inline
    def apply(): AnimatedConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnimatedConfig]
    }
    
    @scala.inline
    implicit class AnimatedConfigMutableBuilder[Self <: AnimatedConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInkBar(value: Boolean): Self = StObject.set(x, "inkBar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInkBarUndefined: Self = StObject.set(x, "inkBar", js.undefined)
      
      @scala.inline
      def setTabPane(value: Boolean): Self = StObject.set(x, "tabPane", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabPaneUndefined: Self = StObject.set(x, "tabPane", js.undefined)
    }
  }
  
  @js.native
  trait EditableConfig extends StObject {
    
    var addIcon: js.UndefOr[ReactElement] = js.native
    
    @JSName("onEdit")
    def onEdit_add(`type`: add, info: Event): Unit = js.native
    @JSName("onEdit")
    def onEdit_remove(`type`: remove, info: Event): Unit = js.native
    
    var removeIcon: js.UndefOr[ReactElement] = js.native
    
    var showAdd: js.UndefOr[Boolean] = js.native
  }
  
  type OnTabScroll = js.Function1[/* info */ Direction, Unit]
  
  type RenderTabBar = js.Function2[/* props */ js.Any, /* DefaultTabBar */ ReactComponentClass[js.Object], ReactElement]
  
  @js.native
  trait Tab extends TabPaneProps {
    
    var key: String = js.native
    
    var node: ReactElement = js.native
  }
  object Tab {
    
    @scala.inline
    def apply(key: String, node: ReactElement): Tab = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tab]
    }
    
    @scala.inline
    implicit class TabMutableBuilder[Self <: Tab] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: ReactElement): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  type TabBarExtraContent = ReactElement | TabBarExtraMap
  
  /* Inlined std.Partial<std.Record<rc-tabs.rc-tabs/es/interface.TabBarExtraPosition, react.react.ReactNode>> */
  @js.native
  trait TabBarExtraMap extends StObject {
    
    var left: js.UndefOr[ReactElement] = js.native
    
    var right: js.UndefOr[ReactElement] = js.native
  }
  object TabBarExtraMap {
    
    @scala.inline
    def apply(): TabBarExtraMap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabBarExtraMap]
    }
    
    @scala.inline
    implicit class TabBarExtraMapMutableBuilder[Self <: TabBarExtraMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLeft(value: ReactElement): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftReactElement(value: ReactElement): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setRight(value: ReactElement): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightReactElement(value: ReactElement): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.rcTabs.rcTabsStrings.left
    - typingsSlinky.rcTabs.rcTabsStrings.right
  */
  trait TabBarExtraPosition extends StObject
  object TabBarExtraPosition {
    
    @scala.inline
    def left: typingsSlinky.rcTabs.rcTabsStrings.left = "left".asInstanceOf[typingsSlinky.rcTabs.rcTabsStrings.left]
    
    @scala.inline
    def right: typingsSlinky.rcTabs.rcTabsStrings.right = "right".asInstanceOf[typingsSlinky.rcTabs.rcTabsStrings.right]
  }
  
  @js.native
  trait TabOffset extends StObject {
    
    var height: Double = js.native
    
    var left: Double = js.native
    
    var right: Double = js.native
    
    var top: Double = js.native
    
    var width: Double = js.native
  }
  object TabOffset {
    
    @scala.inline
    def apply(height: Double, left: Double, right: Double, top: Double, width: Double): TabOffset = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabOffset]
    }
    
    @scala.inline
    implicit class TabOffsetMutableBuilder[Self <: TabOffset] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  type TabOffsetMap = Map[Key, TabOffset]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.rcTabs.rcTabsStrings.left
    - typingsSlinky.rcTabs.rcTabsStrings.right
    - typingsSlinky.rcTabs.rcTabsStrings.top
    - typingsSlinky.rcTabs.rcTabsStrings.bottom
  */
  trait TabPosition extends StObject
  object TabPosition {
    
    @scala.inline
    def bottom: typingsSlinky.rcTabs.rcTabsStrings.bottom = "bottom".asInstanceOf[typingsSlinky.rcTabs.rcTabsStrings.bottom]
    
    @scala.inline
    def left: typingsSlinky.rcTabs.rcTabsStrings.left = "left".asInstanceOf[typingsSlinky.rcTabs.rcTabsStrings.left]
    
    @scala.inline
    def right: typingsSlinky.rcTabs.rcTabsStrings.right = "right".asInstanceOf[typingsSlinky.rcTabs.rcTabsStrings.right]
    
    @scala.inline
    def top: typingsSlinky.rcTabs.rcTabsStrings.top = "top".asInstanceOf[typingsSlinky.rcTabs.rcTabsStrings.top]
  }
  
  type TabSizeMap = Map[Key, Height]
  
  @js.native
  trait TabsLocale extends StObject {
    
    var addAriaLabel: js.UndefOr[String] = js.native
    
    var dropdownAriaLabel: js.UndefOr[String] = js.native
    
    var removeAriaLabel: js.UndefOr[String] = js.native
  }
  object TabsLocale {
    
    @scala.inline
    def apply(): TabsLocale = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabsLocale]
    }
    
    @scala.inline
    implicit class TabsLocaleMutableBuilder[Self <: TabsLocale] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddAriaLabel(value: String): Self = StObject.set(x, "addAriaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddAriaLabelUndefined: Self = StObject.set(x, "addAriaLabel", js.undefined)
      
      @scala.inline
      def setDropdownAriaLabel(value: String): Self = StObject.set(x, "dropdownAriaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownAriaLabelUndefined: Self = StObject.set(x, "dropdownAriaLabel", js.undefined)
      
      @scala.inline
      def setRemoveAriaLabel(value: String): Self = StObject.set(x, "removeAriaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveAriaLabelUndefined: Self = StObject.set(x, "removeAriaLabel", js.undefined)
    }
  }
}
