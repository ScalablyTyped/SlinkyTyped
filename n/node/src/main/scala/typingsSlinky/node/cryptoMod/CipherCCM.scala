package typingsSlinky.node.cryptoMod

import typingsSlinky.node.AnonPlaintextLength
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CipherCCM extends Cipher {
  def getAuthTag(): Buffer = js.native
  def setAAD(buffer: Buffer, options: AnonPlaintextLength): this.type = js.native
}

