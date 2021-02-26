package typingsSlinky.openpgp.mod

import typingsSlinky.openpgp.anon.Err
import typingsSlinky.openpgp.anon.SelfCertification
import typingsSlinky.openpgp.anon.Userid
import typingsSlinky.openpgp.mod.`type`.keyid.Keyid
import typingsSlinky.openpgp.mod.enums.keyStatus
import typingsSlinky.openpgp.mod.enums.symmetric
import typingsSlinky.openpgp.mod.packet.List
import typingsSlinky.openpgp.mod.packet.PublicKey
import typingsSlinky.openpgp.mod.packet.PublicSubkey
import typingsSlinky.openpgp.mod.packet.SecretKey
import typingsSlinky.openpgp.mod.packet.SecretSubkey
import typingsSlinky.openpgp.mod.packet.Signature
import typingsSlinky.openpgp.openpgpStrings.aead
import typingsSlinky.openpgp.openpgpStrings.encrypt_sign
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object key {
  
  /**
    * Class that represents an OpenPGP key. Must contain a primary key.
    * Can contain additional subkeys, signatures, user ids, user attributes.
    */
  @JSImport("openpgp", "key.Key")
  @js.native
  class Key protected () extends StObject {
    /**
      * @param packetlist The packets that form this key
      */
    def this(packetlist: List) = this()
    
    /**
      * Applies a revocation certificate to a key
      * This adds the first signature packet in the armored text to the key,
      * if it is a valid revocation signature.
      * @param revocationCertificate armored revocation certificate
      * @returns new revoked key
      */
    def applyRevocationCertificate(revocationCertificate: String): js.Promise[Key] = js.native
    
    /**
      * Returns ASCII armored text of key
      * @returns ASCII armor
      */
    def armor(): String = js.native
    
    /**
      * Decrypts all secret key and subkey packets matching keyId
      * @param passphrases
      * @param keyId
      * @returns true if all matching key and subkey packets decrypted successfully
      */
    def decrypt(passphrases: String): js.Promise[Boolean] = js.native
    def decrypt(passphrases: String, keyId: Keyid): js.Promise[Boolean] = js.native
    def decrypt(passphrases: js.Array[String]): js.Promise[Boolean] = js.native
    def decrypt(passphrases: js.Array[String], keyId: Keyid): js.Promise[Boolean] = js.native
    
    /**
      * Encrypts all secret key and subkey packets matching keyId
      * @param passphrases - if multiple passphrases, then should be in same order as packets each should encrypt
      * @param keyId
      * @returns
      */
    def encrypt(passphrases: String): js.Promise[js.Array[SecretKey | SecretSubkey]] = js.native
    def encrypt(passphrases: String, keyId: Keyid): js.Promise[js.Array[SecretKey | SecretSubkey]] = js.native
    def encrypt(passphrases: js.Array[_]): js.Promise[js.Array[SecretKey | SecretSubkey]] = js.native
    def encrypt(passphrases: js.Array[_], keyId: Keyid): js.Promise[js.Array[SecretKey | SecretSubkey]] = js.native
    
    /**
      * Returns algorithm information
      * @returns An object of the form {algorithm: string, bits:int, curve:String}
      */
    def getAlgorithmInfo(): js.Object = js.native
    
    /**
      * Returns the creation time of the key
      * @returns
      */
    def getCreationTime(): js.Date = js.native
    
    /**
      * Returns last created key or key by given keyId that is available for encryption or decryption
      * @param keyId, optional
      * @param date, optional
      * @param userId, optional
      * @returns key or null if no encryption key has been found
      */
    def getEncryptionKey(): js.Promise[Key | typingsSlinky.openpgp.mod.key.SubKey | Null] = js.native
    def getEncryptionKey(keyId: js.UndefOr[scala.Nothing], date: js.UndefOr[scala.Nothing], userId: String): js.Promise[Key | typingsSlinky.openpgp.mod.key.SubKey | Null] = js.native
    def getEncryptionKey(keyId: js.UndefOr[scala.Nothing], date: js.Date): js.Promise[Key | typingsSlinky.openpgp.mod.key.SubKey | Null] = js.native
    def getEncryptionKey(keyId: js.UndefOr[scala.Nothing], date: js.Date, userId: String): js.Promise[Key | typingsSlinky.openpgp.mod.key.SubKey | Null] = js.native
    def getEncryptionKey(keyId: Keyid): js.Promise[Key | typingsSlinky.openpgp.mod.key.SubKey | Null] = js.native
    def getEncryptionKey(keyId: Keyid, date: js.UndefOr[scala.Nothing], userId: String): js.Promise[Key | typingsSlinky.openpgp.mod.key.SubKey | Null] = js.native
    def getEncryptionKey(keyId: Keyid, date: js.Date): js.Promise[Key | typingsSlinky.openpgp.mod.key.SubKey | Null] = js.native
    def getEncryptionKey(keyId: Keyid, date: js.Date, userId: String): js.Promise[Key | typingsSlinky.openpgp.mod.key.SubKey | Null] = js.native
    
    /**
      * Returns the latest date when the key can be used for encrypting, signing, or both, depending on the `capabilities` paramater.
      * When `capabilities` is null, defaults to returning the expiry date of the primary key.
      * Returns null if `capabilities` is passed and the key does not have the specified capabilities or is revoked or invalid.
      * Returns Infinity if the key doesn't expire.
      * @param capabilities, optional
      * @param keyId, optional
      * @param userId, optional user ID
      * @returns
      */
    def getExpirationTime(): js.Promise[js.Date | Infinity | Null] = js.native
    def getExpirationTime(capabilities: js.UndefOr[scala.Nothing], keyId: js.UndefOr[scala.Nothing], userId: js.Object): js.Promise[js.Date | Infinity | Null] = js.native
    def getExpirationTime(capabilities: js.UndefOr[scala.Nothing], keyId: Keyid): js.Promise[js.Date | Infinity | Null] = js.native
    def getExpirationTime(capabilities: js.UndefOr[scala.Nothing], keyId: Keyid, userId: js.Object): js.Promise[js.Date | Infinity | Null] = js.native
    @JSName("getExpirationTime")
    def getExpirationTime_encrypt(capabilities: typingsSlinky.openpgp.openpgpStrings.encrypt): js.Promise[js.Date | Infinity | Null] = js.native
    @JSName("getExpirationTime")
    def getExpirationTime_encrypt(
      capabilities: typingsSlinky.openpgp.openpgpStrings.encrypt,
      keyId: js.UndefOr[scala.Nothing],
      userId: js.Object
    ): js.Promise[js.Date | Infinity | Null] = js.native
    @JSName("getExpirationTime")
    def getExpirationTime_encrypt(capabilities: typingsSlinky.openpgp.openpgpStrings.encrypt, keyId: Keyid): js.Promise[js.Date | Infinity | Null] = js.native
    @JSName("getExpirationTime")
    def getExpirationTime_encrypt(capabilities: typingsSlinky.openpgp.openpgpStrings.encrypt, keyId: Keyid, userId: js.Object): js.Promise[js.Date | Infinity | Null] = js.native
    @JSName("getExpirationTime")
    def getExpirationTime_encryptsign(capabilities: encrypt_sign): js.Promise[js.Date | Infinity | Null] = js.native
    @JSName("getExpirationTime")
    def getExpirationTime_encryptsign(capabilities: encrypt_sign, keyId: js.UndefOr[scala.Nothing], userId: js.Object): js.Promise[js.Date | Infinity | Null] = js.native
    @JSName("getExpirationTime")
    def getExpirationTime_encryptsign(capabilities: encrypt_sign, keyId: Keyid): js.Promise[js.Date | Infinity | Null] = js.native
    @JSName("getExpirationTime")
    def getExpirationTime_encryptsign(capabilities: encrypt_sign, keyId: Keyid, userId: js.Object): js.Promise[js.Date | Infinity | Null] = js.native
    @JSName("getExpirationTime")
    def getExpirationTime_sign(capabilities: typingsSlinky.openpgp.openpgpStrings.sign): js.Promise[js.Date | Infinity | Null] = js.native
    @JSName("getExpirationTime")
    def getExpirationTime_sign(
      capabilities: typingsSlinky.openpgp.openpgpStrings.sign,
      keyId: js.UndefOr[scala.Nothing],
      userId: js.Object
    ): js.Promise[js.Date | Infinity | Null] = js.native
    @JSName("getExpirationTime")
    def getExpirationTime_sign(capabilities: typingsSlinky.openpgp.openpgpStrings.sign, keyId: Keyid): js.Promise[js.Date | Infinity | Null] = js.native
    @JSName("getExpirationTime")
    def getExpirationTime_sign(capabilities: typingsSlinky.openpgp.openpgpStrings.sign, keyId: Keyid, userId: js.Object): js.Promise[js.Date | Infinity | Null] = js.native
    
    /**
      * Calculates the fingerprint of the key
      * @returns A string containing the fingerprint in lowercase hex
      */
    def getFingerprint(): String = js.native
    
    /**
      * Calculates the key id of the key
      * @returns A 8 byte key id
      */
    def getKeyId(): String = js.native
    
    /**
      * Returns key IDs of all keys
      * @returns
      */
    def getKeyIds(): js.Array[_] = js.native
    
    /**
      * Returns an array containing all public or private keys matching keyId.
      * If keyId is not present, returns all keys starting with the primary key.
      * @param keyId
      * @returns
      */
    def getKeys(keyId: Keyid): js.Array[_] = js.native
    
    /**
      * Returns primary user and most significant (latest valid) self signature
      * - if multiple primary users exist, returns the one with the latest self signature
      * - otherwise, returns the user with the latest self signature
      * @param date (optional) use the given date for verification instead of the current time
      * @param userId (optional) user ID to get instead of the primary user, if it exists
      * @returns The primary user and the self signature
      */
    def getPrimaryUser(): js.Promise[SelfCertification] = js.native
    def getPrimaryUser(date: js.UndefOr[scala.Nothing], userId: js.Object): js.Promise[SelfCertification] = js.native
    def getPrimaryUser(date: js.Date): js.Promise[SelfCertification] = js.native
    def getPrimaryUser(date: js.Date, userId: js.Object): js.Promise[SelfCertification] = js.native
    
    /**
      * Get revocation certificate from a revoked key.
      * (To get a revocation certificate for an unrevoked key, call revoke() first.)
      * @returns armored revocation certificate
      */
    def getRevocationCertificate(): js.Promise[String] = js.native
    
    /**
      * Returns last created key or key by given keyId that is available for signing and verification
      * @param keyId, optional
      * @param date (optional) use the given date for verification instead of the current time
      * @param userId, optional user ID
      * @returns key or null if no signing key has been found
      */
    def getSigningKey(keyId: Keyid): js.Promise[Key | typingsSlinky.openpgp.mod.key.SubKey | Null] = js.native
    def getSigningKey(keyId: Keyid, date: js.UndefOr[scala.Nothing], userId: js.Object): js.Promise[Key | typingsSlinky.openpgp.mod.key.SubKey | Null] = js.native
    def getSigningKey(keyId: Keyid, date: js.Date): js.Promise[Key | typingsSlinky.openpgp.mod.key.SubKey | Null] = js.native
    def getSigningKey(keyId: Keyid, date: js.Date, userId: js.Object): js.Promise[Key | typingsSlinky.openpgp.mod.key.SubKey | Null] = js.native
    
    /**
      * Returns an array containing all public or private subkeys matching keyId;
      * If keyId is not present, returns all subkeys.
      * @param keyId
      * @returns
      */
    def getSubkeys(keyId: Keyid): js.Array[_] = js.native
    
    /**
      * Returns userids
      * @returns array of userids
      */
    def getUserIds(): js.Array[String] = js.native
    
    /**
      * Calculates whether two keys have the same fingerprint without actually calculating the fingerprint
      * @returns Whether the two keys have the same version and public key data
      */
    def hasSameFingerprintAs(): Boolean = js.native
    
    /**
      * Check whether secret-key data is available in decrypted form. Returns null for public keys.
      * @returns
      */
    def isDecrypted(): Boolean | Null = js.native
    
    /**
      * Returns true if this is a private key
      * @returns
      */
    def isPrivate(): Boolean = js.native
    
    /**
      * Returns true if this is a public key
      * @returns
      */
    def isPublic(): Boolean = js.native
    
    /**
      * Checks if a signature on a key is revoked
      * @param
      * @param signature The signature to verify
      * @param key, optional The key to verify the signature
      * @param date Use the given date instead of the current time
      * @returns True if the certificate is revoked
      */
    def isRevoked(signature: Signature): js.Promise[Boolean] = js.native
    def isRevoked(signature: Signature, key: js.UndefOr[scala.Nothing], date: js.Date): js.Promise[Boolean] = js.native
    def isRevoked(signature: Signature, key: PublicKey): js.Promise[Boolean] = js.native
    def isRevoked(signature: Signature, key: PublicKey, date: js.Date): js.Promise[Boolean] = js.native
    def isRevoked(signature: Signature, key: PublicSubkey): js.Promise[Boolean] = js.native
    def isRevoked(signature: Signature, key: PublicSubkey, date: js.Date): js.Promise[Boolean] = js.native
    def isRevoked(signature: Signature, key: SecretKey): js.Promise[Boolean] = js.native
    def isRevoked(signature: Signature, key: SecretKey, date: js.Date): js.Promise[Boolean] = js.native
    def isRevoked(signature: Signature, key: SecretSubkey): js.Promise[Boolean] = js.native
    def isRevoked(signature: Signature, key: SecretSubkey, date: js.Date): js.Promise[Boolean] = js.native
    
    /**
      * Transforms packetlist to structured key data
      * @param packetlist The packets that form a key
      */
    def packetlist2structure(packetlist: List): Unit = js.native
    
    var primaryKey: Key = js.native
    
    /**
      * Revokes the key
      * @param reasonForRevocation optional, object indicating the reason for revocation
      * @param reasonForRevocation.flag optional, flag indicating the reason for revocation
      * @param reasonForRevocation.string optional, string explaining the reason for revocation
      * @param date optional, override the creationtime of the revocation signature
      * @returns new key with revocation signature
      */
    def revoke(reasonForRevocation: revokeReasonForRevocation, date: js.Date): js.Promise[Key] = js.native
    
    /**
      * Signs all users of key
      * @param privateKeys decrypted private keys for signing
      * @returns new public key with new certificate signature
      */
    def signAllUsers(privateKeys: js.Array[_]): js.Promise[Key] = js.native
    
    /**
      * Signs primary user of key
      * @param privateKey decrypted private keys for signing
      * @param date (optional) use the given date for verification instead of the current time
      * @param userId (optional) user ID to get instead of the primary user, if it exists
      * @returns new public key with new certificate signature
      */
    def signPrimaryUser(privateKey: js.Array[_], date: js.Date, userId: js.Object): js.Promise[Key] = js.native
    
    /**
      * Transforms structured key data to packetlist
      * @returns The packets that form a key
      */
    def toPacketlist(): List = js.native
    
    /**
      * Returns key as public key (shallow copy)
      * @returns new public Key
      */
    def toPublic(): Key = js.native
    
    /**
      * Update key with new components from specified key with same key ID:
      * users, subkeys, certificates are merged into the destination key,
      * duplicates and expired signatures are ignored.
      * If the specified key is a private key and the destination key is public,
      * the destination key is transformed to a private key.
      * @param key Source key to merge
      * @returns
      */
    def update(key: Key): js.Promise[js.UndefOr[scala.Nothing]] = js.native
    
    /**
      * Verifies all users of key
      * - if no arguments are given, verifies the self certificates;
      * - otherwise, verifies all certificates signed with given keys.
      * @param keys array of keys to verify certificate signatures
      * @returns list of userid, signer's keyid and validity of signature
      */
    def verifyAllUsers(keys: js.Array[_]): js.Promise[js.Array[Userid]] = js.native
    
    /**
      * Verify primary key. Checks for revocation signatures, expiration time
      * and valid self signature
      * @param date (optional) use the given date for verification instead of the current time
      * @param userId (optional) user ID
      * @returns The status of the primary key
      */
    def verifyPrimaryKey(): js.Promise[keyStatus] = js.native
    def verifyPrimaryKey(date: js.UndefOr[scala.Nothing], userId: js.Object): js.Promise[keyStatus] = js.native
    def verifyPrimaryKey(date: js.Date): js.Promise[keyStatus] = js.native
    def verifyPrimaryKey(date: js.Date, userId: js.Object): js.Promise[keyStatus] = js.native
    
    /**
      * Verifies primary user of key
      * - if no arguments are given, verifies the self certificates;
      * - otherwise, verifies all certificates signed with given keys.
      * @param keys array of keys to verify certificate signatures
      * @param date (optional) use the given date for verification instead of the current time
      * @param userId (optional) user ID to get instead of the primary user, if it exists
      * @returns List of signer's keyid and validity of signature
      */
    def verifyPrimaryUser(keys: js.Array[_], date: js.Date, userId: js.Object): js.Promise[js.Array[typingsSlinky.openpgp.anon.Keyid]] = js.native
  }
  
  /**
    * Class that represents a subkey packet and the relevant signatures.
    */
  @JSImport("openpgp", "key.SubKey")
  @js.native
  class SubKey () extends StObject {
    
    /**
      * Returns algorithm information
      * @returns An object of the form {algorithm: string, bits:int, curve:String}
      */
    def getAlgorithmInfo(): js.Object = js.native
    
    /**
      * Returns the creation time of the key
      * @returns
      */
    def getCreationTime(): js.Date = js.native
    
    def getExpirationTime(primaryKey: PublicKey, date: js.Date): js.Promise[js.Date | Infinity | Null] = js.native
    /**
      * Returns the expiration time of the subkey or Infinity if key does not expire
      * Returns null if the subkey is invalid.
      * @param primaryKey The primary key packet
      * @param date Use the given date instead of the current time
      * @returns
      */
    def getExpirationTime(primaryKey: SecretKey, date: js.Date): js.Promise[js.Date | Infinity | Null] = js.native
    
    /**
      * Calculates the fingerprint of the key
      * @returns A string containing the fingerprint in lowercase hex
      */
    def getFingerprint(): String = js.native
    
    /**
      * Calculates the key id of the key
      * @returns A 8 byte key id
      */
    def getKeyId(): String = js.native
    
    /**
      * Calculates whether two keys have the same fingerprint without actually calculating the fingerprint
      * @returns Whether the two keys have the same version and public key data
      */
    def hasSameFingerprintAs(): Boolean = js.native
    
    /**
      * Check whether secret-key data is available in decrypted form. Returns null for public keys.
      * @returns
      */
    def isDecrypted(): Boolean | Null = js.native
    
    def isRevoked(primaryKey: PublicKey, signature: Signature, key: PublicKey, date: js.Date): js.Promise[Boolean] = js.native
    def isRevoked(primaryKey: PublicKey, signature: Signature, key: PublicSubkey, date: js.Date): js.Promise[Boolean] = js.native
    def isRevoked(primaryKey: PublicKey, signature: Signature, key: SecretKey, date: js.Date): js.Promise[Boolean] = js.native
    def isRevoked(primaryKey: PublicKey, signature: Signature, key: SecretSubkey, date: js.Date): js.Promise[Boolean] = js.native
    def isRevoked(primaryKey: SecretKey, signature: Signature, key: PublicKey, date: js.Date): js.Promise[Boolean] = js.native
    /**
      * Checks if a binding signature of a subkey is revoked
      * @param primaryKey The primary key packet
      * @param signature The binding signature to verify
      * @param key, optional The key to verify the signature
      * @param date Use the given date instead of the current time
      * @returns True if the binding signature is revoked
      */
    def isRevoked(primaryKey: SecretKey, signature: Signature, key: PublicSubkey, date: js.Date): js.Promise[Boolean] = js.native
    def isRevoked(primaryKey: SecretKey, signature: Signature, key: SecretKey, date: js.Date): js.Promise[Boolean] = js.native
    def isRevoked(primaryKey: SecretKey, signature: Signature, key: SecretSubkey, date: js.Date): js.Promise[Boolean] = js.native
    
    /**
      * Revokes the subkey
      * @param primaryKey decrypted private primary key for revocation
      * @param reasonForRevocation optional, object indicating the reason for revocation
      * @param reasonForRevocation.flag optional, flag indicating the reason for revocation
      * @param reasonForRevocation.string optional, string explaining the reason for revocation
      * @param date optional, override the creationtime of the revocation signature
      * @returns new subkey with revocation signature
      */
    def revoke(primaryKey: SecretKey, reasonForRevocation: revokeReasonForRevocation, date: js.Date): js.Promise[typingsSlinky.openpgp.mod.key.SubKey] = js.native
    
    /**
      * Transforms structured subkey data to packetlist
      * @returns
      */
    def toPacketlist(): List = js.native
    
    /**
      * Update subkey with new components from specified subkey
      * @param subKey Source subkey to merge
      * @param primaryKey primary key used for validation
      * @returns
      */
    def update(subKey: typingsSlinky.openpgp.mod.key.SubKey, primaryKey: SecretKey): js.Promise[js.UndefOr[scala.Nothing]] = js.native
    def update(subKey: typingsSlinky.openpgp.mod.key.SubKey, primaryKey: SecretSubkey): js.Promise[js.UndefOr[scala.Nothing]] = js.native
    
    def verify(primaryKey: PublicKey, date: js.Date): js.Promise[keyStatus] = js.native
    /**
      * Verify subkey. Checks for revocation signatures, expiration time
      * and valid binding signature
      * @param primaryKey The primary key packet
      * @param date Use the given date instead of the current time
      * @returns The status of the subkey
      */
    def verify(primaryKey: SecretKey, date: js.Date): js.Promise[keyStatus] = js.native
  }
  
  /**
    * Class that represents an user ID or attribute packet and the relevant signatures.
    */
  @JSImport("openpgp", "key.User")
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
    
    var userId: typingsSlinky.openpgp.mod.packet.Userid = js.native
    
    def verify(primaryKey: PublicKey, date: js.Date): js.Promise[keyStatus] = js.native
    /**
      * Verify User. Checks for existence of self signatures, revocation signatures
      * and validity of self signature
      * @param primaryKey The primary key packet
      * @param date Use the given date instead of the current time
      * @returns Status of user
      */
    def verify(primaryKey: SecretKey, date: js.Date): js.Promise[keyStatus] = js.native
    
    def verifyAllCertifications(primaryKey: PublicKey, keys: js.Array[_], date: js.Date): js.Promise[js.Array[typingsSlinky.openpgp.anon.Keyid]] = js.native
    /**
      * Verifies all user certificates
      * @param primaryKey The primary key packet
      * @param keys Array of keys to verify certificate signatures
      * @param date Use the given date instead of the current time
      * @returns List of signer's keyid and validity of signature
      */
    def verifyAllCertifications(primaryKey: SecretKey, keys: js.Array[_], date: js.Date): js.Promise[js.Array[typingsSlinky.openpgp.anon.Keyid]] = js.native
    
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
  
  /**
    * Check if signature has revocation key sub packet (not supported by OpenPGP.js)
    * and throw error if found
    * @param signature The certificate or signature to check
    * @param keyId Check only certificates or signatures from a certain issuer key ID
    */
  @JSImport("openpgp", "key.checkRevocationKey")
  @js.native
  def checkRevocationKey(signature: Signature, keyId: Keyid): Unit = js.native
  
  /**
    * Create signature packet
    * @param dataToSign Contains packets to be signed
    * @param signingKeyPacket secret key packet for signing
    * @param signatureProperties (optional) properties to write on the signature packet before signing
    * @param date (optional) override the creationtime of the signature
    * @param userId (optional) user ID
    * @returns signature packet
    */
  @JSImport("openpgp", "key.createSignaturePacket")
  @js.native
  def createSignaturePacket(
    dataToSign: js.Object,
    signingKeyPacket: SecretKey,
    signatureProperties: js.Object,
    date: js.Date,
    userId: js.Object
  ): Signature = js.native
  @JSImport("openpgp", "key.createSignaturePacket")
  @js.native
  def createSignaturePacket(
    dataToSign: js.Object,
    signingKeyPacket: SecretSubkey,
    signatureProperties: js.Object,
    date: js.Date,
    userId: js.Object
  ): Signature = js.native
  
  /**
    * Generates a new OpenPGP key. Supports RSA and ECC keys.
    * Primary and subkey will be of same type.
    * @param options.keyType To indicate what type of key to make.
    *        RSA is 1. See {@link https://tools.ietf.org/html/rfc4880#section-9.1}
    * @param options.numBits number of bits for the key creation.
    * @param options.userIds Assumes already in form of "User Name <username@email.com>"
    *        If array is used, the first userId is set as primary user Id
    * @param options.passphrase The passphrase used to encrypt the resulting private key
    * @param options.keyExpirationTime The number of seconds after the key creation time that the key expires
    * @param curve (optional) elliptic curve for ECC keys
    * @param date Override the creation date of the key and the key signatures
    * @param subkeys (optional) options for each subkey, default to main key options. e.g. [ {sign: true, passphrase: '123'}]
    *        sign parameter defaults to false, and indicates whether the subkey should sign rather than encrypt
    * @returns
    */
  @JSImport("openpgp", "key.generate")
  @js.native
  def generate(options: KeyOptions): js.Promise[Key] = js.native
  
  /**
    * Returns the valid and non-expired signature that has the latest creation date, while ignoring signatures created in the future.
    * @param signatures List of signatures
    * @param date Use the given date instead of the current time
    * @returns The latest valid signature
    */
  @JSImport("openpgp", "key.getLatestValidSignature")
  @js.native
  def getLatestValidSignature(signatures: js.Array[_], date: js.Date): js.Promise[Signature] = js.native
  
  @JSImport("openpgp", "key.getPreferredAlgo")
  @js.native
  def getPreferredAlgo_aead(`type`: aead, keys: js.Array[_], date: js.Date, userIds: js.Array[_]): js.Promise[symmetric] = js.native
  /**
    * Returns the preferred symmetric/aead algorithm for a set of keys
    * @param type Type of preference to return
    * @param keys Set of keys
    * @param date (optional) use the given date for verification instead of the current time
    * @param userIds (optional) user IDs
    * @returns Preferred symmetric algorithm
    */
  @JSImport("openpgp", "key.getPreferredAlgo")
  @js.native
  def getPreferredAlgo_symmetric(
    `type`: typingsSlinky.openpgp.openpgpStrings.symmetric,
    keys: js.Array[_],
    date: js.Date,
    userIds: js.Array[_]
  ): js.Promise[symmetric] = js.native
  
  /**
    * Returns the preferred signature hash algorithm of a key
    * @param key (optional) the key to get preferences from
    * @param keyPacket key packet used for signing
    * @param date (optional) use the given date for verification instead of the current time
    * @param userId (optional) user ID
    * @returns
    */
  @JSImport("openpgp", "key.getPreferredHashAlgo")
  @js.native
  def getPreferredHashAlgo(key: Key, keyPacket: SecretKey, date: js.Date, userId: js.Object): js.Promise[String] = js.native
  @JSImport("openpgp", "key.getPreferredHashAlgo")
  @js.native
  def getPreferredHashAlgo(key: Key, keyPacket: SecretSubkey, date: js.Date, userId: js.Object): js.Promise[String] = js.native
  
  /**
    * Returns whether aead is supported by all keys in the set
    * @param keys Set of keys
    * @param date (optional) use the given date for verification instead of the current time
    * @param userIds (optional) user IDs
    * @returns
    */
  @JSImport("openpgp", "key.isAeadSupported")
  @js.native
  def isAeadSupported(keys: js.Array[_], date: js.Date, userIds: js.Array[_]): js.Promise[Boolean] = js.native
  
  @JSImport("openpgp", "key.isDataRevoked")
  @js.native
  def isDataRevoked(
    primaryKey: PublicKey,
    dataToVerify: js.Object,
    revocations: js.Array[_],
    signature: Signature,
    key: PublicKey,
    date: js.Date
  ): js.Promise[Boolean] = js.native
  @JSImport("openpgp", "key.isDataRevoked")
  @js.native
  def isDataRevoked(
    primaryKey: PublicKey,
    dataToVerify: js.Object,
    revocations: js.Array[_],
    signature: Signature,
    key: PublicSubkey,
    date: js.Date
  ): js.Promise[Boolean] = js.native
  @JSImport("openpgp", "key.isDataRevoked")
  @js.native
  def isDataRevoked(
    primaryKey: PublicKey,
    dataToVerify: js.Object,
    revocations: js.Array[_],
    signature: Signature,
    key: SecretKey,
    date: js.Date
  ): js.Promise[Boolean] = js.native
  @JSImport("openpgp", "key.isDataRevoked")
  @js.native
  def isDataRevoked(
    primaryKey: PublicKey,
    dataToVerify: js.Object,
    revocations: js.Array[_],
    signature: Signature,
    key: SecretSubkey,
    date: js.Date
  ): js.Promise[Boolean] = js.native
  @JSImport("openpgp", "key.isDataRevoked")
  @js.native
  def isDataRevoked(
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
  @JSImport("openpgp", "key.isDataRevoked")
  @js.native
  def isDataRevoked(
    primaryKey: SecretKey,
    dataToVerify: js.Object,
    revocations: js.Array[_],
    signature: Signature,
    key: PublicSubkey,
    date: js.Date
  ): js.Promise[Boolean] = js.native
  @JSImport("openpgp", "key.isDataRevoked")
  @js.native
  def isDataRevoked(
    primaryKey: SecretKey,
    dataToVerify: js.Object,
    revocations: js.Array[_],
    signature: Signature,
    key: SecretKey,
    date: js.Date
  ): js.Promise[Boolean] = js.native
  @JSImport("openpgp", "key.isDataRevoked")
  @js.native
  def isDataRevoked(
    primaryKey: SecretKey,
    dataToVerify: js.Object,
    revocations: js.Array[_],
    signature: Signature,
    key: SecretSubkey,
    date: js.Date
  ): js.Promise[Boolean] = js.native
  
  /**
    * Reads an unarmored OpenPGP key list and returns one or multiple key objects
    * @param data to be parsed
    * @returns result object with key and error arrays
    */
  @JSImport("openpgp", "key.read")
  @js.native
  def read(data: js.typedarray.Uint8Array): js.Promise[Err] = js.native
  
  /**
    * Reads an OpenPGP armored text and returns one or multiple key objects
    * @param armoredText text to be parsed
    * @returns result object with key and error arrays
    */
  @JSImport("openpgp", "key.readArmored")
  @js.native
  def readArmored(armoredText: String): js.Promise[KeyResult] = js.native
  @JSImport("openpgp", "key.readArmored")
  @js.native
  def readArmored(armoredText: ReadableStream[String]): js.Promise[KeyResult] = js.native
  
  /**
    * Reformats and signs an OpenPGP key with a given User ID. Currently only supports RSA keys.
    * @param options.privateKey The private key to reformat
    * @param options.keyType
    * @param options.userIds Assumes already in form of "User Name <username@email.com>"
    *        If array is used, the first userId is set as primary user Id
    * @param options.passphrase The passphrase used to encrypt the resulting private key
    * @param options.keyExpirationTime The number of seconds after the key creation time that the key expires
    * @param date Override the creation date of the key and the key signatures
    * @param subkeys (optional) options for each subkey, default to main key options. e.g. [ {sign: true, passphrase: '123'}]
    * @returns
    */
  @JSImport("openpgp", "key.reformat")
  @js.native
  def reformat(date: js.Date, subkeys: js.Array[_]): js.Promise[Key] = js.native
  
  @js.native
  trait KeyResult extends StObject {
    
    var err: js.Array[js.Error] | Null = js.native
    
    var keys: js.Array[Key] = js.native
  }
  object KeyResult {
    
    @scala.inline
    def apply(keys: js.Array[Key]): KeyResult = {
      val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyResult]
    }
    
    @scala.inline
    implicit class KeyResultMutableBuilder[Self <: KeyResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErr(value: js.Array[js.Error]): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrNull: Self = StObject.set(x, "err", null)
      
      @scala.inline
      def setErrVarargs(value: js.Error*): Self = StObject.set(x, "err", js.Array(value :_*))
      
      @scala.inline
      def setKeys(value: js.Array[Key]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeysVarargs(value: Key*): Self = StObject.set(x, "keys", js.Array(value :_*))
    }
  }
}
