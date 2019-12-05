package typingsSlinky.chromeDashApps.chrome.syncFileSystem

import typingsSlinky.chromeDashApps.Anon_ADDED
import typingsSlinky.chromeDashApps.Anon_CONFLICTING
import typingsSlinky.chromeDashApps.Anon_LOCALTOREMOTE
import typingsSlinky.chromeDashApps.chrome.ToStringLiteral
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.added
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.conflicting
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.deleted_
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.local_to_remote
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.pending
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.remote_to_local
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.synced
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.updated
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
  var action: js.UndefOr[ToStringLiteral[Anon_ADDED, String, Exclude[String, added | updated | deleted_]]] = js.undefined
  /**
    * Sync direction for the onFileStatusChanged event.
    * Only applies if status is 'synced'.
    * @see SyncDirection
    */
  var direction: js.UndefOr[
    ToStringLiteral[Anon_LOCALTOREMOTE, String, Exclude[String, local_to_remote | remote_to_local]]
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
  var status: ToStringLiteral[Anon_CONFLICTING, String, Exclude[String, synced | pending | conflicting]]
}

object FileStatusChangedDetail {
  @scala.inline
  def apply(
    fileEntry: FileEntry,
    status: ToStringLiteral[Anon_CONFLICTING, String, Exclude[String, synced | pending | conflicting]],
    action: ToStringLiteral[Anon_ADDED, String, Exclude[String, added | updated | deleted_]] = null,
    direction: ToStringLiteral[Anon_LOCALTOREMOTE, String, Exclude[String, local_to_remote | remote_to_local]] = null
  ): FileStatusChangedDetail = {
    val __obj = js.Dynamic.literal(fileEntry = fileEntry.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileStatusChangedDetail]
  }
}

