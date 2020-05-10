package typingsSlinky.chromeApps.chrome.system.storage

import typingsSlinky.chromeApps.AnonFAILURE
import typingsSlinky.chromeApps.chrome.ToStringLiteral
import typingsSlinky.chromeApps.chromeAppsStrings.FAILURE
import typingsSlinky.chromeApps.chromeAppsStrings.IN_USE
import typingsSlinky.chromeApps.chromeAppsStrings.NO_SUCH_DEVICE
import typingsSlinky.chromeApps.chromeAppsStrings.SUCCESS
import typingsSlinky.chromeApps.chromeAppsStrings.failure_
import typingsSlinky.chromeApps.chromeAppsStrings.in_use_
import typingsSlinky.chromeApps.chromeAppsStrings.no_such_device_
import typingsSlinky.chromeApps.chromeAppsStrings.success_
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.system.storage.ejectDevice")
@js.native
object ejectDevice extends js.Object {
  /**
    * Ejects a removable storage device.
    * @param callback
    * Parameter **result**:
    *
    * **success:** The ejection command is successful -- the application can prompt the user to remove the device;
    *
    * **in_use:** The device is in use by another application. The ejection did not succeed;
    *   the user should not remove the device until the other application is done with the device;
    *
    * **no_such_device:** There is no such device known.
    *
    * **failure:** The ejection command failed.
    */
  def apply(
    id: String,
    callback: js.Function1[
      /* result */ ToStringLiteral[
        AnonFAILURE, 
        /* keyof chrome-apps.AnonFAILURE */ SUCCESS | IN_USE | NO_SUCH_DEVICE | FAILURE, 
        Exclude[
          /* keyof chrome-apps.AnonFAILURE */ SUCCESS | IN_USE | NO_SUCH_DEVICE | FAILURE, 
          success_ | in_use_ | no_such_device_ | failure_
        ]
      ], 
      Unit
    ]
  ): Unit = js.native
}

