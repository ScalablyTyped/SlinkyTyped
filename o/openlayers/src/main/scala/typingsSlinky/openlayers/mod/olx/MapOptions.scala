package typingsSlinky.openlayers.mod.olx

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Element
import typingsSlinky.openlayers.mod.Collection
import typingsSlinky.openlayers.mod.Overlay
import typingsSlinky.openlayers.mod.RendererType
import typingsSlinky.openlayers.mod.View
import typingsSlinky.openlayers.mod.control.Control
import typingsSlinky.openlayers.mod.interaction.Interaction
import typingsSlinky.openlayers.mod.layer.Base
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object literal with config options for the map.
  */
@js.native
trait MapOptions extends StObject {
  
  var controls: js.UndefOr[Collection[Control] | js.Array[Control]] = js.native
  
  var interactions: js.UndefOr[Collection[Interaction] | js.Array[Interaction]] = js.native
  
  var keyboardEventTarget: js.UndefOr[Element | Document | String] = js.native
  
  var layers: js.UndefOr[js.Array[Base] | Collection[Base]] = js.native
  
  var loadTilesWhileAnimating: js.UndefOr[Boolean] = js.native
  
  var loadTilesWhileInteracting: js.UndefOr[Boolean] = js.native
  
  var logo: js.UndefOr[Boolean | String | LogoOptions | Element] = js.native
  
  var moveTolerance: js.UndefOr[Double] = js.native
  
  var overlays: js.UndefOr[Collection[Overlay] | js.Array[Overlay]] = js.native
  
  var pixelRatio: js.UndefOr[Double] = js.native
  
  var renderer: js.UndefOr[RendererType | (js.Array[RendererType | String]) | String] = js.native
  
  var target: js.UndefOr[Element | String] = js.native
  
  var view: js.UndefOr[View] = js.native
}
object MapOptions {
  
  @scala.inline
  def apply(): MapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapOptions]
  }
  
  @scala.inline
  implicit class MapOptionsMutableBuilder[Self <: MapOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setControls(value: Collection[Control] | js.Array[Control]): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
    
    @scala.inline
    def setControlsVarargs(value: Control*): Self = StObject.set(x, "controls", js.Array(value :_*))
    
    @scala.inline
    def setInteractions(value: Collection[Interaction] | js.Array[Interaction]): Self = StObject.set(x, "interactions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteractionsUndefined: Self = StObject.set(x, "interactions", js.undefined)
    
    @scala.inline
    def setInteractionsVarargs(value: Interaction*): Self = StObject.set(x, "interactions", js.Array(value :_*))
    
    @scala.inline
    def setKeyboardEventTarget(value: Element | Document | String): Self = StObject.set(x, "keyboardEventTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardEventTargetDocument(value: Document): Self = StObject.set(x, "keyboardEventTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardEventTargetElement(value: Element): Self = StObject.set(x, "keyboardEventTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardEventTargetUndefined: Self = StObject.set(x, "keyboardEventTarget", js.undefined)
    
    @scala.inline
    def setLayers(value: js.Array[Base] | Collection[Base]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    @scala.inline
    def setLayersVarargs(value: Base*): Self = StObject.set(x, "layers", js.Array(value :_*))
    
    @scala.inline
    def setLoadTilesWhileAnimating(value: Boolean): Self = StObject.set(x, "loadTilesWhileAnimating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadTilesWhileAnimatingUndefined: Self = StObject.set(x, "loadTilesWhileAnimating", js.undefined)
    
    @scala.inline
    def setLoadTilesWhileInteracting(value: Boolean): Self = StObject.set(x, "loadTilesWhileInteracting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadTilesWhileInteractingUndefined: Self = StObject.set(x, "loadTilesWhileInteracting", js.undefined)
    
    @scala.inline
    def setLogo(value: Boolean | String | LogoOptions | Element): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogoElement(value: Element): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
    
    @scala.inline
    def setMoveTolerance(value: Double): Self = StObject.set(x, "moveTolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveToleranceUndefined: Self = StObject.set(x, "moveTolerance", js.undefined)
    
    @scala.inline
    def setOverlays(value: Collection[Overlay] | js.Array[Overlay]): Self = StObject.set(x, "overlays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlaysUndefined: Self = StObject.set(x, "overlays", js.undefined)
    
    @scala.inline
    def setOverlaysVarargs(value: Overlay*): Self = StObject.set(x, "overlays", js.Array(value :_*))
    
    @scala.inline
    def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
    
    @scala.inline
    def setRenderer(value: RendererType | (js.Array[RendererType | String]) | String): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
    
    @scala.inline
    def setRendererVarargs(value: (RendererType | String)*): Self = StObject.set(x, "renderer", js.Array(value :_*))
    
    @scala.inline
    def setTarget(value: Element | String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetElement(value: Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setView(value: View): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
