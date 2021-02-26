package typingsSlinky.materialUiCore

import org.scalajs.dom.raw.Element
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.ReactInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object portalPortalMod {
  
  @JSImport("@material-ui/core/Portal/Portal", JSImport.Default)
  @js.native
  class default ()
    extends Component[PortalProps, js.Object, js.Any]
  
  type Portal = ReactComponentClass[PortalProps]
  
  @js.native
  trait PortalProps extends StObject {
    
    var children: ReactElement = js.native
    
    var container: js.UndefOr[ReactInstance | js.Function0[ReactInstance] | Null] = js.native
    
    var disablePortal: js.UndefOr[Boolean] = js.native
    
    var onRendered: js.UndefOr[js.Function0[Unit]] = js.native
  }
  object PortalProps {
    
    @scala.inline
    def apply(children: ReactElement): PortalProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[PortalProps]
    }
    
    @scala.inline
    implicit class PortalPropsMutableBuilder[Self <: PortalProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainer(value: ReactInstance | js.Function0[ReactInstance]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerComponent(value: ReactComponentClass[js.Any]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerElement(value: Element): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerFunction0(value: () => ReactInstance): Self = StObject.set(x, "container", js.Any.fromFunction0(value))
      
      @scala.inline
      def setContainerNull: Self = StObject.set(x, "container", null)
      
      @scala.inline
      def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      @scala.inline
      def setDisablePortal(value: Boolean): Self = StObject.set(x, "disablePortal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisablePortalUndefined: Self = StObject.set(x, "disablePortal", js.undefined)
      
      @scala.inline
      def setOnRendered(value: () => Unit): Self = StObject.set(x, "onRendered", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnRenderedUndefined: Self = StObject.set(x, "onRendered", js.undefined)
    }
  }
}
