package typingsSlinky.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoggingConfiguration extends js.Object {
  /**
    * An array of Amazon Kinesis Data Firehose ARNs.
    */
  var LogDestinationConfigs: typingsSlinky.awsSdk.wafMod.LogDestinationConfigs = js.native
  /**
    * The parts of the request that you want redacted from the logs. For example, if you redact the cookie field, the cookie field in the firehose will be xxx. 
    */
  var RedactedFields: js.UndefOr[typingsSlinky.awsSdk.wafMod.RedactedFields] = js.native
  /**
    * The Amazon Resource Name (ARN) of the web ACL that you want to associate with LogDestinationConfigs.
    */
  var ResourceArn: typingsSlinky.awsSdk.wafMod.ResourceArn = js.native
}

object LoggingConfiguration {
  @scala.inline
  def apply(LogDestinationConfigs: LogDestinationConfigs, ResourceArn: ResourceArn): LoggingConfiguration = {
    val __obj = js.Dynamic.literal(LogDestinationConfigs = LogDestinationConfigs.asInstanceOf[js.Any], ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggingConfiguration]
  }
  @scala.inline
  implicit class LoggingConfigurationOps[Self <: LoggingConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLogDestinationConfigs(value: LogDestinationConfigs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogDestinationConfigs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceArn(value: ResourceArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRedactedFields(value: RedactedFields): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RedactedFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedactedFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RedactedFields")(js.undefined)
        ret
    }
  }
  
}

