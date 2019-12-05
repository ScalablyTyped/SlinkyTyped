package typingsSlinky.chromeDashApps.chrome.syncFileSystem

import typingsSlinky.chromeDashApps.Anon_LASTWRITEWIN
import typingsSlinky.chromeDashApps.chrome.ToStringLiteral
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.last_write_win
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.manual_
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.syncFileSystem.getConflictResolutionPolicy")
@js.native
object getConflictResolutionPolicy extends js.Object {
  /**
    * Gets the current conflict resolution policy.
    * @see ConflictResolutionPolicy
    */
  def apply(
    callback: js.Function1[
      /* policy */ ToStringLiteral[Anon_LASTWRITEWIN, String, Exclude[String, last_write_win | manual_]], 
      Unit
    ]
  ): Unit = js.native
}

