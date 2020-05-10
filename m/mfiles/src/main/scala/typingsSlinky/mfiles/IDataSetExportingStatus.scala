package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDataSetExportingStatus extends js.Object {
  val CurrentServerTime: ITimestamp = js.native
  val IsExporting: Boolean = js.native
  val LatestActivity: ITimestamp = js.native
}

object IDataSetExportingStatus {
  @scala.inline
  def apply(CurrentServerTime: ITimestamp, IsExporting: Boolean, LatestActivity: ITimestamp): IDataSetExportingStatus = {
    val __obj = js.Dynamic.literal(CurrentServerTime = CurrentServerTime.asInstanceOf[js.Any], IsExporting = IsExporting.asInstanceOf[js.Any], LatestActivity = LatestActivity.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDataSetExportingStatus]
  }
  @scala.inline
  implicit class IDataSetExportingStatusOps[Self <: IDataSetExportingStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentServerTime(value: ITimestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentServerTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsExporting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsExporting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLatestActivity(value: ITimestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LatestActivity")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

