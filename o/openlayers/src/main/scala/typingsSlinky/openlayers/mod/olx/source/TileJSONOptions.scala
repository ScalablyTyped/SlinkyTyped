package typingsSlinky.openlayers.mod.olx.source

import typingsSlinky.openlayers.mod.Attribution
import typingsSlinky.openlayers.mod.AttributionLike
import typingsSlinky.openlayers.mod.Tile
import typingsSlinky.openlayers.mod.TileLoadFunctionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TileJSONOptions extends js.Object {
  
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
  implicit class TileJSONOptionsOps[Self <: TileJSONOptions] (val x: Self) extends AnyVal {
    
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributionsVarargs(value: (Attribution | String)*): Self = this.set("attributions", js.Array(value :_*))
    
    @scala.inline
    def setAttributions(value: AttributionLike): Self = this.set("attributions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributions: Self = this.set("attributions", js.undefined)
    
    @scala.inline
    def setCacheSize(value: Double): Self = this.set("cacheSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheSize: Self = this.set("cacheSize", js.undefined)
    
    @scala.inline
    def setCrossOrigin(value: String): Self = this.set("crossOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrossOrigin: Self = this.set("crossOrigin", js.undefined)
    
    @scala.inline
    def setJsonp(value: Boolean): Self = this.set("jsonp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJsonp: Self = this.set("jsonp", js.undefined)
    
    @scala.inline
    def setReprojectionErrorThreshold(value: Double): Self = this.set("reprojectionErrorThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReprojectionErrorThreshold: Self = this.set("reprojectionErrorThreshold", js.undefined)
    
    @scala.inline
    def setTileLoadFunction(value: (/* tile */ Tile, /* url */ String) => Unit): Self = this.set("tileLoadFunction", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteTileLoadFunction: Self = this.set("tileLoadFunction", js.undefined)
    
    @scala.inline
    def setTransition(value: Double): Self = this.set("transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransition: Self = this.set("transition", js.undefined)
    
    @scala.inline
    def setWrapX(value: Boolean): Self = this.set("wrapX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapX: Self = this.set("wrapX", js.undefined)
  }
}
