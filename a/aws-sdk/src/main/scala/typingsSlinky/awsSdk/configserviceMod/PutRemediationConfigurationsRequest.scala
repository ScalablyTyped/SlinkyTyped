package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutRemediationConfigurationsRequest extends js.Object {
  /**
    * A list of remediation configuration objects.
    */
  var RemediationConfigurations: typingsSlinky.awsSdk.configserviceMod.RemediationConfigurations = js.native
}

object PutRemediationConfigurationsRequest {
  @scala.inline
  def apply(RemediationConfigurations: RemediationConfigurations): PutRemediationConfigurationsRequest = {
    val __obj = js.Dynamic.literal(RemediationConfigurations = RemediationConfigurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRemediationConfigurationsRequest]
  }
  @scala.inline
  implicit class PutRemediationConfigurationsRequestOps[Self <: PutRemediationConfigurationsRequest] (val x: Self) extends AnyVal {
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
  }
  
}

