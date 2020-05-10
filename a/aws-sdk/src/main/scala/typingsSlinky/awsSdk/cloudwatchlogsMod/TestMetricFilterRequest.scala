package typingsSlinky.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestMetricFilterRequest extends js.Object {
  var filterPattern: FilterPattern = js.native
  /**
    * The log event messages to test.
    */
  var logEventMessages: TestEventMessages = js.native
}

object TestMetricFilterRequest {
  @scala.inline
  def apply(filterPattern: FilterPattern, logEventMessages: TestEventMessages): TestMetricFilterRequest = {
    val __obj = js.Dynamic.literal(filterPattern = filterPattern.asInstanceOf[js.Any], logEventMessages = logEventMessages.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestMetricFilterRequest]
  }
  @scala.inline
  implicit class TestMetricFilterRequestOps[Self <: TestMetricFilterRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilterPattern(value: FilterPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogEventMessages(value: TestEventMessages): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logEventMessages")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

