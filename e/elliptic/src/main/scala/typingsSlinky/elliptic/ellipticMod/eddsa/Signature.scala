package typingsSlinky.elliptic.ellipticMod.eddsa

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elliptic", "eddsa.Signature")
@js.native
class Signature protected () extends js.Object {
  def this(eddsa: typingsSlinky.elliptic.ellipticMod.eddsa, sig: Bytes) = this()
  def this(eddsa: typingsSlinky.elliptic.ellipticMod.eddsa, sig: Signature) = this()
  def toBytes(): Buffer = js.native
  def toHex(): String = js.native
}

