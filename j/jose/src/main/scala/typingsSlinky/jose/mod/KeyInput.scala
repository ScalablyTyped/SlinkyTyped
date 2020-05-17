package typingsSlinky.jose.mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.cryptoMod.PrivateKeyInput
import typingsSlinky.node.cryptoMod.PublicKeyInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.cryptoMod.PrivateKeyInput
  - typingsSlinky.node.cryptoMod.PublicKeyInput
  - java.lang.String
  - typingsSlinky.node.Buffer
*/
trait KeyInput extends ProduceKeyInput

object KeyInput {
  @scala.inline
  implicit def apply(value: Buffer): KeyInput = value.asInstanceOf[KeyInput]
  @scala.inline
  implicit def apply(value: PrivateKeyInput): KeyInput = value.asInstanceOf[KeyInput]
  @scala.inline
  implicit def apply(value: PublicKeyInput): KeyInput = value.asInstanceOf[KeyInput]
  @scala.inline
  implicit def apply(value: String): KeyInput = value.asInstanceOf[KeyInput]
}

