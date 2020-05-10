package typingsSlinky.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.oracleOraclejet.ojdatagridMod.ojDataGrid.CellContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCancelEdit[K, D]
  extends /* key */ StringDictionary[js.Any] {
  var cancelEdit: Boolean = js.native
  var cellContext: CellContext[K, D] = js.native
}

object AnonCancelEdit {
  @scala.inline
  def apply[K, D](cancelEdit: Boolean, cellContext: CellContext[K, D]): AnonCancelEdit[K, D] = {
    val __obj = js.Dynamic.literal(cancelEdit = cancelEdit.asInstanceOf[js.Any], cellContext = cellContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCancelEdit[K, D]]
  }
  @scala.inline
  implicit class AnonCancelEditOps[Self[k, d] <: AnonCancelEdit[k, d], K, D] (val x: Self[K, D]) extends AnyVal {
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
    def withCellContext(value: CellContext[K, D]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellContext")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

