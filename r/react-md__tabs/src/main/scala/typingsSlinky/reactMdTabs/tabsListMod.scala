package typingsSlinky.reactMdTabs

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactMdTabs.typesMod.TabsConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabsListMod {
  
  @JSImport("@react-md/tabs/types/TabsList", "TabsList")
  @js.native
  val TabsList: ForwardRefExoticComponent[TabsListProps with RefAttributes[HTMLDivElement]] = js.native
  
  @js.native
  trait TabsListProps
    extends HTMLAttributes[HTMLDivElement]
       with TabsConfig {
    
    /**
      * The current active tab index to determine which tabs to animate in and out
      * of view.
      */
    var activeIndex: Double = js.native
    
    /**
      * Boolean if the indicator transition should be disabled while the active tab
      * index changes.
      */
    var disableTransition: js.UndefOr[Boolean] = js.native
    
    /**
      * A function to call when the `activeIndex` should change due to keyboard
      * movement or clicking on a tab.
      */
    def onActiveIndexChange(activeIndex: Double): Unit = js.native
  }
  object TabsListProps {
    
    @scala.inline
    def apply(activeIndex: Double, onActiveIndexChange: Double => Unit): TabsListProps = {
      val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], onActiveIndexChange = js.Any.fromFunction1(onActiveIndexChange))
      __obj.asInstanceOf[TabsListProps]
    }
    
    @scala.inline
    implicit class TabsListPropsMutableBuilder[Self <: TabsListProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableTransition(value: Boolean): Self = StObject.set(x, "disableTransition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableTransitionUndefined: Self = StObject.set(x, "disableTransition", js.undefined)
      
      @scala.inline
      def setOnActiveIndexChange(value: Double => Unit): Self = StObject.set(x, "onActiveIndexChange", js.Any.fromFunction1(value))
    }
  }
}
