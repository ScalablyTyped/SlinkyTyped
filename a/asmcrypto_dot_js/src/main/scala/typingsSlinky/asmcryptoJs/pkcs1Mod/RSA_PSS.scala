package typingsSlinky.asmcryptoJs.pkcs1Mod

import typingsSlinky.asmcryptoJs.sha1Mod.Sha1
import typingsSlinky.asmcryptoJs.sha256Mod.Sha256
import typingsSlinky.asmcryptoJs.sha512Mod.Sha512
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asmcrypto.js/dist_es8/rsa/pkcs1", "RSA_PSS")
@js.native
class RSA_PSS protected () extends js.Object {
  def this(key: js.Array[js.typedarray.Uint8Array], hash: Sha1) = this()
  def this(key: js.Array[js.typedarray.Uint8Array], hash: Sha256) = this()
  def this(key: js.Array[js.typedarray.Uint8Array], hash: Sha512) = this()
  def this(key: js.Array[js.typedarray.Uint8Array], hash: Sha1, saltLength: Double) = this()
  def this(key: js.Array[js.typedarray.Uint8Array], hash: Sha256, saltLength: Double) = this()
  def this(key: js.Array[js.typedarray.Uint8Array], hash: Sha512, saltLength: Double) = this()
  val hash: js.Any = js.native
  val rsa: js.Any = js.native
  val saltLength: js.Any = js.native
  def RSA_MGF1_generate(seed: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  def RSA_MGF1_generate(seed: js.typedarray.Uint8Array, length: Double): js.typedarray.Uint8Array = js.native
  def sign(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  def sign(data: js.typedarray.Uint8Array, random: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  def verify(signature: js.typedarray.Uint8Array, data: js.typedarray.Uint8Array): Unit = js.native
}

