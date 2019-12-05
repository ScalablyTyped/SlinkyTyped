package typingsSlinky.openpgp.openpgpMod.enums

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait packet extends js.Object

/**
  * A list of packet types and numeric tags associated with them.
  */
@JSImport("openpgp", "enums.packet")
@js.native
object packet extends js.Object {
  @js.native
  sealed trait compressed
    extends typingsSlinky.openpgp.openpgpMod.enums.packet
  
  @js.native
  sealed trait literal
    extends typingsSlinky.openpgp.openpgpMod.enums.packet
  
  @js.native
  sealed trait marker
    extends typingsSlinky.openpgp.openpgpMod.enums.packet
  
  @js.native
  sealed trait modificationDetectionCode
    extends typingsSlinky.openpgp.openpgpMod.enums.packet
  
  @js.native
  sealed trait onePassSignature
    extends typingsSlinky.openpgp.openpgpMod.enums.packet
  
  @js.native
  sealed trait publicKey
    extends typingsSlinky.openpgp.openpgpMod.enums.packet
  
  @js.native
  sealed trait publicKeyEncryptedSessionKey
    extends typingsSlinky.openpgp.openpgpMod.enums.packet
  
  @js.native
  sealed trait publicSubkey
    extends typingsSlinky.openpgp.openpgpMod.enums.packet
  
  @js.native
  sealed trait secretKey
    extends typingsSlinky.openpgp.openpgpMod.enums.packet
  
  @js.native
  sealed trait secretSubkey
    extends typingsSlinky.openpgp.openpgpMod.enums.packet
  
  @js.native
  sealed trait signature
    extends typingsSlinky.openpgp.openpgpMod.enums.packet
  
  @js.native
  sealed trait symEncryptedAEADProtected
    extends typingsSlinky.openpgp.openpgpMod.enums.packet
  
  @js.native
  sealed trait symEncryptedIntegrityProtected
    extends typingsSlinky.openpgp.openpgpMod.enums.packet
  
  @js.native
  sealed trait symEncryptedSessionKey
    extends typingsSlinky.openpgp.openpgpMod.enums.packet
  
  @js.native
  sealed trait symmetricallyEncrypted
    extends typingsSlinky.openpgp.openpgpMod.enums.packet
  
  @js.native
  sealed trait trust
    extends typingsSlinky.openpgp.openpgpMod.enums.packet
  
  @js.native
  sealed trait userAttribute
    extends typingsSlinky.openpgp.openpgpMod.enums.packet
  
  @js.native
  sealed trait userid
    extends typingsSlinky.openpgp.openpgpMod.enums.packet
  
  /* 8 */ val compressed: typingsSlinky.openpgp.openpgpMod.enums.packet.compressed with Double = js.native
  /* 11 */ val literal: typingsSlinky.openpgp.openpgpMod.enums.packet.literal with Double = js.native
  /* 10 */ val marker: typingsSlinky.openpgp.openpgpMod.enums.packet.marker with Double = js.native
  /* 19 */ val modificationDetectionCode: typingsSlinky.openpgp.openpgpMod.enums.packet.modificationDetectionCode with Double = js.native
  /* 4 */ val onePassSignature: typingsSlinky.openpgp.openpgpMod.enums.packet.onePassSignature with Double = js.native
  /* 6 */ val publicKey: typingsSlinky.openpgp.openpgpMod.enums.packet.publicKey with Double = js.native
  /* 1 */ val publicKeyEncryptedSessionKey: typingsSlinky.openpgp.openpgpMod.enums.packet.publicKeyEncryptedSessionKey with Double = js.native
  /* 14 */ val publicSubkey: typingsSlinky.openpgp.openpgpMod.enums.packet.publicSubkey with Double = js.native
  /* 5 */ val secretKey: typingsSlinky.openpgp.openpgpMod.enums.packet.secretKey with Double = js.native
  /* 7 */ val secretSubkey: typingsSlinky.openpgp.openpgpMod.enums.packet.secretSubkey with Double = js.native
  /* 2 */ val signature: typingsSlinky.openpgp.openpgpMod.enums.packet.signature with Double = js.native
  /* 20 */ val symEncryptedAEADProtected: typingsSlinky.openpgp.openpgpMod.enums.packet.symEncryptedAEADProtected with Double = js.native
  /* 18 */ val symEncryptedIntegrityProtected: typingsSlinky.openpgp.openpgpMod.enums.packet.symEncryptedIntegrityProtected with Double = js.native
  /* 3 */ val symEncryptedSessionKey: typingsSlinky.openpgp.openpgpMod.enums.packet.symEncryptedSessionKey with Double = js.native
  /* 9 */ val symmetricallyEncrypted: typingsSlinky.openpgp.openpgpMod.enums.packet.symmetricallyEncrypted with Double = js.native
  /* 12 */ val trust: typingsSlinky.openpgp.openpgpMod.enums.packet.trust with Double = js.native
  /* 17 */ val userAttribute: typingsSlinky.openpgp.openpgpMod.enums.packet.userAttribute with Double = js.native
  /* 13 */ val userid: typingsSlinky.openpgp.openpgpMod.enums.packet.userid with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typingsSlinky.openpgp.openpgpMod.enums.packet with Double] = js.native
}

