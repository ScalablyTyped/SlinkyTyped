package typingsSlinky.pulumiAws.inputMod.kinesis

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirehoseDeliveryStreamElasticsearchConfiguration extends js.Object {
  /**
    * Buffer incoming data for the specified period of time, in seconds between 60 to 900, before delivering it to the destination.  The default value is 300s.
    */
  var bufferingInterval: js.UndefOr[Input[Double]] = js.native
  /**
    * Buffer incoming data to the specified size, in MBs between 1 to 100, before delivering it to the destination.  The default value is 5MB.
    */
  var bufferingSize: js.UndefOr[Input[Double]] = js.native
  /**
    * The CloudWatch Logging Options for the delivery stream. More details are given below.
    */
  var cloudwatchLoggingOptions: js.UndefOr[Input[FirehoseDeliveryStreamElasticsearchConfigurationCloudwatchLoggingOptions]] = js.native
  /**
    * The ARN of the Amazon ES domain.  The IAM role must have permission for `DescribeElasticsearchDomain`, `DescribeElasticsearchDomains`, and `DescribeElasticsearchDomainConfig` after assuming `RoleARN`.  The pattern needs to be `arn:.*`.
    */
  var domainArn: Input[String] = js.native
  /**
    * The Elasticsearch index name.
    */
  var indexName: Input[String] = js.native
  /**
    * The Elasticsearch index rotation period.  Index rotation appends a timestamp to the IndexName to facilitate expiration of old data.  Valid values are `NoRotation`, `OneHour`, `OneDay`, `OneWeek`, and `OneMonth`.  The default value is `OneDay`.
    */
  var indexRotationPeriod: js.UndefOr[Input[String]] = js.native
  /**
    * The data processing configuration.  More details are given below.
    */
  var processingConfiguration: js.UndefOr[Input[FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfiguration]] = js.native
  /**
    * After an initial failure to deliver to Splunk, the total amount of time, in seconds between 0 to 7200, during which Firehose re-attempts delivery (including the first attempt).  After this time has elapsed, the failed documents are written to Amazon S3.  The default value is 300s.  There will be no retry if the value is 0.
    */
  var retryDuration: js.UndefOr[Input[Double]] = js.native
  /**
    * The role that Kinesis Data Firehose can use to access AWS Glue. This role must be in the same account you use for Kinesis Data Firehose. Cross-account roles aren't allowed.
    */
  var roleArn: Input[String] = js.native
  /**
    * Defines how documents should be delivered to Amazon S3.  Valid values are `FailedEventsOnly` and `AllEvents`.  Default value is `FailedEventsOnly`.
    */
  var s3BackupMode: js.UndefOr[Input[String]] = js.native
  /**
    * The Elasticsearch type name with maximum length of 100 characters.
    */
  var typeName: js.UndefOr[Input[String]] = js.native
}

object FirehoseDeliveryStreamElasticsearchConfiguration {
  @scala.inline
  def apply(domainArn: Input[String], indexName: Input[String], roleArn: Input[String]): FirehoseDeliveryStreamElasticsearchConfiguration = {
    val __obj = js.Dynamic.literal(domainArn = domainArn.asInstanceOf[js.Any], indexName = indexName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseDeliveryStreamElasticsearchConfiguration]
  }
  @scala.inline
  implicit class FirehoseDeliveryStreamElasticsearchConfigurationOps[Self <: FirehoseDeliveryStreamElasticsearchConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomainArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndexName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoleArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBufferingInterval(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferingInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBufferingInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferingInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withBufferingSize(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferingSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBufferingSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferingSize")(js.undefined)
        ret
    }
    @scala.inline
    def withCloudwatchLoggingOptions(value: Input[FirehoseDeliveryStreamElasticsearchConfigurationCloudwatchLoggingOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudwatchLoggingOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudwatchLoggingOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudwatchLoggingOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexRotationPeriod(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexRotationPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexRotationPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexRotationPeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessingConfiguration(value: Input[FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processingConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessingConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processingConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withRetryDuration(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetryDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withS3BackupMode(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3BackupMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3BackupMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3BackupMode")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeName")(js.undefined)
        ret
    }
  }
  
}

