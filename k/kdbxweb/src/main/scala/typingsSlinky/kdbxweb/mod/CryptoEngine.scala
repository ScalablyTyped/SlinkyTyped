package typingsSlinky.kdbxweb.mod

import org.scalajs.dom.crypto.SubtleCrypto
import typingsSlinky.std.Crypto_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kdbxweb", "CryptoEngine")
@js.native
object CryptoEngine extends js.Object {
  val NodeCrypto: Crypto_ | Null = js.native
  val subtle: SubtleCrypto | Null = js.native
  val webCrypto: Crypto_ | Null = js.native
  def argon2(
    password: scala.scalajs.js.typedarray.ArrayBuffer,
    salt: scala.scalajs.js.typedarray.ArrayBuffer,
    memory: Double,
    iterations: Double,
    length: Double,
    parallelism: Double,
    `type`: Double,
    version: Double
  ): js.Promise[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def chacha20(
    data: scala.scalajs.js.typedarray.ArrayBuffer,
    key: scala.scalajs.js.typedarray.ArrayBuffer,
    iv: scala.scalajs.js.typedarray.ArrayBuffer
  ): js.Promise[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def configure(): Unit = js.native
  def configure(newSubtle: Null, newWebCrypto: Null, newNodeCrypto: Crypto_): Unit = js.native
  def configure(newSubtle: Null, newWebCrypto: Crypto_): Unit = js.native
  def configure(newSubtle: Null, newWebCrypto: Crypto_, newNodeCrypto: Crypto_): Unit = js.native
  def configure(newSubtle: typingsSlinky.std.SubtleCrypto): Unit = js.native
  def configure(newSubtle: typingsSlinky.std.SubtleCrypto, newWebCrypto: Null, newNodeCrypto: Crypto_): Unit = js.native
  def configure(newSubtle: typingsSlinky.std.SubtleCrypto, newWebCrypto: Crypto_): Unit = js.native
  def configure(newSubtle: typingsSlinky.std.SubtleCrypto, newWebCrypto: Crypto_, newNodeCrypto: Crypto_): Unit = js.native
  def createAesCbc(): js.Any = js.native
  def hmacSha256(key: scala.scalajs.js.typedarray.ArrayBuffer, data: scala.scalajs.js.typedarray.ArrayBuffer): js.Promise[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def random(len: Double): scala.scalajs.js.typedarray.Uint8Array = js.native
  def sha256(data: scala.scalajs.js.typedarray.ArrayBuffer): js.Promise[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def sha512(data: scala.scalajs.js.typedarray.ArrayBuffer): js.Promise[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
}

