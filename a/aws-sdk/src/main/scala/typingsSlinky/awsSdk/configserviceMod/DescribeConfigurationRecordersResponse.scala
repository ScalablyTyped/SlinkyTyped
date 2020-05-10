package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeConfigurationRecordersResponse extends js.Object {
  /**
    * A list that contains the descriptions of the specified configuration recorders.
    */
  var ConfigurationRecorders: js.UndefOr[ConfigurationRecorderList] = js.native
}

object DescribeConfigurationRecordersResponse {
  @scala.inline
  def apply(): DescribeConfigurationRecordersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConfigurationRecordersResponse]
  }
  @scala.inline
  implicit class DescribeConfigurationRecordersResponseOps[Self <: DescribeConfigurationRecordersResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigurationRecorders(value: ConfigurationRecorderList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationRecorders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurationRecorders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationRecorders")(js.undefined)
        ret
    }
  }
  
}

