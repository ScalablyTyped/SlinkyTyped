package typingsSlinky.protractor.taskRunnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RunResults extends js.Object {
  var capabilities: js.Any = js.native
  var exitCode: Double = js.native
  var failedCount: Double = js.native
  var specResults: js.Array[_] = js.native
  var specs: js.Array[String] = js.native
  var taskId: Double = js.native
}

object RunResults {
  @scala.inline
  def apply(
    capabilities: js.Any,
    exitCode: Double,
    failedCount: Double,
    specResults: js.Array[_],
    specs: js.Array[String],
    taskId: Double
  ): RunResults = {
    val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any], exitCode = exitCode.asInstanceOf[js.Any], failedCount = failedCount.asInstanceOf[js.Any], specResults = specResults.asInstanceOf[js.Any], specs = specs.asInstanceOf[js.Any], taskId = taskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunResults]
  }
  @scala.inline
  implicit class RunResultsOps[Self <: RunResults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCapabilities(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capabilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExitCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailedCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failedCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpecResults(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpecs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTaskId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

