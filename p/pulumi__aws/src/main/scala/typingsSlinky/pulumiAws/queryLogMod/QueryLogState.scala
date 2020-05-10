package typingsSlinky.pulumiAws.queryLogMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryLogState extends js.Object {
  /**
    * CloudWatch log group ARN to send query logs.
    */
  val cloudwatchLogGroupArn: js.UndefOr[Input[String]] = js.native
  /**
    * Route53 hosted zone ID to enable query logs.
    */
  val zoneId: js.UndefOr[Input[String]] = js.native
}

object QueryLogState {
  @scala.inline
  def apply(): QueryLogState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryLogState]
  }
  @scala.inline
  implicit class QueryLogStateOps[Self <: QueryLogState] (val x: Self) extends AnyVal {
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
    def withoutCloudwatchLogGroupArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudwatchLogGroupArn")(js.undefined)
        ret
    }
    @scala.inline
    def withZoneId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoneId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoneId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoneId")(js.undefined)
        ret
    }
  }
  
}

