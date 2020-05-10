package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ContainerState holds a possible state of container. Only one of its members may be specified.
  * If none of them is specified, the default one is ContainerStateWaiting.
  */
@js.native
trait ContainerState extends js.Object {
  /**
    * Details about a running container
    */
  var running: js.UndefOr[Input[ContainerStateRunning]] = js.native
  /**
    * Details about a terminated container
    */
  var terminated: js.UndefOr[Input[ContainerStateTerminated]] = js.native
  /**
    * Details about a waiting container
    */
  var waiting: js.UndefOr[Input[ContainerStateWaiting]] = js.native
}

object ContainerState {
  @scala.inline
  def apply(): ContainerState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerState]
  }
  @scala.inline
  implicit class ContainerStateOps[Self <: ContainerState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRunning(value: Input[ContainerStateRunning]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("running")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRunning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("running")(js.undefined)
        ret
    }
    @scala.inline
    def withTerminated(value: Input[ContainerStateTerminated]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terminated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTerminated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terminated")(js.undefined)
        ret
    }
    @scala.inline
    def withWaiting(value: Input[ContainerStateWaiting]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waiting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaiting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waiting")(js.undefined)
        ret
    }
  }
  
}

