package typingsSlinky.materialUi.MaterialUI

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BottomNavigation {
  
  type BottomNavigation = ReactComponentClass[BottomNavigationProps]
  
  @js.native
  trait BottomNavigationItem
    extends Component[BottomNavigationItemProps, js.Object, js.Any]
  
  @js.native
  trait BottomNavigationItemProps extends SharedEnhancedButtonProps[BottomNavigationItem] {
    
    var className: js.UndefOr[String] = js.native
    
    var icon: js.UndefOr[ReactElement] = js.native
    
    var label: js.UndefOr[ReactElement] = js.native
  }
  object BottomNavigationItemProps {
    
    @scala.inline
    def apply(): BottomNavigationItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BottomNavigationItemProps]
    }
    
    @scala.inline
    implicit class BottomNavigationItemPropsMutableBuilder[Self <: BottomNavigationItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setIcon(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconReactElement(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setLabel(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelReactElement(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    }
  }
  
  @js.native
  trait BottomNavigationProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var selectedIndex: js.UndefOr[Double] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object BottomNavigationProps {
    
    @scala.inline
    def apply(): BottomNavigationProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BottomNavigationProps]
    }
    
    @scala.inline
    implicit class BottomNavigationPropsMutableBuilder[Self <: BottomNavigationProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setSelectedIndex(value: Double): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedIndexUndefined: Self = StObject.set(x, "selectedIndex", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
