package typingsSlinky.asmcryptoJs.pkcs1Mod

import typingsSlinky.asmcryptoJs.sha1Mod.Sha1
import typingsSlinky.asmcryptoJs.sha256Mod.Sha256
import typingsSlinky.asmcryptoJs.sha512Mod.Sha512
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asmcrypto.js/dist_es8/rsa/pkcs1", "RSA_OAEP")
@js.native
class RSA_OAEP protected () extends js.Object {
  def this(key: js.Array[js.typedarray.Uint8Array], hash: Sha1) = this()
  def this(key: js.Array[js.typedarray.Uint8Array], hash: Sha256) = this()
  def this(key: js.Array[js.typedarray.Uint8Array], hash: Sha512) = this()
  def this(key: js.Array[js.typedarray.Uint8Array], hash: Sha1, label: js.typedarray.Uint8Array) = this()
  def this(key: js.Array[js.typedarray.Uint8Array], hash: Sha256, label: js.typedarray.Uint8Array) = this()
  def this(key: js.Array[js.typedarray.Uint8Array], hash: Sha512, label: js.typedarray.Uint8Array) = this()
  val hash: js.Any = js.native
  val label: js.Any = js.native
  val rsa: js.Any = js.native
  def RSA_MGF1_generate(seed: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  def RSA_MGF1_generate(seed: js.typedarray.Uint8Array, length: Double): js.typedarray.Uint8Array = js.native
  def decrypt(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  def encrypt(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  def encrypt(data: js.typedarray.Uint8Array, random: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
}

