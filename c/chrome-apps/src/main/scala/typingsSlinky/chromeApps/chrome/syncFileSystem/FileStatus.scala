package typingsSlinky.chromeApps.chrome.syncFileSystem

import typingsSlinky.chromeApps.chromeAppsStrings.conflicting
import typingsSlinky.chromeApps.chromeAppsStrings.pending
import typingsSlinky.chromeApps.chromeAppsStrings.synced
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @enum
  * 'synced'
  *  - Not conflicting and has no pending local changes.
  * 'pending'
  *  - Has one or more pending local changes that haven't been synchronized.
  * 'conflicting'
  *  - File conflicts with remote version and must be resolved manually.
  */
@JSGlobal("chrome.syncFileSystem.FileStatus")
@js.native
object FileStatus extends js.Object {
  var CONFLICTING: conflicting = js.native
  var PENDING: pending = js.native
  var SYNCED: synced = js.native
}

