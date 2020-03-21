package typingsSlinky.ethers

import typingsSlinky.ethers.ethersStrings.mSlash44ApostropheSlash60ApostropheSlash0ApostropheSlash0Slash0
import typingsSlinky.ethers.typesMod.Arrayish
import typingsSlinky.ethers.typesMod.HDNode
import typingsSlinky.ethers.typesMod.MinimalProvider
import typingsSlinky.ethers.typesMod.ProgressCallback
import typingsSlinky.ethers.typesMod.Wordlist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/wallet", JSImport.Namespace)
@js.native
object walletMod extends js.Object {
  @js.native
  class SigningKey protected ()
    extends typingsSlinky.ethers.signingKeyMod.SigningKey {
    def this(privateKey: Arrayish) = this()
    def this(privateKey: HDNode) = this()
  }
  
  @js.native
  class Wallet protected ()
    extends typingsSlinky.ethers.walletWalletMod.Wallet {
    def this(privateKey: typingsSlinky.ethers.signingKeyMod.SigningKey) = this()
    def this(privateKey: Arrayish) = this()
    def this(privateKey: HDNode) = this()
    def this(privateKey: typingsSlinky.ethers.signingKeyMod.SigningKey, provider: MinimalProvider) = this()
    def this(privateKey: Arrayish, provider: MinimalProvider) = this()
    def this(privateKey: HDNode, provider: MinimalProvider) = this()
  }
  
  @js.native
  object HDNode extends js.Object {
    val defaultPath: mSlash44ApostropheSlash60ApostropheSlash0ApostropheSlash0Slash0 = js.native
    def entropyToMnemonic(entropy: Arrayish): String = js.native
    def entropyToMnemonic(entropy: Arrayish, wordlist: Wordlist): String = js.native
    def fromMnemonic(mnemonic: String): typingsSlinky.ethers.typesMod.HDNode = js.native
    def fromMnemonic(mnemonic: String, wordlist: Wordlist): typingsSlinky.ethers.typesMod.HDNode = js.native
    def fromSeed(seed: Arrayish): typingsSlinky.ethers.typesMod.HDNode = js.native
    def isValidMnemonic(mnemonic: String): Boolean = js.native
    def isValidMnemonic(mnemonic: String, wordlist: Wordlist): Boolean = js.native
    def mnemonicToEntropy(mnemonic: String): String = js.native
    def mnemonicToEntropy(mnemonic: String, wordlist: Wordlist): String = js.native
    def mnemonicToSeed(mnemonic: String): String = js.native
    def mnemonicToSeed(mnemonic: String, password: String): String = js.native
  }
  
  /* static members */
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
  
}

