package typingsSlinky.openlayers.mod.olx.source

import typingsSlinky.openlayers.mod.AttributionLike
import typingsSlinky.openlayers.mod.ImageTile
import typingsSlinky.openlayers.mod.ProjectionLike
import typingsSlinky.openlayers.mod.Tile
import typingsSlinky.openlayers.mod.TileCoord
import typingsSlinky.openlayers.mod.TileLoadFunctionType
import typingsSlinky.openlayers.mod.TileUrlFunctionType
import typingsSlinky.openlayers.mod.olx.LogoOptions
import typingsSlinky.openlayers.mod.proj.Projection
import typingsSlinky.openlayers.mod.source.State
import typingsSlinky.openlayers.mod.tilegrid.TileGrid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TileImageOptions extends js.Object {
  var attributions: js.UndefOr[AttributionLike] = js.native
  var cacheSize: js.UndefOr[Double] = js.native
  var crossOrigin: js.UndefOr[String] = js.native
  var logo: js.UndefOr[String | LogoOptions] = js.native
  var opaque: js.UndefOr[Boolean] = js.native
  var projection: ProjectionLike = js.native
  var reprojectionErrorThreshold: js.UndefOr[Double] = js.native
  var state: js.UndefOr[State] = js.native
  var tileClass: js.UndefOr[
    js.Function6[
      /* n */ ImageTile, 
      /* coords */ TileCoord, 
      /* state */ typingsSlinky.openlayers.mod.Tile.State, 
      /* s1 */ String, 
      /* s2 */ String, 
      /* type */ TileLoadFunctionType, 
      _
    ]
  ] = js.native
  var tileGrid: js.UndefOr[TileGrid] = js.native
  var tileLoadFunction: js.UndefOr[TileLoadFunctionType] = js.native
  var tilePixelRatio: js.UndefOr[Double] = js.native
  var tileUrlFunction: js.UndefOr[TileUrlFunctionType] = js.native
  var transition: js.UndefOr[Double] = js.native
  var url: js.UndefOr[String] = js.native
  var urls: js.UndefOr[js.Array[String]] = js.native
  var wrapX: js.UndefOr[Boolean] = js.native
}

object TileImageOptions {
  @scala.inline
  def apply(): TileImageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileImageOptions]
  }
  @scala.inline
  implicit class TileImageOptionsOps[Self <: TileImageOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributions(value: AttributionLike): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributions")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheSize")(js.undefined)
        ret
    }
    @scala.inline
    def withCrossOrigin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossOrigin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrossOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossOrigin")(js.undefined)
        ret
    }
    @scala.inline
    def withLogo(value: String | LogoOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logo")(js.undefined)
        ret
    }
    @scala.inline
    def withOpaque(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opaque")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpaque: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opaque")(js.undefined)
        ret
    }
    @scala.inline
    def withProjection(value: ProjectionLike): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projection")(js.undefined)
        ret
    }
    @scala.inline
    def withReprojectionErrorThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reprojectionErrorThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReprojectionErrorThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reprojectionErrorThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: State): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withTileClass(
      value: (/* n */ ImageTile, /* coords */ TileCoord, /* state */ typingsSlinky.openlayers.mod.Tile.State, /* s1 */ String, /* s2 */ String, /* type */ TileLoadFunctionType) => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileClass")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withoutTileClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileClass")(js.undefined)
        ret
    }
    @scala.inline
    def withTileGrid(value: TileGrid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileGrid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTileGrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileGrid")(js.undefined)
        ret
    }
    @scala.inline
    def withTileLoadFunction(value: (/* tile */ Tile, /* url */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileLoadFunction")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutTileLoadFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileLoadFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withTilePixelRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tilePixelRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTilePixelRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tilePixelRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withTileUrlFunction(value: (/* coords */ TileCoord, /* pixelRatio */ Double, /* proj */ Projection) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileUrlFunction")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutTileUrlFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileUrlFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withTransition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
    @scala.inline
    def withUrls(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urls")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapX(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapX")(js.undefined)
        ret
    }
  }
  
}

