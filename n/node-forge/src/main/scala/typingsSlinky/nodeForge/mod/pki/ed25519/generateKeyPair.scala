package typingsSlinky.nodeForge.mod.pki.ed25519

import typingsSlinky.nodeForge.anon.PrivateKey
import typingsSlinky.nodeForge.anon.Seed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-forge", "pki.ed25519.generateKeyPair")
@js.native
object generateKeyPair extends js.Object {
  // generateKeyPair does not currently accept `util.ByteBuffer` as the seed.
  def apply(): PrivateKey = js.native
  def apply(options: Seed): PrivateKey = js.native
}

