package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChecksListSuitesForRefResponse extends js.Object {
  var check_suites: js.Array[ChecksListSuitesForRefResponseCheckSuitesItem] = js.native
  var total_count: Double = js.native
}

object ChecksListSuitesForRefResponse {
  @scala.inline
  def apply(check_suites: js.Array[ChecksListSuitesForRefResponseCheckSuitesItem], total_count: Double): ChecksListSuitesForRefResponse = {
    val __obj = js.Dynamic.literal(check_suites = check_suites.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksListSuitesForRefResponse]
  }
  @scala.inline
  implicit class ChecksListSuitesForRefResponseOps[Self <: ChecksListSuitesForRefResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheck_suites(value: js.Array[ChecksListSuitesForRefResponseCheckSuitesItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("check_suites")(value.asInstanceOf[js.Any])
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

