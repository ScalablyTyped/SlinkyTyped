package typingsSlinky.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestMetricFilterResponse extends js.Object {
  /**
    * The matched events.
    */
  var matches: js.UndefOr[MetricFilterMatches] = js.native
}

object TestMetricFilterResponse {
  @scala.inline
  def apply(): TestMetricFilterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestMetricFilterResponse]
  }
  @scala.inline
  implicit class TestMetricFilterResponseOps[Self <: TestMetricFilterResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMatches(value: MetricFilterMatches): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matches")(js.undefined)
        ret
    }
  }
  
}

