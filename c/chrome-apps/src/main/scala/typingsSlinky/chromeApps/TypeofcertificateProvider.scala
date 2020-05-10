package typingsSlinky.chromeApps

import typingsSlinky.chromeApps.chrome.certificateProvider.CertificateInfo
import typingsSlinky.chromeApps.chrome.certificateProvider.PinResponseDetails
import typingsSlinky.chromeApps.chrome.certificateProvider.RequestPinDetails
import typingsSlinky.chromeApps.chrome.certificateProvider.SignRequest
import typingsSlinky.chromeApps.chrome.certificateProvider.StopRequestPinDetails
import typingsSlinky.chromeApps.chrome.events.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofcertificateProvider extends js.Object {
  /**
    * The types of errors that can be presented to the user through the requestPin function.
    * @enum
    */
  val PinRequestErrorType: AnonINVALIDPIN = js.native
  /**
    * The type of code being requested by the extension with requestPin function.
    * @enum
    */
  val PinRequestType: AnonPIN = js.native
  /**
    * This event fires every time the browser requests the current list of
    * certificates provided by this app. The app must call *reportCallback*
    * exactly once with the current list of certificates.
    */
  val onCertificatesRequested: Event[
    js.Function2[
      /* certificates */ js.Array[CertificateInfo], 
      /* callback */ js.Function1[/* rejectedCertificates */ js.Array[js.typedarray.ArrayBuffer], Unit], 
      _
    ]
  ] = js.native
  /**
    * This event fires every time the browser needs to sign
    * a message using a certificate provided by this app
    * in reply to an *onCertificatesRequested* event.
    *
    * The app must sign the data in *request* using the
    * appropriate algorithm and private key and return it by calling
    * *reportCallback*. *reportCallback* must be called exactly once.
    * @param request: Contains the details about the sign request.
    */
  val onSignDigestRequested: Event[
    js.Function2[
      /* signRequest */ SignRequest, 
      /* signCallback */ js.Function1[/* signature */ js.UndefOr[js.typedarray.ArrayBuffer], Unit], 
      _
    ]
  ] = js.native
  /**
    * Requests the PIN from the user. Only one ongoing request at a time is
    * allowed. The requests issued while another flow is ongoing are rejected.
    * It's the apps's responsibility to try again later if another flow is
    * in progress.
    * @param details Contains the details about the requested dialog.
    * @param callback Is called when the dialog is resolved with the user input, or
    * when the dialog request finishes unsuccessfully (e.g. the dialog was
    * canceled by the user or was not allowed to be shown).
    */
  def requestPin(
    details: RequestPinDetails,
    callback: js.Function1[/* details */ js.UndefOr[PinResponseDetails], Unit]
  ): Unit = js.native
  /**
    * @description Stops the pin request started by the *requestPin* function.
    * @param details Contains the details about the reason for stopping the request flow.
    * @param callback To be used by Chrome to send to the app the status from
    * their request to close PIN dialog for user.
    */
  def stopPinRequest(details: StopRequestPinDetails, callback: js.Function0[Unit]): Unit = js.native
}

object TypeofcertificateProvider {
  @scala.inline
  def apply(
    PinRequestErrorType: AnonINVALIDPIN,
    PinRequestType: AnonPIN,
    onCertificatesRequested: Event[
      js.Function2[
        /* certificates */ js.Array[CertificateInfo], 
        /* callback */ js.Function1[/* rejectedCertificates */ js.Array[js.typedarray.ArrayBuffer], Unit], 
        _
      ]
    ],
    onSignDigestRequested: Event[
      js.Function2[
        /* signRequest */ SignRequest, 
        /* signCallback */ js.Function1[/* signature */ js.UndefOr[js.typedarray.ArrayBuffer], Unit], 
        _
      ]
    ],
    requestPin: (RequestPinDetails, js.Function1[/* details */ js.UndefOr[PinResponseDetails], Unit]) => Unit,
    stopPinRequest: (StopRequestPinDetails, js.Function0[Unit]) => Unit
  ): TypeofcertificateProvider = {
    val __obj = js.Dynamic.literal(PinRequestErrorType = PinRequestErrorType.asInstanceOf[js.Any], PinRequestType = PinRequestType.asInstanceOf[js.Any], onCertificatesRequested = onCertificatesRequested.asInstanceOf[js.Any], onSignDigestRequested = onSignDigestRequested.asInstanceOf[js.Any], requestPin = js.Any.fromFunction2(requestPin), stopPinRequest = js.Any.fromFunction2(stopPinRequest))
    __obj.asInstanceOf[TypeofcertificateProvider]
  }
  @scala.inline
  implicit class TypeofcertificateProviderOps[Self <: TypeofcertificateProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPinRequestErrorType(value: AnonINVALIDPIN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PinRequestErrorType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPinRequestType(value: AnonPIN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PinRequestType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnCertificatesRequested(
      value: Event[
          js.Function2[
            /* certificates */ js.Array[CertificateInfo], 
            /* callback */ js.Function1[/* rejectedCertificates */ js.Array[js.typedarray.ArrayBuffer], Unit], 
            _
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCertificatesRequested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnSignDigestRequested(
      value: Event[
          js.Function2[
            /* signRequest */ SignRequest, 
            /* signCallback */ js.Function1[/* signature */ js.UndefOr[js.typedarray.ArrayBuffer], Unit], 
            _
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSignDigestRequested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestPin(
      value: (RequestPinDetails, js.Function1[/* details */ js.UndefOr[PinResponseDetails], Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestPin")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withStopPinRequest(value: (StopRequestPinDetails, js.Function0[Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopPinRequest")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

