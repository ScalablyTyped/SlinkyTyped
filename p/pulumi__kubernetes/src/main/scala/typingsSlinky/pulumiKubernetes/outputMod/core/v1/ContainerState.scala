package typingsSlinky.pulumiKubernetes.outputMod.core.v1

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
  val running: ContainerStateRunning = js.native
  /**
    * Details about a terminated container
    */
  val terminated: ContainerStateTerminated = js.native
  /**
    * Details about a waiting container
    */
  val waiting: ContainerStateWaiting = js.native
}

object ContainerState {
  @scala.inline
  def apply(
    running: ContainerStateRunning,
    terminated: ContainerStateTerminated,
    waiting: ContainerStateWaiting
  ): ContainerState = {
    val __obj = js.Dynamic.literal(running = running.asInstanceOf[js.Any], terminated = terminated.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerState]
  }
  @scala.inline
  implicit class ContainerStateOps[Self <: ContainerState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRunning(value: ContainerStateRunning): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("running")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTerminated(value: ContainerStateTerminated): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terminated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWaiting(value: ContainerStateWaiting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waiting")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

