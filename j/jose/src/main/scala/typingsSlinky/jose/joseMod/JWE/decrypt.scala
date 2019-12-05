package typingsSlinky.jose.joseMod.JWE

import typingsSlinky.jose.joseMod.JWK.Key
import typingsSlinky.jose.joseMod.JWKS.KeyStore
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jose", "JWE.decrypt")
@js.native
object decrypt extends js.Object {
  def apply(jwe: String, key: Key): Buffer = js.native
  def apply(jwe: String, key: KeyStore): Buffer = js.native
  def apply(jwe: FlattenedJWE, key: Key): Buffer = js.native
  def apply(jwe: FlattenedJWE, key: KeyStore): Buffer = js.native
  def apply(jwe: GeneralJWE, key: Key): Buffer = js.native
  def apply(jwe: GeneralJWE, key: KeyStore): Buffer = js.native
}

