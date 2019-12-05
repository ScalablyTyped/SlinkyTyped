package typingsSlinky.jose.joseMod.JWK

import typingsSlinky.jose.joseMod.BasicParameters
import typingsSlinky.jose.joseStrings.RSA
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jose", "JWK.generateSync")
@js.native
object generateSync_RSA extends js.Object {
  def apply(kty: RSA): RSAKey = js.native
  def apply(kty: RSA, bitlength: Double): RSAKey = js.native
  def apply(kty: RSA, bitlength: Double, parameters: BasicParameters): RSAKey = js.native
  def apply(kty: RSA, bitlength: Double, parameters: BasicParameters, `private`: Boolean): RSAKey = js.native
}

