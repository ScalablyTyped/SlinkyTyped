package typingsSlinky.reactBootstrap

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.HTMLProps
import typingsSlinky.react.mod.ReactType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listGroupMod {
  
  @JSImport("react-bootstrap/lib/ListGroup", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[ListGroupProps, js.Object, js.Any]
  
  @js.native
  trait ListGroup
    extends Component[ListGroupProps, js.Object, js.Any]
  
  @js.native
  trait ListGroupProps extends HTMLProps[ListGroup] {
    
    var bsClass: js.UndefOr[String] = js.native
    
    var componentClass: js.UndefOr[ReactType[_]] = js.native
    
    // Added since v0.30.0
    // TODO: Add more specific type
    var fill: js.UndefOr[Boolean] = js.native
  }
  object ListGroupProps {
    
    @scala.inline
    def apply(): ListGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListGroupProps]
    }
    
    @scala.inline
    implicit class ListGroupPropsMutableBuilder[Self <: ListGroupProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
      
      @scala.inline
      def setComponentClass(value: ReactType[_]): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentClassComponentClass(value: ReactComponentClass[_]): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentClassFunctionComponent(value: ReactComponentClass[_]): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentClassUndefined: Self = StObject.set(x, "componentClass", js.undefined)
      
      @scala.inline
      def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    }
  }
}
