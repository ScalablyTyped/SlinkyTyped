package typingsSlinky.pulumiAws.inputMod.ecs

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskDefinitionVolume extends js.Object {
  /**
    * Used to configure a docker volume
    */
  var dockerVolumeConfiguration: js.UndefOr[Input[TaskDefinitionVolumeDockerVolumeConfiguration]] = js.native
  /**
    * Used to configure a EFS volume. Can be used only with an EC2 type task.
    */
  var efsVolumeConfiguration: js.UndefOr[Input[TaskDefinitionVolumeEfsVolumeConfiguration]] = js.native
  /**
    * The path on the host container instance that is presented to the container. If not set, ECS will create a nonpersistent data volume that starts empty and is deleted after the task has finished.
    */
  var hostPath: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the volume. This name is referenced in the `sourceVolume`
    * parameter of container definition in the `mountPoints` section.
    */
  var name: Input[String] = js.native
}

object TaskDefinitionVolume {
  @scala.inline
  def apply(name: Input[String]): TaskDefinitionVolume = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskDefinitionVolume]
  }
  @scala.inline
  implicit class TaskDefinitionVolumeOps[Self <: TaskDefinitionVolume] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDockerVolumeConfiguration(value: Input[TaskDefinitionVolumeDockerVolumeConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dockerVolumeConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDockerVolumeConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dockerVolumeConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withEfsVolumeConfiguration(value: Input[TaskDefinitionVolumeEfsVolumeConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("efsVolumeConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEfsVolumeConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("efsVolumeConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withHostPath(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostPath")(js.undefined)
        ret
    }
  }
  
}

