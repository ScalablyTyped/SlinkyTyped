package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeConfigurationRecorderStatusResponse extends js.Object {
  /**
    * A list that contains status of the specified recorders.
    */
  var ConfigurationRecordersStatus: js.UndefOr[ConfigurationRecorderStatusList] = js.native
}

object DescribeConfigurationRecorderStatusResponse {
  @scala.inline
  def apply(): DescribeConfigurationRecorderStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConfigurationRecorderStatusResponse]
  }
  @scala.inline
  implicit class DescribeConfigurationRecorderStatusResponseOps[Self <: DescribeConfigurationRecorderStatusResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigurationRecordersStatus(value: ConfigurationRecorderStatusList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationRecordersStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurationRecordersStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationRecordersStatus")(js.undefined)
        ret
    }
  }
  
}

