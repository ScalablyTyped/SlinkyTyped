package typingsSlinky.mssql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBulkResult extends js.Object {
  var rowsAffected: Double = js.native
}

object IBulkResult {
  @scala.inline
  def apply(rowsAffected: Double): IBulkResult = {
    val __obj = js.Dynamic.literal(rowsAffected = rowsAffected.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBulkResult]
  }
  @scala.inline
  implicit class IBulkResultOps[Self <: IBulkResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRowsAffected(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowsAffected")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

