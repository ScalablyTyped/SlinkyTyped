package typingsSlinky.esriLeaflet.mod.leafletAugmentingMod.esri

import typingsSlinky.leaflet.mod.TileLayerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for `L.esri.TiledMapLayer`
  */
@js.native
trait TiledMapLayerOptions
  extends TileLayerOptions
     with LayerOptionsBase {
  /**
    * If correctZoomLevels is enabled this controls the amount of tolerance for the difference at each scale
    * level for remapping tile levels.
    *
    * Default 0.1
    */
  var zoomOffsetAllowance: js.UndefOr[Double] = js.native
}

object TiledMapLayerOptions {
  @scala.inline
  def apply(url: String): TiledMapLayerOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TiledMapLayerOptions]
  }
  @scala.inline
  implicit class TiledMapLayerOptionsOps[Self <: TiledMapLayerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withZoomOffsetAllowance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomOffsetAllowance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomOffsetAllowance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomOffsetAllowance")(js.undefined)
        ret
    }
  }
  
}

