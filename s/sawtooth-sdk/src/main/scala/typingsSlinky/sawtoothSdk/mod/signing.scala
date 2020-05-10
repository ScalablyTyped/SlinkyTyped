package typingsSlinky.sawtoothSdk.mod

import typingsSlinky.sawtoothSdk.coreMod.Context
import typingsSlinky.sawtoothSdk.coreMod.PrivateKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk", "signing")
@js.native
object signing extends js.Object {
  @js.native
  class CryptoFactory protected ()
    extends typingsSlinky.sawtoothSdk.signingMod.CryptoFactory {
    /**
      * Constructs a CryptoFactory.
      *
      * @param context - a cryptographic context
      */
    def this(context: Context) = this()
  }
  
  @js.native
  class Signer protected ()
    extends typingsSlinky.sawtoothSdk.signingMod.Signer {
    /**
      * Constructs a new Signer
      *
      * @param context - a cryptographic context
      * @param privateKey - private key
      */
    def this(content: Context, privateKey: PrivateKey) = this()
  }
  
  def createContext(algorithmName: String): Context = js.native
}

