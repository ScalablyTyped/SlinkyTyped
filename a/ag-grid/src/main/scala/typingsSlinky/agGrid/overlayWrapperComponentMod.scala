package typingsSlinky.agGrid

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.agGrid.componentMod.Component
import typingsSlinky.agGrid.componentRecipesMod.ComponentRecipes
import typingsSlinky.agGrid.gridOptionsWrapperMod.GridOptionsWrapper
import typingsSlinky.agGrid.iComponentMod.IComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object overlayWrapperComponentMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.agGrid.iComponentMod.IComponent because Already inherited
  - typingsSlinky.agGrid.overlayWrapperComponentMod.IOverlayWrapperComp because var conflicts: afterGuiAttached, destroy, init. Inlined showLoadingOverlay, showNoRowsOverlay, hideOverlay */ @JSImport("ag-grid/dist/lib/rendering/overlays/overlayWrapperComponent", "OverlayWrapperComponent")
  @js.native
  class OverlayWrapperComponent () extends Component {
    
    var componentRecipes: ComponentRecipes = js.native
    
    var gridOptionsWrapper: GridOptionsWrapper = js.native
    
    def hideOverlay(eOverlayWrapper: HTMLElement): Unit = js.native
    
    @JSName("init")
    def init_MOverlayWrapperComponent(): Unit = js.native
    
    def showLoadingOverlay(eOverlayWrapper: HTMLElement): Unit = js.native
    
    def showNoRowsOverlay(eOverlayWrapper: HTMLElement): Unit = js.native
    
    /* private */ def showOverlay(eOverlayWrapper: js.Any, overlay: js.Any): js.Any = js.native
  }
  /* static members */
  object OverlayWrapperComponent {
    
    @JSImport("ag-grid/dist/lib/rendering/overlays/overlayWrapperComponent", "OverlayWrapperComponent")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ag-grid/dist/lib/rendering/overlays/overlayWrapperComponent", "OverlayWrapperComponent.LOADING_WRAPPER_OVERLAY_TEMPLATE")
    @js.native
    def LOADING_WRAPPER_OVERLAY_TEMPLATE: js.Any = js.native
    @scala.inline
    def LOADING_WRAPPER_OVERLAY_TEMPLATE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOADING_WRAPPER_OVERLAY_TEMPLATE")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/rendering/overlays/overlayWrapperComponent", "OverlayWrapperComponent.NO_ROWS_WRAPPER_OVERLAY_TEMPLATE")
    @js.native
    def NO_ROWS_WRAPPER_OVERLAY_TEMPLATE: js.Any = js.native
    @scala.inline
    def NO_ROWS_WRAPPER_OVERLAY_TEMPLATE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NO_ROWS_WRAPPER_OVERLAY_TEMPLATE")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait IOverlayWrapperComp extends IComponent[IOverlayWrapperParams] {
    
    def hideOverlay(eOverlayWrapper: HTMLElement): Unit = js.native
    
    def showLoadingOverlay(eOverlayWrapper: HTMLElement): Unit = js.native
    
    def showNoRowsOverlay(eOverlayWrapper: HTMLElement): Unit = js.native
  }
  object IOverlayWrapperComp {
    
    @scala.inline
    def apply(
      getGui: () => HTMLElement,
      hideOverlay: HTMLElement => Unit,
      showLoadingOverlay: HTMLElement => Unit,
      showNoRowsOverlay: HTMLElement => Unit
    ): IOverlayWrapperComp = {
      val __obj = js.Dynamic.literal(getGui = js.Any.fromFunction0(getGui), hideOverlay = js.Any.fromFunction1(hideOverlay), showLoadingOverlay = js.Any.fromFunction1(showLoadingOverlay), showNoRowsOverlay = js.Any.fromFunction1(showNoRowsOverlay))
      __obj.asInstanceOf[IOverlayWrapperComp]
    }
    
    @scala.inline
    implicit class IOverlayWrapperCompMutableBuilder[Self <: IOverlayWrapperComp] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHideOverlay(value: HTMLElement => Unit): Self = StObject.set(x, "hideOverlay", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShowLoadingOverlay(value: HTMLElement => Unit): Self = StObject.set(x, "showLoadingOverlay", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShowNoRowsOverlay(value: HTMLElement => Unit): Self = StObject.set(x, "showNoRowsOverlay", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait IOverlayWrapperParams extends StObject
}
