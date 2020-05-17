package typingsSlinky.chromeApps.anon

import typingsSlinky.chromeApps.chromeAppsStrings.openDirectory
import typingsSlinky.chromeApps.chromeAppsStrings.openFile
import typingsSlinky.chromeApps.chromeAppsStrings.openWritableFile
import typingsSlinky.chromeApps.chromeAppsStrings.saveFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OPENDIRECTORY extends js.Object {
  var OPEN_DIRECTORY: openDirectory = js.native
  var OPEN_FILE: openFile = js.native
  var OPEN_WRITABLE_FILE: openWritableFile = js.native
  var SAVE_FILE: saveFile = js.native
}

object OPENDIRECTORY {
  @scala.inline
  def apply(
    OPEN_DIRECTORY: openDirectory,
    OPEN_FILE: openFile,
    OPEN_WRITABLE_FILE: openWritableFile,
    SAVE_FILE: saveFile
  ): OPENDIRECTORY = {
    val __obj = js.Dynamic.literal(OPEN_DIRECTORY = OPEN_DIRECTORY.asInstanceOf[js.Any], OPEN_FILE = OPEN_FILE.asInstanceOf[js.Any], OPEN_WRITABLE_FILE = OPEN_WRITABLE_FILE.asInstanceOf[js.Any], SAVE_FILE = SAVE_FILE.asInstanceOf[js.Any])
    __obj.asInstanceOf[OPENDIRECTORY]
  }
  @scala.inline
  implicit class OPENDIRECTORYOps[Self <: OPENDIRECTORY] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOPEN_DIRECTORY(value: openDirectory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OPEN_DIRECTORY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOPEN_FILE(value: openFile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OPEN_FILE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOPEN_WRITABLE_FILE(value: openWritableFile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OPEN_WRITABLE_FILE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSAVE_FILE(value: saveFile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SAVE_FILE")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

