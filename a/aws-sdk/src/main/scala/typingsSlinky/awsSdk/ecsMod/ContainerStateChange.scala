package typingsSlinky.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerStateChange extends js.Object {
  /**
    * The name of the container.
    */
  var containerName: js.UndefOr[String] = js.native
  /**
    * The exit code for the container, if the state change is a result of the container exiting.
    */
  var exitCode: js.UndefOr[BoxedInteger] = js.native
  /**
    * The container image SHA 256 digest.
    */
  var imageDigest: js.UndefOr[String] = js.native
  /**
    * Any network bindings associated with the container.
    */
  var networkBindings: js.UndefOr[NetworkBindings] = js.native
  /**
    * The reason for the state change.
    */
  var reason: js.UndefOr[String] = js.native
  /**
    * The ID of the Docker container.
    */
  var runtimeId: js.UndefOr[String] = js.native
  /**
    * The status of the container.
    */
  var status: js.UndefOr[String] = js.native
}

object ContainerStateChange {
  @scala.inline
  def apply(): ContainerStateChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerStateChange]
  }
  @scala.inline
  implicit class ContainerStateChangeOps[Self <: ContainerStateChange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainerName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerName")(js.undefined)
        ret
    }
    @scala.inline
    def withExitCode(value: BoxedInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExitCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitCode")(js.undefined)
        ret
    }
    @scala.inline
    def withImageDigest(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageDigest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageDigest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageDigest")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkBindings(value: NetworkBindings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkBindings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkBindings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkBindings")(js.undefined)
        ret
    }
    @scala.inline
    def withReason(value: String): Self = {
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
    def withRuntimeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtimeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuntimeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtimeId")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

