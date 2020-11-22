package typingsSlinky.pulumiAws.inputMod.networkfirewall

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoggingConfigurationLoggingConfigurationLogDestinationConfig extends js.Object {
  
  /**
    * A map describing the logging destination for the chosen `logDestinationType`.
    * * For an Amazon S3 bucket, specify the key `bucketName` with the URL of the bucket and optionally specify the key `prefix` with a path.
    * * For a CloudWatch log group, specify the key `logGroup` with the Amazon Resource Name (ARN) of the CloudWatch log group.
    * * For a Kinesis Data Firehose delivery stream, specify the key `deliveryStream` with the Amazon Resource Name (ARN) of the delivery stream.
    */
  var logDestination: Input[StringDictionary[Input[String]]] = js.native
  
  /**
    * The location to send logs to. Valid values: `S3`, `CloudWatchLogs`, `KinesisDataFirehose`.
    */
  var logDestinationType: Input[String] = js.native
  
  /**
    * The type of log to send. Valid values: `ALERT` or `FLOW`. Alert logs report traffic that matches a `StatefulRule` with an action setting that sends a log message. Flow logs are standard network traffic flow logs.
    */
  var logType: Input[String] = js.native
}
object LoggingConfigurationLoggingConfigurationLogDestinationConfig {
  
  @scala.inline
  def apply(
    logDestination: Input[StringDictionary[Input[String]]],
    logDestinationType: Input[String],
    logType: Input[String]
  ): LoggingConfigurationLoggingConfigurationLogDestinationConfig = {
    val __obj = js.Dynamic.literal(logDestination = logDestination.asInstanceOf[js.Any], logDestinationType = logDestinationType.asInstanceOf[js.Any], logType = logType.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggingConfigurationLoggingConfigurationLogDestinationConfig]
  }
  
  @scala.inline
  implicit class LoggingConfigurationLoggingConfigurationLogDestinationConfigOps[Self <: LoggingConfigurationLoggingConfigurationLogDestinationConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLogDestination(value: Input[StringDictionary[Input[String]]]): Self = this.set("logDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogDestinationType(value: Input[String]): Self = this.set("logDestinationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogType(value: Input[String]): Self = this.set("logType", value.asInstanceOf[js.Any])
  }
}
