package typingsSlinky.chromeApps.chrome.syncFileSystem

import typingsSlinky.chromeApps.AnonAUTHENTICATIONREQUIRED
import typingsSlinky.chromeApps.chrome.ToStringLiteral
import typingsSlinky.chromeApps.chromeAppsStrings.authentication_required
import typingsSlinky.chromeApps.chromeAppsStrings.disabled_
import typingsSlinky.chromeApps.chromeAppsStrings.initializing
import typingsSlinky.chromeApps.chromeAppsStrings.running
import typingsSlinky.chromeApps.chromeAppsStrings.temporary_unavailable
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.syncFileSystem.getServiceStatus")
@js.native
object getServiceStatus extends js.Object {
  /**
    * Returns the current sync backend status.
    * @since Chrome 31.
    * @param callback
    * @see ServiceStatus
    */
  def apply(
    callback: js.Function1[
      /* status */ ToStringLiteral[
        AnonAUTHENTICATIONREQUIRED, 
        String, 
        Exclude[
          String, 
          temporary_unavailable | authentication_required | disabled_ | initializing | running
        ]
      ], 
      Unit
    ]
  ): Unit = js.native
}

