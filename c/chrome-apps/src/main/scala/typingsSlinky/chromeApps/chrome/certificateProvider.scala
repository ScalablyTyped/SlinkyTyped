package typingsSlinky.chromeApps.chrome

import typingsSlinky.chromeApps.anon.INVALIDPIN
import typingsSlinky.chromeApps.anon.PIN
import typingsSlinky.chromeApps.chromeAppsStrings.INVALID_PIN
import typingsSlinky.chromeApps.chromeAppsStrings.INVALID_PUK
import typingsSlinky.chromeApps.chromeAppsStrings.MAX_ATTEMPTS_EXCEEDED
import typingsSlinky.chromeApps.chromeAppsStrings.PUK
import typingsSlinky.chromeApps.chromeAppsStrings.UNKNOWN_ERROR
import typingsSlinky.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region chrome.certificateProvider
//////////////////////////
// Certificate Provider //
//////////////////////////
/**
  * @requires(CrOS) Chrome OS only.
  * @requires Permissions: 'certificateProvider'
  * @description
  * Use this API to expose certificates to the platform which
  * can use these certificates for TLS authentications.
  */
object certificateProvider {
  
  @js.native
  trait CertificateInfo extends StObject {
    
    /**
      * Must be the DER encoding of a X.509 certificate. Currently, only
      * certificates of RSA keys are supported.
      */
    var certificate: js.UndefOr[js.typedarray.ArrayBuffer] = js.native
    
    /**
      * Must be set to all hashes supported for this certificate. This app
      * will only be asked for signatures of digests calculated with one of these
      * hash algorithms. This should be in order of decreasing hash preference.
      * @see Hash
      */
    var supportedHashes: js.UndefOr[js.Array[Hash]] = js.native
  }
  object CertificateInfo {
    
    @scala.inline
    def apply(): CertificateInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CertificateInfo]
    }
    
    @scala.inline
    implicit class CertificateInfoMutableBuilder[Self <: CertificateInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCertificate(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertificateUndefined: Self = StObject.set(x, "certificate", js.undefined)
      
      @scala.inline
      def setSupportedHashes(value: js.Array[Hash]): Self = StObject.set(x, "supportedHashes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportedHashesUndefined: Self = StObject.set(x, "supportedHashes", js.undefined)
      
      @scala.inline
      def setSupportedHashesVarargs(value: Hash*): Self = StObject.set(x, "supportedHashes", js.Array(value :_*))
    }
  }
  
  /** Hash type */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.chromeApps.chromeAppsStrings.MD5_SHA1
    - typingsSlinky.chromeApps.chromeAppsStrings.SHA1
    - typingsSlinky.chromeApps.chromeAppsStrings.SHA256
    - typingsSlinky.chromeApps.chromeAppsStrings.SHA384
    - typingsSlinky.chromeApps.chromeAppsStrings.SHA512
  */
  trait Hash extends StObject
  object Hash {
    
    @scala.inline
    def MD5_SHA1: typingsSlinky.chromeApps.chromeAppsStrings.MD5_SHA1 = "MD5_SHA1".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.MD5_SHA1]
    
    @scala.inline
    def SHA1: typingsSlinky.chromeApps.chromeAppsStrings.SHA1 = "SHA1".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.SHA1]
    
    @scala.inline
    def SHA256: typingsSlinky.chromeApps.chromeAppsStrings.SHA256 = "SHA256".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.SHA256]
    
    @scala.inline
    def SHA384: typingsSlinky.chromeApps.chromeAppsStrings.SHA384 = "SHA384".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.SHA384]
    
    @scala.inline
    def SHA512: typingsSlinky.chromeApps.chromeAppsStrings.SHA512 = "SHA512".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.SHA512]
  }
  
  @js.native
  trait PinResponseDetails extends StObject {
    
    var userInput: js.UndefOr[String] = js.native
  }
  object PinResponseDetails {
    
    @scala.inline
    def apply(): PinResponseDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PinResponseDetails]
    }
    
    @scala.inline
    implicit class PinResponseDetailsMutableBuilder[Self <: PinResponseDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUserInput(value: String): Self = StObject.set(x, "userInput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserInputUndefined: Self = StObject.set(x, "userInput", js.undefined)
    }
  }
  
  @js.native
  trait RequestPinDetails extends StObject {
    
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
    implicit class RequestPinDetailsMutableBuilder[Self <: RequestPinDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttemptsLeft(value: Double): Self = StObject.set(x, "attemptsLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttemptsLeftUndefined: Self = StObject.set(x, "attemptsLeft", js.undefined)
      
      @scala.inline
      def setErrorType(
        value: ToStringLiteral[
              INVALIDPIN, 
              /* keyof chrome-apps.anon.INVALIDPIN */ INVALID_PIN | INVALID_PUK | MAX_ATTEMPTS_EXCEEDED | UNKNOWN_ERROR, 
              Exclude[
                /* keyof chrome-apps.anon.INVALIDPIN */ INVALID_PIN | INVALID_PUK | MAX_ATTEMPTS_EXCEEDED | UNKNOWN_ERROR, 
                INVALID_PIN | INVALID_PUK | MAX_ATTEMPTS_EXCEEDED | UNKNOWN_ERROR
              ]
            ]
      ): Self = StObject.set(x, "errorType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorTypeUndefined: Self = StObject.set(x, "errorType", js.undefined)
      
      @scala.inline
      def setRequestType(
        value: ToStringLiteral[
              PIN, 
              /* keyof chrome-apps.anon.PIN */ typingsSlinky.chromeApps.chromeAppsStrings.PIN | PUK, 
              Exclude[
                /* keyof chrome-apps.anon.PIN */ typingsSlinky.chromeApps.chromeAppsStrings.PIN | PUK, 
                typingsSlinky.chromeApps.chromeAppsStrings.PIN | PUK
              ]
            ]
      ): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestTypeUndefined: Self = StObject.set(x, "requestType", js.undefined)
      
      @scala.inline
      def setSignRequestId(value: Double): Self = StObject.set(x, "signRequestId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SignRequest extends StObject {
    
    /**
      * The DER encoding of a X.509 certificate. The app must sign
      * *digest* using the associated private key.
      */
    var certificate: js.typedarray.ArrayBuffer = js.native
    
    /** The digest that must be signed */
    var digest: js.typedarray.ArrayBuffer = js.native
    
    /** Refers to the hash algorithm that was used to create *digest*. */
    var hash: Hash = js.native
    
    /**
      * The unique ID to be used by the app should it need to call a method
      * that requires it, e.g. requestPin.
      */
    var signRequestId: integer = js.native
  }
  object SignRequest {
    
    @scala.inline
    def apply(
      certificate: js.typedarray.ArrayBuffer,
      digest: js.typedarray.ArrayBuffer,
      hash: Hash,
      signRequestId: integer
    ): SignRequest = {
      val __obj = js.Dynamic.literal(certificate = certificate.asInstanceOf[js.Any], digest = digest.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], signRequestId = signRequestId.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignRequest]
    }
    
    @scala.inline
    implicit class SignRequestMutableBuilder[Self <: SignRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCertificate(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDigest(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHash(value: Hash): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignRequestId(value: integer): Self = StObject.set(x, "signRequestId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StopRequestPinDetails extends StObject {
    
    /**
      * The error template. If present it is displayed to user. Intended to
      * contain the reason for stopping the flow if it was caused by an error,
      * e.g. MAX_ATTEMPTS_EXCEEDED.
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
      * The ID given by Chrome in SignRequest
      */
    var signRequestId: Double = js.native
  }
  object StopRequestPinDetails {
    
    @scala.inline
    def apply(signRequestId: Double): StopRequestPinDetails = {
      val __obj = js.Dynamic.literal(signRequestId = signRequestId.asInstanceOf[js.Any])
      __obj.asInstanceOf[StopRequestPinDetails]
    }
    
    @scala.inline
    implicit class StopRequestPinDetailsMutableBuilder[Self <: StopRequestPinDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrorType(
        value: ToStringLiteral[
              INVALIDPIN, 
              /* keyof chrome-apps.anon.INVALIDPIN */ INVALID_PIN | INVALID_PUK | MAX_ATTEMPTS_EXCEEDED | UNKNOWN_ERROR, 
              Exclude[
                /* keyof chrome-apps.anon.INVALIDPIN */ INVALID_PIN | INVALID_PUK | MAX_ATTEMPTS_EXCEEDED | UNKNOWN_ERROR, 
                INVALID_PIN | INVALID_PUK | MAX_ATTEMPTS_EXCEEDED | UNKNOWN_ERROR
              ]
            ]
      ): Self = StObject.set(x, "errorType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorTypeUndefined: Self = StObject.set(x, "errorType", js.undefined)
      
      @scala.inline
      def setSignRequestId(value: Double): Self = StObject.set(x, "signRequestId", value.asInstanceOf[js.Any])
    }
  }
}
