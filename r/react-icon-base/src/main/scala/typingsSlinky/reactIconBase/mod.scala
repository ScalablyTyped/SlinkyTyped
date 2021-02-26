package typingsSlinky.reactIconBase

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.ReactSVGElement
import typingsSlinky.react.mod.SVGProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-icon-base", JSImport.Default)
  @js.native
  class default ()
    extends Component[IconBaseProps, js.Object, js.Any]
  
  type IconBaseClass = ReactComponentClass[IconBaseProps]
  
  @js.native
  trait IconBaseProps extends SVGProps[ReactSVGElement] {
    
    var size: js.UndefOr[String | Double] = js.native
    
    @JSName("style")
    var style_IconBaseProps: js.UndefOr[js.Any] = js.native
  }
  object IconBaseProps {
    
    @scala.inline
    def apply(): IconBaseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IconBaseProps]
    }
    
    @scala.inline
    implicit class IconBasePropsMutableBuilder[Self <: IconBaseProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
