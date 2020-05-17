package typingsSlinky.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelEdit[K, D]
  extends /* key */ StringDictionary[js.Any] {
  var cancelEdit: Boolean = js.native
  var cellContext: typingsSlinky.oracleOraclejet.ojdatagridMod.ojDataGrid.CellContext[K, D] = js.native
}

object CancelEdit {
  @scala.inline
  def apply[K, D](
    cancelEdit: Boolean,
    cellContext: typingsSlinky.oracleOraclejet.ojdatagridMod.ojDataGrid.CellContext[K, D]
  ): CancelEdit[K, D] = {
    val __obj = js.Dynamic.literal(cancelEdit = cancelEdit.asInstanceOf[js.Any], cellContext = cellContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelEdit[K, D]]
  }
  @scala.inline
  implicit class CancelEditOps[Self[k, d] <: CancelEdit[k, d], K, D] (val x: Self[K, D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K, D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K, D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[K, D]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[K, D]) with Other]
    @scala.inline
    def withCancelEdit(value: Boolean): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelEdit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellContext(value: typingsSlinky.oracleOraclejet.ojdatagridMod.ojDataGrid.CellContext[K, D]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellContext")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

