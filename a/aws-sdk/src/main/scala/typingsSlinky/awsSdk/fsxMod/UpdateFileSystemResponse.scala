package typingsSlinky.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateFileSystemResponse extends js.Object {
  /**
    * A description of the file system that was updated.
    */
  var FileSystem: js.UndefOr[typingsSlinky.awsSdk.fsxMod.FileSystem] = js.native
}

object UpdateFileSystemResponse {
  @scala.inline
  def apply(): UpdateFileSystemResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFileSystemResponse]
  }
  @scala.inline
  implicit class UpdateFileSystemResponseOps[Self <: UpdateFileSystemResponse] (val x: Self) extends AnyVal {
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

