package typingsSlinky.pulumiAws.outputMod.appsync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLApiLogConfig extends js.Object {
  /**
    * Amazon Resource Name of the service role that AWS AppSync will assume to publish to Amazon CloudWatch logs in your account.
    */
  var cloudwatchLogsRoleArn: String = js.native
  /**
    * Field logging level. Valid values: `ALL`, `ERROR`, `NONE`.
    */
  var fieldLogLevel: String = js.native
}

object GraphQLApiLogConfig {
  @scala.inline
  def apply(cloudwatchLogsRoleArn: String, fieldLogLevel: String): GraphQLApiLogConfig = {
    val __obj = js.Dynamic.literal(cloudwatchLogsRoleArn = cloudwatchLogsRoleArn.asInstanceOf[js.Any], fieldLogLevel = fieldLogLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLApiLogConfig]
  }
  @scala.inline
  implicit class GraphQLApiLogConfigOps[Self <: GraphQLApiLogConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloudwatchLogsRoleArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudwatchLogsRoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFieldLogLevel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldLogLevel")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

