package typingsSlinky.chromeDashApps.chrome.runtime

import typingsSlinky.chromeDashApps.Anon_NOUPDATE
import typingsSlinky.chromeDashApps.chrome.ToStringLiteral
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.no_update
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.throttled
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.update_available
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.runtime.requestUpdateCheck")
@js.native
object requestUpdateCheck extends js.Object {
  /**
    * Requests an update check for this app.
    * @since Chrome 25.
    * @param callback
    * Parameter status: Result of the update check. See enum RequestUpdateCheckStatus.
    * Optional parameter details: If an update is available, this contains more information about the available update.
    */
  def apply(
    callback: js.Function2[
      /* status */ ToStringLiteral[Anon_NOUPDATE, String, Exclude[String, throttled | no_update | update_available]], 
      /* details */ js.UndefOr[UpdateCheckDetails], 
      Unit
    ]
  ): Unit = js.native
}

