package typingsSlinky.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateFileSystemFromBackupResponse extends js.Object {
  /**
    * A description of the file system.
    */
  var FileSystem: js.UndefOr[typingsSlinky.awsSdk.fsxMod.FileSystem] = js.native
}

object CreateFileSystemFromBackupResponse {
  @scala.inline
  def apply(): CreateFileSystemFromBackupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFileSystemFromBackupResponse]
  }
  @scala.inline
  implicit class CreateFileSystemFromBackupResponseOps[Self <: CreateFileSystemFromBackupResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileSystem(value: FileSystem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileSystem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileSystem")(js.undefined)
        ret
    }
  }
  
}

