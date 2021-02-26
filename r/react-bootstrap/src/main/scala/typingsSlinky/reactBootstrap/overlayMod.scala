package typingsSlinky.reactBootstrap

import org.scalajs.dom.raw.Element
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.ReactInstance
import typingsSlinky.reactBootstrap.mod.TransitionCallbacks
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object overlayMod {
  
  @JSImport("react-bootstrap/lib/Overlay", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[OverlayProps, js.Object, js.Any]
  
  type Overlay = ReactComponentClass[OverlayProps]
  
  @js.native
  trait OverlayProps extends TransitionCallbacks {
    
    // Optional
    var animation: js.UndefOr[js.Any] = js.native
    
    // TODO: Add more specific type
    var container: js.UndefOr[js.Any] = js.native
    
    // TODO: Add more specific type
    var containerPadding: js.UndefOr[Double] = js.native
    
    // TODO: Add more specific type
    var onHide: js.UndefOr[js.Function] = js.native
    
    var placement: js.UndefOr[String] = js.native
    
    var rootClose: js.UndefOr[Boolean] = js.native
    
    var shouldUpdatePosition: js.UndefOr[Boolean] = js.native
    
    var show: js.UndefOr[Boolean] = js.native
    
    var target: js.UndefOr[js.Function | ReactInstance] = js.native
  }
  object OverlayProps {
    
    @scala.inline
    def apply(): OverlayProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OverlayProps]
    }
    
    @scala.inline
    implicit class OverlayPropsMutableBuilder[Self <: OverlayProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimation(value: js.Any): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      @scala.inline
      def setContainer(value: js.Any): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerPadding(value: Double): Self = StObject.set(x, "containerPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerPaddingUndefined: Self = StObject.set(x, "containerPadding", js.undefined)
      
      @scala.inline
      def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      @scala.inline
      def setOnHide(value: js.Function): Self = StObject.set(x, "onHide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      @scala.inline
      def setPlacement(value: String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setRootClose(value: Boolean): Self = StObject.set(x, "rootClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootCloseUndefined: Self = StObject.set(x, "rootClose", js.undefined)
      
      @scala.inline
      def setShouldUpdatePosition(value: Boolean): Self = StObject.set(x, "shouldUpdatePosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldUpdatePositionUndefined: Self = StObject.set(x, "shouldUpdatePosition", js.undefined)
      
      @scala.inline
      def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      @scala.inline
      def setTarget(value: js.Function | ReactInstance): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetComponent(value: ReactComponentClass[js.Any]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetElement(value: Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
}
