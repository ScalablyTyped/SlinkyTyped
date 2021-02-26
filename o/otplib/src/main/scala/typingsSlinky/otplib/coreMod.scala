package typingsSlinky.otplib

import typingsSlinky.otplib.otplibStrings.createRandomBytes
import typingsSlinky.otplib.otplibStrings.encoding
import typingsSlinky.otplib.otplibStrings.keyDecoder
import typingsSlinky.otplib.otplibStrings.keyEncoder
import typingsSlinky.otplibCore.authenticatorMod.AuthenticatorOptions_
import typingsSlinky.otplibCore.authenticatorMod.Base32SecretKey
import typingsSlinky.otplibCore.hotpMod.HOTPOptions_
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreMod {
  
  @JSImport("otplib/core", "Authenticator")
  @js.native
  /**
    * Constructs the class with defaultOptions set.
    *
    * @param defaultOptions used to override or add existing defaultOptions.
    */
  class Authenticator[T /* <: AuthenticatorOptions_[String] */] ()
    extends typingsSlinky.otplibCore.mod.Authenticator[T] {
    def this(defaultOptions: Partial[T]) = this()
  }
  
  @JSImport("otplib/core", "HASH_ALGORITHMS")
  @js.native
  val HASH_ALGORITHMS: js.Array[String] = js.native
  
  @JSImport("otplib/core", "HOTP")
  @js.native
  /**
    * Constructs the class with defaultOptions set.
    *
    * @param defaultOptions used to override or add existing defaultOptions.
    */
  class HOTP[T /* <: HOTPOptions_[String] */] ()
    extends typingsSlinky.otplibCore.mod.HOTP[T] {
    def this(defaultOptions: Partial[T]) = this()
  }
  
  @JSImport("otplib/core", "HashAlgorithms")
  @js.native
  object HashAlgorithms extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.otplibCore.utilsMod.HashAlgorithms with String] = js.native
    
    /* "sha1" */ val SHA1: typingsSlinky.otplibCore.utilsMod.HashAlgorithms.SHA1 with String = js.native
    
    /* "sha256" */ val SHA256: typingsSlinky.otplibCore.utilsMod.HashAlgorithms.SHA256 with String = js.native
    
    /* "sha512" */ val SHA512: typingsSlinky.otplibCore.utilsMod.HashAlgorithms.SHA512 with String = js.native
  }
  
  @JSImport("otplib/core", "KEY_ENCODINGS")
  @js.native
  val KEY_ENCODINGS: js.Array[String] = js.native
  
  @JSImport("otplib/core", "KeyEncodings")
  @js.native
  object KeyEncodings extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.otplibCore.utilsMod.KeyEncodings with String] = js.native
    
    /* "ascii" */ val ASCII: typingsSlinky.otplibCore.utilsMod.KeyEncodings.ASCII with String = js.native
    
    /* "base64" */ val BASE64: typingsSlinky.otplibCore.utilsMod.KeyEncodings.BASE64 with String = js.native
    
    /* "hex" */ val HEX: typingsSlinky.otplibCore.utilsMod.KeyEncodings.HEX with String = js.native
    
    /* "latin1" */ val LATIN1: typingsSlinky.otplibCore.utilsMod.KeyEncodings.LATIN1 with String = js.native
    
    /* "utf8" */ val UTF8: typingsSlinky.otplibCore.utilsMod.KeyEncodings.UTF8 with String = js.native
  }
  
  @JSImport("otplib/core", "OTP")
  @js.native
  /**
    * Constructs the class with defaultOptions set.
    *
    * @param defaultOptions used to override or add existing defaultOptions.
    */
  class OTP[T /* <: OTPOptions */] ()
    extends typingsSlinky.otplibCore.mod.OTP[T] {
    def this(defaultOptions: Partial[T]) = this()
  }
  
  @JSImport("otplib/core", "STRATEGY")
  @js.native
  val STRATEGY_ : js.Array[String] = js.native
  
  @JSImport("otplib/core", "Strategy")
  @js.native
  object Strategy extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.otplibCore.utilsMod.Strategy with String] = js.native
    
    /* "hotp" */ val HOTP: typingsSlinky.otplibCore.utilsMod.Strategy.HOTP with String = js.native
    
    /* "totp" */ val TOTP: typingsSlinky.otplibCore.utilsMod.Strategy.TOTP with String = js.native
  }
  
  @JSImport("otplib/core", "TOTP")
  @js.native
  /**
    * Constructs the class with defaultOptions set.
    *
    * @param defaultOptions used to override or add existing defaultOptions.
    */
  class TOTP[T /* <: TOTPOptions_[String] */] ()
    extends typingsSlinky.otplibCore.mod.TOTP[T] {
    def this(defaultOptions: Partial[T]) = this()
  }
  
  @JSImport("otplib/core", "authenticatorCheckWithWindow")
  @js.native
  def authenticatorCheckWithWindow[T /* <: AuthenticatorOptions_[String] */](token: String, secret: Base32SecretKey, options: T): Double | Null = js.native
  
  @JSImport("otplib/core", "authenticatorDecoder")
  @js.native
  def authenticatorDecoder[T /* <: AuthenticatorOptions_[_] */](secret: Base32SecretKey, options: Pick[T, keyDecoder | encoding]): ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: T['keyDecoder'] */ js.Any
  ] = js.native
  
  @JSImport("otplib/core", "authenticatorDefaultOptions")
  @js.native
  def authenticatorDefaultOptions[T /* <: AuthenticatorOptions_[_] */](): Partial[T] = js.native
  
  @JSImport("otplib/core", "authenticatorEncoder")
  @js.native
  def authenticatorEncoder[T /* <: AuthenticatorOptions_[_] */](secret: SecretKey, options: Pick[T, keyEncoder | encoding]): ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: T['keyEncoder'] */ js.Any
  ] = js.native
  
  @JSImport("otplib/core", "authenticatorGenerateSecret")
  @js.native
  def authenticatorGenerateSecret[T /* <: AuthenticatorOptions_[String] */](numberOfBytes: Double, options: Pick[T, keyEncoder | encoding | createRandomBytes]): Base32SecretKey = js.native
  
  @JSImport("otplib/core", "authenticatorOptionValidator")
  @js.native
  def authenticatorOptionValidator[T /* <: AuthenticatorOptions_[_] */](options: Partial[T]): Unit = js.native
  
  @JSImport("otplib/core", "authenticatorOptions")
  @js.native
  def authenticatorOptions[T /* <: AuthenticatorOptions_[_] */](opt: Partial[T]): T = js.native
  
  @JSImport("otplib/core", "authenticatorToken")
  @js.native
  def authenticatorToken[T /* <: AuthenticatorOptions_[String] */](secret: Base32SecretKey, options: T): String = js.native
  
  @JSImport("otplib/core", "createDigestPlaceholder")
  @js.native
  val createDigestPlaceholder: CreateDigest[HexString] = js.native
  
  @JSImport("otplib/core", "hotpCheck")
  @js.native
  def hotpCheck[T /* <: HOTPOptions_[_] */](token: String, secret: SecretKey, counter: Double, options: T): Boolean = js.native
  
  @JSImport("otplib/core", "hotpCounter")
  @js.native
  def hotpCounter(counter: Double): HexString = js.native
  
  @JSImport("otplib/core", "hotpCreateHmacKey")
  @js.native
  val hotpCreateHmacKey: CreateHmacKey[HexString] = js.native
  
  @JSImport("otplib/core", "hotpDefaultOptions")
  @js.native
  def hotpDefaultOptions[T /* <: HOTPOptions_[_] */](): Partial[T] = js.native
  
  @JSImport("otplib/core", "hotpDigestToToken")
  @js.native
  def hotpDigestToToken(hexDigest: HexString, digits: Double): String = js.native
  
  @JSImport("otplib/core", "hotpKeyuri")
  @js.native
  def hotpKeyuri[T /* <: HOTPOptions_[_] */](accountName: String, issuer: String, secret: SecretKey, counter: Double, options: T): String = js.native
  
  @JSImport("otplib/core", "hotpOptions")
  @js.native
  def hotpOptions[T /* <: HOTPOptions_[_] */](opt: Partial[T]): T = js.native
  
  @JSImport("otplib/core", "hotpOptionsValidator")
  @js.native
  def hotpOptionsValidator[T /* <: HOTPOptions_[_] */](options: Partial[T]): Unit = js.native
  
  @JSImport("otplib/core", "hotpToken")
  @js.native
  def hotpToken[T /* <: HOTPOptions_[_] */](secret: SecretKey, counter: Double, options: T): String = js.native
  
  @JSImport("otplib/core", "isTokenValid")
  @js.native
  def isTokenValid(value: String): Boolean = js.native
  
  @JSImport("otplib/core", "keyuri")
  @js.native
  def keyuri(options: KeyURIOptions): String = js.native
  
  @JSImport("otplib/core", "objectValues")
  @js.native
  def objectValues[T](value: T): js.Array[String] = js.native
  
  @JSImport("otplib/core", "padStart")
  @js.native
  def padStart(value: String, maxLength: Double, fillString: String): String = js.native
  
  @JSImport("otplib/core", "totpCheck")
  @js.native
  def totpCheck[T /* <: TOTPOptions_[_] */](token: String, secret: SecretKey, options: T): Boolean = js.native
  
  @JSImport("otplib/core", "totpCheckByEpoch")
  @js.native
  def totpCheckByEpoch[T /* <: TOTPOptions_[String] */](epochs: js.Array[Double], token: String, secret: SecretKey, options: T): Double | Null = js.native
  
  @JSImport("otplib/core", "totpCheckWithWindow")
  @js.native
  def totpCheckWithWindow[T /* <: TOTPOptions_[String] */](token: String, secret: SecretKey, options: T): Double | Null = js.native
  
  @JSImport("otplib/core", "totpCounter")
  @js.native
  def totpCounter(epoch: Double, step: Double): Double = js.native
  
  @JSImport("otplib/core", "totpCreateHmacKey")
  @js.native
  val totpCreateHmacKey: CreateHmacKey[HexString] = js.native
  
  @JSImport("otplib/core", "totpDefaultOptions")
  @js.native
  def totpDefaultOptions[T /* <: TOTPOptions_[_] */](): Partial[T] = js.native
  
  @JSImport("otplib/core", "totpEpochAvailable")
  @js.native
  def totpEpochAvailable(epoch: Double, step: Double, win: js.Tuple2[Double, Double]): EpochAvailable = js.native
  @JSImport("otplib/core", "totpEpochAvailable")
  @js.native
  def totpEpochAvailable(epoch: Double, step: Double, win: Double): EpochAvailable = js.native
  
  @JSImport("otplib/core", "totpKeyuri")
  @js.native
  def totpKeyuri[T /* <: TOTPOptions_[_] */](accountName: String, issuer: String, secret: SecretKey, options: T): String = js.native
  
  @JSImport("otplib/core", "totpOptions")
  @js.native
  def totpOptions[T /* <: TOTPOptions_[_] */](opt: Partial[T]): T = js.native
  
  @JSImport("otplib/core", "totpOptionsValidator")
  @js.native
  def totpOptionsValidator[T /* <: TOTPOptions_[_] */](options: Partial[T]): Unit = js.native
  
  @JSImport("otplib/core", "totpPadSecret")
  @js.native
  def totpPadSecret(secret: String, encoding: KeyEncodings, minLength: Double): String = js.native
  
  @JSImport("otplib/core", "totpTimeRemaining")
  @js.native
  def totpTimeRemaining(epoch: Double, step: Double): Double = js.native
  
  @JSImport("otplib/core", "totpTimeUsed")
  @js.native
  def totpTimeUsed(epoch: Double, step: Double): Double = js.native
  
  @JSImport("otplib/core", "totpToken")
  @js.native
  def totpToken[T /* <: TOTPOptions_[_] */](secret: SecretKey, options: T): String = js.native
}
