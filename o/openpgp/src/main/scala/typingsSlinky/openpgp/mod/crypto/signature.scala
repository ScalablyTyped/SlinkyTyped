package typingsSlinky.openpgp.mod.crypto

import typingsSlinky.openpgp.mod.`type`.mpi.MPI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "crypto.signature")
@js.native
object signature extends js.Object {
  /**
    * Creates a signature on data using specified algorithms and private key parameters.
    * See {@link https://tools.ietf.org/html/rfc4880#section-9.1|RFC 4880 9.1}
    * and {@link https://tools.ietf.org/html/rfc4880#section-9.4|RFC 4880 9.4}
    * for public key and hash algorithms.
    * @param algo Public key algorithm
    * @param hash_algo Hash algorithm
    * @param key_params Algorithm-specific public and private key parameters
    * @param data Data to be signed
    * @param hashed The hashed data
    * @returns Signature
    */
  def sign(
    algo: typingsSlinky.openpgp.mod.enums.publicKey,
    hash_algo: typingsSlinky.openpgp.mod.enums.hash,
    key_params: js.Array[MPI],
    data: js.typedarray.Uint8Array,
    hashed: js.typedarray.Uint8Array
  ): js.typedarray.Uint8Array = js.native
  /**
    * Verifies the signature provided for data using specified algorithms and public key parameters.
    * See {@link https://tools.ietf.org/html/rfc4880#section-9.1|RFC 4880 9.1}
    * and {@link https://tools.ietf.org/html/rfc4880#section-9.4|RFC 4880 9.4}
    * for public key and hash algorithms.
    * @param algo Public key algorithm
    * @param hash_algo Hash algorithm
    * @param msg_MPIs Algorithm-specific signature parameters
    * @param pub_MPIs Algorithm-specific public key parameters
    * @param data Data for which the signature was created
    * @param hashed The hashed data
    * @returns True if signature is valid
    */
  def verify(
    algo: typingsSlinky.openpgp.mod.enums.publicKey,
    hash_algo: typingsSlinky.openpgp.mod.enums.hash,
    msg_MPIs: js.Array[MPI],
    pub_MPIs: js.Array[MPI],
    data: js.typedarray.Uint8Array,
    hashed: js.typedarray.Uint8Array
  ): Boolean = js.native
}

