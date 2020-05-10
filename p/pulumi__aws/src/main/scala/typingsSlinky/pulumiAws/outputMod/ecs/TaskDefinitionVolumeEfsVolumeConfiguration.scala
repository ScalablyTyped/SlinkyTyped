package typingsSlinky.pulumiAws.outputMod.ecs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskDefinitionVolumeEfsVolumeConfiguration extends js.Object {
  /**
    * The ID of the EFS File System.
    */
  var fileSystemId: String = js.native
  /**
    * The path to mount on the host
    */
  var rootDirectory: js.UndefOr[String] = js.native
}

object TaskDefinitionVolumeEfsVolumeConfiguration {
  @scala.inline
  def apply(fileSystemId: String): TaskDefinitionVolumeEfsVolumeConfiguration = {
    val __obj = js.Dynamic.literal(fileSystemId = fileSystemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskDefinitionVolumeEfsVolumeConfiguration]
  }
  @scala.inline
  implicit class TaskDefinitionVolumeEfsVolumeConfigurationOps[Self <: TaskDefinitionVolumeEfsVolumeConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileSystemId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSystemId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRootDirectory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootDirectory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootDirectory")(js.undefined)
        ret
    }
  }
  
}

