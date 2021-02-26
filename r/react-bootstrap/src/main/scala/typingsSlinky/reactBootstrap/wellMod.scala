package typingsSlinky.reactBootstrap

import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.HTMLProps
import typingsSlinky.reactBootstrap.mod.Sizes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wellMod {
  
  @JSImport("react-bootstrap/lib/Well", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[WellProps, js.Object, js.Any]
  
  @js.native
  trait Well
    extends Component[WellProps, js.Object, js.Any]
  
  @js.native
  trait WellProps extends HTMLProps[Well] {
    
    var bsClass: js.UndefOr[String] = js.native
    
    var bsSize: js.UndefOr[Sizes] = js.native
    
    var bsStyle: js.UndefOr[String] = js.native
  }
  object WellProps {
    
    @scala.inline
    def apply(): WellProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WellProps]
    }
    
    @scala.inline
    implicit class WellPropsMutableBuilder[Self <: WellProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
      
      @scala.inline
      def setBsSize(value: Sizes): Self = StObject.set(x, "bsSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsSizeUndefined: Self = StObject.set(x, "bsSize", js.undefined)
      
      @scala.inline
      def setBsStyle(value: String): Self = StObject.set(x, "bsStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsStyleUndefined: Self = StObject.set(x, "bsStyle", js.undefined)
    }
  }
}
