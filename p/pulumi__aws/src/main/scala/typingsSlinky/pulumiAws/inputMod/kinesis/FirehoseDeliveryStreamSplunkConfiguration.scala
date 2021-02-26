package typingsSlinky.pulumiAws.inputMod.kinesis

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirehoseDeliveryStreamSplunkConfiguration extends StObject {
  
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
  implicit class FirehoseDeliveryStreamSplunkConfigurationMutableBuilder[Self <: FirehoseDeliveryStreamSplunkConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudwatchLoggingOptions(value: Input[FirehoseDeliveryStreamSplunkConfigurationCloudwatchLoggingOptions]): Self = StObject.set(x, "cloudwatchLoggingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudwatchLoggingOptionsUndefined: Self = StObject.set(x, "cloudwatchLoggingOptions", js.undefined)
    
    @scala.inline
    def setHecAcknowledgmentTimeout(value: Input[Double]): Self = StObject.set(x, "hecAcknowledgmentTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHecAcknowledgmentTimeoutUndefined: Self = StObject.set(x, "hecAcknowledgmentTimeout", js.undefined)
    
    @scala.inline
    def setHecEndpoint(value: Input[String]): Self = StObject.set(x, "hecEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHecEndpointType(value: Input[String]): Self = StObject.set(x, "hecEndpointType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHecEndpointTypeUndefined: Self = StObject.set(x, "hecEndpointType", js.undefined)
    
    @scala.inline
    def setHecToken(value: Input[String]): Self = StObject.set(x, "hecToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingConfiguration(value: Input[FirehoseDeliveryStreamSplunkConfigurationProcessingConfiguration]): Self = StObject.set(x, "processingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingConfigurationUndefined: Self = StObject.set(x, "processingConfiguration", js.undefined)
    
    @scala.inline
    def setRetryDuration(value: Input[Double]): Self = StObject.set(x, "retryDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryDurationUndefined: Self = StObject.set(x, "retryDuration", js.undefined)
    
    @scala.inline
    def setS3BackupMode(value: Input[String]): Self = StObject.set(x, "s3BackupMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BackupModeUndefined: Self = StObject.set(x, "s3BackupMode", js.undefined)
  }
}
