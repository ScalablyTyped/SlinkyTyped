package typingsSlinky.ngTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonColumns extends js.Object {
  var columns: String = js.native
  var tableParams: String = js.native
}

object AnonColumns {
  @scala.inline
  def apply(columns: String, tableParams: String): AnonColumns = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], tableParams = tableParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColumns]
  }
  @scala.inline
  implicit class AnonColumnsOps[Self <: AnonColumns] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumns(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTableParams(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableParams")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

