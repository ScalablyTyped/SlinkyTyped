package typingsSlinky.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurrentCell[K]
  extends /* key */ StringDictionary[js.Any] {
  var currentCell: typingsSlinky.oracleOraclejet.ojdatagridMod.ojDataGrid.CurrentCell[K] = js.native
  var previousCurrentCell: typingsSlinky.oracleOraclejet.ojdatagridMod.ojDataGrid.CurrentCell[K] = js.native
}

object CurrentCell {
  @scala.inline
  def apply[K](
    currentCell: typingsSlinky.oracleOraclejet.ojdatagridMod.ojDataGrid.CurrentCell[K],
    previousCurrentCell: typingsSlinky.oracleOraclejet.ojdatagridMod.ojDataGrid.CurrentCell[K]
  ): CurrentCell[K] = {
    val __obj = js.Dynamic.literal(currentCell = currentCell.asInstanceOf[js.Any], previousCurrentCell = previousCurrentCell.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentCell[K]]
  }
  @scala.inline
  implicit class CurrentCellOps[Self[k] <: CurrentCell[k], K] (val x: Self[K]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[K] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[K] with Other]
    @scala.inline
    def withCurrentCell(value: typingsSlinky.oracleOraclejet.ojdatagridMod.ojDataGrid.CurrentCell[K]): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentCell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousCurrentCell(value: typingsSlinky.oracleOraclejet.ojdatagridMod.ojDataGrid.CurrentCell[K]): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousCurrentCell")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

