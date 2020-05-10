package typingsSlinky.chromeApps.chrome.networking.config

import typingsSlinky.chromeApps.AnonFAILED
import typingsSlinky.chromeApps.chrome.ToStringLiteral
import typingsSlinky.chromeApps.chromeAppsStrings.FAILED
import typingsSlinky.chromeApps.chromeAppsStrings.REJECTED
import typingsSlinky.chromeApps.chromeAppsStrings.SUCCEEDED
import typingsSlinky.chromeApps.chromeAppsStrings.UNHANDLED
import typingsSlinky.chromeApps.chromeAppsStrings.failed_
import typingsSlinky.chromeApps.chromeAppsStrings.rejected_
import typingsSlinky.chromeApps.chromeAppsStrings.succeeded_
import typingsSlinky.chromeApps.chromeAppsStrings.unhandled_
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
    result: ToStringLiteral[
      AnonFAILED, 
      /* keyof chrome-apps.AnonFAILED */ UNHANDLED | SUCCEEDED | REJECTED | FAILED, 
      Exclude[
        /* keyof chrome-apps.AnonFAILED */ UNHANDLED | SUCCEEDED | REJECTED | FAILED, 
        unhandled_ | succeeded_ | rejected_ | failed_
      ]
    ]
  ): Unit = js.native
  def apply(
    GUID: String,
    result: ToStringLiteral[
      AnonFAILED, 
      /* keyof chrome-apps.AnonFAILED */ UNHANDLED | SUCCEEDED | REJECTED | FAILED, 
      Exclude[
        /* keyof chrome-apps.AnonFAILED */ UNHANDLED | SUCCEEDED | REJECTED | FAILED, 
        unhandled_ | succeeded_ | rejected_ | failed_
      ]
    ],
    callback: js.Function0[Unit]
  ): Unit = js.native
}

