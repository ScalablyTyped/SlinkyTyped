package typingsSlinky.ol.vectorTileMod

import typingsSlinky.ol.extentMod.Extent
import typingsSlinky.ol.olFeatureMod.FeatureLike
import typingsSlinky.ol.renderMod.OrderFunction
import typingsSlinky.ol.styleStyleMod.Style
import typingsSlinky.ol.styleStyleMod.StyleLike
import typingsSlinky.ol.vectorTileRenderTypeMod.VectorTileRenderType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  var declutter: js.UndefOr[Boolean] = js.native
  
  var extent: js.UndefOr[Extent] = js.native
  
  var map: js.UndefOr[typingsSlinky.ol.pluggableMapMod.default] = js.native
  
  var maxResolution: js.UndefOr[Double] = js.native
  
  var maxZoom: js.UndefOr[Double] = js.native
  
  var minResolution: js.UndefOr[Double] = js.native
  
  var minZoom: js.UndefOr[Double] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var preload: js.UndefOr[Double] = js.native
  
  var renderBuffer: js.UndefOr[Double] = js.native
  
  var renderMode: js.UndefOr[VectorTileRenderType | String] = js.native
  
  var renderOrder: js.UndefOr[OrderFunction] = js.native
  
  var source: js.UndefOr[typingsSlinky.ol.sourceVectorTileMod.default] = js.native
  
  var style: js.UndefOr[StyleLike] = js.native
  
  var updateWhileAnimating: js.UndefOr[Boolean] = js.native
  
  var updateWhileInteracting: js.UndefOr[Boolean] = js.native
  
  var useInterimTilesOnError: js.UndefOr[Boolean] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
  
  var zIndex: js.UndefOr[Double] = js.native
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setDeclutter(value: Boolean): Self = this.set("declutter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeclutter: Self = this.set("declutter", js.undefined)
    
    @scala.inline
    def setExtent(value: Extent): Self = this.set("extent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtent: Self = this.set("extent", js.undefined)
    
    @scala.inline
    def setMap(value: typingsSlinky.ol.pluggableMapMod.default): Self = this.set("map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    
    @scala.inline
    def setMaxResolution(value: Double): Self = this.set("maxResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResolution: Self = this.set("maxResolution", js.undefined)
    
    @scala.inline
    def setMaxZoom(value: Double): Self = this.set("maxZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxZoom: Self = this.set("maxZoom", js.undefined)
    
    @scala.inline
    def setMinResolution(value: Double): Self = this.set("minResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinResolution: Self = this.set("minResolution", js.undefined)
    
    @scala.inline
    def setMinZoom(value: Double): Self = this.set("minZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinZoom: Self = this.set("minZoom", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setPreload(value: Double): Self = this.set("preload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreload: Self = this.set("preload", js.undefined)
    
    @scala.inline
    def setRenderBuffer(value: Double): Self = this.set("renderBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderBuffer: Self = this.set("renderBuffer", js.undefined)
    
    @scala.inline
    def setRenderMode(value: VectorTileRenderType | String): Self = this.set("renderMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderMode: Self = this.set("renderMode", js.undefined)
    
    @scala.inline
    def setRenderOrder(value: (/* p0 */ FeatureLike, /* p1 */ FeatureLike) => Double): Self = this.set("renderOrder", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRenderOrder: Self = this.set("renderOrder", js.undefined)
    
    @scala.inline
    def setSource(value: typingsSlinky.ol.sourceVectorTileMod.default): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setStyleFunction2(value: (/* p0 */ FeatureLike, /* p1 */ Double) => Style | js.Array[Style]): Self = this.set("style", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStyleVarargs(value: Style*): Self = this.set("style", js.Array(value :_*))
    
    @scala.inline
    def setStyle(value: StyleLike): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setUpdateWhileAnimating(value: Boolean): Self = this.set("updateWhileAnimating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateWhileAnimating: Self = this.set("updateWhileAnimating", js.undefined)
    
    @scala.inline
    def setUpdateWhileInteracting(value: Boolean): Self = this.set("updateWhileInteracting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateWhileInteracting: Self = this.set("updateWhileInteracting", js.undefined)
    
    @scala.inline
    def setUseInterimTilesOnError(value: Boolean): Self = this.set("useInterimTilesOnError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseInterimTilesOnError: Self = this.set("useInterimTilesOnError", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
}
