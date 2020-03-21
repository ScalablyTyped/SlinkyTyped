package typingsSlinky.ethers.mod.ethers

import typingsSlinky.ethers.typesMod.Arrayish
import typingsSlinky.ethers.typesMod.MinimalProvider
import typingsSlinky.ethers.typesMod.ProgressCallback
import typingsSlinky.ethers.typesMod.Wordlist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers", "ethers.Wallet")
@js.native
class Wallet protected ()
  extends typingsSlinky.ethers.ethersMod.Wallet {
  def this(privateKey: typingsSlinky.ethers.signingKeyMod.SigningKey) = this()
  def this(privateKey: Arrayish) = this()
  def this(privateKey: typingsSlinky.ethers.typesMod.HDNode) = this()
  def this(privateKey: typingsSlinky.ethers.signingKeyMod.SigningKey, provider: MinimalProvider) = this()
  def this(privateKey: Arrayish, provider: MinimalProvider) = this()
  def this(privateKey: typingsSlinky.ethers.typesMod.HDNode, provider: MinimalProvider) = this()
}

/* static members */
@JSImport("ethers", "ethers.Wallet")
@js.native
object Wallet extends js.Object {
  /**
    *  Static methods to create Wallet instances.
    */
  def createRandom(): typingsSlinky.ethers.walletWalletMod.Wallet = js.native
  def createRandom(options: js.Any): typingsSlinky.ethers.walletWalletMod.Wallet = js.native
  def fromEncryptedJson(json: String, password: Arrayish, progressCallback: ProgressCallback): js.Promise[typingsSlinky.ethers.walletWalletMod.Wallet] = js.native
  def fromMnemonic(mnemonic: String): typingsSlinky.ethers.walletWalletMod.Wallet = js.native
  def fromMnemonic(mnemonic: String, path: String): typingsSlinky.ethers.walletWalletMod.Wallet = js.native
  def fromMnemonic(mnemonic: String, path: String, wordlist: Wordlist): typingsSlinky.ethers.walletWalletMod.Wallet = js.native
}

