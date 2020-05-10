package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PendingCloudwatchLogsExports extends js.Object {
  /**
    * Log types that are in the process of being enabled. After they are enabled, these log types are exported to CloudWatch Logs.
    */
  var LogTypesToDisable: js.UndefOr[LogTypeList] = js.native
  /**
    * Log types that are in the process of being deactivated. After they are deactivated, these log types aren't exported to CloudWatch Logs.
    */
  var LogTypesToEnable: js.UndefOr[LogTypeList] = js.native
}

object PendingCloudwatchLogsExports {
  @scala.inline
  def apply(): PendingCloudwatchLogsExports = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PendingCloudwatchLogsExports]
  }
  @scala.inline
  implicit class PendingCloudwatchLogsExportsOps[Self <: PendingCloudwatchLogsExports] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLogTypesToDisable(value: LogTypeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogTypesToDisable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogTypesToDisable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogTypesToDisable")(js.undefined)
        ret
    }
    @scala.inline
    def withLogTypesToEnable(value: LogTypeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogTypesToEnable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogTypesToEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogTypesToEnable")(js.undefined)
        ret
    }
  }
  
}

