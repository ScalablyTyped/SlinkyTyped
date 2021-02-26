package typingsSlinky.awsSdk.firehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SplunkDestinationDescription extends StObject {
  
  /**
    * The Amazon CloudWatch logging options for your delivery stream.
    */
  var CloudWatchLoggingOptions: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.CloudWatchLoggingOptions] = js.native
  
  /**
    * The amount of time that Kinesis Data Firehose waits to receive an acknowledgment from Splunk after it sends it data. At the end of the timeout period, Kinesis Data Firehose either tries to send the data again or considers it an error, based on your retry settings.
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
    * A GUID you obtain from your Splunk cluster when you create a new HEC endpoint.
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
    * The Amazon S3 destination.&gt;
    */
  var S3DestinationDescription: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.S3DestinationDescription] = js.native
}
object SplunkDestinationDescription {
  
  @scala.inline
  def apply(): SplunkDestinationDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SplunkDestinationDescription]
  }
  
  @scala.inline
  implicit class SplunkDestinationDescriptionMutableBuilder[Self <: SplunkDestinationDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudWatchLoggingOptions(value: CloudWatchLoggingOptions): Self = StObject.set(x, "CloudWatchLoggingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudWatchLoggingOptionsUndefined: Self = StObject.set(x, "CloudWatchLoggingOptions", js.undefined)
    
    @scala.inline
    def setHECAcknowledgmentTimeoutInSeconds(value: HECAcknowledgmentTimeoutInSeconds): Self = StObject.set(x, "HECAcknowledgmentTimeoutInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHECAcknowledgmentTimeoutInSecondsUndefined: Self = StObject.set(x, "HECAcknowledgmentTimeoutInSeconds", js.undefined)
    
    @scala.inline
    def setHECEndpoint(value: HECEndpoint): Self = StObject.set(x, "HECEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHECEndpointType(value: HECEndpointType): Self = StObject.set(x, "HECEndpointType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHECEndpointTypeUndefined: Self = StObject.set(x, "HECEndpointType", js.undefined)
    
    @scala.inline
    def setHECEndpointUndefined: Self = StObject.set(x, "HECEndpoint", js.undefined)
    
    @scala.inline
    def setHECToken(value: HECToken): Self = StObject.set(x, "HECToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHECTokenUndefined: Self = StObject.set(x, "HECToken", js.undefined)
    
    @scala.inline
    def setProcessingConfiguration(value: ProcessingConfiguration): Self = StObject.set(x, "ProcessingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingConfigurationUndefined: Self = StObject.set(x, "ProcessingConfiguration", js.undefined)
    
    @scala.inline
    def setRetryOptions(value: SplunkRetryOptions): Self = StObject.set(x, "RetryOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryOptionsUndefined: Self = StObject.set(x, "RetryOptions", js.undefined)
    
    @scala.inline
    def setS3BackupMode(value: SplunkS3BackupMode): Self = StObject.set(x, "S3BackupMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BackupModeUndefined: Self = StObject.set(x, "S3BackupMode", js.undefined)
    
    @scala.inline
    def setS3DestinationDescription(value: S3DestinationDescription): Self = StObject.set(x, "S3DestinationDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3DestinationDescriptionUndefined: Self = StObject.set(x, "S3DestinationDescription", js.undefined)
  }
}
