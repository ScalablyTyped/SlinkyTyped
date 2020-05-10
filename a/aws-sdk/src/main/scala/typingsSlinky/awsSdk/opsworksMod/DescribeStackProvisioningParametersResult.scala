package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStackProvisioningParametersResult extends js.Object {
  /**
    * The AWS OpsWorks Stacks agent installer's URL.
    */
  var AgentInstallerUrl: js.UndefOr[String] = js.native
  /**
    * An embedded object that contains the provisioning parameters.
    */
  var Parameters: js.UndefOr[typingsSlinky.awsSdk.opsworksMod.Parameters] = js.native
}

object DescribeStackProvisioningParametersResult {
  @scala.inline
  def apply(): DescribeStackProvisioningParametersResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStackProvisioningParametersResult]
  }
  @scala.inline
  implicit class DescribeStackProvisioningParametersResultOps[Self <: DescribeStackProvisioningParametersResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgentInstallerUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AgentInstallerUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgentInstallerUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AgentInstallerUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withParameters(value: Parameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parameters")(js.undefined)
        ret
    }
  }
  
}

