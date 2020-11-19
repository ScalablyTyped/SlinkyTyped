package typingsSlinky.otplibCore

import typingsSlinky.otplibCore.otplibCoreStrings.createRandomBytes
import typingsSlinky.otplibCore.otplibCoreStrings.encoding
import typingsSlinky.otplibCore.otplibCoreStrings.keyDecoder
import typingsSlinky.otplibCore.otplibCoreStrings.keyEncoder
import typingsSlinky.otplibCore.totpMod.TOTP
import typingsSlinky.otplibCore.totpMod.TOTPOptions_
import typingsSlinky.otplibCore.utilsMod.KeyEncodings
import typingsSlinky.otplibCore.utilsMod.SecretKey
import typingsSlinky.std.Partial
import typingsSlinky.std.Pick
import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@otplib/core/authenticator", JSImport.Namespace)
@js.native
object authenticatorMod extends js.Object {
  
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
  
  @js.native
  class Authenticator[T /* <: AuthenticatorOptions_[String] */] () extends TOTP[T] {
    
    /**
      * Reference: [[authenticatorDecoder]]
      */
    def decode(secret: Base32SecretKey): SecretKey = js.native
    
    /**
      * Reference: [[authenticatorEncoder]]
      */
    def encode(secret: SecretKey): Base32SecretKey = js.native
    
    /**
      * Reference: [[authenticatorGenerateSecret]]
      */
    def generateSecret(): Base32SecretKey = js.native
    def generateSecret(numberOfBytes: Double): Base32SecretKey = js.native
  }
  
  @js.native
  trait AuthenticatorOptions_[T] extends TOTPOptions_[T] {
    
    /**
      * Creates a random string containing the defined number of
      * bytes to be used in generating a secret key.
      */
    def createRandomBytes(size: Double, encoding: KeyEncodings): T = js.native
    /**
      * Creates a random string containing the defined number of
      * bytes to be used in generating a secret key.
      */
    @JSName("createRandomBytes")
    var createRandomBytes_Original: CreateRandomBytes[T] = js.native
    
    /**
      * Decodes the Base32 string given by the user into a secret.
      * */
    def keyDecoder(encodedSecret: Base32SecretKey, encoding: KeyEncodings): T = js.native
    /**
      * Decodes the Base32 string given by the user into a secret.
      * */
    @JSName("keyDecoder")
    var keyDecoder_Original: KeyDecoder[T] = js.native
    
    /**
      * Encodes a secret key into a Base32 string before it is
      * sent to the user (in QR Code etc).
      */
    def keyEncoder(secret: SecretKey, encoding: KeyEncodings): T = js.native
    /**
      * Encodes a secret key into a Base32 string before it is
      * sent to the user (in QR Code etc).
      */
    @JSName("keyEncoder")
    var keyEncoder_Original: KeyEncoder[T] = js.native
  }
  
  type Base32SecretKey = SecretKey
  
  type CreateRandomBytes[T] = js.Function2[/* size */ Double, /* encoding */ KeyEncodings, T]
  
  type KeyDecoder[T] = js.Function2[/* encodedSecret */ Base32SecretKey, /* encoding */ KeyEncodings, T]
  
  type KeyEncoder[T] = js.Function2[/* secret */ SecretKey, /* encoding */ KeyEncodings, T]
}
