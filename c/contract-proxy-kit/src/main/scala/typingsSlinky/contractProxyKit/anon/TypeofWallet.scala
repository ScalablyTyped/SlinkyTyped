package typingsSlinky.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.ethers.mod.ethers.Wallet
import typingsSlinky.ethersprojectBytes.mod.Bytes
import typingsSlinky.ethersprojectBytes.mod.BytesLike
import typingsSlinky.ethersprojectJsonWallets.keystoreMod.ProgressCallback
import typingsSlinky.ethersprojectWordlists.mod.Wordlist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofWallet extends Instantiable1[/* privateKey */ BytesLike, Wallet] {
  
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
  def fromMnemonic(mnemonic: String, path: js.UndefOr[scala.Nothing], wordlist: Wordlist): typingsSlinky.ethersprojectWallet.mod.Wallet = js.native
  def fromMnemonic(mnemonic: String, path: String): typingsSlinky.ethersprojectWallet.mod.Wallet = js.native
  def fromMnemonic(mnemonic: String, path: String, wordlist: Wordlist): typingsSlinky.ethersprojectWallet.mod.Wallet = js.native
}
