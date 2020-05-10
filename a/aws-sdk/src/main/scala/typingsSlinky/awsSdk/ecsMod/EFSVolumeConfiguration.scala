package typingsSlinky.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EFSVolumeConfiguration extends js.Object {
  /**
    * The Amazon EFS file system ID to use.
    */
  var fileSystemId: String = js.native
  /**
    * The directory within the Amazon EFS file system to mount as the root directory inside the host.
    */
  var rootDirectory: js.UndefOr[String] = js.native
}

object EFSVolumeConfiguration {
  @scala.inline
  def apply(fileSystemId: String): EFSVolumeConfiguration = {
    val __obj = js.Dynamic.literal(fileSystemId = fileSystemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EFSVolumeConfiguration]
  }
  @scala.inline
  implicit class EFSVolumeConfigurationOps[Self <: EFSVolumeConfiguration] (val x: Self) extends AnyVal {
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

