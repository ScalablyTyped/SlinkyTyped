package typingsSlinky.rotJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<rot-js.rot-js/lib/map/rogue.Options> */
@js.native
trait PartialOptionsCellHeight extends js.Object {
  var cellHeight: js.UndefOr[Double] = js.native
  var cellWidth: js.UndefOr[Double] = js.native
  var roomHeight: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var roomWidth: js.UndefOr[js.Tuple2[Double, Double]] = js.native
}

object PartialOptionsCellHeight {
  @scala.inline
  def apply(): PartialOptionsCellHeight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptionsCellHeight]
  }
  @scala.inline
  implicit class PartialOptionsCellHeightOps[Self <: PartialOptionsCellHeight] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCellHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withCellWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withRoomHeight(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roomHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoomHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roomHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withRoomWidth(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roomWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoomWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roomWidth")(js.undefined)
        ret
    }
  }
  
}

