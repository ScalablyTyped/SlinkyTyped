package typingsSlinky.datatablesNetRowgroup.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Api extends js.Object {
  def rowGroup(): RowGroupApi = js.native
}

object Api {
  @scala.inline
  def apply(rowGroup: () => RowGroupApi): Api = {
    val __obj = js.Dynamic.literal(rowGroup = js.Any.fromFunction0(rowGroup))
    __obj.asInstanceOf[Api]
  }
  @scala.inline
  implicit class ApiOps[Self <: Api] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRowGroup(value: () => RowGroupApi): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowGroup")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

