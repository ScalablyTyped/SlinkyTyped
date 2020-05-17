package typingsSlinky.jestConfig.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilePath extends js.Object {
  var filePath: String = js.native
  var humanOptionName: String = js.native
  var optionName: String = js.native
  var prefix: String = js.native
  var rootDir: String = js.native
}

object FilePath {
  @scala.inline
  def apply(filePath: String, humanOptionName: String, optionName: String, prefix: String, rootDir: String): FilePath = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], humanOptionName = humanOptionName.asInstanceOf[js.Any], optionName = optionName.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilePath]
  }
  @scala.inline
  implicit class FilePathOps[Self <: FilePath] (val x: Self) extends AnyVal {
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
    def withHumanOptionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("humanOptionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
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

