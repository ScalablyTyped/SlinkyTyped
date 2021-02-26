package typingsSlinky.reactRouterTabs

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.history.mod.Location
import typingsSlinky.history.mod.LocationDescriptor
import typingsSlinky.history.mod.LocationState
import typingsSlinky.reactRouterDom.mod.NavLinkProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-router-tabs", "NavTab")
  @js.native
  val NavTab: ReactComponentClass[NavTabProps] = js.native
  
  @JSImport("react-router-tabs", "RoutedTabs")
  @js.native
  val RoutedTabs: ReactComponentClass[RoutedTabsProps] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactRouterTabs.reactRouterTabsStrings.page
    - typingsSlinky.reactRouterTabs.reactRouterTabsStrings.step
    - typingsSlinky.reactRouterTabs.reactRouterTabsStrings.location
    - typingsSlinky.reactRouterTabs.reactRouterTabsStrings.date
    - typingsSlinky.reactRouterTabs.reactRouterTabsStrings.time
    - typingsSlinky.reactRouterTabs.reactRouterTabsStrings.`true`
  */
  trait AriaCurrent extends StObject
  object AriaCurrent {
    
    @scala.inline
    def date: typingsSlinky.reactRouterTabs.reactRouterTabsStrings.date = "date".asInstanceOf[typingsSlinky.reactRouterTabs.reactRouterTabsStrings.date]
    
    @scala.inline
    def location: typingsSlinky.reactRouterTabs.reactRouterTabsStrings.location = "location".asInstanceOf[typingsSlinky.reactRouterTabs.reactRouterTabsStrings.location]
    
    @scala.inline
    def page: typingsSlinky.reactRouterTabs.reactRouterTabsStrings.page = "page".asInstanceOf[typingsSlinky.reactRouterTabs.reactRouterTabsStrings.page]
    
    @scala.inline
    def step: typingsSlinky.reactRouterTabs.reactRouterTabsStrings.step = "step".asInstanceOf[typingsSlinky.reactRouterTabs.reactRouterTabsStrings.step]
    
    @scala.inline
    def time: typingsSlinky.reactRouterTabs.reactRouterTabsStrings.time = "time".asInstanceOf[typingsSlinky.reactRouterTabs.reactRouterTabsStrings.time]
    
    @scala.inline
    def `true`: typingsSlinky.reactRouterTabs.reactRouterTabsStrings.`true` = "true".asInstanceOf[typingsSlinky.reactRouterTabs.reactRouterTabsStrings.`true`]
  }
  
  @js.native
  trait NavTabProps extends NavLinkProps[LocationState] {
    
    var allowClickOnActive: js.UndefOr[Boolean] = js.native
    
    @JSName("aria-current")
    var `aria-current_NavTabProps`: js.UndefOr[AriaCurrent] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
  }
  object NavTabProps {
    
    @scala.inline
    def apply(
      to: LocationDescriptor[LocationState] | (js.Function1[/* location */ Location[LocationState], LocationDescriptor[LocationState]])
    ): NavTabProps = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavTabProps]
    }
    
    @scala.inline
    implicit class NavTabPropsMutableBuilder[Self <: NavTabProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowClickOnActive(value: Boolean): Self = StObject.set(x, "allowClickOnActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowClickOnActiveUndefined: Self = StObject.set(x, "allowClickOnActive", js.undefined)
      
      @scala.inline
      def `setAria-current`(value: AriaCurrent): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-currentUndefined`: Self = StObject.set(x, "aria-current", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    }
  }
  
  @js.native
  trait RoutedTabsProps extends StObject {
    
    var activeTabClassName: js.UndefOr[String] = js.native
    
    var activeTabStyle: js.UndefOr[js.Object] = js.native
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var startPathWith: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[js.Object] = js.native
    
    var tabClassName: js.UndefOr[String] = js.native
    
    var tabStyle: js.UndefOr[js.Object] = js.native
  }
  object RoutedTabsProps {
    
    @scala.inline
    def apply(): RoutedTabsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RoutedTabsProps]
    }
    
    @scala.inline
    implicit class RoutedTabsPropsMutableBuilder[Self <: RoutedTabsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveTabClassName(value: String): Self = StObject.set(x, "activeTabClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveTabClassNameUndefined: Self = StObject.set(x, "activeTabClassName", js.undefined)
      
      @scala.inline
      def setActiveTabStyle(value: js.Object): Self = StObject.set(x, "activeTabStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveTabStyleUndefined: Self = StObject.set(x, "activeTabStyle", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setStartPathWith(value: String): Self = StObject.set(x, "startPathWith", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartPathWithUndefined: Self = StObject.set(x, "startPathWith", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTabClassName(value: String): Self = StObject.set(x, "tabClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabClassNameUndefined: Self = StObject.set(x, "tabClassName", js.undefined)
      
      @scala.inline
      def setTabStyle(value: js.Object): Self = StObject.set(x, "tabStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabStyleUndefined: Self = StObject.set(x, "tabStyle", js.undefined)
    }
  }
}
