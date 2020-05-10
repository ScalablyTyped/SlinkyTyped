package typingsSlinky.jwkToPem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jwkToPem.mod.EC
  - typingsSlinky.jwkToPem.mod.ECPrivate
  - typingsSlinky.jwkToPem.mod.RSA
*/
trait JWK extends js.Object

object JWK {
  @scala.inline
  def EC(crv: String, kty: typingsSlinky.jwkToPem.jwkToPemStrings.EC, x: String, y: String): JWK = {
    val __obj = js.Dynamic.literal(crv = crv.asInstanceOf[js.Any], kty = kty.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[JWK]
  }
  @scala.inline
  def ECPrivate(crv: String, d: String, kty: typingsSlinky.jwkToPem.jwkToPemStrings.EC): JWK = {
    val __obj = js.Dynamic.literal(crv = crv.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], kty = kty.asInstanceOf[js.Any])
    __obj.asInstanceOf[JWK]
  }
  @scala.inline
  def RSA(e: String, kty: typingsSlinky.jwkToPem.jwkToPemStrings.RSA, n: String): JWK = {
    val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], kty = kty.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any])
    __obj.asInstanceOf[JWK]
  }
}

