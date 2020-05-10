package typingsSlinky.pulumiAws.inputMod.elasticsearch

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainLogPublishingOption extends js.Object {
  /**
    * ARN of the Cloudwatch log group to which log needs to be published.
    */
  var cloudwatchLogGroupArn: Input[String] = js.native
  /**
    * Specifies whether Amazon Cognito authentication with Kibana is enabled or not
    */
  var enabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * A type of Elasticsearch log. Valid values: INDEX_SLOW_LOGS, SEARCH_SLOW_LOGS, ES_APPLICATION_LOGS
    */
  var logType: Input[String] = js.native
}

object DomainLogPublishingOption {
  @scala.inline
  def apply(cloudwatchLogGroupArn: Input[String], logType: Input[String]): DomainLogPublishingOption = {
    val __obj = js.Dynamic.literal(cloudwatchLogGroupArn = cloudwatchLogGroupArn.asInstanceOf[js.Any], logType = logType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainLogPublishingOption]
  }
  @scala.inline
  implicit class DomainLogPublishingOptionOps[Self <: DomainLogPublishingOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloudwatchLogGroupArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudwatchLogGroupArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnabled(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
  }
  
}

