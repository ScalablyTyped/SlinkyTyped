package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ContainerStatus contains details for the current status of this container.
  */
@js.native
trait ContainerStatus extends js.Object {
  /**
    * Container's ID in the format 'docker://<container_id>'.
    */
  val containerID: String = js.native
  /**
    * The image the container is running. More info:
    * https://kubernetes.io/docs/concepts/containers/images
    */
  val image: String = js.native
  /**
    * ImageID of the container's image.
    */
  val imageID: String = js.native
  /**
    * Details about the container's last termination condition.
    */
  val lastState: ContainerState = js.native
  /**
    * This must be a DNS_LABEL. Each container in a pod must have a unique name. Cannot be
    * updated.
    */
  val name: String = js.native
  /**
    * Specifies whether the container has passed its readiness probe.
    */
  val ready: Boolean = js.native
  /**
    * The number of times the container has been restarted, currently based on the number of dead
    * containers that have not yet been removed. Note that this is calculated from dead
    * containers. But those containers are subject to garbage collection. This value will get
    * capped at 5 by GC.
    */
  val restartCount: Double = js.native
  /**
    * Specifies whether the container has passed its startup probe. Initialized as false, becomes
    * true after startupProbe is considered successful. Resets to false when the container is
    * restarted, or if kubelet loses state temporarily. Is always true when no startupProbe is
    * defined.
    */
  val started: Boolean = js.native
  /**
    * Details about the container's current condition.
    */
  val state: ContainerState = js.native
}

object ContainerStatus {
  @scala.inline
  def apply(
    containerID: String,
    image: String,
    imageID: String,
    lastState: ContainerState,
    name: String,
    ready: Boolean,
    restartCount: Double,
    started: Boolean,
    state: ContainerState
  ): ContainerStatus = {
    val __obj = js.Dynamic.literal(containerID = containerID.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], imageID = imageID.asInstanceOf[js.Any], lastState = lastState.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any], restartCount = restartCount.asInstanceOf[js.Any], started = started.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerStatus]
  }
  @scala.inline
  implicit class ContainerStatusOps[Self <: ContainerStatus] (val x: Self) extends AnyVal {
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
    def withImage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastState(value: ContainerState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReady(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ready")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRestartCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restartCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStarted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("started")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: ContainerState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

