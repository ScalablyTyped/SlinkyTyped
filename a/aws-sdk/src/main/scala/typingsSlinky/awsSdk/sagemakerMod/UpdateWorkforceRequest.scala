package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateWorkforceRequest extends js.Object {
  /**
    * A list of one to four worker IP address ranges (CIDRs) that can be used to access tasks assigned to this workforce. Maximum: Four CIDR values
    */
  var SourceIpConfig: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.SourceIpConfig] = js.native
  /**
    * The name of the private workforce whose access you want to restrict. WorkforceName is automatically set to default when a workforce is created and cannot be modified. 
    */
  var WorkforceName: typingsSlinky.awsSdk.sagemakerMod.WorkforceName = js.native
}

object UpdateWorkforceRequest {
  @scala.inline
  def apply(WorkforceName: WorkforceName): UpdateWorkforceRequest = {
    val __obj = js.Dynamic.literal(WorkforceName = WorkforceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWorkforceRequest]
  }
  @scala.inline
  implicit class UpdateWorkforceRequestOps[Self <: UpdateWorkforceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWorkforceName(value: WorkforceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkforceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceIpConfig(value: SourceIpConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceIpConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceIpConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceIpConfig")(js.undefined)
        ret
    }
  }
  
}

