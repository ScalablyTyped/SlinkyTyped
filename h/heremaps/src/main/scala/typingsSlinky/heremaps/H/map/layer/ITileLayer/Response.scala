package typingsSlinky.heremaps.H.map.layer.ITileLayer

import typingsSlinky.heremaps.H.map.provider.Tile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response object for a tile request. Contains total number of elements requested and an array of currently available Tiles
  * @property total {number} - the total number of requested tiles
  * @property tiles {Array<H.map.provider.Tile>} - the tiles which this provider can currently return synchronously
  */
@js.native
trait Response extends js.Object {
  var tiles: js.Array[Tile] = js.native
  var total: Double = js.native
}

object Response {
  @scala.inline
  def apply(tiles: js.Array[Tile], total: Double): Response = {
    val __obj = js.Dynamic.literal(tiles = tiles.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
  @scala.inline
  implicit class ResponseOps[Self <: Response] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTiles(value: js.Array[Tile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

