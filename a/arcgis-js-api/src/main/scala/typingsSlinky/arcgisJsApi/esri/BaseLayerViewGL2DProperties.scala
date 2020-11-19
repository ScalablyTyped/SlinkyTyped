package typingsSlinky.arcgisJsApi.esri

import org.scalajs.dom.raw.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseLayerViewGL2DProperties extends LayerViewProperties {
  
  /**
    * The WebGL rendering context associated to this layer view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#context)
    */
  var context: js.UndefOr[WebGLRenderingContext | js.Any] = js.native
  
  /**
    * The array of module:esri/views/2d/layers/BaseLayerViewGL2D#Tile objects computed to cover the MapView's visible area. This array is updated when the view is animating or the user is interacting with it. Then if tiles have been added or removed, [tilesChanged()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#tilesChanged) is called.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#tiles)
    */
  var tiles: js.UndefOr[js.Array[BaseLayerViewGL2DTile]] = js.native
  
  /**
    * References the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) this [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) belongs to.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#view)
    */
  var view: js.UndefOr[MapViewProperties] = js.native
}
object BaseLayerViewGL2DProperties {
  
  @scala.inline
  def apply(): BaseLayerViewGL2DProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseLayerViewGL2DProperties]
  }
  
  @scala.inline
  implicit class BaseLayerViewGL2DPropertiesOps[Self <: BaseLayerViewGL2DProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContextWebGLRenderingContext(value: WebGLRenderingContext): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContext(value: WebGLRenderingContext | js.Any): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setTilesVarargs(value: BaseLayerViewGL2DTile*): Self = this.set("tiles", js.Array(value :_*))
    
    @scala.inline
    def setTiles(value: js.Array[BaseLayerViewGL2DTile]): Self = this.set("tiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTiles: Self = this.set("tiles", js.undefined)
    
    @scala.inline
    def setView(value: MapViewProperties): Self = this.set("view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
}
