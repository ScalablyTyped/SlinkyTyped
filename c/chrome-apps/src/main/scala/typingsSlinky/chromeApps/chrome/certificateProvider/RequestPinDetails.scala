package typingsSlinky.chromeApps.chrome.certificateProvider

import typingsSlinky.chromeApps.AnonINVALIDPIN
import typingsSlinky.chromeApps.AnonPIN
import typingsSlinky.chromeApps.chrome.ToStringLiteral
import typingsSlinky.chromeApps.chromeAppsStrings.INVALID_PIN
import typingsSlinky.chromeApps.chromeAppsStrings.INVALID_PUK
import typingsSlinky.chromeApps.chromeAppsStrings.MAX_ATTEMPTS_EXCEEDED
import typingsSlinky.chromeApps.chromeAppsStrings.PIN
import typingsSlinky.chromeApps.chromeAppsStrings.PUK
import typingsSlinky.chromeApps.chromeAppsStrings.UNKNOWN_ERROR
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestPinDetails extends js.Object {
  /**
    * The number of attempts left. This is provided so that any UI can present
    * this information to the user. Chrome is not expected to enforce this,
    * instead stopPinRequest should be called by the app with
    * errorType = MAX_ATTEMPTS_EXCEEDED when the number of pin requests is
    * exceeded.
    */
  var attemptsLeft: js.UndefOr[Double] = js.undefined
  /**
    * The error template displayed to the user. This should be set if the
    * previous request failed, to notify the user of the failure reason.
    * @see PinRequestErrorType
    */
  var errorType: js.UndefOr[
    ToStringLiteral[
      AnonINVALIDPIN, 
      String, 
      Exclude[String, INVALID_PIN | INVALID_PUK | MAX_ATTEMPTS_EXCEEDED | UNKNOWN_ERROR]
    ]
  ] = js.undefined
  /**
    * The type of code requested. Default is PIN.
    * @see PinRequestType
    */
  var requestType: js.UndefOr[ToStringLiteral[AnonPIN, String, Exclude[String, PIN | PUK]]] = js.undefined
  /**
    * The ID given by Chrome in SignRequest.
    */
  var signRequestId: Double
}

object RequestPinDetails {
  @scala.inline
  def apply(
    signRequestId: Double,
    attemptsLeft: Int | Double = null,
    errorType: ToStringLiteral[
      AnonINVALIDPIN, 
      String, 
      Exclude[String, INVALID_PIN | INVALID_PUK | MAX_ATTEMPTS_EXCEEDED | UNKNOWN_ERROR]
    ] = null,
    requestType: ToStringLiteral[AnonPIN, String, Exclude[String, PIN | PUK]] = null
  ): RequestPinDetails = {
    val __obj = js.Dynamic.literal(signRequestId = signRequestId.asInstanceOf[js.Any])
    if (attemptsLeft != null) __obj.updateDynamic("attemptsLeft")(attemptsLeft.asInstanceOf[js.Any])
    if (errorType != null) __obj.updateDynamic("errorType")(errorType.asInstanceOf[js.Any])
    if (requestType != null) __obj.updateDynamic("requestType")(requestType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestPinDetails]
  }
}

