package typingsSlinky.expoFileSystem.anon

import typingsSlinky.expoFileSystem.expoFileSystemBooleans.`false`
import typingsSlinky.expoFileSystem.fileSystemTypesMod.FileInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsDirectory extends FileInfo {
  var exists: `false` = js.native
  var isDirectory: `false` = js.native
  var md5: js.UndefOr[scala.Nothing] = js.native
  var modificationTime: js.UndefOr[scala.Nothing] = js.native
  var size: js.UndefOr[scala.Nothing] = js.native
  var uri: String = js.native
}

object IsDirectory {
  @scala.inline
  def apply(exists: `false`, isDirectory: `false`, uri: String): IsDirectory = {
    val __obj = js.Dynamic.literal(exists = exists.asInstanceOf[js.Any], isDirectory = isDirectory.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsDirectory]
  }
  @scala.inline
  implicit class IsDirectoryOps[Self <: IsDirectory] (val x: Self) extends AnyVal {
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
  }
  
}

