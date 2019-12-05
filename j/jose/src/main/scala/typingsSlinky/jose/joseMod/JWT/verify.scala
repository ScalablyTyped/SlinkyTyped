package typingsSlinky.jose.joseMod.JWT

import typingsSlinky.jose.joseMod.JWK.Key
import typingsSlinky.jose.joseMod.JWKS.KeyStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jose", "JWT.verify")
@js.native
object verify extends js.Object {
  def apply(jwt: String, key: Key): js.Object = js.native
  def apply(jwt: String, key: KeyStore): js.Object = js.native
}

