package typingsSlinky.awsSdk.licensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateLicenseSpecificationsForResourceRequest extends js.Object {
  /**
    * ARNs of the license configurations to add.
    */
  var AddLicenseSpecifications: js.UndefOr[LicenseSpecifications] = js.native
  /**
    * ARNs of the license configurations to remove.
    */
  var RemoveLicenseSpecifications: js.UndefOr[LicenseSpecifications] = js.native
  /**
    * Amazon Resource Name (ARN) of the AWS resource.
    */
  var ResourceArn: String = js.native
}

object UpdateLicenseSpecificationsForResourceRequest {
  @scala.inline
  def apply(ResourceArn: String): UpdateLicenseSpecificationsForResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLicenseSpecificationsForResourceRequest]
  }
  @scala.inline
  implicit class UpdateLicenseSpecificationsForResourceRequestOps[Self <: UpdateLicenseSpecificationsForResourceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddLicenseSpecifications(value: LicenseSpecifications): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddLicenseSpecifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddLicenseSpecifications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddLicenseSpecifications")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveLicenseSpecifications(value: LicenseSpecifications): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoveLicenseSpecifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveLicenseSpecifications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoveLicenseSpecifications")(js.undefined)
        ret
    }
  }
  
}

