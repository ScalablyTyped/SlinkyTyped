package typingsSlinky.pulumiAws.inputMod.kinesis

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirehoseDeliveryStreamExtendedS3Configuration extends js.Object {
  /**
    * The ARN of the S3 bucket
    */
  var bucketArn: Input[String] = js.native
  /**
    * Buffer incoming data for the specified period of time, in seconds, before delivering it to the destination. The default value is 300.
    */
  var bufferInterval: js.UndefOr[Input[Double]] = js.native
  /**
    * Buffer incoming data to the specified size, in MBs, before delivering it to the destination. The default value is 5.
    * We recommend setting SizeInMBs to a value greater than the amount of data you typically ingest into the delivery stream in 10 seconds. For example, if you typically ingest data at 1 MB/sec set SizeInMBs to be 10 MB or higher.
    */
  var bufferSize: js.UndefOr[Input[Double]] = js.native
  /**
    * The CloudWatch Logging Options for the delivery stream. More details are given below.
    */
  var cloudwatchLoggingOptions: js.UndefOr[Input[FirehoseDeliveryStreamExtendedS3ConfigurationCloudwatchLoggingOptions]] = js.native
  /**
    * The compression format. If no value is specified, the default is UNCOMPRESSED. Other supported values are GZIP, ZIP & Snappy. If the destination is redshift you cannot use ZIP or Snappy.
    */
  var compressionFormat: js.UndefOr[Input[String]] = js.native
  /**
    * Nested argument for the serializer, deserializer, and schema for converting data from the JSON format to the Parquet or ORC format before writing it to Amazon S3. More details given below.
    */
  var dataFormatConversionConfiguration: js.UndefOr[
    Input[FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfiguration]
  ] = js.native
  /**
    * Prefix added to failed records before writing them to S3. This prefix appears immediately following the bucket name.
    */
  var errorOutputPrefix: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies the KMS key ARN the stream will use to encrypt data. If not set, no encryption will
    * be used.
    */
  var kmsKeyArn: js.UndefOr[Input[String]] = js.native
  /**
    * The "YYYY/MM/DD/HH" time format prefix is automatically used for delivered S3 files. You can specify an extra prefix to be added in front of the time format prefix. Note that if the prefix ends with a slash, it appears as a folder in the S3 bucket
    */
  var prefix: js.UndefOr[Input[String]] = js.native
  /**
    * The data processing configuration.  More details are given below.
    */
  var processingConfiguration: js.UndefOr[Input[FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfiguration]] = js.native
  /**
    * The role that Kinesis Data Firehose can use to access AWS Glue. This role must be in the same account you use for Kinesis Data Firehose. Cross-account roles aren't allowed.
    */
  var roleArn: Input[String] = js.native
  /**
    * The configuration for backup in Amazon S3. Required if `s3BackupMode` is `Enabled`. Supports the same fields as `s3Configuration` object.
    */
  var s3BackupConfiguration: js.UndefOr[Input[FirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfiguration]] = js.native
  /**
    * Defines how documents should be delivered to Amazon S3.  Valid values are `FailedEventsOnly` and `AllEvents`.  Default value is `FailedEventsOnly`.
    */
  var s3BackupMode: js.UndefOr[Input[String]] = js.native
}

object FirehoseDeliveryStreamExtendedS3Configuration {
  @scala.inline
  def apply(bucketArn: Input[String], roleArn: Input[String]): FirehoseDeliveryStreamExtendedS3Configuration = {
    val __obj = js.Dynamic.literal(bucketArn = bucketArn.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseDeliveryStreamExtendedS3Configuration]
  }
  @scala.inline
  implicit class FirehoseDeliveryStreamExtendedS3ConfigurationOps[Self <: FirehoseDeliveryStreamExtendedS3Configuration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucketArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoleArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBufferInterval(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBufferInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withBufferSize(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBufferSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferSize")(js.undefined)
        ret
    }
    @scala.inline
    def withCloudwatchLoggingOptions(value: Input[FirehoseDeliveryStreamExtendedS3ConfigurationCloudwatchLoggingOptions]): Self = {
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
    def withCompressionFormat(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compressionFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompressionFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compressionFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withDataFormatConversionConfiguration(value: Input[FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataFormatConversionConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataFormatConversionConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataFormatConversionConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorOutputPrefix(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorOutputPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorOutputPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorOutputPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withKmsKeyArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kmsKeyArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKmsKeyArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kmsKeyArn")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefix(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessingConfiguration(value: Input[FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfiguration]): Self = {
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
    def withS3BackupConfiguration(value: Input[FirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3BackupConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3BackupConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3BackupConfiguration")(js.undefined)
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
  }
  
}

