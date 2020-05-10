package typingsSlinky.node.workerThreadsMod

import typingsSlinky.node.NodeJS.Dict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkerOptions extends js.Object {
  /**
    * List of arguments which would be stringified and appended to
    * `process.argv` in the worker. This is mostly similar to the `workerData`
    * but the values will be available on the global `process.argv` as if they
    * were passed as CLI options to the script.
    */
  var argv: js.UndefOr[js.Array[_]] = js.native
  var env: js.UndefOr[Dict[String] | js.Symbol] = js.native
  var eval: js.UndefOr[Boolean] = js.native
  var execArgv: js.UndefOr[js.Array[String]] = js.native
  var resourceLimits: js.UndefOr[ResourceLimits] = js.native
  var stderr: js.UndefOr[Boolean] = js.native
  var stdin: js.UndefOr[Boolean] = js.native
  var stdout: js.UndefOr[Boolean] = js.native
  /**
    * Additional data to send in the first worker message.
    */
  var transferList: js.UndefOr[js.Array[js.typedarray.ArrayBuffer | MessagePort]] = js.native
  var workerData: js.UndefOr[js.Any] = js.native
}

object WorkerOptions {
  @scala.inline
  def apply(): WorkerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkerOptions]
  }
  @scala.inline
  implicit class WorkerOptionsOps[Self <: WorkerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgv(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argv")(js.undefined)
        ret
    }
    @scala.inline
    def withEnv(value: Dict[String] | js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(js.undefined)
        ret
    }
    @scala.inline
    def withEval(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eval")(js.undefined)
        ret
    }
    @scala.inline
    def withExecArgv(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execArgv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecArgv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execArgv")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceLimits(value: ResourceLimits): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceLimits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceLimits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceLimits")(js.undefined)
        ret
    }
    @scala.inline
    def withStderr(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stderr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStderr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stderr")(js.undefined)
        ret
    }
    @scala.inline
    def withStdin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStdin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdin")(js.undefined)
        ret
    }
    @scala.inline
    def withStdout(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStdout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdout")(js.undefined)
        ret
    }
    @scala.inline
    def withTransferList(value: js.Array[js.typedarray.ArrayBuffer | MessagePort]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transferList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransferList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transferList")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkerData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkerData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerData")(js.undefined)
        ret
    }
  }
  
}

