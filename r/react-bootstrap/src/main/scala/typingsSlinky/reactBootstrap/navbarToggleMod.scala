package typingsSlinky.reactBootstrap

import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.HTMLProps
import typingsSlinky.react.mod.MouseEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navbarToggleMod {
  
  @JSImport("react-bootstrap/lib/NavbarToggle", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[NavbarToggleProps, js.Object, js.Any]
  
  @js.native
  trait NavbarToggle
    extends Component[NavbarToggleProps, js.Object, js.Any]
  
  @js.native
  trait NavbarToggleProps extends HTMLProps[NavbarToggle] {
    
    @JSName("onClick")
    var onClick_NavbarToggleProps: js.UndefOr[MouseEventHandler[_]] = js.native
  }
  object NavbarToggleProps {
    
    @scala.inline
    def apply(): NavbarToggleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavbarToggleProps]
    }
    
    @scala.inline
    implicit class NavbarTogglePropsMutableBuilder[Self <: NavbarToggleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnClick(value: SyntheticMouseEvent[_] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    }
  }
}
