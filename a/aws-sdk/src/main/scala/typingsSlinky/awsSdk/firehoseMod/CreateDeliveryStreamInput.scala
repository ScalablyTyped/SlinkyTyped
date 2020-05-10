package typingsSlinky.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDeliveryStreamInput extends js.Object {
  /**
    * Used to specify the type and Amazon Resource Name (ARN) of the KMS key needed for Server-Side Encryption (SSE).
    */
  var DeliveryStreamEncryptionConfigurationInput: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.DeliveryStreamEncryptionConfigurationInput] = js.native
  /**
    * The name of the delivery stream. This name must be unique per AWS account in the same AWS Region. If the delivery streams are in different accounts or different Regions, you can have multiple delivery streams with the same name.
    */
  var DeliveryStreamName: typingsSlinky.awsSdk.firehoseMod.DeliveryStreamName = js.native
  /**
    * The delivery stream type. This parameter can be one of the following values:    DirectPut: Provider applications access the delivery stream directly.    KinesisStreamAsSource: The delivery stream uses a Kinesis data stream as a source.  
    */
  var DeliveryStreamType: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.DeliveryStreamType] = js.native
  /**
    * The destination in Amazon ES. You can specify only one destination.
    */
  var ElasticsearchDestinationConfiguration: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.ElasticsearchDestinationConfiguration] = js.native
  /**
    * The destination in Amazon S3. You can specify only one destination.
    */
  var ExtendedS3DestinationConfiguration: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.ExtendedS3DestinationConfiguration] = js.native
  /**
    * When a Kinesis data stream is used as the source for the delivery stream, a KinesisStreamSourceConfiguration containing the Kinesis data stream Amazon Resource Name (ARN) and the role ARN for the source stream.
    */
  var KinesisStreamSourceConfiguration: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.KinesisStreamSourceConfiguration] = js.native
  /**
    * The destination in Amazon Redshift. You can specify only one destination.
    */
  var RedshiftDestinationConfiguration: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.RedshiftDestinationConfiguration] = js.native
  /**
    * [Deprecated] The destination in Amazon S3. You can specify only one destination.
    */
  var S3DestinationConfiguration: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.S3DestinationConfiguration] = js.native
  /**
    * The destination in Splunk. You can specify only one destination.
    */
  var SplunkDestinationConfiguration: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.SplunkDestinationConfiguration] = js.native
  /**
    * A set of tags to assign to the delivery stream. A tag is a key-value pair that you can define and assign to AWS resources. Tags are metadata. For example, you can add friendly names and descriptions or other types of information that can help you distinguish the delivery stream. For more information about tags, see Using Cost Allocation Tags in the AWS Billing and Cost Management User Guide. You can specify up to 50 tags when creating a delivery stream.
    */
  var Tags: js.UndefOr[TagDeliveryStreamInputTagList] = js.native
}

object CreateDeliveryStreamInput {
  @scala.inline
  def apply(DeliveryStreamName: DeliveryStreamName): CreateDeliveryStreamInput = {
    val __obj = js.Dynamic.literal(DeliveryStreamName = DeliveryStreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDeliveryStreamInput]
  }
  @scala.inline
  implicit class CreateDeliveryStreamInputOps[Self <: CreateDeliveryStreamInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeliveryStreamName(value: DeliveryStreamName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeliveryStreamName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeliveryStreamEncryptionConfigurationInput(value: DeliveryStreamEncryptionConfigurationInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeliveryStreamEncryptionConfigurationInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeliveryStreamEncryptionConfigurationInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeliveryStreamEncryptionConfigurationInput")(js.undefined)
        ret
    }
    @scala.inline
    def withDeliveryStreamType(value: DeliveryStreamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeliveryStreamType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeliveryStreamType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeliveryStreamType")(js.undefined)
        ret
    }
    @scala.inline
    def withElasticsearchDestinationConfiguration(value: ElasticsearchDestinationConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElasticsearchDestinationConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElasticsearchDestinationConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElasticsearchDestinationConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withExtendedS3DestinationConfiguration(value: ExtendedS3DestinationConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExtendedS3DestinationConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtendedS3DestinationConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExtendedS3DestinationConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withKinesisStreamSourceConfiguration(value: KinesisStreamSourceConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KinesisStreamSourceConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKinesisStreamSourceConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KinesisStreamSourceConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withRedshiftDestinationConfiguration(value: RedshiftDestinationConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RedshiftDestinationConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedshiftDestinationConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RedshiftDestinationConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withS3DestinationConfiguration(value: S3DestinationConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3DestinationConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3DestinationConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3DestinationConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withSplunkDestinationConfiguration(value: SplunkDestinationConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SplunkDestinationConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSplunkDestinationConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SplunkDestinationConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagDeliveryStreamInputTagList): Self = {
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

