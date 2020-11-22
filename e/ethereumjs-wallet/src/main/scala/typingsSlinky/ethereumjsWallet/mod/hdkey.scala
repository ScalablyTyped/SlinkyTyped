package typingsSlinky.ethereumjsWallet.mod

import typingsSlinky.ethereumjsWallet.hdkeyMod.EthereumHDKey
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethereumjs-wallet", "hdkey")
@js.native
class hdkey ()
  extends typingsSlinky.ethereumjsWallet.hdkeyMod.default {
  def this(_hdkey: js.Any) = this()
}
/* static members */
@JSImport("ethereumjs-wallet", "hdkey")
@js.native
object hdkey extends js.Object {
  
  /**
    * Create an instance based on a BIP32 extended private or public key.
    */
  def fromExtendedKey(base58Key: String): EthereumHDKey = js.native
  
  /**
    * Creates an instance based on a seed.
    *
    * For the seed we suggest to use [bip39](https://npmjs.org/package/bip39) to
    * create one from a BIP39 mnemonic.
    */
  def fromMasterSeed(seedBuffer: Buffer): EthereumHDKey = js.native
}
