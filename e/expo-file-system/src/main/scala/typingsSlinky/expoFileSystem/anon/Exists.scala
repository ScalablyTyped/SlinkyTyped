package typingsSlinky.expoFileSystem.anon

import typingsSlinky.expoFileSystem.expoFileSystemBooleans.`true`
import typingsSlinky.expoFileSystem.fileSystemTypesMod.FileInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Exists extends FileInfo {
  var exists: `true` = js.native
  var isDirectory: Boolean = js.native
  var md5: js.UndefOr[String] = js.native
  var modificationTime: Double = js.native
  var size: Double = js.native
  var uri: String = js.native
}

object Exists {
  @scala.inline
  def apply(exists: `true`, isDirectory: Boolean, modificationTime: Double, size: Double, uri: String): Exists = {
    val __obj = js.Dynamic.literal(exists = exists.asInstanceOf[js.Any], isDirectory = isDirectory.asInstanceOf[js.Any], modificationTime = modificationTime.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exists]
  }
  @scala.inline
  implicit class ExistsOps[Self <: Exists] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExists(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDirectory(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModificationTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modificationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMd5(value: String): Self = {
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
  }
  
}

