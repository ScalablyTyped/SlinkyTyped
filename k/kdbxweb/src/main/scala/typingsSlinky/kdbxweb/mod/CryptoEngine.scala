package typingsSlinky.kdbxweb.mod

import org.scalajs.dom.crypto.Crypto
import org.scalajs.dom.crypto.SubtleCrypto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CryptoEngine {
  
  @JSImport("kdbxweb", "CryptoEngine.NodeCrypto")
  @js.native
  val NodeCrypto: Crypto | Null = js.native
  
  @JSImport("kdbxweb", "CryptoEngine.argon2")
  @js.native
  def argon2(
    password: js.typedarray.ArrayBuffer,
    salt: js.typedarray.ArrayBuffer,
    memory: Double,
    iterations: Double,
    length: Double,
    parallelism: Double,
    `type`: Double,
    version: Double
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  @JSImport("kdbxweb", "CryptoEngine.chacha20")
  @js.native
  def chacha20(data: js.typedarray.ArrayBuffer, key: js.typedarray.ArrayBuffer, iv: js.typedarray.ArrayBuffer): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  @JSImport("kdbxweb", "CryptoEngine.configure")
  @js.native
  def configure(): Unit = js.native
  @JSImport("kdbxweb", "CryptoEngine.configure")
  @js.native
  def configure(newSubtle: SubtleCrypto): Unit = js.native
  @JSImport("kdbxweb", "CryptoEngine.configure")
  @js.native
  def configure(newSubtle: SubtleCrypto, newWebCrypto: Crypto): Unit = js.native
  @JSImport("kdbxweb", "CryptoEngine.configure")
  @js.native
  def configure(newSubtle: SubtleCrypto, newWebCrypto: Crypto, newNodeCrypto: Crypto): Unit = js.native
  @JSImport("kdbxweb", "CryptoEngine.configure")
  @js.native
  def configure(newSubtle: SubtleCrypto, newWebCrypto: Null, newNodeCrypto: Crypto): Unit = js.native
  @JSImport("kdbxweb", "CryptoEngine.configure")
  @js.native
  def configure(newSubtle: Null, newWebCrypto: Crypto): Unit = js.native
  @JSImport("kdbxweb", "CryptoEngine.configure")
  @js.native
  def configure(newSubtle: Null, newWebCrypto: Crypto, newNodeCrypto: Crypto): Unit = js.native
  @JSImport("kdbxweb", "CryptoEngine.configure")
  @js.native
  def configure(newSubtle: Null, newWebCrypto: Null, newNodeCrypto: Crypto): Unit = js.native
  
  @JSImport("kdbxweb", "CryptoEngine.createAesCbc")
  @js.native
  def createAesCbc(): js.Any = js.native
  
  @JSImport("kdbxweb", "CryptoEngine.hmacSha256")
  @js.native
  def hmacSha256(key: js.typedarray.ArrayBuffer, data: js.typedarray.ArrayBuffer): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  @JSImport("kdbxweb", "CryptoEngine.random")
  @js.native
  def random(len: Double): js.typedarray.Uint8Array = js.native
  
  @JSImport("kdbxweb", "CryptoEngine.sha256")
  @js.native
  def sha256(data: js.typedarray.ArrayBuffer): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  @JSImport("kdbxweb", "CryptoEngine.sha512")
  @js.native
  def sha512(data: js.typedarray.ArrayBuffer): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  @JSImport("kdbxweb", "CryptoEngine.subtle")
  @js.native
  val subtle: SubtleCrypto | Null = js.native
  
  @JSImport("kdbxweb", "CryptoEngine.webCrypto")
  @js.native
  val webCrypto: Crypto | Null = js.native
}
