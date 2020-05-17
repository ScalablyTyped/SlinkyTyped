package typingsSlinky.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tile
  extends /* key */ StringDictionary[js.Any] {
  var index: Double = js.native
  var tile: org.scalajs.dom.raw.Element = js.native
}

object Tile {
  @scala.inline
  def apply(index: Double, tile: org.scalajs.dom.raw.Element): Tile = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], tile = tile.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tile]
  }
  @scala.inline
  implicit class TileOps[Self <: Tile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTile(value: org.scalajs.dom.raw.Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tile")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

