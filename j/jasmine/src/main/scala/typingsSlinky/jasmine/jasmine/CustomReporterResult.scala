package typingsSlinky.jasmine.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomReporterResult extends js.Object {
  var description: String = js.native
  var failedExpectations: js.UndefOr[js.Array[FailedExpectation]] = js.native
  var fullName: String = js.native
  var id: String = js.native
  var passedExpectations: js.UndefOr[js.Array[PassedExpectation]] = js.native
  var pendingReason: js.UndefOr[String] = js.native
  var status: js.UndefOr[String] = js.native
}

object CustomReporterResult {
  @scala.inline
  def apply(description: String, fullName: String, id: String): CustomReporterResult = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomReporterResult]
  }
  @scala.inline
  implicit class CustomReporterResultOps[Self <: CustomReporterResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailedExpectations(value: js.Array[FailedExpectation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failedExpectations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailedExpectations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failedExpectations")(js.undefined)
        ret
    }
    @scala.inline
    def withPassedExpectations(value: js.Array[PassedExpectation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passedExpectations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassedExpectations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passedExpectations")(js.undefined)
        ret
    }
    @scala.inline
    def withPendingReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pendingReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPendingReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pendingReason")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

