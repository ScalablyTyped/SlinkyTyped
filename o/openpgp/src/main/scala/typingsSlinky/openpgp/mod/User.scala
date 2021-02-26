package typingsSlinky.openpgp.mod

import typingsSlinky.openpgp.anon.Keyid
import typingsSlinky.openpgp.mod.enums.keyStatus
import typingsSlinky.openpgp.mod.key.Key
import typingsSlinky.openpgp.mod.packet.List
import typingsSlinky.openpgp.mod.packet.PublicKey
import typingsSlinky.openpgp.mod.packet.PublicSubkey
import typingsSlinky.openpgp.mod.packet.SecretKey
import typingsSlinky.openpgp.mod.packet.SecretSubkey
import typingsSlinky.openpgp.mod.packet.Signature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openpgp", "User")
@js.native
class User () extends StObject {
  
  def isRevoked(primaryKey: PublicKey, certificate: Signature, key: PublicKey, date: js.Date): js.Promise[Boolean] = js.native
  def isRevoked(primaryKey: PublicKey, certificate: Signature, key: PublicSubkey, date: js.Date): js.Promise[Boolean] = js.native
  def isRevoked(primaryKey: PublicKey, certificate: Signature, key: SecretKey, date: js.Date): js.Promise[Boolean] = js.native
  def isRevoked(primaryKey: PublicKey, certificate: Signature, key: SecretSubkey, date: js.Date): js.Promise[Boolean] = js.native
  def isRevoked(primaryKey: SecretKey, certificate: Signature, key: PublicKey, date: js.Date): js.Promise[Boolean] = js.native
  /**
    * Checks if a given certificate of the user is revoked
    * @param primaryKey The primary key packet
    * @param certificate The certificate to verify
    * @param key, optional The key to verify the signature
    * @param date Use the given date instead of the current time
    * @returns True if the certificate is revoked
    */
  def isRevoked(primaryKey: SecretKey, certificate: Signature, key: PublicSubkey, date: js.Date): js.Promise[Boolean] = js.native
  def isRevoked(primaryKey: SecretKey, certificate: Signature, key: SecretKey, date: js.Date): js.Promise[Boolean] = js.native
  def isRevoked(primaryKey: SecretKey, certificate: Signature, key: SecretSubkey, date: js.Date): js.Promise[Boolean] = js.native
  
  def sign(primaryKey: PublicKey, privateKeys: js.Array[_]): js.Promise[Key] = js.native
  /**
    * Signs user
    * @param primaryKey The primary key packet
    * @param privateKeys Decrypted private keys for signing
    * @returns New user with new certificate signatures
    */
  def sign(primaryKey: SecretKey, privateKeys: js.Array[_]): js.Promise[Key] = js.native
  
  /**
    * Transforms structured user data to packetlist
    * @returns
    */
  def toPacketlist(): List = js.native
  
  /**
    * Update user with new components from specified user
    * @param user Source user to merge
    * @param primaryKey primary key used for validation
    * @returns
    */
  def update(user: typingsSlinky.openpgp.mod.key.User, primaryKey: SecretKey): js.Promise[js.UndefOr[scala.Nothing]] = js.native
  def update(user: typingsSlinky.openpgp.mod.key.User, primaryKey: SecretSubkey): js.Promise[js.UndefOr[scala.Nothing]] = js.native
  
  def verify(primaryKey: PublicKey, date: js.Date): js.Promise[keyStatus] = js.native
  /**
    * Verify User. Checks for existence of self signatures, revocation signatures
    * and validity of self signature
    * @param primaryKey The primary key packet
    * @param date Use the given date instead of the current time
    * @returns Status of user
    */
  def verify(primaryKey: SecretKey, date: js.Date): js.Promise[keyStatus] = js.native
  
  def verifyAllCertifications(primaryKey: PublicKey, keys: js.Array[_], date: js.Date): js.Promise[js.Array[Keyid]] = js.native
  /**
    * Verifies all user certificates
    * @param primaryKey The primary key packet
    * @param keys Array of keys to verify certificate signatures
    * @param date Use the given date instead of the current time
    * @returns List of signer's keyid and validity of signature
    */
  def verifyAllCertifications(primaryKey: SecretKey, keys: js.Array[_], date: js.Date): js.Promise[js.Array[Keyid]] = js.native
  
  def verifyCertificate(primaryKey: PublicKey, certificate: Signature, keys: js.Array[_], date: js.Date): js.Promise[keyStatus] = js.native
  /**
    * Verifies the user certificate
    * @param primaryKey The primary key packet
    * @param certificate A certificate of this user
    * @param keys Array of keys to verify certificate signatures
    * @param date Use the given date instead of the current time
    * @returns status of the certificate
    */
  def verifyCertificate(primaryKey: SecretKey, certificate: Signature, keys: js.Array[_], date: js.Date): js.Promise[keyStatus] = js.native
}
