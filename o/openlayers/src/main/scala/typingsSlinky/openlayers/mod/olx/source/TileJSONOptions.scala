package typingsSlinky.openlayers.mod.olx.source

import typingsSlinky.openlayers.mod.Attribution
import typingsSlinky.openlayers.mod.AttributionLike
import typingsSlinky.openlayers.mod.Tile
import typingsSlinky.openlayers.mod.TileLoadFunctionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TileJSONOptions extends StObject {
  
  var attributions: js.UndefOr[AttributionLike] = js.native
  
  var cacheSize: js.UndefOr[Double] = js.native
  
  var crossOrigin: js.UndefOr[String] = js.native
  
  var jsonp: js.UndefOr[Boolean] = js.native
  
  var reprojectionErrorThreshold: js.UndefOr[Double] = js.native
  
  var tileLoadFunction: js.UndefOr[TileLoadFunctionType] = js.native
  
  var transition: js.UndefOr[Double] = js.native
  
  var url: String = js.native
  
  var wrapX: js.UndefOr[Boolean] = js.native
}
object TileJSONOptions {
  
  @scala.inline
  def apply(url: String): TileJSONOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileJSONOptions]
  }
  
  @scala.inline
  implicit class TileJSONOptionsMutableBuilder[Self <: TileJSONOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributions(value: AttributionLike): Self = StObject.set(x, "attributions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributionsUndefined: Self = StObject.set(x, "attributions", js.undefined)
    
    @scala.inline
    def setAttributionsVarargs(value: (Attribution | String)*): Self = StObject.set(x, "attributions", js.Array(value :_*))
    
    @scala.inline
    def setCacheSize(value: Double): Self = StObject.set(x, "cacheSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheSizeUndefined: Self = StObject.set(x, "cacheSize", js.undefined)
    
    @scala.inline
    def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
    
    @scala.inline
    def setJsonp(value: Boolean): Self = StObject.set(x, "jsonp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsonpUndefined: Self = StObject.set(x, "jsonp", js.undefined)
    
    @scala.inline
    def setReprojectionErrorThreshold(value: Double): Self = StObject.set(x, "reprojectionErrorThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReprojectionErrorThresholdUndefined: Self = StObject.set(x, "reprojectionErrorThreshold", js.undefined)
    
    @scala.inline
    def setTileLoadFunction(value: (/* tile */ Tile, /* url */ String) => Unit): Self = StObject.set(x, "tileLoadFunction", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTileLoadFunctionUndefined: Self = StObject.set(x, "tileLoadFunction", js.undefined)
    
    @scala.inline
    def setTransition(value: Double): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapX(value: Boolean): Self = StObject.set(x, "wrapX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapXUndefined: Self = StObject.set(x, "wrapX", js.undefined)
  }
}
