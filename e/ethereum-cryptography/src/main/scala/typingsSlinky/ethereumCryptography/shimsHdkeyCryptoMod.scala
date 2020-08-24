package typingsSlinky.ethereumCryptography

import typingsSlinky.node.Buffer
import typingsSlinky.node.cryptoMod.BinaryLike
import typingsSlinky.node.cryptoMod.Hash
import typingsSlinky.node.cryptoMod.HashOptions
import typingsSlinky.node.cryptoMod.Hmac
import typingsSlinky.node.cryptoMod.KeyObject
import typingsSlinky.node.streamMod.TransformOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethereum-cryptography/shims/hdkey-crypto", JSImport.Namespace)
@js.native
object shimsHdkeyCryptoMod extends js.Object {
  def createHash(algorithm: String): Hash = js.native
  def createHash(algorithm: String, options: HashOptions): Hash = js.native
  def createHmac(algorithm: String, key: BinaryLike): Hmac = js.native
  def createHmac(algorithm: String, key: BinaryLike, options: TransformOptions): Hmac = js.native
  def createHmac(algorithm: String, key: KeyObject): Hmac = js.native
  def createHmac(algorithm: String, key: KeyObject, options: TransformOptions): Hmac = js.native
  def randomBytes(size: Double): Buffer = js.native
  def randomBytes(size: Double, callback: js.Function2[/* err */ js.Error | Null, /* buf */ Buffer, Unit]): Unit = js.native
}

