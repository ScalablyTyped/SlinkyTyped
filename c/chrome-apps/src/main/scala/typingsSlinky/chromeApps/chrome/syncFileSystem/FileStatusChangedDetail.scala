package typingsSlinky.chromeApps.chrome.syncFileSystem

import typingsSlinky.chromeApps.AnonADDED
import typingsSlinky.chromeApps.AnonCONFLICTING
import typingsSlinky.chromeApps.AnonLOCALTOREMOTE
import typingsSlinky.chromeApps.chrome.ToStringLiteral
import typingsSlinky.chromeApps.chromeAppsStrings.ADDED
import typingsSlinky.chromeApps.chromeAppsStrings.CONFLICTING
import typingsSlinky.chromeApps.chromeAppsStrings.DELETED
import typingsSlinky.chromeApps.chromeAppsStrings.LOCAL_TO_REMOTE
import typingsSlinky.chromeApps.chromeAppsStrings.PENDING
import typingsSlinky.chromeApps.chromeAppsStrings.REMOTE_TO_LOCAL
import typingsSlinky.chromeApps.chromeAppsStrings.SYNCED
import typingsSlinky.chromeApps.chromeAppsStrings.UPDATED
import typingsSlinky.chromeApps.chromeAppsStrings.added_
import typingsSlinky.chromeApps.chromeAppsStrings.conflicting_
import typingsSlinky.chromeApps.chromeAppsStrings.deleted_
import typingsSlinky.chromeApps.chromeAppsStrings.local_to_remote_
import typingsSlinky.chromeApps.chromeAppsStrings.pending_
import typingsSlinky.chromeApps.chromeAppsStrings.remote_to_local_
import typingsSlinky.chromeApps.chromeAppsStrings.synced_
import typingsSlinky.chromeApps.chromeAppsStrings.updated_
import typingsSlinky.filesystem.FileEntry
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileStatusChangedDetail extends js.Object {
  /**
    * Sync action taken to fire onFileStatusChanged event.
    * Only applies if status is 'synced'.
    * @see SyncAction
    */
  var action: js.UndefOr[
    ToStringLiteral[
      AnonADDED, 
      /* keyof chrome-apps.AnonADDED */ ADDED | UPDATED | DELETED, 
      Exclude[
        /* keyof chrome-apps.AnonADDED */ ADDED | UPDATED | DELETED, 
        added_ | updated_ | deleted_
      ]
    ]
  ] = js.native
  /**
    * Sync direction for the onFileStatusChanged event.
    * Only applies if status is 'synced'.
    * @see SyncDirection
    */
  var direction: js.UndefOr[
    ToStringLiteral[
      AnonLOCALTOREMOTE, 
      /* keyof chrome-apps.AnonLOCALTOREMOTE */ LOCAL_TO_REMOTE | REMOTE_TO_LOCAL, 
      Exclude[
        /* keyof chrome-apps.AnonLOCALTOREMOTE */ LOCAL_TO_REMOTE | REMOTE_TO_LOCAL, 
        local_to_remote_ | remote_to_local_
      ]
    ]
  ] = js.native
  /**
    * fileEntry for the target file whose status has changed.
    * Contains name and path information of synchronized file.
    * On file deletion, fileEntry information will still be
    * available but file will no longer exist.
    */
  var fileEntry: FileEntry = js.native
  /**
    * Resulting file status after onFileStatusChanged event.
    * @see FileStatus
    */
  var status: ToStringLiteral[
    AnonCONFLICTING, 
    /* keyof chrome-apps.AnonCONFLICTING */ SYNCED | PENDING | CONFLICTING, 
    Exclude[
      /* keyof chrome-apps.AnonCONFLICTING */ SYNCED | PENDING | CONFLICTING, 
      synced_ | pending_ | conflicting_
    ]
  ] = js.native
}

object FileStatusChangedDetail {
  @scala.inline
  def apply(
    fileEntry: FileEntry,
    status: ToStringLiteral[
      AnonCONFLICTING, 
      /* keyof chrome-apps.AnonCONFLICTING */ SYNCED | PENDING | CONFLICTING, 
      Exclude[
        /* keyof chrome-apps.AnonCONFLICTING */ SYNCED | PENDING | CONFLICTING, 
        synced_ | pending_ | conflicting_
      ]
    ]
  ): FileStatusChangedDetail = {
    val __obj = js.Dynamic.literal(fileEntry = fileEntry.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileStatusChangedDetail]
  }
  @scala.inline
  implicit class FileStatusChangedDetailOps[Self <: FileStatusChangedDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileEntry(value: FileEntry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileEntry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(
      value: ToStringLiteral[
          AnonCONFLICTING, 
          /* keyof chrome-apps.AnonCONFLICTING */ SYNCED | PENDING | CONFLICTING, 
          Exclude[
            /* keyof chrome-apps.AnonCONFLICTING */ SYNCED | PENDING | CONFLICTING, 
            synced_ | pending_ | conflicting_
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAction(
      value: ToStringLiteral[
          AnonADDED, 
          /* keyof chrome-apps.AnonADDED */ ADDED | UPDATED | DELETED, 
          Exclude[
            /* keyof chrome-apps.AnonADDED */ ADDED | UPDATED | DELETED, 
            added_ | updated_ | deleted_
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(
      value: ToStringLiteral[
          AnonLOCALTOREMOTE, 
          /* keyof chrome-apps.AnonLOCALTOREMOTE */ LOCAL_TO_REMOTE | REMOTE_TO_LOCAL, 
          Exclude[
            /* keyof chrome-apps.AnonLOCALTOREMOTE */ LOCAL_TO_REMOTE | REMOTE_TO_LOCAL, 
            local_to_remote_ | remote_to_local_
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
  }
  
}

