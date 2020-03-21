package typingsSlinky.openpgp.mod.key

import typingsSlinky.openpgp.mod.`type`.keyid.Keyid
import typingsSlinky.openpgp.mod.packet.Signature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "key.checkRevocationKey")
@js.native
object checkRevocationKey extends js.Object {
  /**
    * Check if signature has revocation key sub packet (not supported by OpenPGP.js)
    * and throw error if found
    * @param signature The certificate or signature to check
    * @param keyId Check only certificates or signatures from a certain issuer key ID
    */
  def apply(signature: Signature, keyId: Keyid): Unit = js.native
}

