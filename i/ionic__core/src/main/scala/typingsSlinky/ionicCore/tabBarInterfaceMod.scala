package typingsSlinky.ionicCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabBarInterfaceMod {
  
  @js.native
  trait TabBarChangedEventDetail extends StObject {
    
    var tab: js.UndefOr[String] = js.native
  }
  object TabBarChangedEventDetail {
    
    @scala.inline
    def apply(): TabBarChangedEventDetail = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabBarChangedEventDetail]
    }
    
    @scala.inline
    implicit class TabBarChangedEventDetailMutableBuilder[Self <: TabBarChangedEventDetail] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTab(value: String): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabUndefined: Self = StObject.set(x, "tab", js.undefined)
    }
  }
  
  @js.native
  trait TabButtonClickEventDetail extends StObject {
    
    var href: js.UndefOr[String] = js.native
    
    var selected: Boolean = js.native
    
    var tab: String = js.native
  }
  object TabButtonClickEventDetail {
    
    @scala.inline
    def apply(selected: Boolean, tab: String): TabButtonClickEventDetail = {
      val __obj = js.Dynamic.literal(selected = selected.asInstanceOf[js.Any], tab = tab.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabButtonClickEventDetail]
    }
    
    @scala.inline
    implicit class TabButtonClickEventDetailMutableBuilder[Self <: TabButtonClickEventDetail] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTab(value: String): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.ionicCore.ionicCoreStrings.`icon-top`
    - typingsSlinky.ionicCore.ionicCoreStrings.`icon-start`
    - typingsSlinky.ionicCore.ionicCoreStrings.`icon-end`
    - typingsSlinky.ionicCore.ionicCoreStrings.`icon-bottom`
    - typingsSlinky.ionicCore.ionicCoreStrings.`icon-hide`
    - typingsSlinky.ionicCore.ionicCoreStrings.`label-hide`
  */
  trait TabButtonLayout extends StObject
  object TabButtonLayout {
    
    @scala.inline
    def `icon-bottom`: typingsSlinky.ionicCore.ionicCoreStrings.`icon-bottom` = "icon-bottom".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.`icon-bottom`]
    
    @scala.inline
    def `icon-end`: typingsSlinky.ionicCore.ionicCoreStrings.`icon-end` = "icon-end".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.`icon-end`]
    
    @scala.inline
    def `icon-hide`: typingsSlinky.ionicCore.ionicCoreStrings.`icon-hide` = "icon-hide".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.`icon-hide`]
    
    @scala.inline
    def `icon-start`: typingsSlinky.ionicCore.ionicCoreStrings.`icon-start` = "icon-start".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.`icon-start`]
    
    @scala.inline
    def `icon-top`: typingsSlinky.ionicCore.ionicCoreStrings.`icon-top` = "icon-top".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.`icon-top`]
    
    @scala.inline
    def `label-hide`: typingsSlinky.ionicCore.ionicCoreStrings.`label-hide` = "label-hide".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.`label-hide`]
  }
}
