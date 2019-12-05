package typingsSlinky.chromeDashApps.chrome.networking.config

import typingsSlinky.chromeDashApps.Anon_FAILED
import typingsSlinky.chromeDashApps.chrome.ToStringLiteral
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.failed_
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.rejected
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.succeeded
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.unhandled
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.networking.config.finishAuthentication")
@js.native
object finishAuthentication extends js.Object {
  /**
    * Called by the app to notify the network config API that it finished
    * a captive portal authentication attempt and hand over the result of the attempt.
    * This function must only be called with the GUID of the latest *onCaptivePortalDetected* event.
    * @param GUID Unique network identifier obtained from *onCaptivePortalDetected*.
    * @param result The result of the authentication attempt.
    * @param [callback] Called back when this operation is finished.
    */
  def apply(
    GUID: String,
    result: ToStringLiteral[Anon_FAILED, String, Exclude[String, unhandled | succeeded | rejected | failed_]]
  ): Unit = js.native
  def apply(
    GUID: String,
    result: ToStringLiteral[Anon_FAILED, String, Exclude[String, unhandled | succeeded | rejected | failed_]],
    callback: js.Function0[Unit]
  ): Unit = js.native
}

