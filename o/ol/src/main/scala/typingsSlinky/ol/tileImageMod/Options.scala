package typingsSlinky.ol.tileImageMod

import typingsSlinky.ol.olTileMod.LoadFunction
import typingsSlinky.ol.olTileMod.Tile
import typingsSlinky.ol.olTileMod.UrlFunction
import typingsSlinky.ol.pluggableMapMod.FrameState
import typingsSlinky.ol.projMod.ProjectionLike
import typingsSlinky.ol.sourceSourceMod.AttributionLike
import typingsSlinky.ol.stateMod.State
import typingsSlinky.ol.tilecoordMod.TileCoord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var attributions: js.UndefOr[AttributionLike] = js.native
  
  var attributionsCollapsible: js.UndefOr[Boolean] = js.native
  
  var cacheSize: js.UndefOr[Double] = js.native
  
  var crossOrigin: js.UndefOr[String] = js.native
  
  var key: js.UndefOr[String] = js.native
  
  var opaque: js.UndefOr[Boolean] = js.native
  
  var projection: js.UndefOr[ProjectionLike] = js.native
  
  var reprojectionErrorThreshold: js.UndefOr[Double] = js.native
  
  var state: js.UndefOr[State] = js.native
  
  var tileClass: js.UndefOr[typingsSlinky.ol.imageTileMod.default] = js.native
  
  var tileGrid: js.UndefOr[typingsSlinky.ol.tilegridTileGridMod.default] = js.native
  
  var tileLoadFunction: js.UndefOr[LoadFunction] = js.native
  
  var tilePixelRatio: js.UndefOr[Double] = js.native
  
  var tileUrlFunction: js.UndefOr[UrlFunction] = js.native
  
  var transition: js.UndefOr[Double] = js.native
  
  var url: js.UndefOr[String] = js.native
  
  var urls: js.UndefOr[js.Array[String]] = js.native
  
  var wrapX: js.UndefOr[Boolean] = js.native
  
  var zDirection: js.UndefOr[Double] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
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
    def setAttributionsVarargs(value: String*): Self = this.set("attributions", js.Array(value :_*))
    
    @scala.inline
    def setAttributionsFunction1(value: /* p0 */ FrameState => String | js.Array[String]): Self = this.set("attributions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAttributions(value: AttributionLike): Self = this.set("attributions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributions: Self = this.set("attributions", js.undefined)
    
    @scala.inline
    def setAttributionsCollapsible(value: Boolean): Self = this.set("attributionsCollapsible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributionsCollapsible: Self = this.set("attributionsCollapsible", js.undefined)
    
    @scala.inline
    def setCacheSize(value: Double): Self = this.set("cacheSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheSize: Self = this.set("cacheSize", js.undefined)
    
    @scala.inline
    def setCrossOrigin(value: String): Self = this.set("crossOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrossOrigin: Self = this.set("crossOrigin", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setOpaque(value: Boolean): Self = this.set("opaque", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpaque: Self = this.set("opaque", js.undefined)
    
    @scala.inline
    def setProjection(value: ProjectionLike): Self = this.set("projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjection: Self = this.set("projection", js.undefined)
    
    @scala.inline
    def setReprojectionErrorThreshold(value: Double): Self = this.set("reprojectionErrorThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReprojectionErrorThreshold: Self = this.set("reprojectionErrorThreshold", js.undefined)
    
    @scala.inline
    def setState(value: State): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setTileClass(value: typingsSlinky.ol.imageTileMod.default): Self = this.set("tileClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTileClass: Self = this.set("tileClass", js.undefined)
    
    @scala.inline
    def setTileGrid(value: typingsSlinky.ol.tilegridTileGridMod.default): Self = this.set("tileGrid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTileGrid: Self = this.set("tileGrid", js.undefined)
    
    @scala.inline
    def setTileLoadFunction(value: (/* p0 */ Tile, /* p1 */ String) => Unit): Self = this.set("tileLoadFunction", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteTileLoadFunction: Self = this.set("tileLoadFunction", js.undefined)
    
    @scala.inline
    def setTilePixelRatio(value: Double): Self = this.set("tilePixelRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTilePixelRatio: Self = this.set("tilePixelRatio", js.undefined)
    
    @scala.inline
    def setTileUrlFunction(
      value: (/* p0 */ TileCoord, /* p1 */ Double, /* p2 */ typingsSlinky.ol.projectionMod.default) => String
    ): Self = this.set("tileUrlFunction", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTileUrlFunction: Self = this.set("tileUrlFunction", js.undefined)
    
    @scala.inline
    def setTransition(value: Double): Self = this.set("transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransition: Self = this.set("transition", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setUrlsVarargs(value: String*): Self = this.set("urls", js.Array(value :_*))
    
    @scala.inline
    def setUrls(value: js.Array[String]): Self = this.set("urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrls: Self = this.set("urls", js.undefined)
    
    @scala.inline
    def setWrapX(value: Boolean): Self = this.set("wrapX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapX: Self = this.set("wrapX", js.undefined)
    
    @scala.inline
    def setZDirection(value: Double): Self = this.set("zDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZDirection: Self = this.set("zDirection", js.undefined)
  }
}
