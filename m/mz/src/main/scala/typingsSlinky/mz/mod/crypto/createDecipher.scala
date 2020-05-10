package typingsSlinky.mz.mod.crypto

import typingsSlinky.node.cryptoMod.BinaryLike
import typingsSlinky.node.cryptoMod.CipherCCMOptions
import typingsSlinky.node.cryptoMod.CipherCCMTypes
import typingsSlinky.node.cryptoMod.CipherGCMOptions
import typingsSlinky.node.cryptoMod.CipherGCMTypes
import typingsSlinky.node.cryptoMod.DecipherCCM
import typingsSlinky.node.cryptoMod.DecipherGCM
import typingsSlinky.node.streamMod.TransformOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mz", "crypto.createDecipher")
@js.native
object createDecipher extends js.Object {
  /** @deprecated since v10.0.0 use createDecipheriv() */
  def apply(algorithm: String, password: BinaryLike): typingsSlinky.node.cryptoMod.Decipher = js.native
  def apply(algorithm: String, password: BinaryLike, options: TransformOptions): typingsSlinky.node.cryptoMod.Decipher = js.native
  /** @deprecated since v10.0.0 use createDecipheriv() */
  def apply(algorithm: CipherCCMTypes, password: BinaryLike, options: CipherCCMOptions): DecipherCCM = js.native
  /** @deprecated since v10.0.0 use createDecipheriv() */
  def apply(algorithm: CipherGCMTypes, password: BinaryLike): DecipherGCM = js.native
  def apply(algorithm: CipherGCMTypes, password: BinaryLike, options: CipherGCMOptions): DecipherGCM = js.native
}

