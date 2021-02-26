package typingsSlinky.jose.mod

import typingsSlinky.jose.joseStrings.ERR_JOSE_ALG_NOT_WHITELISTED
import typingsSlinky.jose.joseStrings.ERR_JOSE_CRIT_NOT_UNDERSTOOD
import typingsSlinky.jose.joseStrings.ERR_JOSE_INVALID_ENCODING
import typingsSlinky.jose.joseStrings.ERR_JOSE_MULTIPLE_ERRORS
import typingsSlinky.jose.joseStrings.ERR_JOSE_NOT_SUPPORTED
import typingsSlinky.jose.joseStrings.ERR_JWE_DECRYPTION_FAILED
import typingsSlinky.jose.joseStrings.ERR_JWE_INVALID
import typingsSlinky.jose.joseStrings.ERR_JWKS_NO_MATCHING_KEY
import typingsSlinky.jose.joseStrings.ERR_JWK_IMPORT_FAILED
import typingsSlinky.jose.joseStrings.ERR_JWK_INVALID
import typingsSlinky.jose.joseStrings.ERR_JWK_KEY_SUPPORT
import typingsSlinky.jose.joseStrings.ERR_JWS_INVALID
import typingsSlinky.jose.joseStrings.ERR_JWS_VERIFICATION_FAILED
import typingsSlinky.jose.joseStrings.ERR_JWT_EXPIRED
import typingsSlinky.jose.joseStrings.ERR_JWT_MALFORMED
import typingsSlinky.jose.joseStrings.check_failed
import typingsSlinky.jose.joseStrings.invalid
import typingsSlinky.jose.joseStrings.missing
import typingsSlinky.jose.joseStrings.prohibited
import typingsSlinky.jose.joseStrings.unspecified
import typingsSlinky.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errors {
  
  @JSImport("jose", "errors.JOSEAlgNotWhitelisted")
  @js.native
  class JOSEAlgNotWhitelisted () extends JOSEError[ERR_JOSE_ALG_NOT_WHITELISTED]
  
  @JSImport("jose", "errors.JOSECritNotUnderstood")
  @js.native
  class JOSECritNotUnderstood () extends JOSEError[ERR_JOSE_CRIT_NOT_UNDERSTOOD]
  
  @JSImport("jose", "errors.JOSEError")
  @js.native
  class JOSEError[T] () extends Error {
    
    var code: T = js.native
  }
  
  @JSImport("jose", "errors.JOSEInvalidEncoding")
  @js.native
  class JOSEInvalidEncoding () extends JOSEError[ERR_JOSE_INVALID_ENCODING]
  
  @JSImport("jose", "errors.JOSEMultiError")
  @js.native
  class JOSEMultiError () extends JOSEError[ERR_JOSE_MULTIPLE_ERRORS]
  
  @JSImport("jose", "errors.JOSENotSupported")
  @js.native
  class JOSENotSupported () extends JOSEError[ERR_JOSE_NOT_SUPPORTED]
  
  @JSImport("jose", "errors.JWEDecryptionFailed")
  @js.native
  class JWEDecryptionFailed () extends JOSEError[ERR_JWE_DECRYPTION_FAILED]
  
  @JSImport("jose", "errors.JWEInvalid")
  @js.native
  class JWEInvalid () extends JOSEError[ERR_JWE_INVALID]
  
  @JSImport("jose", "errors.JWKImportFailed")
  @js.native
  class JWKImportFailed () extends JOSEError[ERR_JWK_IMPORT_FAILED]
  
  @JSImport("jose", "errors.JWKInvalid")
  @js.native
  class JWKInvalid () extends JOSEError[ERR_JWK_INVALID]
  
  @JSImport("jose", "errors.JWKKeySupport")
  @js.native
  class JWKKeySupport () extends JOSEError[ERR_JWK_KEY_SUPPORT]
  
  @JSImport("jose", "errors.JWKSNoMatchingKey")
  @js.native
  class JWKSNoMatchingKey () extends JOSEError[ERR_JWKS_NO_MATCHING_KEY]
  
  @JSImport("jose", "errors.JWSInvalid")
  @js.native
  class JWSInvalid () extends JOSEError[ERR_JWS_INVALID]
  
  @JSImport("jose", "errors.JWSVerificationFailed")
  @js.native
  class JWSVerificationFailed () extends JOSEError[ERR_JWS_VERIFICATION_FAILED]
  
  @JSImport("jose", "errors.JWTClaimInvalid")
  @js.native
  class JWTClaimInvalid[T] () extends JOSEError[T] {
    def this(message: String) = this()
    def this(message: js.UndefOr[scala.Nothing], claim: String) = this()
    def this(message: String, claim: String) = this()
    def this(message: js.UndefOr[scala.Nothing], claim: js.UndefOr[scala.Nothing], reason: String) = this()
    def this(message: js.UndefOr[scala.Nothing], claim: String, reason: String) = this()
    def this(message: String, claim: js.UndefOr[scala.Nothing], reason: String) = this()
    def this(message: String, claim: String, reason: String) = this()
    
    var claim: String = js.native
    
    var reason: prohibited | missing | invalid | check_failed | unspecified = js.native
  }
  
  @JSImport("jose", "errors.JWTExpired")
  @js.native
  class JWTExpired () extends JWTClaimInvalid[ERR_JWT_EXPIRED] {
    def this(message: String) = this()
    def this(message: js.UndefOr[scala.Nothing], claim: String) = this()
    def this(message: String, claim: String) = this()
    def this(message: js.UndefOr[scala.Nothing], claim: js.UndefOr[scala.Nothing], reason: String) = this()
    def this(message: js.UndefOr[scala.Nothing], claim: String, reason: String) = this()
    def this(message: String, claim: js.UndefOr[scala.Nothing], reason: String) = this()
    def this(message: String, claim: String, reason: String) = this()
  }
  
  @JSImport("jose", "errors.JWTMalformed")
  @js.native
  class JWTMalformed () extends JOSEError[ERR_JWT_MALFORMED]
}
