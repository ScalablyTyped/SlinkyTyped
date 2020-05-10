package typingsSlinky.newman.mod

import typingsSlinky.newman.AnonAssertions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewmanRun extends js.Object {
  var executions: js.Array[NewmanRunExecution] = js.native
  var failures: js.Array[NewmanRunFailure] = js.native
  var stats: AnonAssertions = js.native
}

object NewmanRun {
  @scala.inline
  def apply(
    executions: js.Array[NewmanRunExecution],
    failures: js.Array[NewmanRunFailure],
    stats: AnonAssertions
  ): NewmanRun = {
    val __obj = js.Dynamic.literal(executions = executions.asInstanceOf[js.Any], failures = failures.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewmanRun]
  }
  @scala.inline
  implicit class NewmanRunOps[Self <: NewmanRun] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExecutions(value: js.Array[NewmanRunExecution]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailures(value: js.Array[NewmanRunFailure]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStats(value: AnonAssertions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stats")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

