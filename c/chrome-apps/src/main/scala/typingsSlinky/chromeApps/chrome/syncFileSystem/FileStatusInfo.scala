package typingsSlinky.chromeApps.chrome.syncFileSystem

import typingsSlinky.chromeApps.AnonCONFLICTING
import typingsSlinky.chromeApps.chrome.ToStringLiteral
import typingsSlinky.chromeApps.chromeAppsStrings.conflicting
import typingsSlinky.chromeApps.chromeAppsStrings.pending
import typingsSlinky.chromeApps.chromeAppsStrings.synced
import typingsSlinky.filesystem.FileEntry
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileStatusInfo extends js.Object {
  /** Optional error that is only returned if there was a problem retrieving the FileStatus for the given file. */
  var error: js.UndefOr[String] = js.undefined
  /** One of the Entry's originally given to getFileStatuses. */
  var fileEntry: FileEntry
  /**
    * Status value
    * @see FileStatus
    */
  var status: ToStringLiteral[AnonCONFLICTING, String, Exclude[String, synced | pending | conflicting]]
}

object FileStatusInfo {
  @scala.inline
  def apply(
    fileEntry: FileEntry,
    status: ToStringLiteral[AnonCONFLICTING, String, Exclude[String, synced | pending | conflicting]],
    error: String = null
  ): FileStatusInfo = {
    val __obj = js.Dynamic.literal(fileEntry = fileEntry.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileStatusInfo]
  }
}

