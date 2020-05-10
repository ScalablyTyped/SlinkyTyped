package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeConfigurationRecordersRequest extends js.Object {
  /**
    * A list of configuration recorder names.
    */
  var ConfigurationRecorderNames: js.UndefOr[ConfigurationRecorderNameList] = js.native
}

object DescribeConfigurationRecordersRequest {
  @scala.inline
  def apply(): DescribeConfigurationRecordersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConfigurationRecordersRequest]
  }
  @scala.inline
  implicit class DescribeConfigurationRecordersRequestOps[Self <: DescribeConfigurationRecordersRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigurationRecorderNames(value: ConfigurationRecorderNameList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationRecorderNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurationRecorderNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationRecorderNames")(js.undefined)
        ret
    }
  }
  
}

