package typingsSlinky.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITileSourceOptions extends js.Object {
  /**
    * A bounding box that specifies where tiles are available.
    * Note: This will not crop tiles to the specific bounding box, it limits the tiles it loads to those that intersect this bounding box.
    */
  var bounds: js.UndefOr[LocationRect] = js.native
  /** The maximum zoom level tiles that tiles should be rendered at. */
  var maxZoom: js.UndefOr[Double] = js.native
  /** The minimum zoom level tiles that tiles should be rendered at. */
  var minZoom: js.UndefOr[Double] = js.native
  /**
    * Required. This can be a string or a callback function that constructs the URLs used to retrieve tiles from the tile source.
    * When using a string, the uriConstructor will allow you to specify placeholders that will be replaced with the tiles value (i.e. {quadkey}).
    * See the Tile URL Parameters section for a list of supported parameters.
    * Besides using formatted tile URLs, you can also specify a callback function as the uriConstructor. This is useful if you need to be able to
    * build custom tile URL’s that may require some additional calculations for a tile.
    */
  var uriConstructor: String | (js.Function1[/* tile */ PyramidTileId, String]) = js.native
}

object ITileSourceOptions {
  @scala.inline
  def apply(uriConstructor: String | (js.Function1[/* tile */ PyramidTileId, String])): ITileSourceOptions = {
    val __obj = js.Dynamic.literal(uriConstructor = uriConstructor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITileSourceOptions]
  }
  @scala.inline
  implicit class ITileSourceOptionsOps[Self <: ITileSourceOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUriConstructorFunction1(value: /* tile */ PyramidTileId => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uriConstructor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUriConstructor(value: String | (js.Function1[/* tile */ PyramidTileId, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uriConstructor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBounds(value: LocationRect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBounds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withMinZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minZoom")(js.undefined)
        ret
    }
  }
  
}

