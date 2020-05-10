package typingsSlinky.chromeApps.chrome.syncFileSystem

import typingsSlinky.chromeApps.AnonLASTWRITEWIN
import typingsSlinky.chromeApps.chrome.ToStringLiteral
import typingsSlinky.chromeApps.chromeAppsStrings.LAST_WRITE_WIN
import typingsSlinky.chromeApps.chromeAppsStrings.MANUAL
import typingsSlinky.chromeApps.chromeAppsStrings.last_write_win_
import typingsSlinky.chromeApps.chromeAppsStrings.manual__
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
      /* policy */ ToStringLiteral[
        AnonLASTWRITEWIN, 
        /* keyof chrome-apps.AnonLASTWRITEWIN */ LAST_WRITE_WIN | MANUAL, 
        Exclude[
          /* keyof chrome-apps.AnonLASTWRITEWIN */ LAST_WRITE_WIN | MANUAL, 
          last_write_win_ | manual__
        ]
      ], 
      Unit
    ]
  ): Unit = js.native
}

