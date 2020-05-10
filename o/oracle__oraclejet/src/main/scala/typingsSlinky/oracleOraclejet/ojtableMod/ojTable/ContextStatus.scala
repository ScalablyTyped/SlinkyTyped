package typingsSlinky.oracleOraclejet.ojtableMod.ojTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
@js.native
trait ContextStatus[K] extends js.Object {
  var currentRow: CurrentRow[K] = js.native
  var rowIndex: Double = js.native
  var rowKey: K = js.native
}

object ContextStatus {
  @scala.inline
  def apply[K](currentRow: CurrentRow[K], rowIndex: Double, rowKey: K): ContextStatus[K] = {
    val __obj = js.Dynamic.literal(currentRow = currentRow.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], rowKey = rowKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextStatus[K]]
  }
  @scala.inline
  implicit class ContextStatusOps[Self[k] <: ContextStatus[k], K] (val x: Self[K]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[K] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[K] with Other]
    @scala.inline
    def withCurrentRow(value: CurrentRow[K]): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowIndex(value: Double): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowKey(value: K): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowKey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

