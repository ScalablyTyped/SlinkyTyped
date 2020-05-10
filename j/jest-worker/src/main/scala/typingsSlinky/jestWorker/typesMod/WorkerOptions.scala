package typingsSlinky.jestWorker.typesMod

import typingsSlinky.node.childProcessMod.ForkOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkerOptions extends js.Object {
  var forkOptions: ForkOptions = js.native
  var maxRetries: Double = js.native
  var setupArgs: js.Array[_] = js.native
  var workerId: Double = js.native
  var workerPath: String = js.native
}

object WorkerOptions {
  @scala.inline
  def apply(
    forkOptions: ForkOptions,
    maxRetries: Double,
    setupArgs: js.Array[_],
    workerId: Double,
    workerPath: String
  ): WorkerOptions = {
    val __obj = js.Dynamic.literal(forkOptions = forkOptions.asInstanceOf[js.Any], maxRetries = maxRetries.asInstanceOf[js.Any], setupArgs = setupArgs.asInstanceOf[js.Any], workerId = workerId.asInstanceOf[js.Any], workerPath = workerPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerOptions]
  }
  @scala.inline
  implicit class WorkerOptionsOps[Self <: WorkerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForkOptions(value: ForkOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forkOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxRetries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRetries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetupArgs(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setupArgs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkerId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkerPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerPath")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

