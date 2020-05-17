package typingsSlinky.node.cryptoMod

import typingsSlinky.node.Buffer
import typingsSlinky.node.anon.PlaintextLength
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CipherCCM extends Cipher {
  def getAuthTag(): Buffer = js.native
  def setAAD(buffer: Buffer, options: PlaintextLength): this.type = js.native
}

