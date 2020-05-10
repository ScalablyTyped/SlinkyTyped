package typingsSlinky.osrm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This generates Mapbox Vector Tiles that can be viewed with a vector-tile capable slippy-map viewer.
  * The tiles contain road geometries and metadata that can be used to examine the routing graph.
  * The tiles are generated directly from the data in-memory, so are in sync with actual routing results,
  * and let you examine which roads are actually routable, and what weights they have applied.
  *
  * https://github.com/Project-OSRM/node-osrm/blob/master/docs/api.md#tile
  */
@js.native
trait TileOptions extends Options {
  /**
    * Array an array consisting of x, y, and z values representing tile coordinates like wiki.openstreetmap.org/wiki/Slippy_map_tilenames
    * and are supported by vector tile viewers like Mapbox GL JS.
    */
  var ZXY: js.UndefOr[Tile] = js.native
}

object TileOptions {
  @scala.inline
  def apply(): TileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileOptions]
  }
  @scala.inline
  implicit class TileOptionsOps[Self <: TileOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withZXY(value: Tile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZXY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZXY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZXY")(js.undefined)
        ret
    }
  }
  
}

