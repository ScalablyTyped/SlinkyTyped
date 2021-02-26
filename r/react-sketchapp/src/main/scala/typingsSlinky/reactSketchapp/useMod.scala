package typingsSlinky.reactSketchapp

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.reactSketchapp.propsMod.NumberProp
import typingsSlinky.reactSketchapp.propsMod.PathProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useMod {
  
  @JSImport("react-sketchapp/lib/components/Svg/Use", JSImport.Default)
  @js.native
  class default ()
    extends Component[UseProps, js.Object, js.Any]
  
  type Use = ReactComponentClass[UseProps]
  
  @js.native
  trait UseProps extends PathProps {
    
    // Just for reusing `Symbol`
    var height: js.UndefOr[NumberProp] = js.native
    
    var href: String = js.native
    
    var width: js.UndefOr[NumberProp] = js.native
  }
  object UseProps {
    
    @scala.inline
    def apply(href: String): UseProps = {
      val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
      __obj.asInstanceOf[UseProps]
    }
    
    @scala.inline
    implicit class UsePropsMutableBuilder[Self <: UseProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: NumberProp): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: NumberProp): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
