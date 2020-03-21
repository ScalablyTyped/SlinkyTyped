package typingsSlinky.contractProxyKit

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.ethers.mod.ethers.Wallet
import typingsSlinky.ethers.signingKeyMod.SigningKey
import typingsSlinky.ethers.typesMod.Arrayish
import typingsSlinky.ethers.typesMod.ProgressCallback
import typingsSlinky.ethers.typesMod.Wordlist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofWallet extends Instantiable1[/* privateKey */ SigningKey, Wallet] {
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

