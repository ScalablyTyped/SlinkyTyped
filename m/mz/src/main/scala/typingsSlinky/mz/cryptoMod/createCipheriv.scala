package typingsSlinky.mz.cryptoMod

import typingsSlinky.node.cryptoMod.BinaryLike
import typingsSlinky.node.cryptoMod.CipherCCM
import typingsSlinky.node.cryptoMod.CipherCCMOptions
import typingsSlinky.node.cryptoMod.CipherCCMTypes
import typingsSlinky.node.cryptoMod.CipherGCM
import typingsSlinky.node.cryptoMod.CipherGCMOptions
import typingsSlinky.node.cryptoMod.CipherGCMTypes
import typingsSlinky.node.cryptoMod.CipherKey
import typingsSlinky.node.streamMod.TransformOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mz/crypto", "createCipheriv")
@js.native
object createCipheriv extends js.Object {
  
  def apply(algorithm: String, key: CipherKey): typingsSlinky.node.cryptoMod.Cipher = js.native
  def apply(algorithm: String, key: CipherKey, iv: Null, options: TransformOptions): typingsSlinky.node.cryptoMod.Cipher = js.native
  def apply(algorithm: String, key: CipherKey, iv: BinaryLike): typingsSlinky.node.cryptoMod.Cipher = js.native
  def apply(algorithm: String, key: CipherKey, iv: BinaryLike, options: TransformOptions): typingsSlinky.node.cryptoMod.Cipher = js.native
  def apply(algorithm: CipherCCMTypes, key: CipherKey, iv: Null, options: CipherCCMOptions): CipherCCM = js.native
  def apply(algorithm: CipherCCMTypes, key: CipherKey, iv: BinaryLike, options: CipherCCMOptions): CipherCCM = js.native
  def apply(algorithm: CipherGCMTypes, key: CipherKey): CipherGCM = js.native
  def apply(algorithm: CipherGCMTypes, key: CipherKey, iv: Null, options: CipherGCMOptions): CipherGCM = js.native
  def apply(algorithm: CipherGCMTypes, key: CipherKey, iv: BinaryLike): CipherGCM = js.native
  def apply(algorithm: CipherGCMTypes, key: CipherKey, iv: BinaryLike, options: CipherGCMOptions): CipherGCM = js.native
}
