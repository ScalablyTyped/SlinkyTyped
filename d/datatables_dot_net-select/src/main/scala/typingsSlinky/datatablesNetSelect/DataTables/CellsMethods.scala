package typingsSlinky.datatablesNetSelect.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellsMethods extends js.Object {
  /**
    * Deselect cells
    */
  def deselect(): Api = js.native
  /**
    * Select multiple cells
    */
  def select(): Api = js.native
}

object CellsMethods {
  @scala.inline
  def apply(deselect: () => Api, select: () => Api): CellsMethods = {
    val __obj = js.Dynamic.literal(deselect = js.Any.fromFunction0(deselect), select = js.Any.fromFunction0(select))
    __obj.asInstanceOf[CellsMethods]
  }
  @scala.inline
  implicit class CellsMethodsOps[Self <: CellsMethods] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeselect(value: () => Api): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deselect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSelect(value: () => Api): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

