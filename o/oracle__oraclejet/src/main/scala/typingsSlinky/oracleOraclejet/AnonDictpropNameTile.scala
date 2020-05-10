package typingsSlinky.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDictpropNameTile
  extends /* key */ StringDictionary[js.Any] {
  var tile: Element = js.native
}

object AnonDictpropNameTile {
  @scala.inline
  def apply(tile: Element): AnonDictpropNameTile = {
    val __obj = js.Dynamic.literal(tile = tile.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDictpropNameTile]
  }
  @scala.inline
  implicit class AnonDictpropNameTileOps[Self <: AnonDictpropNameTile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTile(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tile")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

