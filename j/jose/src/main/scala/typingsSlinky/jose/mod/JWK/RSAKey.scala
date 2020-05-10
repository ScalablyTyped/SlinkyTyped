package typingsSlinky.jose.mod.JWK

import typingsSlinky.jose.joseBooleans.`false`
import typingsSlinky.jose.joseStrings.RSA
import typingsSlinky.jose.mod.JWKRSAKey
import typingsSlinky.jose.mod.asymmetricKeyObjectTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RSAKey extends Key {
  @JSName("crv")
  val crv_RSAKey: js.UndefOr[scala.Nothing] = js.native
  @JSName("e")
  val e_RSAKey: String = js.native
  @JSName("k")
  val k_RSAKey: js.UndefOr[scala.Nothing] = js.native
  @JSName("kty")
  val kty_RSAKey: RSA = js.native
  @JSName("n")
  val n_RSAKey: String = js.native
  @JSName("secret")
  val secret_RSAKey: `false` = js.native
  @JSName("type")
  val type_RSAKey: asymmetricKeyObjectTypes = js.native
  @JSName("x")
  val x_RSAKey: js.UndefOr[scala.Nothing] = js.native
  @JSName("y")
  val y_RSAKey: js.UndefOr[scala.Nothing] = js.native
  def toJWK(): JWKRSAKey = js.native
  def toJWK(`private`: Boolean): JWKRSAKey = js.native
}

