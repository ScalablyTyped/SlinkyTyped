package typingsSlinky.heredatalens.H.datalens.HeatmapLayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Slice of data (eg Data Lens query data row) that represents a data point.
  * Each row is transformed into TilePoint and then rendered on a heat map. By default each row is an Object where property names correspond to data column names.
  * This representation can be changed with the dataToRows callback.
  */
@js.native
trait Row extends js.Object {
  var count: js.UndefOr[Double] = js.native
  var tx: js.UndefOr[Double] = js.native
  var ty: js.UndefOr[Double] = js.native
}

object Row {
  @scala.inline
  def apply(): Row = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Row]
  }
  @scala.inline
  implicit class RowOps[Self <: Row] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.undefined)
        ret
    }
    @scala.inline
    def withTx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tx")(js.undefined)
        ret
    }
    @scala.inline
    def withTy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ty")(js.undefined)
        ret
    }
  }
  
}

