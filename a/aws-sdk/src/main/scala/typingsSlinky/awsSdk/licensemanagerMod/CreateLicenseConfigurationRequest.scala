package typingsSlinky.awsSdk.licensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLicenseConfigurationRequest extends js.Object {
  /**
    * Description of the license configuration.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * Number of licenses managed by the license configuration.
    */
  var LicenseCount: js.UndefOr[BoxLong] = js.native
  /**
    * Indicates whether hard or soft license enforcement is used. Exceeding a hard limit blocks the launch of new instances.
    */
  var LicenseCountHardLimit: js.UndefOr[BoxBoolean] = js.native
  /**
    * Dimension used to track the license inventory.
    */
  var LicenseCountingType: typingsSlinky.awsSdk.licensemanagerMod.LicenseCountingType = js.native
  /**
    * License rules. The syntax is #name=value (for example, #allowedTenancy=EC2-DedicatedHost). Available rules vary by dimension.    Cores dimension: allowedTenancy | maximumCores | minimumCores     Instances dimension: allowedTenancy | maximumCores | minimumCores | maximumSockets | minimumSockets | maximumVcpus | minimumVcpus     Sockets dimension: allowedTenancy | maximumSockets | minimumSockets     vCPUs dimension: allowedTenancy | honorVcpuOptimization | maximumVcpus | minimumVcpus   
    */
  var LicenseRules: js.UndefOr[StringList] = js.native
  /**
    * Name of the license configuration.
    */
  var Name: String = js.native
  /**
    * Product information.
    */
  var ProductInformationList: js.UndefOr[typingsSlinky.awsSdk.licensemanagerMod.ProductInformationList] = js.native
  /**
    * Tags to add to the license configuration.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateLicenseConfigurationRequest {
  @scala.inline
  def apply(LicenseCountingType: LicenseCountingType, Name: String): CreateLicenseConfigurationRequest = {
    val __obj = js.Dynamic.literal(LicenseCountingType = LicenseCountingType.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLicenseConfigurationRequest]
  }
  @scala.inline
  implicit class CreateLicenseConfigurationRequestOps[Self <: CreateLicenseConfigurationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLicenseCountingType(value: LicenseCountingType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LicenseCountingType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withLicenseCount(value: BoxLong): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LicenseCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLicenseCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LicenseCount")(js.undefined)
        ret
    }
    @scala.inline
    def withLicenseCountHardLimit(value: BoxBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LicenseCountHardLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLicenseCountHardLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LicenseCountHardLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withLicenseRules(value: StringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LicenseRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLicenseRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LicenseRules")(js.undefined)
        ret
    }
    @scala.inline
    def withProductInformationList(value: ProductInformationList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductInformationList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductInformationList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductInformationList")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}

