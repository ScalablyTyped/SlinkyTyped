package typingsSlinky.agGrid

import typingsSlinky.agGrid.componentMod.Component
import typingsSlinky.agGrid.gridOptionsWrapperMod.GridOptionsWrapper
import typingsSlinky.agGrid.iComponentMod.IComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loadingOverlayComponentMod {
  
  @JSImport("ag-grid/dist/lib/rendering/overlays/loadingOverlayComponent", "LoadingOverlayComponent")
  @js.native
  class LoadingOverlayComponent () extends Component {
    
    var gridOptionsWrapper: GridOptionsWrapper = js.native
    
    @JSName("init")
    def init_MLoadingOverlayComponent(params: ILoadingOverlayParams): Unit = js.native
  }
  /* static members */
  object LoadingOverlayComponent {
    
    @JSImport("ag-grid/dist/lib/rendering/overlays/loadingOverlayComponent", "LoadingOverlayComponent")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ag-grid/dist/lib/rendering/overlays/loadingOverlayComponent", "LoadingOverlayComponent.DEFAULT_LOADING_OVERLAY_TEMPLATE")
    @js.native
    def DEFAULT_LOADING_OVERLAY_TEMPLATE: js.Any = js.native
    @scala.inline
    def DEFAULT_LOADING_OVERLAY_TEMPLATE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_LOADING_OVERLAY_TEMPLATE")(x.asInstanceOf[js.Any])
  }
  
  type ILoadingOverlayComp = IComponent[ILoadingOverlayParams]
  
  @js.native
  trait ILoadingOverlayParams extends StObject
}
