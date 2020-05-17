package typingsSlinky.jose.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jose.mod.JWKRSAKey
  - typingsSlinky.jose.mod.JWKOKPKey
  - typingsSlinky.jose.mod.JWKECKey
  - typingsSlinky.jose.mod.JWKOctKey
*/
trait JSONWebKey extends js.Object

object JSONWebKey {
  @scala.inline
  implicit def apply(value: JWKECKey): JSONWebKey = value.asInstanceOf[JSONWebKey]
  @scala.inline
  implicit def apply(value: JWKOKPKey): JSONWebKey = value.asInstanceOf[JSONWebKey]
  @scala.inline
  implicit def apply(value: JWKOctKey): JSONWebKey = value.asInstanceOf[JSONWebKey]
  @scala.inline
  implicit def apply(value: JWKRSAKey): JSONWebKey = value.asInstanceOf[JSONWebKey]
}

