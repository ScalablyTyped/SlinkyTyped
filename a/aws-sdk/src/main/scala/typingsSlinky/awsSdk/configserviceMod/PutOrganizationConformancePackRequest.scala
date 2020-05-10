package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutOrganizationConformancePackRequest extends js.Object {
  /**
    * A list of ConformancePackInputParameter objects.
    */
  var ConformancePackInputParameters: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.ConformancePackInputParameters] = js.native
  /**
    * Location of an Amazon S3 bucket where AWS Config can deliver evaluation results. AWS Config stores intermediate files while processing conformance pack template.  The delivery bucket name should start with awsconfigconforms. For example: "Resource": "arn:aws:s3:::your_bucket_name/ *". For more information, see Permissions for cross account bucket access.
    */
  var DeliveryS3Bucket: typingsSlinky.awsSdk.configserviceMod.DeliveryS3Bucket = js.native
  /**
    * The prefix for the Amazon S3 bucket.
    */
  var DeliveryS3KeyPrefix: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.DeliveryS3KeyPrefix] = js.native
  /**
    * A list of AWS accounts to be excluded from an organization conformance pack while deploying a conformance pack.
    */
  var ExcludedAccounts: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.ExcludedAccounts] = js.native
  /**
    * Name of the organization conformance pack you want to create.
    */
  var OrganizationConformancePackName: typingsSlinky.awsSdk.configserviceMod.OrganizationConformancePackName = js.native
  /**
    * A string containing full conformance pack template body. Structure containing the template body with a minimum length of 1 byte and a maximum length of 51,200 bytes.
    */
  var TemplateBody: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.TemplateBody] = js.native
  /**
    * Location of file containing the template body. The uri must point to the conformance pack template (max size: 300 KB).  You must have access to read Amazon S3 bucket. 
    */
  var TemplateS3Uri: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.TemplateS3Uri] = js.native
}

object PutOrganizationConformancePackRequest {
  @scala.inline
  def apply(
    DeliveryS3Bucket: DeliveryS3Bucket,
    OrganizationConformancePackName: OrganizationConformancePackName
  ): PutOrganizationConformancePackRequest = {
    val __obj = js.Dynamic.literal(DeliveryS3Bucket = DeliveryS3Bucket.asInstanceOf[js.Any], OrganizationConformancePackName = OrganizationConformancePackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutOrganizationConformancePackRequest]
  }
  @scala.inline
  implicit class PutOrganizationConformancePackRequestOps[Self <: PutOrganizationConformancePackRequest] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withTemplateBody(value: TemplateBody): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateBody")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateS3Uri(value: TemplateS3Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateS3Uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateS3Uri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateS3Uri")(js.undefined)
        ret
    }
  }
  
}

