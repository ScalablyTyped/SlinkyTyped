package typingsSlinky.datatablesNetSelect.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowMethods extends js.Object {
  /**
    * Deselect a row
    */
  def deselect(): Api = js.native
  /**
    * Select a row
    */
  def select(): Api = js.native
}

object RowMethods {
  @scala.inline
  def apply(deselect: () => Api, select: () => Api): RowMethods = {
    val __obj = js.Dynamic.literal(deselect = js.Any.fromFunction0(deselect), select = js.Any.fromFunction0(select))
    __obj.asInstanceOf[RowMethods]
  }
  @scala.inline
  implicit class RowMethodsOps[Self <: RowMethods] (val x: Self) extends AnyVal {
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

