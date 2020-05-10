package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConformancePackDetail extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the conformance pack.
    */
  var ConformancePackArn: typingsSlinky.awsSdk.configserviceMod.ConformancePackArn = js.native
  /**
    * ID of the conformance pack.
    */
  var ConformancePackId: typingsSlinky.awsSdk.configserviceMod.ConformancePackId = js.native
  /**
    * A list of ConformancePackInputParameter objects.
    */
  var ConformancePackInputParameters: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.ConformancePackInputParameters] = js.native
  /**
    * Name of the conformance pack.
    */
  var ConformancePackName: typingsSlinky.awsSdk.configserviceMod.ConformancePackName = js.native
  /**
    * AWS service that created the conformance pack.
    */
  var CreatedBy: js.UndefOr[StringWithCharLimit256] = js.native
  /**
    * Conformance pack template that is used to create a pack. The delivery bucket name should start with awsconfigconforms. For example: "Resource": "arn:aws:s3:::your_bucket_name/ *".
    */
  var DeliveryS3Bucket: typingsSlinky.awsSdk.configserviceMod.DeliveryS3Bucket = js.native
  /**
    * The prefix for the Amazon S3 bucket.
    */
  var DeliveryS3KeyPrefix: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.DeliveryS3KeyPrefix] = js.native
  /**
    * Last time when conformation pack update was requested. 
    */
  var LastUpdateRequestedTime: js.UndefOr[js.Date] = js.native
}

object ConformancePackDetail {
  @scala.inline
  def apply(
    ConformancePackArn: ConformancePackArn,
    ConformancePackId: ConformancePackId,
    ConformancePackName: ConformancePackName,
    DeliveryS3Bucket: DeliveryS3Bucket
  ): ConformancePackDetail = {
    val __obj = js.Dynamic.literal(ConformancePackArn = ConformancePackArn.asInstanceOf[js.Any], ConformancePackId = ConformancePackId.asInstanceOf[js.Any], ConformancePackName = ConformancePackName.asInstanceOf[js.Any], DeliveryS3Bucket = DeliveryS3Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConformancePackDetail]
  }
  @scala.inline
  implicit class ConformancePackDetailOps[Self <: ConformancePackDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConformancePackArn(value: ConformancePackArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConformancePackArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConformancePackId(value: ConformancePackId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConformancePackId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConformancePackName(value: ConformancePackName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConformancePackName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeliveryS3Bucket(value: DeliveryS3Bucket): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeliveryS3Bucket")(value.asInstanceOf[js.Any])
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
    def withCreatedBy(value: StringWithCharLimit256): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedBy")(js.undefined)
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
    def withLastUpdateRequestedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdateRequestedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdateRequestedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdateRequestedTime")(js.undefined)
        ret
    }
  }
  
}

