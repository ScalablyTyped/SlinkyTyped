package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TileRenderedEventUIParam extends js.Object {
  /**
  	 * Used to get a reference to the tile manager performing rendering.
  	 */
  var owner: js.UndefOr[js.Any] = js.native
  /**
  	 * Used to get a reference to the rendered tile
  	 */
  var tile: js.UndefOr[js.Any] = js.native
}

object TileRenderedEventUIParam {
  @scala.inline
  def apply(): TileRenderedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileRenderedEventUIParam]
  }
  @scala.inline
  implicit class TileRenderedEventUIParamOps[Self <: TileRenderedEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOwner(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(js.undefined)
        ret
    }
    @scala.inline
    def withTile(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tile")(js.undefined)
        ret
    }
  }
  
}

