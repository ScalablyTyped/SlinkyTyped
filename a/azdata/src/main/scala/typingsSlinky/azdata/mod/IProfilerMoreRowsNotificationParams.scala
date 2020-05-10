package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProfilerMoreRowsNotificationParams extends js.Object {
  var data: IProfilerTableRow = js.native
  var rowCount: Double = js.native
  var uri: String = js.native
}

object IProfilerMoreRowsNotificationParams {
  @scala.inline
  def apply(data: IProfilerTableRow, rowCount: Double, uri: String): IProfilerMoreRowsNotificationParams = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProfilerMoreRowsNotificationParams]
  }
  @scala.inline
  implicit class IProfilerMoreRowsNotificationParamsOps[Self <: IProfilerMoreRowsNotificationParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: IProfilerTableRow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

