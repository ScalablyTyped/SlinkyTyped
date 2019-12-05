package typingsSlinky.chromeDashApps.chrome.certificateProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The types of errors that can be presented to the user through the requestPin function.
  * @enum
  */
@JSGlobal("chrome.certificateProvider.PinRequestErrorType")
@js.native
object PinRequestErrorType extends js.Object {
  var INVALID_PIN: typingsSlinky.chromeDashApps.chromeDashAppsStrings.INVALID_PIN = js.native
  var INVALID_PUK: typingsSlinky.chromeDashApps.chromeDashAppsStrings.INVALID_PUK = js.native
  var MAX_ATTEMPTS_EXCEEDED: typingsSlinky.chromeDashApps.chromeDashAppsStrings.MAX_ATTEMPTS_EXCEEDED = js.native
  var UNKNOWN_ERROR: typingsSlinky.chromeDashApps.chromeDashAppsStrings.UNKNOWN_ERROR = js.native
}

