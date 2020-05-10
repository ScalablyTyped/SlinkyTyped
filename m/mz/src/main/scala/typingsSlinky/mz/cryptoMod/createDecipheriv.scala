package typingsSlinky.mz.cryptoMod

import typingsSlinky.node.cryptoMod.BinaryLike
import typingsSlinky.node.cryptoMod.CipherCCMOptions
import typingsSlinky.node.cryptoMod.CipherCCMTypes
import typingsSlinky.node.cryptoMod.CipherGCMOptions
import typingsSlinky.node.cryptoMod.CipherGCMTypes
import typingsSlinky.node.cryptoMod.CipherKey
import typingsSlinky.node.cryptoMod.DecipherCCM
import typingsSlinky.node.cryptoMod.DecipherGCM
import typingsSlinky.node.streamMod.TransformOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mz/crypto", "createDecipheriv")
@js.native
object createDecipheriv extends js.Object {
  def apply(algorithm: String, key: CipherKey): typingsSlinky.node.cryptoMod.Decipher = js.native
  def apply(algorithm: String, key: CipherKey, iv: Null, options: TransformOptions): typingsSlinky.node.cryptoMod.Decipher = js.native
  def apply(algorithm: String, key: CipherKey, iv: BinaryLike): typingsSlinky.node.cryptoMod.Decipher = js.native
  def apply(algorithm: String, key: CipherKey, iv: BinaryLike, options: TransformOptions): typingsSlinky.node.cryptoMod.Decipher = js.native
  def apply(algorithm: CipherCCMTypes, key: CipherKey, iv: Null, options: CipherCCMOptions): DecipherCCM = js.native
  def apply(algorithm: CipherCCMTypes, key: CipherKey, iv: BinaryLike, options: CipherCCMOptions): DecipherCCM = js.native
  def apply(algorithm: CipherGCMTypes, key: CipherKey): DecipherGCM = js.native
  def apply(algorithm: CipherGCMTypes, key: CipherKey, iv: Null, options: CipherGCMOptions): DecipherGCM = js.native
  def apply(algorithm: CipherGCMTypes, key: CipherKey, iv: BinaryLike): DecipherGCM = js.native
  def apply(algorithm: CipherGCMTypes, key: CipherKey, iv: BinaryLike, options: CipherGCMOptions): DecipherGCM = js.native
}

