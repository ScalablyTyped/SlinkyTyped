package typingsSlinky.pulumiAws.inputMod.kinesis

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirehoseDeliveryStreamSplunkConfiguration extends js.Object {
  /**
    * The CloudWatch Logging Options for the delivery stream. More details are given below.
    */
  var cloudwatchLoggingOptions: js.UndefOr[Input[FirehoseDeliveryStreamSplunkConfigurationCloudwatchLoggingOptions]] = js.native
  /**
    * The amount of time, in seconds between 180 and 600, that Kinesis Firehose waits to receive an acknowledgment from Splunk after it sends it data.
    */
  var hecAcknowledgmentTimeout: js.UndefOr[Input[Double]] = js.native
  /**
    * The HTTP Event Collector (HEC) endpoint to which Kinesis Firehose sends your data.
    */
  var hecEndpoint: Input[String] = js.native
  /**
    * The HEC endpoint type. Valid values are `Raw` or `Event`. The default value is `Raw`.
    */
  var hecEndpointType: js.UndefOr[Input[String]] = js.native
  /**
    * The GUID that you obtain from your Splunk cluster when you create a new HEC endpoint.
    */
  var hecToken: Input[String] = js.native
  /**
    * The data processing configuration.  More details are given below.
    */
  var processingConfiguration: js.UndefOr[Input[FirehoseDeliveryStreamSplunkConfigurationProcessingConfiguration]] = js.native
  /**
    * After an initial failure to deliver to Splunk, the total amount of time, in seconds between 0 to 7200, during which Firehose re-attempts delivery (including the first attempt).  After this time has elapsed, the failed documents are written to Amazon S3.  The default value is 300s.  There will be no retry if the value is 0.
    */
  var retryDuration: js.UndefOr[Input[Double]] = js.native
  /**
    * Defines how documents should be delivered to Amazon S3.  Valid values are `FailedEventsOnly` and `AllEvents`.  Default value is `FailedEventsOnly`.
    */
  var s3BackupMode: js.UndefOr[Input[String]] = js.native
}

object FirehoseDeliveryStreamSplunkConfiguration {
  @scala.inline
  def apply(hecEndpoint: Input[String], hecToken: Input[String]): FirehoseDeliveryStreamSplunkConfiguration = {
    val __obj = js.Dynamic.literal(hecEndpoint = hecEndpoint.asInstanceOf[js.Any], hecToken = hecToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseDeliveryStreamSplunkConfiguration]
  }
  @scala.inline
  implicit class FirehoseDeliveryStreamSplunkConfigurationOps[Self <: FirehoseDeliveryStreamSplunkConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHecEndpoint(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hecEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHecToken(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hecToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCloudwatchLoggingOptions(value: Input[FirehoseDeliveryStreamSplunkConfigurationCloudwatchLoggingOptions]): Self = {
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
    def withHecAcknowledgmentTimeout(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hecAcknowledgmentTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHecAcknowledgmentTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hecAcknowledgmentTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withHecEndpointType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hecEndpointType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHecEndpointType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hecEndpointType")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessingConfiguration(value: Input[FirehoseDeliveryStreamSplunkConfigurationProcessingConfiguration]): Self = {
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
  }
  
}

