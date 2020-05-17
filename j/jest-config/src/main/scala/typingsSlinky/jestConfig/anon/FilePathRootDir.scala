package typingsSlinky.jestConfig.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilePathRootDir extends js.Object {
  var filePath: String = js.native
  var rootDir: String = js.native
}

object FilePathRootDir {
  @scala.inline
  def apply(filePath: String, rootDir: String): FilePathRootDir = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilePathRootDir]
  }
  @scala.inline
  implicit class FilePathRootDirOps[Self <: FilePathRootDir] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRootDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootDir")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

