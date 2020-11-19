package typingsSlinky.mz.mod.crypto

import typingsSlinky.node.cryptoMod.BinaryLike
import typingsSlinky.node.cryptoMod.CipherCCM
import typingsSlinky.node.cryptoMod.CipherCCMOptions
import typingsSlinky.node.cryptoMod.CipherCCMTypes
import typingsSlinky.node.cryptoMod.CipherGCM
import typingsSlinky.node.cryptoMod.CipherGCMOptions
import typingsSlinky.node.cryptoMod.CipherGCMTypes
import typingsSlinky.node.streamMod.TransformOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mz", "crypto.createCipher")
@js.native
object createCipher extends js.Object {
  
  /** @deprecated since v10.0.0 use `createCipheriv()` */
  def apply(algorithm: String, password: BinaryLike): typingsSlinky.node.cryptoMod.Cipher = js.native
  def apply(algorithm: String, password: BinaryLike, options: TransformOptions): typingsSlinky.node.cryptoMod.Cipher = js.native
  /** @deprecated since v10.0.0 use `createCipheriv()` */
  def apply(algorithm: CipherCCMTypes, password: BinaryLike, options: CipherCCMOptions): CipherCCM = js.native
  /** @deprecated since v10.0.0 use `createCipheriv()` */
  def apply(algorithm: CipherGCMTypes, password: BinaryLike): CipherGCM = js.native
  def apply(algorithm: CipherGCMTypes, password: BinaryLike, options: CipherGCMOptions): CipherGCM = js.native
}
