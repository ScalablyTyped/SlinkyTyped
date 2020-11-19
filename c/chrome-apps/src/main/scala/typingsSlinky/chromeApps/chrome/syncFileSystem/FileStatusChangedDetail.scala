package typingsSlinky.chromeApps.chrome.syncFileSystem

import typingsSlinky.chromeApps.anon.ADDED
import typingsSlinky.chromeApps.anon.CONFLICTING
import typingsSlinky.chromeApps.anon.LOCALTOREMOTE
import typingsSlinky.chromeApps.chrome.ToStringLiteral
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileStatusChangedDetail extends js.Object {
  
  /**
    * Sync action taken to fire onFileStatusChanged event.
    * Only applies if status is 'synced'.
    * @see SyncAction
    */
  var action: js.UndefOr[
    ToStringLiteral[
      ADDED, 
      /* keyof chrome-apps.anon.ADDED */ typingsSlinky.chromeApps.chromeAppsStrings.ADDED | UPDATED | DELETED, 
      Exclude[
        /* keyof chrome-apps.anon.ADDED */ typingsSlinky.chromeApps.chromeAppsStrings.ADDED | UPDATED | DELETED, 
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
      LOCALTOREMOTE, 
      /* keyof chrome-apps.anon.LOCALTOREMOTE */ LOCAL_TO_REMOTE | REMOTE_TO_LOCAL, 
      Exclude[
        /* keyof chrome-apps.anon.LOCALTOREMOTE */ LOCAL_TO_REMOTE | REMOTE_TO_LOCAL, 
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
    CONFLICTING, 
    /* keyof chrome-apps.anon.CONFLICTING */ SYNCED | PENDING | typingsSlinky.chromeApps.chromeAppsStrings.CONFLICTING, 
    Exclude[
      /* keyof chrome-apps.anon.CONFLICTING */ SYNCED | PENDING | typingsSlinky.chromeApps.chromeAppsStrings.CONFLICTING, 
      synced_ | pending_ | conflicting_
    ]
  ] = js.native
}
object FileStatusChangedDetail {
  
  @scala.inline
  def apply(
    fileEntry: FileEntry,
    status: ToStringLiteral[
      CONFLICTING, 
      /* keyof chrome-apps.anon.CONFLICTING */ SYNCED | PENDING | typingsSlinky.chromeApps.chromeAppsStrings.CONFLICTING, 
      Exclude[
        /* keyof chrome-apps.anon.CONFLICTING */ SYNCED | PENDING | typingsSlinky.chromeApps.chromeAppsStrings.CONFLICTING, 
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFileEntry(value: FileEntry): Self = this.set("fileEntry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(
      value: ToStringLiteral[
          CONFLICTING, 
          /* keyof chrome-apps.anon.CONFLICTING */ SYNCED | PENDING | typingsSlinky.chromeApps.chromeAppsStrings.CONFLICTING, 
          Exclude[
            /* keyof chrome-apps.anon.CONFLICTING */ SYNCED | PENDING | typingsSlinky.chromeApps.chromeAppsStrings.CONFLICTING, 
            synced_ | pending_ | conflicting_
          ]
        ]
    ): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAction(
      value: ToStringLiteral[
          ADDED, 
          /* keyof chrome-apps.anon.ADDED */ typingsSlinky.chromeApps.chromeAppsStrings.ADDED | UPDATED | DELETED, 
          Exclude[
            /* keyof chrome-apps.anon.ADDED */ typingsSlinky.chromeApps.chromeAppsStrings.ADDED | UPDATED | DELETED, 
            added_ | updated_ | deleted_
          ]
        ]
    ): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    
    @scala.inline
    def setDirection(
      value: ToStringLiteral[
          LOCALTOREMOTE, 
          /* keyof chrome-apps.anon.LOCALTOREMOTE */ LOCAL_TO_REMOTE | REMOTE_TO_LOCAL, 
          Exclude[
            /* keyof chrome-apps.anon.LOCALTOREMOTE */ LOCAL_TO_REMOTE | REMOTE_TO_LOCAL, 
            local_to_remote_ | remote_to_local_
          ]
        ]
    ): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
  }
}
