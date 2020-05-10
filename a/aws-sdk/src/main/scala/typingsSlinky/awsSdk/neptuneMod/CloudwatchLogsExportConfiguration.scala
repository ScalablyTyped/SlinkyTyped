package typingsSlinky.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudwatchLogsExportConfiguration extends js.Object {
  /**
    * The list of log types to disable.
    */
  var DisableLogTypes: js.UndefOr[LogTypeList] = js.native
  /**
    * The list of log types to enable.
    */
  var EnableLogTypes: js.UndefOr[LogTypeList] = js.native
}

object CloudwatchLogsExportConfiguration {
  @scala.inline
  def apply(): CloudwatchLogsExportConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudwatchLogsExportConfiguration]
  }
  @scala.inline
  implicit class CloudwatchLogsExportConfigurationOps[Self <: CloudwatchLogsExportConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisableLogTypes(value: LogTypeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisableLogTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableLogTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisableLogTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableLogTypes(value: LogTypeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableLogTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableLogTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableLogTypes")(js.undefined)
        ret
    }
  }
  
}

