package typingsSlinky.jestTestResult.typesMod

import typingsSlinky.jestTestResult.jestTestResultStrings.failed
import typingsSlinky.jestTestResult.jestTestResultStrings.passed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormattedTestResult extends js.Object {
  var assertionResults: js.Array[FormattedAssertionResult] = js.native
  var coverage: js.Any = js.native
  var endTime: Double = js.native
  var message: String = js.native
  var name: String = js.native
  var startTime: Double = js.native
  var status: failed | passed = js.native
  var summary: String = js.native
}

object FormattedTestResult {
  @scala.inline
  def apply(
    assertionResults: js.Array[FormattedAssertionResult],
    coverage: js.Any,
    endTime: Double,
    message: String,
    name: String,
    startTime: Double,
    status: failed | passed,
    summary: String
  ): FormattedTestResult = {
    val __obj = js.Dynamic.literal(assertionResults = assertionResults.asInstanceOf[js.Any], coverage = coverage.asInstanceOf[js.Any], endTime = endTime.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormattedTestResult]
  }
  @scala.inline
  implicit class FormattedTestResultOps[Self <: FormattedTestResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssertionResults(value: js.Array[FormattedAssertionResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assertionResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCoverage(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: failed | passed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSummary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

