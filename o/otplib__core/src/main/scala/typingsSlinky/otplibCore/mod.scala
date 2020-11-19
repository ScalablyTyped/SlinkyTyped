package typingsSlinky.otplibCore

import typingsSlinky.otplibCore.authenticatorMod.AuthenticatorOptions_
import typingsSlinky.otplibCore.authenticatorMod.Base32SecretKey
import typingsSlinky.otplibCore.hotpMod.HOTPOptions_
import typingsSlinky.otplibCore.otplibCoreStrings.createRandomBytes
import typingsSlinky.otplibCore.otplibCoreStrings.encoding
import typingsSlinky.otplibCore.otplibCoreStrings.keyDecoder
import typingsSlinky.otplibCore.otplibCoreStrings.keyEncoder
import typingsSlinky.otplibCore.totpMod.EpochAvailable
import typingsSlinky.otplibCore.totpMod.TOTPOptions_
import typingsSlinky.otplibCore.utilsMod.CreateDigest
import typingsSlinky.otplibCore.utilsMod.CreateHmacKey
import typingsSlinky.otplibCore.utilsMod.HexString
import typingsSlinky.otplibCore.utilsMod.KeyEncodings
import typingsSlinky.otplibCore.utilsMod.KeyURIOptions
import typingsSlinky.otplibCore.utilsMod.OTPOptions
import typingsSlinky.otplibCore.utilsMod.SecretKey
import typingsSlinky.std.Partial
import typingsSlinky.std.Pick
import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@otplib/core", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val HASH_ALGORITHMS: js.Array[String] = js.native
  
  val KEY_ENCODINGS: js.Array[String] = js.native
  
  @JSName("STRATEGY")
  val STRATEGY_ : js.Array[String] = js.native
  
  def authenticatorCheckWithWindow[T /* <: AuthenticatorOptions_[String] */](token: String, secret: Base32SecretKey, options: T): Double | Null = js.native
  
  def authenticatorDecoder[T /* <: AuthenticatorOptions_[_] */](secret: Base32SecretKey, options: Pick[T, keyDecoder | encoding]): ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: T['keyDecoder'] */ js.Any
  ] = js.native
  
  def authenticatorDefaultOptions[T /* <: AuthenticatorOptions_[_] */](): Partial[T] = js.native
  
  def authenticatorEncoder[T /* <: AuthenticatorOptions_[_] */](secret: SecretKey, options: Pick[T, keyEncoder | encoding]): ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: T['keyEncoder'] */ js.Any
  ] = js.native
  
  def authenticatorGenerateSecret[T /* <: AuthenticatorOptions_[String] */](numberOfBytes: Double, options: Pick[T, keyEncoder | encoding | createRandomBytes]): Base32SecretKey = js.native
  
  def authenticatorOptionValidator[T /* <: AuthenticatorOptions_[_] */](options: Partial[T]): Unit = js.native
  
  def authenticatorOptions[T /* <: AuthenticatorOptions_[_] */](opt: Partial[T]): T = js.native
  
  def authenticatorToken[T /* <: AuthenticatorOptions_[String] */](secret: Base32SecretKey, options: T): String = js.native
  
  val createDigestPlaceholder: CreateDigest[HexString] = js.native
  
  def hotpCheck[T /* <: HOTPOptions_[_] */](token: String, secret: SecretKey, counter: Double, options: T): Boolean = js.native
  
  def hotpCounter(counter: Double): HexString = js.native
  
  val hotpCreateHmacKey: CreateHmacKey[HexString] = js.native
  
  def hotpDefaultOptions[T /* <: HOTPOptions_[_] */](): Partial[T] = js.native
  
  def hotpDigestToToken(hexDigest: HexString, digits: Double): String = js.native
  
  def hotpKeyuri[T /* <: HOTPOptions_[_] */](accountName: String, issuer: String, secret: SecretKey, counter: Double, options: T): String = js.native
  
  def hotpOptions[T /* <: HOTPOptions_[_] */](opt: Partial[T]): T = js.native
  
  def hotpOptionsValidator[T /* <: HOTPOptions_[_] */](options: Partial[T]): Unit = js.native
  
  def hotpToken[T /* <: HOTPOptions_[_] */](secret: SecretKey, counter: Double, options: T): String = js.native
  
  def isTokenValid(value: String): Boolean = js.native
  
  def keyuri(options: KeyURIOptions): String = js.native
  
  def objectValues[T](value: T): js.Array[String] = js.native
  
  def padStart(value: String, maxLength: Double, fillString: String): String = js.native
  
  def totpCheck[T /* <: TOTPOptions_[_] */](token: String, secret: SecretKey, options: T): Boolean = js.native
  
  def totpCheckByEpoch[T /* <: TOTPOptions_[String] */](epochs: js.Array[Double], token: String, secret: SecretKey, options: T): Double | Null = js.native
  
  def totpCheckWithWindow[T /* <: TOTPOptions_[String] */](token: String, secret: SecretKey, options: T): Double | Null = js.native
  
  def totpCounter(epoch: Double, step: Double): Double = js.native
  
  val totpCreateHmacKey: CreateHmacKey[HexString] = js.native
  
  def totpDefaultOptions[T /* <: TOTPOptions_[_] */](): Partial[T] = js.native
  
  def totpEpochAvailable(epoch: Double, step: Double, win: js.Tuple2[Double, Double]): EpochAvailable = js.native
  def totpEpochAvailable(epoch: Double, step: Double, win: Double): EpochAvailable = js.native
  
  def totpKeyuri[T /* <: TOTPOptions_[_] */](accountName: String, issuer: String, secret: SecretKey, options: T): String = js.native
  
  def totpOptions[T /* <: TOTPOptions_[_] */](opt: Partial[T]): T = js.native
  
  def totpOptionsValidator[T /* <: TOTPOptions_[_] */](options: Partial[T]): Unit = js.native
  
  def totpPadSecret(secret: String, encoding: KeyEncodings, minLength: Double): String = js.native
  
  def totpTimeRemaining(epoch: Double, step: Double): Double = js.native
  
  def totpTimeUsed(epoch: Double, step: Double): Double = js.native
  
  def totpToken[T /* <: TOTPOptions_[_] */](secret: SecretKey, options: T): String = js.native
  
  @js.native
  class Authenticator[T /* <: AuthenticatorOptions_[String] */] ()
    extends typingsSlinky.otplibCore.authenticatorMod.Authenticator[T]
  
  @js.native
  class HOTP[T /* <: HOTPOptions_[String] */] ()
    extends typingsSlinky.otplibCore.hotpMod.HOTP[T]
  
  @js.native
  object HashAlgorithms extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.otplibCore.utilsMod.HashAlgorithms with String] = js.native
    
    /* "sha1" */ val SHA1: typingsSlinky.otplibCore.utilsMod.HashAlgorithms.SHA1 with String = js.native
    
    /* "sha256" */ val SHA256: typingsSlinky.otplibCore.utilsMod.HashAlgorithms.SHA256 with String = js.native
    
    /* "sha512" */ val SHA512: typingsSlinky.otplibCore.utilsMod.HashAlgorithms.SHA512 with String = js.native
  }
  
  @js.native
  object KeyEncodings extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.otplibCore.utilsMod.KeyEncodings with String] = js.native
    
    /* "ascii" */ val ASCII: typingsSlinky.otplibCore.utilsMod.KeyEncodings.ASCII with String = js.native
    
    /* "base64" */ val BASE64: typingsSlinky.otplibCore.utilsMod.KeyEncodings.BASE64 with String = js.native
    
    /* "hex" */ val HEX: typingsSlinky.otplibCore.utilsMod.KeyEncodings.HEX with String = js.native
    
    /* "latin1" */ val LATIN1: typingsSlinky.otplibCore.utilsMod.KeyEncodings.LATIN1 with String = js.native
    
    /* "utf8" */ val UTF8: typingsSlinky.otplibCore.utilsMod.KeyEncodings.UTF8 with String = js.native
  }
  
  @js.native
  /**
    * Constructs the class with defaultOptions set.
    *
    * @param defaultOptions used to override or add existing defaultOptions.
    */
  class OTP[T /* <: OTPOptions */] ()
    extends typingsSlinky.otplibCore.utilsMod.OTP[T] {
    def this(defaultOptions: Partial[T]) = this()
  }
  
  @js.native
  object Strategy extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.otplibCore.utilsMod.Strategy with String] = js.native
    
    /* "hotp" */ val HOTP: typingsSlinky.otplibCore.utilsMod.Strategy.HOTP with String = js.native
    
    /* "totp" */ val TOTP: typingsSlinky.otplibCore.utilsMod.Strategy.TOTP with String = js.native
  }
  
  @js.native
  class TOTP[T /* <: TOTPOptions_[String] */] ()
    extends typingsSlinky.otplibCore.totpMod.TOTP[T]
}
