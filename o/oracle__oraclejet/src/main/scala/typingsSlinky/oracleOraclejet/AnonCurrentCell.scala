package typingsSlinky.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.oracleOraclejet.ojdatagridMod.ojDataGrid.CurrentCell
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCurrentCell[K]
  extends /* key */ StringDictionary[js.Any] {
  var currentCell: CurrentCell[K] = js.native
  var previousCurrentCell: CurrentCell[K] = js.native
}

object AnonCurrentCell {
  @scala.inline
  def apply[K](currentCell: CurrentCell[K], previousCurrentCell: CurrentCell[K]): AnonCurrentCell[K] = {
    val __obj = js.Dynamic.literal(currentCell = currentCell.asInstanceOf[js.Any], previousCurrentCell = previousCurrentCell.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCurrentCell[K]]
  }
  @scala.inline
  implicit class AnonCurrentCellOps[Self[k] <: AnonCurrentCell[k], K] (val x: Self[K]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[K] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[K] with Other]
    @scala.inline
    def withCurrentCell(value: CurrentCell[K]): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentCell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousCurrentCell(value: CurrentCell[K]): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousCurrentCell")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

