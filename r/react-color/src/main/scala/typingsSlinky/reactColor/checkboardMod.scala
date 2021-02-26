package typingsSlinky.reactColor

import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkboardMod {
  
  @JSImport("react-color/lib/components/common/Checkboard", JSImport.Default)
  @js.native
  class default ()
    extends Component[CheckboardProps, js.Object, js.Any]
  
  @js.native
  trait Checkboard
    extends Component[CheckboardProps, js.Object, js.Any]
  
  @js.native
  trait CheckboardProps extends ClassAttributes[Checkboard] {
    
    var grey: js.UndefOr[String] = js.native
    
    var size: js.UndefOr[Double] = js.native
    
    var white: js.UndefOr[String] = js.native
  }
  object CheckboardProps {
    
    @scala.inline
    def apply(): CheckboardProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckboardProps]
    }
    
    @scala.inline
    implicit class CheckboardPropsMutableBuilder[Self <: CheckboardProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGrey(value: String): Self = StObject.set(x, "grey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGreyUndefined: Self = StObject.set(x, "grey", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setWhite(value: String): Self = StObject.set(x, "white", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhiteUndefined: Self = StObject.set(x, "white", js.undefined)
    }
  }
}
