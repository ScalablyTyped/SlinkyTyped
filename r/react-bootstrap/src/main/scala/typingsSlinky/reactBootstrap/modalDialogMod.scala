package typingsSlinky.reactBootstrap

import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.HTMLProps
import typingsSlinky.reactBootstrap.mod.Sizes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalDialogMod {
  
  @JSImport("react-bootstrap/lib/ModalDialog", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[ModalDialogProps, js.Object, js.Any]
  
  @js.native
  trait ModalDialog
    extends Component[ModalDialogProps, js.Object, js.Any]
  
  @js.native
  trait ModalDialogProps extends HTMLProps[ModalDialog] {
    
    var bsClass: js.UndefOr[String] = js.native
    
    var bsSize: js.UndefOr[Sizes] = js.native
    
    var onEnter: js.UndefOr[js.Function] = js.native
    
    var onEntered: js.UndefOr[js.Function] = js.native
    
    var onEntering: js.UndefOr[js.Function] = js.native
    
    var onExit: js.UndefOr[js.Function] = js.native
    
    var onExited: js.UndefOr[js.Function] = js.native
    
    var onExiting: js.UndefOr[js.Function] = js.native
    
    // TODO: these props are not correct https://github.com/react-bootstrap/react-bootstrap/blob/v0.31.1/src/ModalDialog.js#L9
    var onHide: js.UndefOr[js.Function] = js.native
  }
  object ModalDialogProps {
    
    @scala.inline
    def apply(): ModalDialogProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModalDialogProps]
    }
    
    @scala.inline
    implicit class ModalDialogPropsMutableBuilder[Self <: ModalDialogProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
      
      @scala.inline
      def setBsSize(value: Sizes): Self = StObject.set(x, "bsSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsSizeUndefined: Self = StObject.set(x, "bsSize", js.undefined)
      
      @scala.inline
      def setOnEnter(value: js.Function): Self = StObject.set(x, "onEnter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
      
      @scala.inline
      def setOnEntered(value: js.Function): Self = StObject.set(x, "onEntered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnEnteredUndefined: Self = StObject.set(x, "onEntered", js.undefined)
      
      @scala.inline
      def setOnEntering(value: js.Function): Self = StObject.set(x, "onEntering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnEnteringUndefined: Self = StObject.set(x, "onEntering", js.undefined)
      
      @scala.inline
      def setOnExit(value: js.Function): Self = StObject.set(x, "onExit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnExitUndefined: Self = StObject.set(x, "onExit", js.undefined)
      
      @scala.inline
      def setOnExited(value: js.Function): Self = StObject.set(x, "onExited", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnExitedUndefined: Self = StObject.set(x, "onExited", js.undefined)
      
      @scala.inline
      def setOnExiting(value: js.Function): Self = StObject.set(x, "onExiting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnExitingUndefined: Self = StObject.set(x, "onExiting", js.undefined)
      
      @scala.inline
      def setOnHide(value: js.Function): Self = StObject.set(x, "onHide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
    }
  }
}
