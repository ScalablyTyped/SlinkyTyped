package typingsSlinky.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DictpropNameTile
  extends /* key */ StringDictionary[js.Any] {
  var tile: org.scalajs.dom.raw.Element = js.native
}

object DictpropNameTile {
  @scala.inline
  def apply(tile: org.scalajs.dom.raw.Element): DictpropNameTile = {
    val __obj = js.Dynamic.literal(tile = tile.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictpropNameTile]
  }
  @scala.inline
  implicit class DictpropNameTileOps[Self <: DictpropNameTile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTile(value: org.scalajs.dom.raw.Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tile")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

