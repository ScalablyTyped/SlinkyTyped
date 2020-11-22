package typingsSlinky.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable8
import typingsSlinky.ethers.mod.ethers.utils.HDNode
import typingsSlinky.ethersprojectBytes.mod.BytesLike
import typingsSlinky.ethersprojectHdnode.mod.Mnemonic
import typingsSlinky.ethersprojectWordlists.mod.Wordlist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofHDNode
  extends Instantiable8[
      /* constructorGuard */ js.Any, 
      /* privateKey */ String, 
      /* publicKey */ String, 
      /* parentFingerprint */ String, 
      /* chainCode */ String, 
      /* index */ Double, 
      /* depth */ Double, 
      /* mnemonicOrPath */ Mnemonic, 
      HDNode
    ] {
  
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
