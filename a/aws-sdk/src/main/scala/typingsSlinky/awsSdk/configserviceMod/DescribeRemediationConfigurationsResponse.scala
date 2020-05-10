package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRemediationConfigurationsResponse extends js.Object {
  /**
    * Returns a remediation configuration object.
    */
  var RemediationConfigurations: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.RemediationConfigurations] = js.native
}

object DescribeRemediationConfigurationsResponse {
  @scala.inline
  def apply(): DescribeRemediationConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRemediationConfigurationsResponse]
  }
  @scala.inline
  implicit class DescribeRemediationConfigurationsResponseOps[Self <: DescribeRemediationConfigurationsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRemediationConfigurations(value: RemediationConfigurations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemediationConfigurations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemediationConfigurations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemediationConfigurations")(js.undefined)
        ret
    }
  }
  
}

