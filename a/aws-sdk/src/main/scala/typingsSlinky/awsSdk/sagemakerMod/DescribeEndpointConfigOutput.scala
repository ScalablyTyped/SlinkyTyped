package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEndpointConfigOutput extends js.Object {
  /**
    * A timestamp that shows when the endpoint configuration was created.
    */
  var CreationTime: js.Date = js.native
  var DataCaptureConfig: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.DataCaptureConfig] = js.native
  /**
    * The Amazon Resource Name (ARN) of the endpoint configuration.
    */
  var EndpointConfigArn: typingsSlinky.awsSdk.sagemakerMod.EndpointConfigArn = js.native
  /**
    * Name of the Amazon SageMaker endpoint configuration.
    */
  var EndpointConfigName: typingsSlinky.awsSdk.sagemakerMod.EndpointConfigName = js.native
  /**
    * AWS KMS key ID Amazon SageMaker uses to encrypt data when storing it on the ML storage volume attached to the instance.
    */
  var KmsKeyId: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.KmsKeyId] = js.native
  /**
    * An array of ProductionVariant objects, one for each model that you want to host at this endpoint.
    */
  var ProductionVariants: ProductionVariantList = js.native
}

object DescribeEndpointConfigOutput {
  @scala.inline
  def apply(
    CreationTime: js.Date,
    EndpointConfigArn: EndpointConfigArn,
    EndpointConfigName: EndpointConfigName,
    ProductionVariants: ProductionVariantList
  ): DescribeEndpointConfigOutput = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], EndpointConfigArn = EndpointConfigArn.asInstanceOf[js.Any], EndpointConfigName = EndpointConfigName.asInstanceOf[js.Any], ProductionVariants = ProductionVariants.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEndpointConfigOutput]
  }
  @scala.inline
  implicit class DescribeEndpointConfigOutputOps[Self <: DescribeEndpointConfigOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndpointConfigArn(value: EndpointConfigArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointConfigArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndpointConfigName(value: EndpointConfigName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointConfigName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProductionVariants(value: ProductionVariantList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductionVariants")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataCaptureConfig(value: DataCaptureConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataCaptureConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataCaptureConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataCaptureConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withKmsKeyId(value: KmsKeyId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KmsKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKmsKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KmsKeyId")(js.undefined)
        ret
    }
  }
  
}

