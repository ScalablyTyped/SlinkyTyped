package typingsSlinky.reactBootstrap

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.HTMLProps
import typingsSlinky.reactBootstrap.dropdownMod.DropdownBaseProps
import typingsSlinky.reactBootstrap.mod.Omit
import typingsSlinky.reactBootstrap.reactBootstrapStrings.title
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navDropdownMod {
  
  @JSImport("react-bootstrap/lib/NavDropdown", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[NavDropdownProps, js.Object, js.Any]
  
  @js.native
  trait NavDropdown
    extends Component[NavDropdownProps, js.Object, js.Any]
  
  @js.native
  trait NavDropdownBaseProps extends DropdownBaseProps {
    
    var active: js.UndefOr[Boolean] = js.native
    
    var eventKey: js.UndefOr[js.Any] = js.native
    
    var noCaret: js.UndefOr[Boolean] = js.native
    
    var title: ReactElement = js.native
  }
  object NavDropdownBaseProps {
    
    @scala.inline
    def apply(id: String): NavDropdownBaseProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavDropdownBaseProps]
    }
    
    @scala.inline
    implicit class NavDropdownBasePropsMutableBuilder[Self <: NavDropdownBaseProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setEventKey(value: js.Any): Self = StObject.set(x, "eventKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventKeyUndefined: Self = StObject.set(x, "eventKey", js.undefined)
      
      @scala.inline
      def setNoCaret(value: Boolean): Self = StObject.set(x, "noCaret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoCaretUndefined: Self = StObject.set(x, "noCaret", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type NavDropdownProps = NavDropdownBaseProps with (Omit[HTMLProps[NavDropdown], title])
}
