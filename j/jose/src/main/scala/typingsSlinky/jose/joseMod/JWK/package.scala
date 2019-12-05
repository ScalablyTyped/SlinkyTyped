package typingsSlinky.jose.joseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object JWK {
  import typingsSlinky.node.Buffer
  import typingsSlinky.node.cryptoMod.PrivateKeyInput
  import typingsSlinky.node.cryptoMod.PublicKeyInput

  type KeyInput = PrivateKeyInput | PublicKeyInput | String | Buffer
}
