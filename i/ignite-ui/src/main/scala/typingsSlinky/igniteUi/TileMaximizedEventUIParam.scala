package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TileMaximizedEventUIParam extends js.Object {
  /**
  	 * Used to get a reference to the tile manager the maximized tile belongs to.
  	 */
  var owner: js.UndefOr[js.Any] = js.native
  /**
  	 * Used to get the jQuery element of the maximized tile
  	 */
  var tile: js.UndefOr[js.Any] = js.native
}

object TileMaximizedEventUIParam {
  @scala.inline
  def apply(): TileMaximizedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileMaximizedEventUIParam]
  }
  @scala.inline
  implicit class TileMaximizedEventUIParamOps[Self <: TileMaximizedEventUIParam] (val x: Self) extends AnyVal {
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

