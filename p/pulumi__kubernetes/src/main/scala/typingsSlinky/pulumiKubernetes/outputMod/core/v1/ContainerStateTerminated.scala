package typingsSlinky.pulumiKubernetes.outputMod.core.v1

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
  val containerID: String = js.native
  /**
    * Exit status from the last termination of the container
    */
  val exitCode: Double = js.native
  /**
    * Time at which the container last terminated
    */
  val finishedAt: String = js.native
  /**
    * Message regarding the last termination of the container
    */
  val message: String = js.native
  /**
    * (brief) reason from the last termination of the container
    */
  val reason: String = js.native
  /**
    * Signal from the last termination of the container
    */
  val signal: Double = js.native
  /**
    * Time at which previous execution of the container started
    */
  val startedAt: String = js.native
}

object ContainerStateTerminated {
  @scala.inline
  def apply(
    containerID: String,
    exitCode: Double,
    finishedAt: String,
    message: String,
    reason: String,
    signal: Double,
    startedAt: String
  ): ContainerStateTerminated = {
    val __obj = js.Dynamic.literal(containerID = containerID.asInstanceOf[js.Any], exitCode = exitCode.asInstanceOf[js.Any], finishedAt = finishedAt.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], signal = signal.asInstanceOf[js.Any], startedAt = startedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerStateTerminated]
  }
  @scala.inline
  implicit class ContainerStateTerminatedOps[Self <: ContainerStateTerminated] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainerID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExitCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFinishedAt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finishedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartedAt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startedAt")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

