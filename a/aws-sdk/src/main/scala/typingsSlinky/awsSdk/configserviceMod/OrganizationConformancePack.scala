package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrganizationConformancePack extends js.Object {
  /**
    * A list of ConformancePackInputParameter objects.
    */
  var ConformancePackInputParameters: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.ConformancePackInputParameters] = js.native
  /**
    * Location of an Amazon S3 bucket where AWS Config can deliver evaluation results and conformance pack template that is used to create a pack. 
    */
  var DeliveryS3Bucket: typingsSlinky.awsSdk.configserviceMod.DeliveryS3Bucket = js.native
  /**
    * Any folder structure you want to add to an Amazon S3 bucket.
    */
  var DeliveryS3KeyPrefix: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.DeliveryS3KeyPrefix] = js.native
  /**
    * A comma-separated list of accounts excluded from organization conformance pack.
    */
  var ExcludedAccounts: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.ExcludedAccounts] = js.native
  /**
    * Last time when organization conformation pack was updated.
    */
  var LastUpdateTime: js.Date = js.native
  /**
    * Amazon Resource Name (ARN) of organization conformance pack.
    */
  var OrganizationConformancePackArn: StringWithCharLimit256 = js.native
  /**
    * The name you assign to an organization conformance pack.
    */
  var OrganizationConformancePackName: typingsSlinky.awsSdk.configserviceMod.OrganizationConformancePackName = js.native
}

object OrganizationConformancePack {
  @scala.inline
  def apply(
    DeliveryS3Bucket: DeliveryS3Bucket,
    LastUpdateTime: js.Date,
    OrganizationConformancePackArn: StringWithCharLimit256,
    OrganizationConformancePackName: OrganizationConformancePackName
  ): OrganizationConformancePack = {
    val __obj = js.Dynamic.literal(DeliveryS3Bucket = DeliveryS3Bucket.asInstanceOf[js.Any], LastUpdateTime = LastUpdateTime.asInstanceOf[js.Any], OrganizationConformancePackArn = OrganizationConformancePackArn.asInstanceOf[js.Any], OrganizationConformancePackName = OrganizationConformancePackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationConformancePack]
  }
  @scala.inline
  implicit class OrganizationConformancePackOps[Self <: OrganizationConformancePack] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeliveryS3Bucket(value: DeliveryS3Bucket): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeliveryS3Bucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastUpdateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrganizationConformancePackArn(value: StringWithCharLimit256): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrganizationConformancePackArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrganizationConformancePackName(value: OrganizationConformancePackName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrganizationConformancePackName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConformancePackInputParameters(value: ConformancePackInputParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConformancePackInputParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConformancePackInputParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConformancePackInputParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withDeliveryS3KeyPrefix(value: DeliveryS3KeyPrefix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeliveryS3KeyPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeliveryS3KeyPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeliveryS3KeyPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludedAccounts(value: ExcludedAccounts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExcludedAccounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludedAccounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExcludedAccounts")(js.undefined)
        ret
    }
  }
  
}

