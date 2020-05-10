package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ContainerStateRunning is a running state of a container.
  */
@js.native
trait ContainerStateRunning extends js.Object {
  /**
    * Time at which the container was last (re-)started
    */
  var startedAt: js.UndefOr[Input[String]] = js.native
}

object ContainerStateRunning {
  @scala.inline
  def apply(): ContainerStateRunning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerStateRunning]
  }
  @scala.inline
  implicit class ContainerStateRunningOps[Self <: ContainerStateRunning] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

