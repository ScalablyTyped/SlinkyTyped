package typingsSlinky.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerOverride extends js.Object {
  /**
    * The command to send to the container that overrides the default command from the Docker image or the task definition. You must also specify a container name.
    */
  var command: js.UndefOr[StringList] = js.native
  /**
    * The number of cpu units reserved for the container, instead of the default value from the task definition. You must also specify a container name.
    */
  var cpu: js.UndefOr[BoxedInteger] = js.native
  /**
    * The environment variables to send to the container. You can add new environment variables, which are added to the container at launch, or you can override the existing environment variables from the Docker image or the task definition. You must also specify a container name.
    */
  var environment: js.UndefOr[EnvironmentVariables] = js.native
  /**
    * The hard limit (in MiB) of memory to present to the container, instead of the default value from the task definition. If your container attempts to exceed the memory specified here, the container is killed. You must also specify a container name.
    */
  var memory: js.UndefOr[BoxedInteger] = js.native
  /**
    * The soft limit (in MiB) of memory to reserve for the container, instead of the default value from the task definition. You must also specify a container name.
    */
  var memoryReservation: js.UndefOr[BoxedInteger] = js.native
  /**
    * The name of the container that receives the override. This parameter is required if any override is specified.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The type and amount of a resource to assign to a container, instead of the default value from the task definition. The only supported resource is a GPU.
    */
  var resourceRequirements: js.UndefOr[ResourceRequirements] = js.native
}

object ContainerOverride {
  @scala.inline
  def apply(): ContainerOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerOverride]
  }
  @scala.inline
  implicit class ContainerOverrideOps[Self <: ContainerOverride] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommand(value: StringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("command")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("command")(js.undefined)
        ret
    }
    @scala.inline
    def withCpu(value: BoxedInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCpu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpu")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvironment(value: EnvironmentVariables): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(js.undefined)
        ret
    }
    @scala.inline
    def withMemory(value: BoxedInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memory")(js.undefined)
        ret
    }
    @scala.inline
    def withMemoryReservation(value: BoxedInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memoryReservation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemoryReservation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memoryReservation")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceRequirements(value: ResourceRequirements): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceRequirements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceRequirements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceRequirements")(js.undefined)
        ret
    }
  }
  
}

