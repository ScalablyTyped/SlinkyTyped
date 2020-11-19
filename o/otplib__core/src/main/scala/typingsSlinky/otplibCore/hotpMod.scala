package typingsSlinky.otplibCore

import typingsSlinky.otplibCore.anon.Counter
import typingsSlinky.otplibCore.utilsMod.CreateDigest
import typingsSlinky.otplibCore.utilsMod.CreateHmacKey
import typingsSlinky.otplibCore.utilsMod.HashAlgorithms
import typingsSlinky.otplibCore.utilsMod.HexString
import typingsSlinky.otplibCore.utilsMod.KeyEncodings
import typingsSlinky.otplibCore.utilsMod.OTP
import typingsSlinky.otplibCore.utilsMod.OTPOptions
import typingsSlinky.otplibCore.utilsMod.SecretKey
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@otplib/core/hotp", JSImport.Namespace)
@js.native
object hotpMod extends js.Object {
  
  def hotpCheck[T /* <: HOTPOptions_[_] */](token: String, secret: SecretKey, counter: Double, options: T): Boolean = js.native
  
  def hotpCounter(counter: Double): HexString = js.native
  
  val hotpCreateHmacKey: CreateHmacKey[HexString] = js.native
  
  def hotpDefaultOptions[T /* <: HOTPOptions_[_] */](): Partial[T] = js.native
  
  def hotpDigestToToken(hexDigest: HexString, digits: Double): String = js.native
  
  def hotpKeyuri[T /* <: HOTPOptions_[_] */](accountName: String, issuer: String, secret: SecretKey, counter: Double, options: T): String = js.native
  
  def hotpOptions[T /* <: HOTPOptions_[_] */](opt: Partial[T]): T = js.native
  
  def hotpOptionsValidator[T /* <: HOTPOptions_[_] */](options: Partial[T]): Unit = js.native
  
  def hotpToken[T /* <: HOTPOptions_[_] */](secret: SecretKey, counter: Double, options: T): String = js.native
  
  @js.native
  class HOTP[T /* <: HOTPOptions_[String] */] () extends OTP[T] {
    
    /**
      * Reference: [[hotpCheck]]
      */
    def check(token: String, secret: SecretKey, counter: Double): Boolean = js.native
    
    /**
      * Reference: [[hotpToken]]
      */
    def generate(secret: SecretKey, counter: Double): String = js.native
    
    /**
      * Calls [keyuri](../#keyuri) with class options and type
      * set to HOTP.
      */
    def keyuri(accountName: String, issuer: String, secret: SecretKey, counter: Double): String = js.native
    
    /**
      * Same as [[check]] but accepts a single object based argument.
      */
    def verify(opts: Counter): Boolean = js.native
  }
  
  @js.native
  trait HOTPOptions_[T] extends OTPOptions {
    
    /**
      * The algorithm used for calculating the HMAC.
      */
    var algorithm: HashAlgorithms = js.native
    
    /**
      * Creates the digest which token is derived from.
      */
    def createDigest(algorithm: HashAlgorithms, hmacKey: HexString, counter: HexString): T = js.native
    /**
      * Creates the digest which token is derived from.
      */
    @JSName("createDigest")
    var createDigest_Original: CreateDigest[T] = js.native
    
    /**
      * Formats the secret into a HMAC key, applying transformations (like padding) where needed
      */
    def createHmacKey(algorithm: HashAlgorithms, secret: SecretKey, encoding: KeyEncodings): T = js.native
    /**
      * Formats the secret into a HMAC key, applying transformations (like padding) where needed
      */
    @JSName("createHmacKey")
    var createHmacKey_Original: CreateHmacKey[T] = js.native
    
    /**
      * **USE WITH CAUTION:** Given the same digest, the same token will be received.
      *
      * This is provided for unique use cases. For example, digest generation might
      * depend on an async API.
      */
    var digest: js.UndefOr[HexString] = js.native
    
    /**
      * The number of digits a token will have. Usually 6 or 8.
      */
    var digits: Double = js.native
    
    /**
      * The encoding that was used on the secret.
      */
    var encoding: KeyEncodings = js.native
  }
}
