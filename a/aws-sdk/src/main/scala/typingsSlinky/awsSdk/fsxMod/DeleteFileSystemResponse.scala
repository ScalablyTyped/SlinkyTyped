package typingsSlinky.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteFileSystemResponse extends js.Object {
  /**
    * The ID of the file system being deleted.
    */
  var FileSystemId: js.UndefOr[typingsSlinky.awsSdk.fsxMod.FileSystemId] = js.native
  /**
    * The file system lifecycle for the deletion request. Should be DELETING.
    */
  var Lifecycle: js.UndefOr[FileSystemLifecycle] = js.native
  var WindowsResponse: js.UndefOr[DeleteFileSystemWindowsResponse] = js.native
}

object DeleteFileSystemResponse {
  @scala.inline
  def apply(): DeleteFileSystemResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteFileSystemResponse]
  }
  @scala.inline
  implicit class DeleteFileSystemResponseOps[Self <: DeleteFileSystemResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileSystemId(value: FileSystemId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileSystemId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileSystemId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileSystemId")(js.undefined)
        ret
    }
    @scala.inline
    def withLifecycle(value: FileSystemLifecycle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Lifecycle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLifecycle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Lifecycle")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowsResponse(value: DeleteFileSystemWindowsResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WindowsResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowsResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WindowsResponse")(js.undefined)
        ret
    }
  }
  
}

