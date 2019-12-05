package typingsSlinky.chromeDashApps.chrome.syncFileSystem

import typingsSlinky.chromeDashApps.chromeDashAppsStrings.conflicting
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.pending
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.synced
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

