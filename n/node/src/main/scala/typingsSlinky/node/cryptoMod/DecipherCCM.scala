package typingsSlinky.node.cryptoMod

import typingsSlinky.node.Anon_PlaintextLength
import typingsSlinky.node.NodeJS.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecipherCCM extends Decipher {
  def setAAD(buffer: ArrayBufferView, options: Anon_PlaintextLength): this.type = js.native
  def setAuthTag(buffer: ArrayBufferView): this.type = js.native
}

