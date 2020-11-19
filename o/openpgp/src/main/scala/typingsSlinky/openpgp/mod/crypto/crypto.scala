package typingsSlinky.openpgp.mod.crypto

import typingsSlinky.openpgp.mod.Integer
import typingsSlinky.openpgp.mod.`type`.kdfParams.KDFParams
import typingsSlinky.openpgp.mod.`type`.mpi.MPI
import typingsSlinky.openpgp.mod.`type`.oid.OID
import typingsSlinky.openpgp.mod.enums.symmetric
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openpgp", "crypto.crypto")
@js.native
object crypto extends js.Object {
  
  /**
    * Generate algorithm-specific key parameters
    * @param algo The public key algorithm
    * @param bits Bit length for RSA keys
    * @param oid Object identifier for ECC keys
    * @returns The array of parameters
    */
  def generateParams(algo: String, bits: Integer, oid: OID): js.Array[_] = js.native
  
  /**
    * Generating a session key for the specified symmetric algorithm
    * See {@link https://tools.ietf.org/html/rfc4880#section-9.2|RFC 4880 9.2} for algorithms.
    * @param algo Symmetric encryption algorithm
    * @returns Random bytes as a string to be used as a key
    */
  def generateSessionKey(algo: symmetric): js.typedarray.Uint8Array = js.native
  
  /**
    * Returns the types comprising the encrypted session key of an algorithm
    * @param algo The public key algorithm
    * @returns The array of types
    */
  def getEncSessionKeyParamTypes(algo: String): js.Array[_] = js.native
  
  /**
    * Generates a random byte prefix for the specified algorithm
    * See {@link https://tools.ietf.org/html/rfc4880#section-9.2|RFC 4880 9.2} for algorithms.
    * @param algo Symmetric encryption algorithm
    * @returns Random bytes with length equal to the block size of the cipher, plus the last two bytes repeated.
    */
  def getPrefixRandom(algo: symmetric): js.typedarray.Uint8Array = js.native
  
  /**
    * Returns the types comprising the private key of an algorithm
    * @param algo The public key algorithm
    * @returns The array of types
    */
  def getPrivKeyParamTypes(algo: String): js.Array[_] = js.native
  
  /**
    * Returns the types comprising the public key of an algorithm
    * @param algo The public key algorithm
    * @returns The array of types
    */
  def getPubKeyParamTypes(algo: String): js.Array[_] = js.native
  
  /**
    * Decrypts data using specified algorithm and private key parameters.
    * See {@link https://tools.ietf.org/html/rfc4880#section-9.1|RFC 4880 9.1} for public key algorithms.
    * @param algo Public key algorithm
    * @param key_params Algorithm-specific public, private key parameters
    * @param data_params encrypted session key parameters
    * @param fingerprint Recipient fingerprint
    * @returns An MPI containing the decrypted data
    */
  def publicKeyDecrypt(
    algo: typingsSlinky.openpgp.mod.enums.publicKey,
    key_params: js.Array[MPI | OID | KDFParams],
    data_params: js.Array[MPI | OID | KDFParams],
    fingerprint: String
  ): MPI = js.native
  
  /**
    * Encrypts data using specified algorithm and public key parameters.
    * See {@link https://tools.ietf.org/html/rfc4880#section-9.1|RFC 4880 9.1} for public key algorithms.
    * @param algo Public key algorithm
    * @param pub_params Algorithm-specific public key parameters
    * @param data Data to be encrypted as MPI
    * @param fingerprint Recipient fingerprint
    * @returns encrypted session key parameters
    */
  def publicKeyEncrypt(
    algo: typingsSlinky.openpgp.mod.enums.publicKey,
    pub_params: js.Array[MPI | OID | KDFParams],
    data: MPI,
    fingerprint: String
  ): js.Array[_] = js.native
}
