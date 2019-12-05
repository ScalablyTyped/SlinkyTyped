package typingsSlinky.jose.joseMod.JWS

import typingsSlinky.jose.joseMod.JWK.Key
import typingsSlinky.jose.joseMod.JWKS.KeyStore
import typingsSlinky.jose.joseNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jose", "JWS.verify")
@js.native
object verify_true extends js.Object {
  def apply(jws: String, key: Key, options: VerifyOptions[`true`, `true`]): completeVerification[String | js.Object] = js.native
  def apply(jws: String, key: KeyStore, options: VerifyOptions[`true`, `true`]): completeVerification[String | js.Object] = js.native
  def apply(jws: FlattenedJWS, key: Key, options: VerifyOptions[`true`, `true`]): completeVerification[String | js.Object] = js.native
  def apply(jws: FlattenedJWS, key: KeyStore, options: VerifyOptions[`true`, `true`]): completeVerification[String | js.Object] = js.native
  def apply(jws: GeneralJWS, key: Key, options: VerifyOptions[`true`, `true`]): completeVerification[String | js.Object] = js.native
  def apply(jws: GeneralJWS, key: KeyStore, options: VerifyOptions[`true`, `true`]): completeVerification[String | js.Object] = js.native
}

