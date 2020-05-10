package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyDefaultCreditSpecificationRequest extends js.Object {
  /**
    * The credit option for CPU usage of the instance family. Valid Values: standard | unlimited 
    */
  var CpuCredits: String = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The instance family.
    */
  var InstanceFamily: UnlimitedSupportedInstanceFamily = js.native
}

object ModifyDefaultCreditSpecificationRequest {
  @scala.inline
  def apply(CpuCredits: String, InstanceFamily: UnlimitedSupportedInstanceFamily): ModifyDefaultCreditSpecificationRequest = {
    val __obj = js.Dynamic.literal(CpuCredits = CpuCredits.asInstanceOf[js.Any], InstanceFamily = InstanceFamily.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyDefaultCreditSpecificationRequest]
  }
  @scala.inline
  implicit class ModifyDefaultCreditSpecificationRequestOps[Self <: ModifyDefaultCreditSpecificationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCpuCredits(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CpuCredits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstanceFamily(value: UnlimitedSupportedInstanceFamily): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDryRun(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDryRun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(js.undefined)
        ret
    }
  }
  
}

