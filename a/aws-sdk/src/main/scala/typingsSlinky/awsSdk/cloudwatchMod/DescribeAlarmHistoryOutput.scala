package typingsSlinky.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAlarmHistoryOutput extends js.Object {
  /**
    * The alarm histories, in JSON format.
    */
  var AlarmHistoryItems: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.AlarmHistoryItems] = js.native
  /**
    * The token that marks the start of the next batch of returned results.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.NextToken] = js.native
}

object DescribeAlarmHistoryOutput {
  @scala.inline
  def apply(): DescribeAlarmHistoryOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAlarmHistoryOutput]
  }
  @scala.inline
  implicit class DescribeAlarmHistoryOutputOps[Self <: DescribeAlarmHistoryOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlarmHistoryItems(value: AlarmHistoryItems): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlarmHistoryItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlarmHistoryItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlarmHistoryItems")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
  }
  
}

