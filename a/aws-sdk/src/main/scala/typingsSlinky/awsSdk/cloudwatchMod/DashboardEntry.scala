package typingsSlinky.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DashboardEntry extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the dashboard.
    */
  var DashboardArn: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.DashboardArn] = js.native
  /**
    * The name of the dashboard.
    */
  var DashboardName: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.DashboardName] = js.native
  /**
    * The time stamp of when the dashboard was last modified, either by an API call or through the console. This number is expressed as the number of milliseconds since Jan 1, 1970 00:00:00 UTC.
    */
  var LastModified: js.UndefOr[js.Date] = js.native
  /**
    * The size of the dashboard, in bytes.
    */
  var Size: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.Size] = js.native
}

object DashboardEntry {
  @scala.inline
  def apply(): DashboardEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DashboardEntry]
  }
  @scala.inline
  implicit class DashboardEntryOps[Self <: DashboardEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDashboardArn(value: DashboardArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DashboardArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDashboardArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DashboardArn")(js.undefined)
        ret
    }
    @scala.inline
    def withDashboardName(value: DashboardName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DashboardName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDashboardName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DashboardName")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModified(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModified: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModified")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Size")(js.undefined)
        ret
    }
  }
  
}

