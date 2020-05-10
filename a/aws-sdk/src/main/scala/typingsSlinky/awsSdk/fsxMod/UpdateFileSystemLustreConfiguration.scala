package typingsSlinky.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateFileSystemLustreConfiguration extends js.Object {
  /**
    * The preferred time to perform weekly maintenance, in the UTC time zone.
    */
  var WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime] = js.native
}

object UpdateFileSystemLustreConfiguration {
  @scala.inline
  def apply(): UpdateFileSystemLustreConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFileSystemLustreConfiguration]
  }
  @scala.inline
  implicit class UpdateFileSystemLustreConfigurationOps[Self <: UpdateFileSystemLustreConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWeeklyMaintenanceStartTime(value: WeeklyTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WeeklyMaintenanceStartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeeklyMaintenanceStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WeeklyMaintenanceStartTime")(js.undefined)
        ret
    }
  }
  
}

