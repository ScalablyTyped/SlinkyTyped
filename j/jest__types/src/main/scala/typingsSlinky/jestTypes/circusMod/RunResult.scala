package typingsSlinky.jestTypes.circusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RunResult extends js.Object {
  var testResults: TestResults = js.native
  var unhandledErrors: js.Array[FormattedError] = js.native
}

object RunResult {
  @scala.inline
  def apply(testResults: TestResults, unhandledErrors: js.Array[FormattedError]): RunResult = {
    val __obj = js.Dynamic.literal(testResults = testResults.asInstanceOf[js.Any], unhandledErrors = unhandledErrors.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunResult]
  }
  @scala.inline
  implicit class RunResultOps[Self <: RunResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTestResults(value: TestResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnhandledErrors(value: js.Array[FormattedError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unhandledErrors")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

