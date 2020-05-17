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
  implicit def apply(value: EC): JWK = value.asInstanceOf[JWK]
  @scala.inline
  implicit def apply(value: ECPrivate): JWK = value.asInstanceOf[JWK]
  @scala.inline
  implicit def apply(value: RSA): JWK = value.asInstanceOf[JWK]
}

