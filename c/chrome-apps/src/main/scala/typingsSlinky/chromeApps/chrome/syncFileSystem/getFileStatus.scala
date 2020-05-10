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

@JSGlobal("chrome.syncFileSystem.getFileStatus")
@js.native
object getFileStatus extends js.Object {
  /**
    * Returns the FileStatus for the given fileEntry.
    * Note that 'conflicting' state only happens when
    * the service's conflict resolution policy is set to 'manual'.
    * @see FileStatus
    * */
  def apply(
    fileEntry: FileEntry,
    callback: js.Function1[
      /* status */ ToStringLiteral[
        AnonCONFLICTING, 
        /* keyof chrome-apps.AnonCONFLICTING */ SYNCED | PENDING | CONFLICTING, 
        Exclude[
          /* keyof chrome-apps.AnonCONFLICTING */ SYNCED | PENDING | CONFLICTING, 
          synced_ | pending_ | conflicting_
        ]
      ], 
      Unit
    ]
  ): Unit = js.native
}

