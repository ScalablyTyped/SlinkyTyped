package typingsSlinky.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowIndexRowKey[K]
  extends typingsSlinky.oracleOraclejet.ojtableMod.ojTable.CurrentRow[K] {
  var rowIndex: js.UndefOr[Double] = js.native
  var rowKey: K = js.native
}

object RowIndexRowKey {
  @scala.inline
  def apply[K](rowKey: K): RowIndexRowKey[K] = {
    val __obj = js.Dynamic.literal(rowKey = rowKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowIndexRowKey[K]]
  }
  @scala.inline
  implicit class RowIndexRowKeyOps[Self[k] <: RowIndexRowKey[k], K] (val x: Self[K]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[K] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[K] with Other]
    @scala.inline
    def withRowKey(value: K): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowIndex(value: Double): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowIndex: Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowIndex")(js.undefined)
        ret
    }
  }
  
}

