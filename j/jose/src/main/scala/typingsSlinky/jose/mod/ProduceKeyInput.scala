package typingsSlinky.jose.mod

import typingsSlinky.jose.mod.JWK.Key
import typingsSlinky.node.cryptoMod.KeyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jose.mod.JWK.Key
  - typingsSlinky.node.cryptoMod.KeyObject
  - typingsSlinky.jose.mod.KeyInput
  - typingsSlinky.jose.mod.JWKOctKey
  - typingsSlinky.jose.mod.JWKRSAKey
  - typingsSlinky.jose.mod.JWKECKey
  - typingsSlinky.jose.mod.JWKOKPKey
*/
trait ProduceKeyInput
  extends ConsumeKeyInput
     with ProduceKeyInputWithNone

object ProduceKeyInput {
  @scala.inline
  implicit def apply(value: JWKECKey): ProduceKeyInput = value.asInstanceOf[ProduceKeyInput]
  @scala.inline
  implicit def apply(value: JWKOKPKey): ProduceKeyInput = value.asInstanceOf[ProduceKeyInput]
  @scala.inline
  implicit def apply(value: JWKOctKey): ProduceKeyInput = value.asInstanceOf[ProduceKeyInput]
  @scala.inline
  implicit def apply(value: JWKRSAKey): ProduceKeyInput = value.asInstanceOf[ProduceKeyInput]
  @scala.inline
  implicit def apply(value: Key): ProduceKeyInput = value.asInstanceOf[ProduceKeyInput]
  @scala.inline
  implicit def apply(value: KeyInput): ProduceKeyInput = value.asInstanceOf[ProduceKeyInput]
  @scala.inline
  implicit def apply(value: KeyObject): ProduceKeyInput = value.asInstanceOf[ProduceKeyInput]
}

