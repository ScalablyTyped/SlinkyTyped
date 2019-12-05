package typingsSlinky.jose.joseMod.JWE

import typingsSlinky.jose.joseMod.JWK.Key
import typingsSlinky.jose.joseMod.JWKS.KeyStore
import typingsSlinky.jose.joseNumbers.`false`
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jose", "JWE.decrypt")
@js.native
object decrypt_false extends js.Object {
  def apply(jwe: String, key: Key, options: DecryptOptions[`false`]): Buffer = js.native
  def apply(jwe: String, key: KeyStore, options: DecryptOptions[`false`]): Buffer = js.native
  def apply(jwe: FlattenedJWE, key: Key, options: DecryptOptions[`false`]): Buffer = js.native
  def apply(jwe: FlattenedJWE, key: KeyStore, options: DecryptOptions[`false`]): Buffer = js.native
  def apply(jwe: GeneralJWE, key: Key, options: DecryptOptions[`false`]): Buffer = js.native
  def apply(jwe: GeneralJWE, key: KeyStore, options: DecryptOptions[`false`]): Buffer = js.native
}

