package typingsSlinky.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SplunkDestinationUpdate extends js.Object {
  /**
    * The Amazon CloudWatch logging options for your delivery stream.
    */
  var CloudWatchLoggingOptions: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.CloudWatchLoggingOptions] = js.native
  /**
    * The amount of time that Kinesis Data Firehose waits to receive an acknowledgment from Splunk after it sends data. At the end of the timeout period, Kinesis Data Firehose either tries to send the data again or considers it an error, based on your retry settings.
    */
  var HECAcknowledgmentTimeoutInSeconds: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.HECAcknowledgmentTimeoutInSeconds] = js.native
  /**
    * The HTTP Event Collector (HEC) endpoint to which Kinesis Data Firehose sends your data.
    */
  var HECEndpoint: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.HECEndpoint] = js.native
  /**
    * This type can be either "Raw" or "Event."
    */
  var HECEndpointType: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.HECEndpointType] = js.native
  /**
    * A GUID that you obtain from your Splunk cluster when you create a new HEC endpoint.
    */
  var HECToken: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.HECToken] = js.native
  /**
    * The data processing configuration.
    */
  var ProcessingConfiguration: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.ProcessingConfiguration] = js.native
  /**
    * The retry behavior in case Kinesis Data Firehose is unable to deliver data to Splunk or if it doesn't receive an acknowledgment of receipt from Splunk.
    */
  var RetryOptions: js.UndefOr[SplunkRetryOptions] = js.native
  /**
    * Defines how documents should be delivered to Amazon S3. When set to FailedDocumentsOnly, Kinesis Data Firehose writes any data that could not be indexed to the configured Amazon S3 destination. When set to AllDocuments, Kinesis Data Firehose delivers all incoming records to Amazon S3, and also writes failed documents to Amazon S3. Default value is FailedDocumentsOnly. 
    */
  var S3BackupMode: js.UndefOr[SplunkS3BackupMode] = js.native
  /**
    * Your update to the configuration of the backup Amazon S3 location.
    */
  var S3Update: js.UndefOr[S3DestinationUpdate] = js.native
}

object SplunkDestinationUpdate {
  @scala.inline
  def apply(): SplunkDestinationUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SplunkDestinationUpdate]
  }
  @scala.inline
  implicit class SplunkDestinationUpdateOps[Self <: SplunkDestinationUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloudWatchLoggingOptions(value: CloudWatchLoggingOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudWatchLoggingOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudWatchLoggingOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudWatchLoggingOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withHECAcknowledgmentTimeoutInSeconds(value: HECAcknowledgmentTimeoutInSeconds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HECAcknowledgmentTimeoutInSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHECAcknowledgmentTimeoutInSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HECAcknowledgmentTimeoutInSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withHECEndpoint(value: HECEndpoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HECEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHECEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HECEndpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withHECEndpointType(value: HECEndpointType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HECEndpointType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHECEndpointType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HECEndpointType")(js.undefined)
        ret
    }
    @scala.inline
    def withHECToken(value: HECToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HECToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHECToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HECToken")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessingConfiguration(value: ProcessingConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProcessingConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessingConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProcessingConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withRetryOptions(value: SplunkRetryOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RetryOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetryOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RetryOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withS3BackupMode(value: SplunkS3BackupMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3BackupMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3BackupMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3BackupMode")(js.undefined)
        ret
    }
    @scala.inline
    def withS3Update(value: S3DestinationUpdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Update")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3Update: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Update")(js.undefined)
        ret
    }
  }
  
}

