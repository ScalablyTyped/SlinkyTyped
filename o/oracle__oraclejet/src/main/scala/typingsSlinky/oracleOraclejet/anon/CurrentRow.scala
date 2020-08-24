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
  implicit class CurrentRowOps[Self <: CurrentRow[_], K] (val x: Self with CurrentRow[K]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCurrentRow(value: typingsSlinky.oracleOraclejet.ojtableMod.ojTable.CurrentRow[K]): Self = this.set("currentRow", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreviousCurrentRow(value: typingsSlinky.oracleOraclejet.ojtableMod.ojTable.CurrentRow[K]): Self = this.set("previousCurrentRow", value.asInstanceOf[js.Any])
  }
  
}

