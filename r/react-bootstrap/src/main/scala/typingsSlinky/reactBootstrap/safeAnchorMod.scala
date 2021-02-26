package typingsSlinky.reactBootstrap

import slinky.core.ReactComponentClass
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.HTMLProps
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.react.mod.ReactType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object safeAnchorMod {
  
  @JSImport("react-bootstrap/lib/SafeAnchor", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[SafeAnchorProps, js.Object, js.Any]
  
  @js.native
  trait SafeAnchor
    extends Component[SafeAnchorProps, js.Object, js.Any]
  
  @js.native
  trait SafeAnchorProps extends HTMLProps[SafeAnchor] {
    
    var componentClass: js.UndefOr[ReactType[_]] = js.native
    
    @JSName("onClick")
    var onClick_SafeAnchorProps: js.UndefOr[MouseEventHandler[js.Object]] = js.native
  }
  object SafeAnchorProps {
    
    @scala.inline
    def apply(): SafeAnchorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SafeAnchorProps]
    }
    
    @scala.inline
    implicit class SafeAnchorPropsMutableBuilder[Self <: SafeAnchorProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponentClass(value: ReactType[_]): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentClassComponentClass(value: ReactComponentClass[_]): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentClassFunctionComponent(value: ReactComponentClass[_]): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentClassUndefined: Self = StObject.set(x, "componentClass", js.undefined)
      
      @scala.inline
      def setOnClick(value: SyntheticMouseEvent[js.Object] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    }
  }
}
