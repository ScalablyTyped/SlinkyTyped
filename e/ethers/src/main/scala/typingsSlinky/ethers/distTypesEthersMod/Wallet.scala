package typingsSlinky.ethers.distTypesEthersMod

import typingsSlinky.ethers.distTypesUtilsTypesMod.Arrayish
import typingsSlinky.ethers.distTypesUtilsTypesMod.MinimalProvider
import typingsSlinky.ethers.distTypesUtilsTypesMod.ProgressCallback
import typingsSlinky.ethers.distTypesUtilsTypesMod.Wordlist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/ethers", "Wallet")
@js.native
class Wallet protected ()
  extends typingsSlinky.ethers.distTypesWalletMod.Wallet {
  def this(privateKey: Arrayish) = this()
  def this(privateKey: typingsSlinky.ethers.distTypesUtilsTypesMod.HDNode) = this()
  def this(privateKey: typingsSlinky.ethers.distTypesWalletSigningDashKeyMod.SigningKey) = this()
  def this(privateKey: Arrayish, provider: MinimalProvider) = this()
  def this(privateKey: typingsSlinky.ethers.distTypesUtilsTypesMod.HDNode, provider: MinimalProvider) = this()
  def this(
    privateKey: typingsSlinky.ethers.distTypesWalletSigningDashKeyMod.SigningKey,
    provider: MinimalProvider
  ) = this()
}

/* static members */
@JSImport("ethers/dist/types/ethers", "Wallet")
@js.native
object Wallet extends js.Object {
  /**
    *  Static methods to create Wallet instances.
    */
  def createRandom(): typingsSlinky.ethers.distTypesWalletWalletMod.Wallet = js.native
  def createRandom(options: js.Any): typingsSlinky.ethers.distTypesWalletWalletMod.Wallet = js.native
  def fromEncryptedJson(json: String, password: Arrayish, progressCallback: ProgressCallback): js.Promise[typingsSlinky.ethers.distTypesWalletWalletMod.Wallet] = js.native
  def fromMnemonic(mnemonic: String): typingsSlinky.ethers.distTypesWalletWalletMod.Wallet = js.native
  def fromMnemonic(mnemonic: String, path: String): typingsSlinky.ethers.distTypesWalletWalletMod.Wallet = js.native
  def fromMnemonic(mnemonic: String, path: String, wordlist: Wordlist): typingsSlinky.ethers.distTypesWalletWalletMod.Wallet = js.native
}

