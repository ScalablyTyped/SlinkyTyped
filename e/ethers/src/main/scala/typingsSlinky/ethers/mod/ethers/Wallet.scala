package typingsSlinky.ethers.mod.ethers

import typingsSlinky.ethersprojectAbstractProvider.mod.Provider
import typingsSlinky.ethersprojectAbstractSigner.mod.ExternallyOwnedAccount
import typingsSlinky.ethersprojectBytes.mod.Bytes
import typingsSlinky.ethersprojectBytes.mod.BytesLike
import typingsSlinky.ethersprojectJsonWallets.keystoreMod.ProgressCallback
import typingsSlinky.ethersprojectSigningKey.mod.SigningKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "ethers.Wallet")
@js.native
class Wallet protected ()
  extends typingsSlinky.ethers.ethersMod.Wallet {
  def this(privateKey: ExternallyOwnedAccount) = this()
  def this(privateKey: BytesLike) = this()
  def this(privateKey: SigningKey) = this()
  def this(privateKey: ExternallyOwnedAccount, provider: Provider) = this()
  def this(privateKey: BytesLike, provider: Provider) = this()
  def this(privateKey: SigningKey, provider: Provider) = this()
}
/* static members */
@JSImport("ethers", "ethers.Wallet")
@js.native
object Wallet extends js.Object {
  
  /**
    *  Static methods to create Wallet instances.
    */
  def createRandom(): typingsSlinky.ethersprojectWallet.mod.Wallet = js.native
  def createRandom(options: js.Any): typingsSlinky.ethersprojectWallet.mod.Wallet = js.native
  
  def fromEncryptedJson(json: String, password: String): js.Promise[typingsSlinky.ethersprojectWallet.mod.Wallet] = js.native
  def fromEncryptedJson(json: String, password: String, progressCallback: ProgressCallback): js.Promise[typingsSlinky.ethersprojectWallet.mod.Wallet] = js.native
  def fromEncryptedJson(json: String, password: Bytes): js.Promise[typingsSlinky.ethersprojectWallet.mod.Wallet] = js.native
  def fromEncryptedJson(json: String, password: Bytes, progressCallback: ProgressCallback): js.Promise[typingsSlinky.ethersprojectWallet.mod.Wallet] = js.native
  
  def fromEncryptedJsonSync(json: String, password: String): typingsSlinky.ethersprojectWallet.mod.Wallet = js.native
  def fromEncryptedJsonSync(json: String, password: Bytes): typingsSlinky.ethersprojectWallet.mod.Wallet = js.native
  
  def fromMnemonic(mnemonic: String): typingsSlinky.ethersprojectWallet.mod.Wallet = js.native
  def fromMnemonic(
    mnemonic: String,
    path: js.UndefOr[scala.Nothing],
    wordlist: typingsSlinky.ethersprojectWordlists.mod.Wordlist
  ): typingsSlinky.ethersprojectWallet.mod.Wallet = js.native
  def fromMnemonic(mnemonic: String, path: String): typingsSlinky.ethersprojectWallet.mod.Wallet = js.native
  def fromMnemonic(mnemonic: String, path: String, wordlist: typingsSlinky.ethersprojectWordlists.mod.Wordlist): typingsSlinky.ethersprojectWallet.mod.Wallet = js.native
}
