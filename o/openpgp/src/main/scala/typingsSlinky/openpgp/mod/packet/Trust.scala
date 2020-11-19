package typingsSlinky.openpgp.mod.packet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openpgp", "packet.Trust")
@js.native
/**
  * Implementation of the Trust Packet (Tag 12)
  * {@link https://tools.ietf.org/html/rfc4880#section-5.10|RFC4880 5.10}:
  * The Trust packet is used only within keyrings and is not normally
  * exported.  Trust packets contain data that record the user's
  * specifications of which key holders are trustworthy introducers,
  * along with other information that implementing software uses for
  * trust information.  The format of Trust packets is defined by a given
  * implementation.
  * Trust packets SHOULD NOT be emitted to output streams that are
  * transferred to other users, and they SHOULD be ignored on any input
  * other than local keyring files.
  */
class Trust () extends js.Object {
  
  /**
    * Parsing function for a trust packet (tag 12).
    * Currently not implemented as we ignore trust packets
    * @param byptes payload of a tag 12 packet
    */
  def read(byptes: String): Unit = js.native
}
