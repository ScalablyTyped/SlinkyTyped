package typingsSlinky.chromeApps.chrome.runtime

import typingsSlinky.chromeApps.AnonNOUPDATE
import typingsSlinky.chromeApps.chrome.ToStringLiteral
import typingsSlinky.chromeApps.chromeAppsStrings.NO_UPDATE
import typingsSlinky.chromeApps.chromeAppsStrings.THROTTLED
import typingsSlinky.chromeApps.chromeAppsStrings.UPDATE_AVAILABLE
import typingsSlinky.chromeApps.chromeAppsStrings.no_update_
import typingsSlinky.chromeApps.chromeAppsStrings.throttled_
import typingsSlinky.chromeApps.chromeAppsStrings.update_available_
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
      /* status */ ToStringLiteral[
        AnonNOUPDATE, 
        /* keyof chrome-apps.AnonNOUPDATE */ THROTTLED | NO_UPDATE | UPDATE_AVAILABLE, 
        Exclude[
          /* keyof chrome-apps.AnonNOUPDATE */ THROTTLED | NO_UPDATE | UPDATE_AVAILABLE, 
          throttled_ | no_update_ | update_available_
        ]
      ], 
      /* details */ js.UndefOr[UpdateCheckDetails], 
      Unit
    ]
  ): Unit = js.native
}

