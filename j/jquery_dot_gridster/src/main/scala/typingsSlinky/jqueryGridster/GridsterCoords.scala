package typingsSlinky.jqueryGridster

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridsterCoords extends js.Object {
  var col: Double = js.native
  var row: Double = js.native
  var size_x: Double = js.native
  var size_y: Double = js.native
}

object GridsterCoords {
  @scala.inline
  def apply(col: Double, row: Double, size_x: Double, size_y: Double): GridsterCoords = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], size_x = size_x.asInstanceOf[js.Any], size_y = size_y.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridsterCoords]
  }
  @scala.inline
  implicit class GridsterCoordsOps[Self <: GridsterCoords] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCol(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("col")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize_x(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size_x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize_y(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size_y")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

