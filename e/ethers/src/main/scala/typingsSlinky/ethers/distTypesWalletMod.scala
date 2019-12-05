package typingsSlinky.ethers

import typingsSlinky.ethers.distTypesUtilsTypesMod.Arrayish
import typingsSlinky.ethers.distTypesUtilsTypesMod.HDNode
import typingsSlinky.ethers.distTypesUtilsTypesMod.MinimalProvider
import typingsSlinky.ethers.distTypesUtilsTypesMod.ProgressCallback
import typingsSlinky.ethers.distTypesUtilsTypesMod.Wordlist
import typingsSlinky.ethers.ethersStrings.`m/44_quote/60_quote/0_quote/0/0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/wallet", JSImport.Namespace)
@js.native
object distTypesWalletMod extends js.Object {
  @js.native
  class SigningKey protected ()
    extends typingsSlinky.ethers.distTypesWalletSigningDashKeyMod.SigningKey {
    def this(privateKey: Arrayish) = this()
    def this(privateKey: HDNode) = this()
  }
  
  @js.native
  class Wallet protected ()
    extends typingsSlinky.ethers.distTypesWalletWalletMod.Wallet {
    def this(privateKey: Arrayish) = this()
    def this(privateKey: HDNode) = this()
    def this(privateKey: typingsSlinky.ethers.distTypesWalletSigningDashKeyMod.SigningKey) = this()
    def this(privateKey: Arrayish, provider: MinimalProvider) = this()
    def this(privateKey: HDNode, provider: MinimalProvider) = this()
    def this(
      privateKey: typingsSlinky.ethers.distTypesWalletSigningDashKeyMod.SigningKey,
      provider: MinimalProvider
    ) = this()
  }
  
  @js.native
  object HDNode extends js.Object {
    val defaultPath: `m/44_quote/60_quote/0_quote/0/0` = js.native
    def entropyToMnemonic(entropy: Arrayish): String = js.native
    def entropyToMnemonic(entropy: Arrayish, wordlist: Wordlist): String = js.native
    def fromMnemonic(mnemonic: String): typingsSlinky.ethers.distTypesUtilsTypesMod.HDNode = js.native
    def fromMnemonic(mnemonic: String, wordlist: Wordlist): typingsSlinky.ethers.distTypesUtilsTypesMod.HDNode = js.native
    def fromSeed(seed: Arrayish): typingsSlinky.ethers.distTypesUtilsTypesMod.HDNode = js.native
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
    def createRandom(): typingsSlinky.ethers.distTypesWalletWalletMod.Wallet = js.native
    def createRandom(options: js.Any): typingsSlinky.ethers.distTypesWalletWalletMod.Wallet = js.native
    def fromEncryptedJson(json: String, password: Arrayish, progressCallback: ProgressCallback): js.Promise[typingsSlinky.ethers.distTypesWalletWalletMod.Wallet] = js.native
    def fromMnemonic(mnemonic: String): typingsSlinky.ethers.distTypesWalletWalletMod.Wallet = js.native
    def fromMnemonic(mnemonic: String, path: String): typingsSlinky.ethers.distTypesWalletWalletMod.Wallet = js.native
    def fromMnemonic(mnemonic: String, path: String, wordlist: Wordlist): typingsSlinky.ethers.distTypesWalletWalletMod.Wallet = js.native
  }
  
}

