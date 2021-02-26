package typingsSlinky.materialUi

import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderToLayerMod {
  
  @JSImport("material-ui/internal/RenderToLayer", JSImport.Default)
  @js.native
  class default ()
    extends Component[RenderToLayerProps, js.Object, js.Any]
  
  @js.native
  trait RenderToLayer
    extends Component[RenderToLayerProps, js.Object, js.Any]
  
  @js.native
  trait RenderToLayerProps extends Props[RenderToLayer] {
    
    var componentClickAway: js.UndefOr[js.Function] = js.native
    
    var open: Boolean = js.native
    
    var render: js.Function = js.native
    
    var useLayerForClickAway: js.UndefOr[Boolean] = js.native
  }
  object RenderToLayerProps {
    
    @scala.inline
    def apply(open: Boolean, render: js.Function): RenderToLayerProps = {
      val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderToLayerProps]
    }
    
    @scala.inline
    implicit class RenderToLayerPropsMutableBuilder[Self <: RenderToLayerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponentClickAway(value: js.Function): Self = StObject.set(x, "componentClickAway", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentClickAwayUndefined: Self = StObject.set(x, "componentClickAway", js.undefined)
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRender(value: js.Function): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseLayerForClickAway(value: Boolean): Self = StObject.set(x, "useLayerForClickAway", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseLayerForClickAwayUndefined: Self = StObject.set(x, "useLayerForClickAway", js.undefined)
    }
  }
}
