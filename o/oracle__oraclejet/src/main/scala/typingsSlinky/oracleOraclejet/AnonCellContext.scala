package typingsSlinky.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.oracleOraclejet.ojdatagridMod.ojDataGrid.CellContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCellContext[K, D]
  extends /* key */ StringDictionary[js.Any] {
  var cellContext: CellContext[K, D] = js.native
}

object AnonCellContext {
  @scala.inline
  def apply[K, D](cellContext: CellContext[K, D]): AnonCellContext[K, D] = {
    val __obj = js.Dynamic.literal(cellContext = cellContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCellContext[K, D]]
  }
  @scala.inline
  implicit class AnonCellContextOps[Self[k, d] <: AnonCellContext[k, d], K, D] (val x: Self[K, D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K, D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K, D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[K, D]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[K, D]) with Other]
    @scala.inline
    def withCellContext(value: CellContext[K, D]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellContext")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

