package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetFileModeEntry extends js.Object {
  /**
    * The file mode for the file.
    */
  var fileMode: FileModeTypeEnum = js.native
  /**
    * The full path to the file, including the name of the file.
    */
  var filePath: Path = js.native
}

object SetFileModeEntry {
  @scala.inline
  def apply(fileMode: FileModeTypeEnum, filePath: Path): SetFileModeEntry = {
    val __obj = js.Dynamic.literal(fileMode = fileMode.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetFileModeEntry]
  }
  @scala.inline
  implicit class SetFileModeEntryOps[Self <: SetFileModeEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileMode(value: FileModeTypeEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilePath(value: Path): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filePath")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

