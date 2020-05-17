package typingsSlinky.jose.mod

import typingsSlinky.jose.mod.JWKS.KeyStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jose.mod.ProduceKeyInput
  - typingsSlinky.jose.mod.JWKS.KeyStore
*/
trait ConsumeKeyInput extends ConsumeKeyInputWithNone

object ConsumeKeyInput {
  @scala.inline
  implicit def apply(value: KeyStore): ConsumeKeyInput = value.asInstanceOf[ConsumeKeyInput]
  @scala.inline
  implicit def apply(value: ProduceKeyInput): ConsumeKeyInput = value.asInstanceOf[ConsumeKeyInput]
}

