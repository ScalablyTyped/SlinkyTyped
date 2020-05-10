package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ContainerStateTerminated is a terminated state of a container.
  */
@js.native
trait ContainerStateTerminated extends js.Object {
  /**
    * Container's ID in the format 'docker://<container_id>'
    */
  var containerID: js.UndefOr[Input[String]] = js.native
  /**
    * Exit status from the last termination of the container
    */
  var exitCode: Input[Double] = js.native
  /**
    * Time at which the container last terminated
    */
  var finishedAt: js.UndefOr[Input[String]] = js.native
  /**
    * Message regarding the last termination of the container
    */
  var message: js.UndefOr[Input[String]] = js.native
  /**
    * (brief) reason from the last termination of the container
    */
  var reason: js.UndefOr[Input[String]] = js.native
  /**
    * Signal from the last termination of the container
    */
  var signal: js.UndefOr[Input[Double]] = js.native
  /**
    * Time at which previous execution of the container started
    */
  var startedAt: js.UndefOr[Input[String]] = js.native
}

object ContainerStateTerminated {
  @scala.inline
  def apply(exitCode: Input[Double]): ContainerStateTerminated = {
    val __obj = js.Dynamic.literal(exitCode = exitCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerStateTerminated]
  }
  @scala.inline
  implicit class ContainerStateTerminatedOps[Self <: ContainerStateTerminated] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExitCode(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainerID(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerID")(js.undefined)
        ret
    }
    @scala.inline
    def withFinishedAt(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finishedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinishedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finishedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withReason(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(js.undefined)
        ret
    }
    @scala.inline
    def withSignal(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signal")(js.undefined)
        ret
    }
    @scala.inline
    def withStartedAt(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startedAt")(js.undefined)
        ret
    }
  }
  
}

