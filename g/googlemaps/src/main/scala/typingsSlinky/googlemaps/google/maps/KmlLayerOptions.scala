package typingsSlinky.googlemaps.google.maps

import org.scalajs.dom.raw.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KmlLayerOptions extends StObject {
  
  var clickable: js.UndefOr[Boolean] = js.native
  
  var map: js.UndefOr[Map[Element]] = js.native
  
  var preserveViewport: js.UndefOr[Boolean] = js.native
  
  var screenOverlays: js.UndefOr[Boolean] = js.native
  
  var suppressInfoWindows: js.UndefOr[Boolean] = js.native
  
  var url: js.UndefOr[String] = js.native
  
  var zIndex: js.UndefOr[Double] = js.native
}
object KmlLayerOptions {
  
  @scala.inline
  def apply(): KmlLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KmlLayerOptions]
  }
  
  @scala.inline
  implicit class KmlLayerOptionsMutableBuilder[Self <: KmlLayerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClickable(value: Boolean): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickableUndefined: Self = StObject.set(x, "clickable", js.undefined)
    
    @scala.inline
    def setMap(value: Map[Element]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    @scala.inline
    def setPreserveViewport(value: Boolean): Self = StObject.set(x, "preserveViewport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveViewportUndefined: Self = StObject.set(x, "preserveViewport", js.undefined)
    
    @scala.inline
    def setScreenOverlays(value: Boolean): Self = StObject.set(x, "screenOverlays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenOverlaysUndefined: Self = StObject.set(x, "screenOverlays", js.undefined)
    
    @scala.inline
    def setSuppressInfoWindows(value: Boolean): Self = StObject.set(x, "suppressInfoWindows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressInfoWindowsUndefined: Self = StObject.set(x, "suppressInfoWindows", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
