package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChecksListForSuiteResponse extends js.Object {
  var check_runs: js.Array[ChecksListForSuiteResponseCheckRunsItem] = js.native
  var total_count: Double = js.native
}

object ChecksListForSuiteResponse {
  @scala.inline
  def apply(check_runs: js.Array[ChecksListForSuiteResponseCheckRunsItem], total_count: Double): ChecksListForSuiteResponse = {
    val __obj = js.Dynamic.literal(check_runs = check_runs.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksListForSuiteResponse]
  }
  @scala.inline
  implicit class ChecksListForSuiteResponseOps[Self <: ChecksListForSuiteResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheck_runs(value: js.Array[ChecksListForSuiteResponseCheckRunsItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("check_runs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_count")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

