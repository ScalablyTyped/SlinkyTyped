package typingsSlinky.chromeDashApps.chrome.syncFileSystem

import typingsSlinky.chromeDashApps.Anon_AUTHENTICATIONREQUIRED
import typingsSlinky.chromeDashApps.chrome.ToStringLiteral
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.authentication_required
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.disabled_
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.initializing
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.running
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.temporary_unavailable
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
        Anon_AUTHENTICATIONREQUIRED, 
        String, 
        Exclude[
          String, 
          initializing | running | temporary_unavailable | authentication_required | disabled_
        ]
      ], 
      Unit
    ]
  ): Unit = js.native
}

