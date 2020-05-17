package typingsSlinky.chromeApps.chrome.certificateProvider

import typingsSlinky.chromeApps.anon.INVALIDPIN
import typingsSlinky.chromeApps.anon.PIN
import typingsSlinky.chromeApps.chrome.ToStringLiteral
import typingsSlinky.chromeApps.chromeAppsStrings.INVALID_PIN
import typingsSlinky.chromeApps.chromeAppsStrings.INVALID_PUK
import typingsSlinky.chromeApps.chromeAppsStrings.MAX_ATTEMPTS_EXCEEDED
import typingsSlinky.chromeApps.chromeAppsStrings.PUK
import typingsSlinky.chromeApps.chromeAppsStrings.UNKNOWN_ERROR
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestPinDetails extends js.Object {
  /**
    * The number of attempts left. This is provided so that any UI can present
    * this information to the user. Chrome is not expected to enforce this,
    * instead stopPinRequest should be called by the app with
    * errorType = MAX_ATTEMPTS_EXCEEDED when the number of pin requests is
    * exceeded.
    */
  var attemptsLeft: js.UndefOr[Double] = js.native
  /**
    * The error template displayed to the user. This should be set if the
    * previous request failed, to notify the user of the failure reason.
    * @see PinRequestErrorType
    */
  var errorType: js.UndefOr[
    ToStringLiteral[
      INVALIDPIN, 
      /* keyof chrome-apps.anon.INVALIDPIN */ INVALID_PIN | INVALID_PUK | MAX_ATTEMPTS_EXCEEDED | UNKNOWN_ERROR, 
      Exclude[
        /* keyof chrome-apps.anon.INVALIDPIN */ INVALID_PIN | INVALID_PUK | MAX_ATTEMPTS_EXCEEDED | UNKNOWN_ERROR, 
        INVALID_PIN | INVALID_PUK | MAX_ATTEMPTS_EXCEEDED | UNKNOWN_ERROR
      ]
    ]
  ] = js.native
  /**
    * The type of code requested. Default is PIN.
    * @see PinRequestType
    */
  var requestType: js.UndefOr[
    ToStringLiteral[
      PIN, 
      /* keyof chrome-apps.anon.PIN */ typingsSlinky.chromeApps.chromeAppsStrings.PIN | PUK, 
      Exclude[
        /* keyof chrome-apps.anon.PIN */ typingsSlinky.chromeApps.chromeAppsStrings.PIN | PUK, 
        typingsSlinky.chromeApps.chromeAppsStrings.PIN | PUK
      ]
    ]
  ] = js.native
  /**
    * The ID given by Chrome in SignRequest.
    */
  var signRequestId: Double = js.native
}

object RequestPinDetails {
  @scala.inline
  def apply(signRequestId: Double): RequestPinDetails = {
    val __obj = js.Dynamic.literal(signRequestId = signRequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestPinDetails]
  }
  @scala.inline
  implicit class RequestPinDetailsOps[Self <: RequestPinDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSignRequestId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signRequestId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttemptsLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attemptsLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttemptsLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attemptsLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorType(
      value: ToStringLiteral[
          INVALIDPIN, 
          /* keyof chrome-apps.anon.INVALIDPIN */ INVALID_PIN | INVALID_PUK | MAX_ATTEMPTS_EXCEEDED | UNKNOWN_ERROR, 
          Exclude[
            /* keyof chrome-apps.anon.INVALIDPIN */ INVALID_PIN | INVALID_PUK | MAX_ATTEMPTS_EXCEEDED | UNKNOWN_ERROR, 
            INVALID_PIN | INVALID_PUK | MAX_ATTEMPTS_EXCEEDED | UNKNOWN_ERROR
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorType")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestType(
      value: ToStringLiteral[
          PIN, 
          /* keyof chrome-apps.anon.PIN */ typingsSlinky.chromeApps.chromeAppsStrings.PIN | PUK, 
          Exclude[
            /* keyof chrome-apps.anon.PIN */ typingsSlinky.chromeApps.chromeAppsStrings.PIN | PUK, 
            typingsSlinky.chromeApps.chromeAppsStrings.PIN | PUK
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestType")(js.undefined)
        ret
    }
  }
  
}

