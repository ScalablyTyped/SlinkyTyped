package typingsSlinky.ethers.ethersMod

import typingsSlinky.ethers.typesMod.Arrayish
import typingsSlinky.ethers.typesMod.Wordlist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/ethers", "HDNode")
@js.native
object HDNode extends js.Object {
  val defaultPath: /* "m/44'/60'/0'/0/0" */ String = js.native
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

