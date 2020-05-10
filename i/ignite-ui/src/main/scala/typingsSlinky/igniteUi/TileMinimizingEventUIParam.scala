package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TileMinimizingEventUIParam extends js.Object {
  /**
  	 * Used to get reference to the tile that is maximizing simultaneously or null if no tile is maximizing.
  	 */
  var maximizingTile: js.UndefOr[js.Any] = js.native
  /**
  	 * Used to get a reference to the tile manager performing the minimizing the tile belongs to.
  	 */
  var owner: js.UndefOr[js.Any] = js.native
  /**
  	 * Used to get the jQuery element of the tile being minimized
  	 */
  var tile: js.UndefOr[js.Any] = js.native
}

object TileMinimizingEventUIParam {
  @scala.inline
  def apply(): TileMinimizingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileMinimizingEventUIParam]
  }
  @scala.inline
  implicit class TileMinimizingEventUIParamOps[Self <: TileMinimizingEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaximizingTile(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximizingTile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximizingTile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximizingTile")(js.undefined)
        ret
    }
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

