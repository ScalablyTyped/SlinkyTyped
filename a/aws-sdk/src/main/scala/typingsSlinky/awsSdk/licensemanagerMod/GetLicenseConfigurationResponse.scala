package typingsSlinky.awsSdk.licensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLicenseConfigurationResponse extends js.Object {
  /**
    * Automated discovery information.
    */
  var AutomatedDiscoveryInformation: js.UndefOr[typingsSlinky.awsSdk.licensemanagerMod.AutomatedDiscoveryInformation] = js.native
  /**
    * Summaries of the licenses consumed by resources.
    */
  var ConsumedLicenseSummaryList: js.UndefOr[typingsSlinky.awsSdk.licensemanagerMod.ConsumedLicenseSummaryList] = js.native
  /**
    * Number of licenses assigned to resources.
    */
  var ConsumedLicenses: js.UndefOr[BoxLong] = js.native
  /**
    * Description of the license configuration.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * Amazon Resource Name (ARN) of the license configuration.
    */
  var LicenseConfigurationArn: js.UndefOr[String] = js.native
  /**
    * Unique ID for the license configuration.
    */
  var LicenseConfigurationId: js.UndefOr[String] = js.native
  /**
    * Number of available licenses.
    */
  var LicenseCount: js.UndefOr[BoxLong] = js.native
  /**
    * Sets the number of available licenses as a hard limit.
    */
  var LicenseCountHardLimit: js.UndefOr[BoxBoolean] = js.native
  /**
    * Dimension on which the licenses are counted.
    */
  var LicenseCountingType: js.UndefOr[typingsSlinky.awsSdk.licensemanagerMod.LicenseCountingType] = js.native
  /**
    * License rules.
    */
  var LicenseRules: js.UndefOr[StringList] = js.native
  /**
    * Summaries of the managed resources.
    */
  var ManagedResourceSummaryList: js.UndefOr[typingsSlinky.awsSdk.licensemanagerMod.ManagedResourceSummaryList] = js.native
  /**
    * Name of the license configuration.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * Account ID of the owner of the license configuration.
    */
  var OwnerAccountId: js.UndefOr[String] = js.native
  /**
    * Product information.
    */
  var ProductInformationList: js.UndefOr[typingsSlinky.awsSdk.licensemanagerMod.ProductInformationList] = js.native
  /**
    * License configuration status.
    */
  var Status: js.UndefOr[String] = js.native
  /**
    * Tags for the license configuration.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object GetLicenseConfigurationResponse {
  @scala.inline
  def apply(): GetLicenseConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLicenseConfigurationResponse]
  }
  @scala.inline
  implicit class GetLicenseConfigurationResponseOps[Self <: GetLicenseConfigurationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutomatedDiscoveryInformation(value: AutomatedDiscoveryInformation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutomatedDiscoveryInformation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutomatedDiscoveryInformation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutomatedDiscoveryInformation")(js.undefined)
        ret
    }
    @scala.inline
    def withConsumedLicenseSummaryList(value: ConsumedLicenseSummaryList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConsumedLicenseSummaryList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsumedLicenseSummaryList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConsumedLicenseSummaryList")(js.undefined)
        ret
    }
    @scala.inline
    def withConsumedLicenses(value: BoxLong): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConsumedLicenses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsumedLicenses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConsumedLicenses")(js.undefined)
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
    def withLicenseConfigurationArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LicenseConfigurationArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLicenseConfigurationArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LicenseConfigurationArn")(js.undefined)
        ret
    }
    @scala.inline
    def withLicenseConfigurationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LicenseConfigurationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLicenseConfigurationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LicenseConfigurationId")(js.undefined)
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
    def withLicenseCountingType(value: LicenseCountingType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LicenseCountingType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLicenseCountingType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LicenseCountingType")(js.undefined)
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
    def withManagedResourceSummaryList(value: ManagedResourceSummaryList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManagedResourceSummaryList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManagedResourceSummaryList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManagedResourceSummaryList")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerAccountId")(js.undefined)
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
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
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

