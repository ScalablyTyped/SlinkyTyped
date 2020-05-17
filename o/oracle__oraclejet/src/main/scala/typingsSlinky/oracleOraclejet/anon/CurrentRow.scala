package typingsSlinky.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurrentRow[K]
  extends /* key */ StringDictionary[js.Any] {
  var currentRow: typingsSlinky.oracleOraclejet.ojtableMod.ojTable.CurrentRow[K] = js.native
  var previousCurrentRow: typingsSlinky.oracleOraclejet.ojtableMod.ojTable.CurrentRow[K] = js.native
}

object CurrentRow {
  @scala.inline
  def apply[K](
    currentRow: typingsSlinky.oracleOraclejet.ojtableMod.ojTable.CurrentRow[K],
    previousCurrentRow: typingsSlinky.oracleOraclejet.ojtableMod.ojTable.CurrentRow[K]
  ): CurrentRow[K] = {
    val __obj = js.Dynamic.literal(currentRow = currentRow.asInstanceOf[js.Any], previousCurrentRow = previousCurrentRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentRow[K]]
  }
  @scala.inline
  implicit class CurrentRowOps[Self[k] <: CurrentRow[k], K] (val x: Self[K]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[K] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[K] with Other]
    @scala.inline
    def withCurrentRow(value: typingsSlinky.oracleOraclejet.ojtableMod.ojTable.CurrentRow[K]): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousCurrentRow(value: typingsSlinky.oracleOraclejet.ojtableMod.ojTable.CurrentRow[K]): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousCurrentRow")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

