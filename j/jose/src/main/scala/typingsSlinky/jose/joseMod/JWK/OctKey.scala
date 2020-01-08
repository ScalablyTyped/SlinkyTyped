package typingsSlinky.jose.joseMod.JWK

import typingsSlinky.jose.joseBooleans.`false`
import typingsSlinky.jose.joseBooleans.`true`
import typingsSlinky.jose.joseMod.JWKOctKey
import typingsSlinky.jose.joseStrings.oct
import typingsSlinky.jose.joseStrings.secret
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jose", "JWK.OctKey")
@js.native
class OctKey () extends Key {
  var k: js.UndefOr[String] = js.native
  @JSName("kty")
  var kty_OctKey: oct = js.native
  @JSName("private")
  var private_OctKey: `false` = js.native
  @JSName("public")
  var public_OctKey: `false` = js.native
  @JSName("secret")
  var secret_OctKey: `true` = js.native
  @JSName("type")
  var type_OctKey: secret = js.native
  def toJWK(): JWKOctKey = js.native
  def toJWK(`private`: Boolean): JWKOctKey = js.native
}

