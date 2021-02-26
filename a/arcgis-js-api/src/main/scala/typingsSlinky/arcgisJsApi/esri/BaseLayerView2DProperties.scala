package typingsSlinky.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseLayerView2DProperties extends LayerViewProperties {
  
  /**
    * The array of [Tile](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerView2D.html#Tile) objects computed to cover the MapView's visible area.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerView2D.html#tiles)
    */
  var tiles: js.UndefOr[js.Array[Tile]] = js.native
  
  /**
    * References the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) this [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) belongs to.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerView2D.html#view)
    */
  var view: js.UndefOr[MapViewProperties] = js.native
}
object BaseLayerView2DProperties {
  
  @scala.inline
  def apply(): BaseLayerView2DProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseLayerView2DProperties]
  }
  
  @scala.inline
  implicit class BaseLayerView2DPropertiesMutableBuilder[Self <: BaseLayerView2DProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTiles(value: js.Array[Tile]): Self = StObject.set(x, "tiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTilesUndefined: Self = StObject.set(x, "tiles", js.undefined)
    
    @scala.inline
    def setTilesVarargs(value: Tile*): Self = StObject.set(x, "tiles", js.Array(value :_*))
    
    @scala.inline
    def setView(value: MapViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
