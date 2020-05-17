package typingsSlinky.node.cryptoMod

import typingsSlinky.node.NodeJS.ArrayBufferView
import typingsSlinky.node.anon.PlaintextLength
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecipherCCM extends Decipher {
  def setAAD(buffer: ArrayBufferView, options: PlaintextLength): this.type = js.native
  def setAuthTag(buffer: ArrayBufferView): this.type = js.native
}

