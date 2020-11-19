package typingsSlinky.nodeForge.mod.ssh

import typingsSlinky.nodeForge.mod.Hex
import typingsSlinky.nodeForge.mod.pki.PublicKey
import typingsSlinky.nodeForge.mod.util.ByteStringBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-forge", "ssh.getPublicKeyFingerprint")
@js.native
object getPublicKeyFingerprint extends js.Object {
  
  /**
    * @description Gets the SSH fingerprint for the given public key
    */
  def apply(publicKey: PublicKey): ByteStringBuffer | Hex | String = js.native
  def apply(publicKey: PublicKey, options: FingerprintOptions): ByteStringBuffer | Hex | String = js.native
}
