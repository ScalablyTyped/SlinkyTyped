package typingsSlinky.chromeApps.chrome.syncFileSystem

import typingsSlinky.chromeApps.AnonAUTHENTICATIONREQUIRED
import typingsSlinky.chromeApps.chrome.ToStringLiteral
import typingsSlinky.chromeApps.chromeAppsStrings.AUTHENTICATION_REQUIRED
import typingsSlinky.chromeApps.chromeAppsStrings.DISABLED
import typingsSlinky.chromeApps.chromeAppsStrings.INITIALIZING
import typingsSlinky.chromeApps.chromeAppsStrings.RUNNING
import typingsSlinky.chromeApps.chromeAppsStrings.TEMPORARY_UNAVAILABLE
import typingsSlinky.chromeApps.chromeAppsStrings.authentication_required_
import typingsSlinky.chromeApps.chromeAppsStrings.disabled__
import typingsSlinky.chromeApps.chromeAppsStrings.initializing_
import typingsSlinky.chromeApps.chromeAppsStrings.running_
import typingsSlinky.chromeApps.chromeAppsStrings.temporary_unavailable_
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
        /* keyof chrome-apps.AnonAUTHENTICATIONREQUIRED */ INITIALIZING | RUNNING | AUTHENTICATION_REQUIRED | TEMPORARY_UNAVAILABLE | DISABLED, 
        Exclude[
          /* keyof chrome-apps.AnonAUTHENTICATIONREQUIRED */ INITIALIZING | RUNNING | AUTHENTICATION_REQUIRED | TEMPORARY_UNAVAILABLE | DISABLED, 
          temporary_unavailable_ | authentication_required_ | disabled__ | initializing_ | running_
        ]
      ], 
      Unit
    ]
  ): Unit = js.native
}

