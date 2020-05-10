package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DriveItemUploadableProperties extends js.Object {
  // Provides a user-visible description of the item. Read-write. Only on OneDrive Personal
  var description: js.UndefOr[String] = js.native
  // File system information on client. Read-write.
  var fileSystemInfo: js.UndefOr[FileSystemInfo] = js.native
  // The name of the item (filename and extension). Read-write.
  var name: js.UndefOr[String] = js.native
}

object DriveItemUploadableProperties {
  @scala.inline
  def apply(): DriveItemUploadableProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DriveItemUploadableProperties]
  }
  @scala.inline
  implicit class DriveItemUploadablePropertiesOps[Self <: DriveItemUploadableProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withFileSystemInfo(value: FileSystemInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSystemInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileSystemInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSystemInfo")(js.undefined)
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
  }
  
}

