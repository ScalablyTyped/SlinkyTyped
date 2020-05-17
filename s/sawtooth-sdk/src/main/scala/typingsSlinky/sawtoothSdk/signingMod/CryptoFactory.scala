package typingsSlinky.sawtoothSdk.signingMod

import typingsSlinky.sawtoothSdk.coreMod.Context
import typingsSlinky.sawtoothSdk.coreMod.PrivateKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk/signing", "CryptoFactory")
@js.native
class CryptoFactory protected () extends js.Object {
  /**
    * Constructs a CryptoFactory.
    *
    * @param context - a cryptographic context
    */
  def this(context: Context) = this()
  /** A cryptographic context */
  var _context: Context = js.native
  /**
    * Returns the context associated with this factory
    *
    */ def getContext(): Context = js.native
  /**
    * Create a new signer for the given private key.
    *
    * @param privateKey - a private key
    */
  def newSigner(privateKey: PrivateKey): Signer = js.native
}

