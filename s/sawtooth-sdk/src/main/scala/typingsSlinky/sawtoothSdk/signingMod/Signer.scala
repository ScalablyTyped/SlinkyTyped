package typingsSlinky.sawtoothSdk.signingMod

import typingsSlinky.node.Buffer
import typingsSlinky.sawtoothSdk.coreMod.Context
import typingsSlinky.sawtoothSdk.coreMod.PrivateKey
import typingsSlinky.sawtoothSdk.coreMod.PublicKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk/signing", "Signer")
@js.native
class Signer protected () extends js.Object {
  /**
    * Constructs a new Signer
    *
    * @param context - a cryptographic context
    * @param privateKey - private key
    */
  def this(content: Context, privateKey: PrivateKey) = this()
  var _context: Context = js.native
  var _privateKey: PrivateKey = js.native
  var _publicKey: js.UndefOr[PublicKey] = js.native
  /**
    * Return the public key for this Signer instance.
    *
    */
  def getPublicKey(): PublicKey = js.native
  /**
    * Signs the given message.
    *
    * @param message - the message bytes
    * @throws {SigningError} - if any error occurs during the signing process
    */
  def sign(message: Buffer): String = js.native
}

