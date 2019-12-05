package typingsSlinky.jose.joseMod.JWT

import typingsSlinky.jose.joseMod.JWK.Key
import typingsSlinky.jose.joseMod.JWKS.KeyStore
import typingsSlinky.jose.joseNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jose", "JWT.verify")
@js.native
object verify_true extends js.Object {
  def apply(jwt: String, key: Key, options: VerifyOptions[`true`]): completeResult = js.native
  def apply(jwt: String, key: KeyStore, options: VerifyOptions[`true`]): completeResult = js.native
}

