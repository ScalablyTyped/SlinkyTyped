package typingsSlinky.ol.bingMapsMod

import typingsSlinky.ol.olTileMod.LoadFunction
import typingsSlinky.ol.olTileMod.Tile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var cacheSize: js.UndefOr[Double] = js.native
  
  var culture: js.UndefOr[String] = js.native
  
  var hidpi: js.UndefOr[Boolean] = js.native
  
  var imagerySet: String = js.native
  
  var key: String = js.native
  
  var maxZoom: js.UndefOr[Double] = js.native
  
  var reprojectionErrorThreshold: js.UndefOr[Double] = js.native
  
  var tileLoadFunction: js.UndefOr[LoadFunction] = js.native
  
  var transition: js.UndefOr[Double] = js.native
  
  var wrapX: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(imagerySet: String, key: String): Options = {
    val __obj = js.Dynamic.literal(imagerySet = imagerySet.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setImagerySet(value: String): Self = this.set("imagerySet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheSize(value: Double): Self = this.set("cacheSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheSize: Self = this.set("cacheSize", js.undefined)
    
    @scala.inline
    def setCulture(value: String): Self = this.set("culture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCulture: Self = this.set("culture", js.undefined)
    
    @scala.inline
    def setHidpi(value: Boolean): Self = this.set("hidpi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidpi: Self = this.set("hidpi", js.undefined)
    
    @scala.inline
    def setMaxZoom(value: Double): Self = this.set("maxZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxZoom: Self = this.set("maxZoom", js.undefined)
    
    @scala.inline
    def setReprojectionErrorThreshold(value: Double): Self = this.set("reprojectionErrorThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReprojectionErrorThreshold: Self = this.set("reprojectionErrorThreshold", js.undefined)
    
    @scala.inline
    def setTileLoadFunction(value: (/* p0 */ Tile, /* p1 */ String) => Unit): Self = this.set("tileLoadFunction", js.Any.fromFunction2(value))
    
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
