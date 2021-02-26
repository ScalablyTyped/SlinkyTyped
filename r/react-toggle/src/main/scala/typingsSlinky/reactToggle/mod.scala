package typingsSlinky.reactToggle

import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.InputHTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-toggle", JSImport.Default)
  @js.native
  class default ()
    extends Component[ToggleProps, js.Object, js.Any]
  
  type Toggle = ReactComponentClass[ToggleProps]
  
  @js.native
  trait ToggleIcons extends StObject {
    
    var checked: js.UndefOr[ReactElement] = js.native
    
    var unchecked: js.UndefOr[ReactElement] = js.native
  }
  object ToggleIcons {
    
    @scala.inline
    def apply(): ToggleIcons = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToggleIcons]
    }
    
    @scala.inline
    implicit class ToggleIconsMutableBuilder[Self <: ToggleIcons] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChecked(value: ReactElement): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedReactElement(value: ReactElement): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      @scala.inline
      def setUnchecked(value: ReactElement): Self = StObject.set(x, "unchecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUncheckedReactElement(value: ReactElement): Self = StObject.set(x, "unchecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUncheckedUndefined: Self = StObject.set(x, "unchecked", js.undefined)
    }
  }
  
  @js.native
  trait ToggleProps extends InputHTMLAttributes[HTMLInputElement] {
    
    var icons: js.UndefOr[Boolean | ToggleIcons] = js.native
  }
  object ToggleProps {
    
    @scala.inline
    def apply(): ToggleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToggleProps]
    }
    
    @scala.inline
    implicit class TogglePropsMutableBuilder[Self <: ToggleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIcons(value: Boolean | ToggleIcons): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    }
  }
}
