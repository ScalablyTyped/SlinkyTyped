package typingsSlinky.chromeApps.chrome.syncFileSystem

import typingsSlinky.chromeApps.AnonADDED
import typingsSlinky.chromeApps.AnonCONFLICTING
import typingsSlinky.chromeApps.AnonLOCALTOREMOTE
import typingsSlinky.chromeApps.chrome.ToStringLiteral
import typingsSlinky.chromeApps.chromeAppsStrings.added
import typingsSlinky.chromeApps.chromeAppsStrings.conflicting
import typingsSlinky.chromeApps.chromeAppsStrings.deleted_
import typingsSlinky.chromeApps.chromeAppsStrings.local_to_remote
import typingsSlinky.chromeApps.chromeAppsStrings.pending
import typingsSlinky.chromeApps.chromeAppsStrings.remote_to_local
import typingsSlinky.chromeApps.chromeAppsStrings.synced
import typingsSlinky.chromeApps.chromeAppsStrings.updated
import typingsSlinky.filesystem.FileEntry
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileStatusChangedDetail extends js.Object {
  /**
    * Sync action taken to fire onFileStatusChanged event.
    * Only applies if status is 'synced'.
    * @see SyncAction
    */
  var action: js.UndefOr[ToStringLiteral[AnonADDED, String, Exclude[String, added | updated | deleted_]]] = js.undefined
  /**
    * Sync direction for the onFileStatusChanged event.
    * Only applies if status is 'synced'.
    * @see SyncDirection
    */
  var direction: js.UndefOr[
    ToStringLiteral[AnonLOCALTOREMOTE, String, Exclude[String, local_to_remote | remote_to_local]]
  ] = js.undefined
  /**
    * fileEntry for the target file whose status has changed.
    * Contains name and path information of synchronized file.
    * On file deletion, fileEntry information will still be
    * available but file will no longer exist.
    */
  var fileEntry: FileEntry
  /**
    * Resulting file status after onFileStatusChanged event.
    * @see FileStatus
    */
  var status: ToStringLiteral[AnonCONFLICTING, String, Exclude[String, synced | pending | conflicting]]
}

object FileStatusChangedDetail {
  @scala.inline
  def apply(
    fileEntry: FileEntry,
    status: ToStringLiteral[AnonCONFLICTING, String, Exclude[String, synced | pending | conflicting]],
    action: ToStringLiteral[AnonADDED, String, Exclude[String, added | updated | deleted_]] = null,
    direction: ToStringLiteral[AnonLOCALTOREMOTE, String, Exclude[String, local_to_remote | remote_to_local]] = null
  ): FileStatusChangedDetail = {
    val __obj = js.Dynamic.literal(fileEntry = fileEntry.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileStatusChangedDetail]
  }
}

