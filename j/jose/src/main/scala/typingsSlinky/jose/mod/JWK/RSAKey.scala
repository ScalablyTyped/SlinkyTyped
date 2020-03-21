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
  var d: js.UndefOr[String] = js.native
  var dp: js.UndefOr[String] = js.native
  var dq: js.UndefOr[String] = js.native
  var e: String = js.native
  @JSName("kty")
  var kty_RSAKey: RSA = js.native
  var n: String = js.native
  var p: js.UndefOr[String] = js.native
  var q: js.UndefOr[String] = js.native
  var qi: js.UndefOr[String] = js.native
  @JSName("secret")
  var secret_RSAKey: `false` = js.native
  @JSName("type")
  var type_RSAKey: asymmetricKeyObjectTypes = js.native
  def toJWK(): JWKRSAKey = js.native
  def toJWK(`private`: Boolean): JWKRSAKey = js.native
}

