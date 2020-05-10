package typingsSlinky.chromeApps.chrome.notifications

import typingsSlinky.chromeApps.AnonDENIED
import typingsSlinky.chromeApps.chrome.ToStringLiteral
import typingsSlinky.chromeApps.chromeAppsStrings.DENIED
import typingsSlinky.chromeApps.chromeAppsStrings.GRANTED
import typingsSlinky.chromeApps.chromeAppsStrings.denied_
import typingsSlinky.chromeApps.chromeAppsStrings.granted_
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.notifications.getPermissionLevel")
@js.native
object getPermissionLevel extends js.Object {
  /**
    * Retrieves whether the user has enabled notifications from this app .
    * @since Chrome 32.
    * @param callback Returns the current permission level.
    * @see enum PermissionLevel
    */
  def apply(
    callback: js.Function1[
      /* level */ ToStringLiteral[
        AnonDENIED, 
        /* keyof chrome-apps.AnonDENIED */ GRANTED | DENIED, 
        Exclude[/* keyof chrome-apps.AnonDENIED */ GRANTED | DENIED, granted_ | denied_]
      ], 
      Unit
    ]
  ): Unit = js.native
}

