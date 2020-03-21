package typingsSlinky.chromeApps.chrome.syncFileSystem

import typingsSlinky.chromeApps.AnonLASTWRITEWIN
import typingsSlinky.chromeApps.chrome.ToStringLiteral
import typingsSlinky.chromeApps.chromeAppsStrings.last_write_win
import typingsSlinky.chromeApps.chromeAppsStrings.manual_
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
      /* policy */ ToStringLiteral[AnonLASTWRITEWIN, String, Exclude[String, last_write_win | manual_]], 
      Unit
    ]
  ): Unit = js.native
}

