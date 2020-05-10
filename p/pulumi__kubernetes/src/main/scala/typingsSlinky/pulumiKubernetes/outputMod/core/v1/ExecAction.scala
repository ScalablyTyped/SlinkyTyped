package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ExecAction describes a "run in container" action.
  */
@js.native
trait ExecAction extends js.Object {
  /**
    * Command is the command line to execute inside the container, the working directory for the
    * command  is root ('/') in the container's filesystem. The command is simply exec'd, it is
    * not run inside a shell, so traditional shell instructions ('|', etc) won't work. To use a
    * shell, you need to explicitly call out to that shell. Exit status of 0 is treated as
    * live/healthy and non-zero is unhealthy.
    */
  val command: js.Array[String] = js.native
}

object ExecAction {
  @scala.inline
  def apply(command: js.Array[String]): ExecAction = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecAction]
  }
  @scala.inline
  implicit class ExecActionOps[Self <: ExecAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommand(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("command")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

