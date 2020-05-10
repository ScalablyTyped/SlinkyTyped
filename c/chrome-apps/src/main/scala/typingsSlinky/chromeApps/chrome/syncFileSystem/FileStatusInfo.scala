package typingsSlinky.chromeApps.chrome.syncFileSystem

import typingsSlinky.chromeApps.AnonCONFLICTING
import typingsSlinky.chromeApps.chrome.ToStringLiteral
import typingsSlinky.chromeApps.chromeAppsStrings.CONFLICTING
import typingsSlinky.chromeApps.chromeAppsStrings.PENDING
import typingsSlinky.chromeApps.chromeAppsStrings.SYNCED
import typingsSlinky.chromeApps.chromeAppsStrings.conflicting_
import typingsSlinky.chromeApps.chromeAppsStrings.pending_
import typingsSlinky.chromeApps.chromeAppsStrings.synced_
import typingsSlinky.filesystem.FileEntry
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileStatusInfo extends js.Object {
  /** Optional error that is only returned if there was a problem retrieving the FileStatus for the given file. */
  var error: js.UndefOr[String] = js.native
  /** One of the Entry's originally given to getFileStatuses. */
  var fileEntry: FileEntry = js.native
  /**
    * Status value
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

object FileStatusInfo {
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
  ): FileStatusInfo = {
    val __obj = js.Dynamic.literal(fileEntry = fileEntry.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileStatusInfo]
  }
  @scala.inline
  implicit class FileStatusInfoOps[Self <: FileStatusInfo] (val x: Self) extends AnyVal {
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
    def withError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
  }
  
}

