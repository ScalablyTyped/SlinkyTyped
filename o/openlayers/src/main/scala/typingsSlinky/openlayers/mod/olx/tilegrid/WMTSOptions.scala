package typingsSlinky.openlayers.mod.olx.tilegrid

import typingsSlinky.openlayers.mod.Coordinate_
import typingsSlinky.openlayers.mod.Extent_
import typingsSlinky.openlayers.mod.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WMTSOptions extends js.Object {
  var extent: js.UndefOr[Extent_] = js.native
  var matrixIds: js.Array[String] = js.native
  var origin: js.UndefOr[Coordinate_] = js.native
  var origins: js.UndefOr[js.Array[Coordinate_]] = js.native
  var resolutions: js.Array[Double] = js.native
  var sizes: js.UndefOr[js.Array[Size]] = js.native
  var tileSize: js.UndefOr[Double | Size] = js.native
  var tileSizes: js.UndefOr[js.Array[Double | Size]] = js.native
  var widths: js.UndefOr[js.Array[Double]] = js.native
}

object WMTSOptions {
  @scala.inline
  def apply(matrixIds: js.Array[String], resolutions: js.Array[Double]): WMTSOptions = {
    val __obj = js.Dynamic.literal(matrixIds = matrixIds.asInstanceOf[js.Any], resolutions = resolutions.asInstanceOf[js.Any])
    __obj.asInstanceOf[WMTSOptions]
  }
  @scala.inline
  implicit class WMTSOptionsOps[Self <: WMTSOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMatrixIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matrixIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolutions(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolutions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtent(value: Extent_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extent")(js.undefined)
        ret
    }
    @scala.inline
    def withOrigin(value: Coordinate_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(js.undefined)
        ret
    }
    @scala.inline
    def withOrigins(value: js.Array[Coordinate_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrigins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origins")(js.undefined)
        ret
    }
    @scala.inline
    def withSizes(value: js.Array[Size]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizes")(js.undefined)
        ret
    }
    @scala.inline
    def withTileSize(value: Double | Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTileSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileSize")(js.undefined)
        ret
    }
    @scala.inline
    def withTileSizes(value: js.Array[Double | Size]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileSizes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTileSizes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileSizes")(js.undefined)
        ret
    }
    @scala.inline
    def withWidths(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widths")(js.undefined)
        ret
    }
  }
  
}

