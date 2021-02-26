package typingsSlinky.leaflet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridLayerOptions extends StObject {
  
  var attribution: js.UndefOr[String] = js.native
  
  var bounds: js.UndefOr[LatLngBoundsExpression] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var keepBuffer: js.UndefOr[Double] = js.native
  
  var maxZoom: js.UndefOr[Double] = js.native
  
  var minZoom: js.UndefOr[Double] = js.native
  
  var noWrap: js.UndefOr[Boolean] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var pane: js.UndefOr[String] = js.native
  
  var tileSize: js.UndefOr[Double | Point_] = js.native
  
  var updateInterval: js.UndefOr[Double] = js.native
  
  var updateWhenIdle: js.UndefOr[Boolean] = js.native
  
  var updateWhenZooming: js.UndefOr[Boolean] = js.native
  
  var zIndex: js.UndefOr[Double] = js.native
}
object GridLayerOptions {
  
  @scala.inline
  def apply(): GridLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridLayerOptions]
  }
  
  @scala.inline
  implicit class GridLayerOptionsMutableBuilder[Self <: GridLayerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttribution(value: String): Self = StObject.set(x, "attribution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributionUndefined: Self = StObject.set(x, "attribution", js.undefined)
    
    @scala.inline
    def setBounds(value: LatLngBoundsExpression): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    @scala.inline
    def setBoundsVarargs(value: LatLngTuple*): Self = StObject.set(x, "bounds", js.Array(value :_*))
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setKeepBuffer(value: Double): Self = StObject.set(x, "keepBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepBufferUndefined: Self = StObject.set(x, "keepBuffer", js.undefined)
    
    @scala.inline
    def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
    
    @scala.inline
    def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
    
    @scala.inline
    def setNoWrap(value: Boolean): Self = StObject.set(x, "noWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoWrapUndefined: Self = StObject.set(x, "noWrap", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setPane(value: String): Self = StObject.set(x, "pane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaneUndefined: Self = StObject.set(x, "pane", js.undefined)
    
    @scala.inline
    def setTileSize(value: Double | Point_): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileSizeUndefined: Self = StObject.set(x, "tileSize", js.undefined)
    
    @scala.inline
    def setUpdateInterval(value: Double): Self = StObject.set(x, "updateInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateIntervalUndefined: Self = StObject.set(x, "updateInterval", js.undefined)
    
    @scala.inline
    def setUpdateWhenIdle(value: Boolean): Self = StObject.set(x, "updateWhenIdle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateWhenIdleUndefined: Self = StObject.set(x, "updateWhenIdle", js.undefined)
    
    @scala.inline
    def setUpdateWhenZooming(value: Boolean): Self = StObject.set(x, "updateWhenZooming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateWhenZoomingUndefined: Self = StObject.set(x, "updateWhenZooming", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
