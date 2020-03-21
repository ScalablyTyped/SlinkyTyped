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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jose", "errors")
@js.native
object errors extends js.Object {
  @js.native
  class JOSEAlgNotWhitelisted () extends JOSEError[ERR_JOSE_ALG_NOT_WHITELISTED]
  
  @js.native
  class JOSECritNotUnderstood () extends JOSEError[ERR_JOSE_CRIT_NOT_UNDERSTOOD]
  
  @js.native
  class JOSEError[T] () extends Error {
    var code: T = js.native
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
  @js.native
  class JOSEInvalidEncoding () extends JOSEError[ERR_JOSE_INVALID_ENCODING]
  
  @js.native
  class JOSEMultiError () extends JOSEError[ERR_JOSE_MULTIPLE_ERRORS]
  
  @js.native
  class JOSENotSupported () extends JOSEError[ERR_JOSE_NOT_SUPPORTED]
  
  @js.native
  class JWEDecryptionFailed () extends JOSEError[ERR_JWE_DECRYPTION_FAILED]
  
  @js.native
  class JWEInvalid () extends JOSEError[ERR_JWE_INVALID]
  
  @js.native
  class JWKImportFailed () extends JOSEError[ERR_JWK_IMPORT_FAILED]
  
  @js.native
  class JWKInvalid () extends JOSEError[ERR_JWK_INVALID]
  
  @js.native
  class JWKKeySupport () extends JOSEError[ERR_JWK_KEY_SUPPORT]
  
  @js.native
  class JWKSNoMatchingKey () extends JOSEError[ERR_JWKS_NO_MATCHING_KEY]
  
  @js.native
  class JWSInvalid () extends JOSEError[ERR_JWS_INVALID]
  
  @js.native
  class JWSVerificationFailed () extends JOSEError[ERR_JWS_VERIFICATION_FAILED]
  
  @js.native
  class JWTClaimInvalid[T] () extends JOSEError[T] {
    def this(message: String) = this()
    def this(message: String, claim: String) = this()
    def this(message: String, claim: String, reason: String) = this()
    var claim: String = js.native
    var reason: prohibited | missing | invalid | check_failed | unspecified = js.native
  }
  
  @js.native
  class JWTExpired () extends JWTClaimInvalid[ERR_JWT_EXPIRED]
  
  @js.native
  class JWTMalformed () extends JOSEError[ERR_JWT_MALFORMED]
  
}

