package typingsSlinky.expoFileSystem

import typingsSlinky.expoFileSystem.expoFileSystemBooleans.`false`
import typingsSlinky.expoFileSystem.fileSystemTypesMod.FileInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIsDirectory extends FileInfo {
  var exists: `false` = js.native
  var isDirectory: `false` = js.native
  var md5: js.UndefOr[scala.Nothing] = js.native
  var modificationTime: js.UndefOr[scala.Nothing] = js.native
  var size: js.UndefOr[scala.Nothing] = js.native
  var uri: String = js.native
}

object AnonIsDirectory {
  @scala.inline
  def apply(exists: `false`, isDirectory: `false`, uri: String): AnonIsDirectory = {
    val __obj = js.Dynamic.literal(exists = exists.asInstanceOf[js.Any], isDirectory = isDirectory.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsDirectory]
  }
  @scala.inline
  implicit class AnonIsDirectoryOps[Self <: AnonIsDirectory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExists(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDirectory(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMd5(value: scala.Nothing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("md5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMd5: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("md5")(js.undefined)
        ret
    }
    @scala.inline
    def withModificationTime(value: scala.Nothing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modificationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModificationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modificationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: scala.Nothing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
  }
  
}

