package typingsSlinky.pulumiAws.firehoseDeliveryStreamMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamElasticsearchConfiguration
import typingsSlinky.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamExtendedS3Configuration
import typingsSlinky.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamKinesisSourceConfiguration
import typingsSlinky.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamRedshiftConfiguration
import typingsSlinky.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamS3Configuration
import typingsSlinky.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamServerSideEncryption
import typingsSlinky.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamSplunkConfiguration
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirehoseDeliveryStreamState extends js.Object {
  /**
    * The Amazon Resource Name (ARN) specifying the Stream
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * This is the destination to where the data is delivered. The only options are `s3` (Deprecated, use `extendedS3` instead), `extendedS3`, `redshift`, `elasticsearch`, and `splunk`.
    */
  val destination: js.UndefOr[Input[String]] = js.native
  val destinationId: js.UndefOr[Input[String]] = js.native
  /**
    * Configuration options if elasticsearch is the destination. More details are given below.
    */
  val elasticsearchConfiguration: js.UndefOr[Input[FirehoseDeliveryStreamElasticsearchConfiguration]] = js.native
  /**
    * Enhanced configuration options for the s3 destination. More details are given below.
    */
  val extendedS3Configuration: js.UndefOr[Input[FirehoseDeliveryStreamExtendedS3Configuration]] = js.native
  /**
    * Allows the ability to specify the kinesis stream that is used as the source of the firehose delivery stream.
    */
  val kinesisSourceConfiguration: js.UndefOr[Input[FirehoseDeliveryStreamKinesisSourceConfiguration]] = js.native
  /**
    * A name to identify the stream. This is unique to the
    * AWS account and region the Stream is created in.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Configuration options if redshift is the destination.
    * Using `redshiftConfiguration` requires the user to also specify a
    * `s3Configuration` block. More details are given below.
    */
  val redshiftConfiguration: js.UndefOr[Input[FirehoseDeliveryStreamRedshiftConfiguration]] = js.native
  /**
    * Required for non-S3 destinations. For S3 destination, use `extendedS3Configuration` instead. Configuration options for the s3 destination (or the intermediate bucket if the destination
    * is redshift). More details are given below.
    */
  val s3Configuration: js.UndefOr[Input[FirehoseDeliveryStreamS3Configuration]] = js.native
  /**
    * Encrypt at rest options.
    * Server-side encryption should not be enabled when a kinesis stream is configured as the source of the firehose delivery stream.
    */
  val serverSideEncryption: js.UndefOr[Input[FirehoseDeliveryStreamServerSideEncryption]] = js.native
  val splunkConfiguration: js.UndefOr[Input[FirehoseDeliveryStreamSplunkConfiguration]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * Specifies the table version for the output data schema. Defaults to `LATEST`.
    */
  val versionId: js.UndefOr[Input[String]] = js.native
}

object FirehoseDeliveryStreamState {
  @scala.inline
  def apply(): FirehoseDeliveryStreamState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirehoseDeliveryStreamState]
  }
  @scala.inline
  implicit class FirehoseDeliveryStreamStateOps[Self <: FirehoseDeliveryStreamState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withDestination(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(js.undefined)
        ret
    }
    @scala.inline
    def withDestinationId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationId")(js.undefined)
        ret
    }
    @scala.inline
    def withElasticsearchConfiguration(value: Input[FirehoseDeliveryStreamElasticsearchConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elasticsearchConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElasticsearchConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elasticsearchConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withExtendedS3Configuration(value: Input[FirehoseDeliveryStreamExtendedS3Configuration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendedS3Configuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtendedS3Configuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendedS3Configuration")(js.undefined)
        ret
    }
    @scala.inline
    def withKinesisSourceConfiguration(value: Input[FirehoseDeliveryStreamKinesisSourceConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kinesisSourceConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKinesisSourceConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kinesisSourceConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withRedshiftConfiguration(value: Input[FirehoseDeliveryStreamRedshiftConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redshiftConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedshiftConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redshiftConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withS3Configuration(value: Input[FirehoseDeliveryStreamS3Configuration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3Configuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3Configuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3Configuration")(js.undefined)
        ret
    }
    @scala.inline
    def withServerSideEncryption(value: Input[FirehoseDeliveryStreamServerSideEncryption]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverSideEncryption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerSideEncryption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverSideEncryption")(js.undefined)
        ret
    }
    @scala.inline
    def withSplunkConfiguration(value: Input[FirehoseDeliveryStreamSplunkConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splunkConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSplunkConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splunkConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
    @scala.inline
    def withVersionId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionId")(js.undefined)
        ret
    }
  }
  
}

