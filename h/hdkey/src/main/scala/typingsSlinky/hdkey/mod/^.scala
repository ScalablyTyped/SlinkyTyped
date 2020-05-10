package typingsSlinky.hdkey.mod

import typingsSlinky.hdkey.AnonXpriv
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hdkey", JSImport.Namespace)
@js.native
class ^ () extends HDNode

@JSImport("hdkey", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def fromJSON(obj: AnonXpriv): HDNode = js.native
  def fromMasterSeed(seed: Buffer): HDNode = js.native
}

