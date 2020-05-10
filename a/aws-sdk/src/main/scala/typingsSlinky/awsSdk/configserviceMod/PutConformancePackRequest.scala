package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutConformancePackRequest extends js.Object {
  /**
    * A list of ConformancePackInputParameter objects.
    */
  var ConformancePackInputParameters: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.ConformancePackInputParameters] = js.native
  /**
    * Name of the conformance pack you want to create.
    */
  var ConformancePackName: typingsSlinky.awsSdk.configserviceMod.ConformancePackName = js.native
  /**
    * AWS Config stores intermediate files while processing conformance pack template.
    */
  var DeliveryS3Bucket: typingsSlinky.awsSdk.configserviceMod.DeliveryS3Bucket = js.native
  /**
    * The prefix for the Amazon S3 bucket. 
    */
  var DeliveryS3KeyPrefix: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.DeliveryS3KeyPrefix] = js.native
  /**
    * A string containing full conformance pack template body. Structure containing the template body with a minimum length of 1 byte and a maximum length of 51,200 bytes.  You can only use a YAML template with one resource type, that is, config rule and a remediation action.  
    */
  var TemplateBody: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.TemplateBody] = js.native
  /**
    * Location of file containing the template body (s3://bucketname/prefix). The uri must point to the conformance pack template (max size: 300 KB) that is located in an Amazon S3 bucket in the same region as the conformance pack.   You must have access to read Amazon S3 bucket. 
    */
  var TemplateS3Uri: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.TemplateS3Uri] = js.native
}

object PutConformancePackRequest {
  @scala.inline
  def apply(ConformancePackName: ConformancePackName, DeliveryS3Bucket: DeliveryS3Bucket): PutConformancePackRequest = {
    val __obj = js.Dynamic.literal(ConformancePackName = ConformancePackName.asInstanceOf[js.Any], DeliveryS3Bucket = DeliveryS3Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutConformancePackRequest]
  }
  @scala.inline
  implicit class PutConformancePackRequestOps[Self <: PutConformancePackRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

