package typingsSlinky.openlayers.mod.olx.source

import typingsSlinky.openlayers.mod.Tile
import typingsSlinky.openlayers.mod.TileLoadFunctionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapQuestOptions extends StObject {
  
  var cacheSize: js.UndefOr[Double] = js.native
  
  var layer: String = js.native
  
  var reprojectionErrorThreshold: js.UndefOr[Double] = js.native
  
  var tileLoadFunction: js.UndefOr[TileLoadFunctionType] = js.native
  
  var url: js.UndefOr[String] = js.native
}
object MapQuestOptions {
  
  @scala.inline
  def apply(layer: String): MapQuestOptions = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapQuestOptions]
  }
  
  @scala.inline
  implicit class MapQuestOptionsMutableBuilder[Self <: MapQuestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheSize(value: Double): Self = StObject.set(x, "cacheSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheSizeUndefined: Self = StObject.set(x, "cacheSize", js.undefined)
    
    @scala.inline
    def setLayer(value: String): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReprojectionErrorThreshold(value: Double): Self = StObject.set(x, "reprojectionErrorThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReprojectionErrorThresholdUndefined: Self = StObject.set(x, "reprojectionErrorThreshold", js.undefined)
    
    @scala.inline
    def setTileLoadFunction(value: (/* tile */ Tile, /* url */ String) => Unit): Self = StObject.set(x, "tileLoadFunction", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTileLoadFunctionUndefined: Self = StObject.set(x, "tileLoadFunction", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
