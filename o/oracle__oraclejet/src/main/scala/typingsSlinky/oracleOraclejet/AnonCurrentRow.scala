package typingsSlinky.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.oracleOraclejet.ojtableMod.ojTable.CurrentRow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCurrentRow[K]
  extends /* key */ StringDictionary[js.Any] {
  var currentRow: CurrentRow[K] = js.native
  var previousCurrentRow: CurrentRow[K] = js.native
}

object AnonCurrentRow {
  @scala.inline
  def apply[K](currentRow: CurrentRow[K], previousCurrentRow: CurrentRow[K]): AnonCurrentRow[K] = {
    val __obj = js.Dynamic.literal(currentRow = currentRow.asInstanceOf[js.Any], previousCurrentRow = previousCurrentRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCurrentRow[K]]
  }
  @scala.inline
  implicit class AnonCurrentRowOps[Self[k] <: AnonCurrentRow[k], K] (val x: Self[K]) extends AnyVal {
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
    def withPreviousCurrentRow(value: CurrentRow[K]): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousCurrentRow")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

