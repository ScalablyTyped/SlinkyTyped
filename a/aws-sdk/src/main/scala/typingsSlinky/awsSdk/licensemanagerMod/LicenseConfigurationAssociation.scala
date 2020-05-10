package typingsSlinky.awsSdk.licensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LicenseConfigurationAssociation extends js.Object {
  /**
    * Time when the license configuration was associated with the resource.
    */
  var AssociationTime: js.UndefOr[js.Date] = js.native
  /**
    * Amazon Resource Name (ARN) of the resource.
    */
  var ResourceArn: js.UndefOr[String] = js.native
  /**
    * ID of the AWS account that owns the resource consuming licenses.
    */
  var ResourceOwnerId: js.UndefOr[String] = js.native
  /**
    * Type of server resource.
    */
  var ResourceType: js.UndefOr[typingsSlinky.awsSdk.licensemanagerMod.ResourceType] = js.native
}

object LicenseConfigurationAssociation {
  @scala.inline
  def apply(): LicenseConfigurationAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LicenseConfigurationAssociation]
  }
  @scala.inline
  implicit class LicenseConfigurationAssociationOps[Self <: LicenseConfigurationAssociation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssociationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssociationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssociationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceArn")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceOwnerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceOwnerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceOwnerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceOwnerId")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceType(value: ResourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceType")(js.undefined)
        ret
    }
  }
  
}

