package typingsSlinky.openpgp.mod.key

import typingsSlinky.openpgp.mod.packet.PublicKey
import typingsSlinky.openpgp.mod.packet.PublicSubkey
import typingsSlinky.openpgp.mod.packet.SecretKey
import typingsSlinky.openpgp.mod.packet.SecretSubkey
import typingsSlinky.openpgp.mod.packet.Signature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openpgp", "key.isDataRevoked")
@js.native
object isDataRevoked extends js.Object {
  
  def apply(
    primaryKey: PublicKey,
    dataToVerify: js.Object,
    revocations: js.Array[_],
    signature: Signature,
    key: PublicKey,
    date: js.Date
  ): js.Promise[Boolean] = js.native
  def apply(
    primaryKey: PublicKey,
    dataToVerify: js.Object,
    revocations: js.Array[_],
    signature: Signature,
    key: PublicSubkey,
    date: js.Date
  ): js.Promise[Boolean] = js.native
  def apply(
    primaryKey: PublicKey,
    dataToVerify: js.Object,
    revocations: js.Array[_],
    signature: Signature,
    key: SecretKey,
    date: js.Date
  ): js.Promise[Boolean] = js.native
  def apply(
    primaryKey: PublicKey,
    dataToVerify: js.Object,
    revocations: js.Array[_],
    signature: Signature,
    key: SecretSubkey,
    date: js.Date
  ): js.Promise[Boolean] = js.native
  def apply(
    primaryKey: SecretKey,
    dataToVerify: js.Object,
    revocations: js.Array[_],
    signature: Signature,
    key: PublicKey,
    date: js.Date
  ): js.Promise[Boolean] = js.native
  /**
    * Checks if a given certificate or binding signature is revoked
    * @param primaryKey The primary key packet
    * @param dataToVerify The data to check
    * @param revocations The revocation signatures to check
    * @param signature The certificate or signature to check
    * @param key, optional The key packet to check the signature
    * @param date Use the given date instead of the current time
    * @returns True if the signature revokes the data
    */
  def apply(
    primaryKey: SecretKey,
    dataToVerify: js.Object,
    revocations: js.Array[_],
    signature: Signature,
    key: PublicSubkey,
    date: js.Date
  ): js.Promise[Boolean] = js.native
  def apply(
    primaryKey: SecretKey,
    dataToVerify: js.Object,
    revocations: js.Array[_],
    signature: Signature,
    key: SecretKey,
    date: js.Date
  ): js.Promise[Boolean] = js.native
  def apply(
    primaryKey: SecretKey,
    dataToVerify: js.Object,
    revocations: js.Array[_],
    signature: Signature,
    key: SecretSubkey,
    date: js.Date
  ): js.Promise[Boolean] = js.native
}
