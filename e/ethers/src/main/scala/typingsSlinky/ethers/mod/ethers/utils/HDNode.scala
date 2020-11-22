package typingsSlinky.ethers.mod.ethers.utils

import typingsSlinky.ethersprojectBytes.mod.BytesLike
import typingsSlinky.ethersprojectHdnode.mod.Mnemonic
import typingsSlinky.ethersprojectWordlists.mod.Wordlist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "ethers.utils.HDNode")
@js.native
class HDNode protected ()
  extends typingsSlinky.ethers.ethersMod.utils.HDNode {
  def this(
    constructorGuard: js.Any,
    privateKey: String,
    publicKey: String,
    parentFingerprint: String,
    chainCode: String,
    index: Double,
    depth: Double,
    mnemonicOrPath: String
  ) = this()
  /**
    *  This constructor should not be called directly.
    *
    *  Please use:
    *   - fromMnemonic
    *   - fromSeed
    */
  def this(
    constructorGuard: js.Any,
    privateKey: String,
    publicKey: String,
    parentFingerprint: String,
    chainCode: String,
    index: Double,
    depth: Double,
    mnemonicOrPath: Mnemonic
  ) = this()
}
/* static members */
@JSImport("ethers", "ethers.utils.HDNode")
@js.native
object HDNode extends js.Object {
  
  def _fromSeed(seed: BytesLike, mnemonic: Mnemonic): typingsSlinky.ethersprojectHdnode.mod.HDNode = js.native
  
  def fromExtendedKey(extendedKey: String): typingsSlinky.ethersprojectHdnode.mod.HDNode = js.native
  
  def fromMnemonic(mnemonic: String): typingsSlinky.ethersprojectHdnode.mod.HDNode = js.native
  def fromMnemonic(mnemonic: String, password: js.UndefOr[scala.Nothing], wordlist: String): typingsSlinky.ethersprojectHdnode.mod.HDNode = js.native
  def fromMnemonic(mnemonic: String, password: js.UndefOr[scala.Nothing], wordlist: Wordlist): typingsSlinky.ethersprojectHdnode.mod.HDNode = js.native
  def fromMnemonic(mnemonic: String, password: String): typingsSlinky.ethersprojectHdnode.mod.HDNode = js.native
  def fromMnemonic(mnemonic: String, password: String, wordlist: String): typingsSlinky.ethersprojectHdnode.mod.HDNode = js.native
  def fromMnemonic(mnemonic: String, password: String, wordlist: Wordlist): typingsSlinky.ethersprojectHdnode.mod.HDNode = js.native
  
  def fromSeed(seed: BytesLike): typingsSlinky.ethersprojectHdnode.mod.HDNode = js.native
}
