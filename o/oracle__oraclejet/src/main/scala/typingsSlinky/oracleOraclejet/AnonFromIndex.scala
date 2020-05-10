package typingsSlinky.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFromIndex
  extends /* key */ StringDictionary[js.Any] {
  var fromIndex: Double = js.native
  var tile: Element = js.native
}

object AnonFromIndex {
  @scala.inline
  def apply(fromIndex: Double, tile: Element): AnonFromIndex = {
    val __obj = js.Dynamic.literal(fromIndex = fromIndex.asInstanceOf[js.Any], tile = tile.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFromIndex]
  }
  @scala.inline
  implicit class AnonFromIndexOps[Self <: AnonFromIndex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFromIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTile(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tile")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

