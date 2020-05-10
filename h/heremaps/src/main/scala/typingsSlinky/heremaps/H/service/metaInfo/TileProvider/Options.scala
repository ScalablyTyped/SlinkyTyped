package typingsSlinky.heremaps.H.service.metaInfo.TileProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration object which can be used to initialize the TileProvider.
  * @property tileType {string=} - The tile type for which to request meta info
  * @property scheme {string=} - The map scheme for which to request meta info
  * @property tileCacheSize {number=} - The number of fully rendered spatial tiles that are cached for immediate reuse, default is 32
  * @property tileSize {number=} - The size of the tiles rendered by this provider (must be power of 2, default is 256)
  * @property pixelRatio {number=} - The pixel ratio to use for over-sampling in cases of high-resolution displays
  * @property categoryFilter {Array<string>=} - A list of meta-info category names which should be suppressed. See Metainfo Tile for valid category names.
  */
@js.native
trait Options extends js.Object {
  var categoryFilter: js.UndefOr[js.Array[String]] = js.native
  var pixelRatio: js.UndefOr[Double] = js.native
  var scheme: js.UndefOr[String] = js.native
  var tileCacheSize: js.UndefOr[Double] = js.native
  var tileSize: js.UndefOr[Double] = js.native
  var tileType: js.UndefOr[String] = js.native
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
    def withCategoryFilter(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoryFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategoryFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoryFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withPixelRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPixelRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withScheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheme")(js.undefined)
        ret
    }
    @scala.inline
    def withTileCacheSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileCacheSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTileCacheSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileCacheSize")(js.undefined)
        ret
    }
    @scala.inline
    def withTileSize(value: Double): Self = {
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
    def withTileType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTileType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileType")(js.undefined)
        ret
    }
  }
  
}

