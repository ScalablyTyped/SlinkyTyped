package typingsSlinky.chromeDashApps

import typingsSlinky.chromeDashApps.chromeDashAppsStrings.openDirectory
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.openFile
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.openWritableFile
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.saveFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OPENDIRECTORY extends js.Object {
  var OPEN_DIRECTORY: openDirectory
  var OPEN_FILE: openFile
  var OPEN_WRITABLE_FILE: openWritableFile
  var SAVE_FILE: saveFile
}

object Anon_OPENDIRECTORY {
  @scala.inline
  def apply(
    OPEN_DIRECTORY: openDirectory,
    OPEN_FILE: openFile,
    OPEN_WRITABLE_FILE: openWritableFile,
    SAVE_FILE: saveFile
  ): Anon_OPENDIRECTORY = {
    val __obj = js.Dynamic.literal(OPEN_DIRECTORY = OPEN_DIRECTORY.asInstanceOf[js.Any], OPEN_FILE = OPEN_FILE.asInstanceOf[js.Any], OPEN_WRITABLE_FILE = OPEN_WRITABLE_FILE.asInstanceOf[js.Any], SAVE_FILE = SAVE_FILE.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_OPENDIRECTORY]
  }
}

