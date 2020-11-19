package typingsSlinky.openpgp.mod.packet

import typingsSlinky.openpgp.mod.Integer
import typingsSlinky.openpgp.mod.`type`.keyid.Keyid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openpgp", "packet.PublicSubkey")
@js.native
/**
  * A Public-Subkey packet (tag 14) has exactly the same format as a
  * Public-Key packet, but denotes a subkey.  One or more subkeys may be
  * associated with a top-level key.  By convention, the top-level key
  * provides signature services, and the subkeys provide encryption
  * services.
  */
class PublicSubkey () extends js.Object {
  
  /**
    * Public key algorithm.
    */
  var algorithm: String = js.native
  
  /**
    * Key creation date.
    */
  var created: js.Date = js.native
  
  /**
    * Time until expiration in days (V3 only)
    */
  var expirationTimeV3: Integer = js.native
  
  /**
    * Fingerprint in lowercase hex
    */
  var fingerprint: String = js.native
  
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
    * Calculates the fingerprint of the key
    * @returns A string containing the fingerprint in lowercase hex
    */
  def getFingerprint(): String = js.native
  
  /**
    * Calculates the fingerprint of the key
    * @returns A Uint8Array containing the fingerprint
    */
  def getFingerprintBytes(): js.typedarray.Uint8Array = js.native
  
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
  
  /**
    * Keyid
    */
  var keyid: Keyid = js.native
  
  /**
    * Algorithm specific params
    */
  var params: js.Array[js.Object] = js.native
  
  /**
    * Fix custom types after cloning
    */
  def postCloneTypeFix(): Unit = js.native
  
  /**
    * Internal Parser for public keys as specified in {@link https://tools.ietf.org/html/rfc4880#section-5.5.2|RFC 4880 section 5.5.2 Public-Key Packet Formats}
    * called by read_tag&lt;num&gt;
    * @param bytes Input array to read the packet from
    * @returns This object with attributes set by the parser
    */
  def read(bytes: js.typedarray.Uint8Array): js.Object = js.native
  
  /**
    * Alias of read()
    * @see module:packet.PublicKey#read
    */
  var readPublicKey: js.Any = js.native
  
  /**
    * Packet type
    */
  var tag: typingsSlinky.openpgp.mod.enums.packet = js.native
  
  /**
    * Packet version
    */
  var version: Integer = js.native
  
  /**
    * Same as write_private_key, but has less information because of
    * public key.
    * @returns OpenPGP packet body contents,
    */
  def write(): js.typedarray.Uint8Array = js.native
  
  /**
    * Write an old version packet - it's used by some of the internal routines.
    */
  def writeOld(): Unit = js.native
  
  /**
    * Alias of write()
    * @see module:packet.PublicKey#write
    */
  var writePublicKey: js.Any = js.native
}
