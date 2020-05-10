package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateProvisioningClaimRequest extends js.Object {
  /**
    * The name of the provisioning template to use.
    */
  var templateName: TemplateName = js.native
}

object CreateProvisioningClaimRequest {
  @scala.inline
  def apply(templateName: TemplateName): CreateProvisioningClaimRequest = {
    val __obj = js.Dynamic.literal(templateName = templateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProvisioningClaimRequest]
  }
  @scala.inline
  implicit class CreateProvisioningClaimRequestOps[Self <: CreateProvisioningClaimRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTemplateName(value: TemplateName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

