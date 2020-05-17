package typingsSlinky.asmcryptoJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asmcrypto.js", "RSA_PKCS1_v1_5")
@js.native
class RSAPKCS1V15 protected ()
  extends typingsSlinky.asmcryptoJs.pkcs1Mod.RSAPKCS1V15 {
  def this(key: js.Array[js.typedarray.Uint8Array], hash: typingsSlinky.asmcryptoJs.sha1Mod.Sha1) = this()
  def this(key: js.Array[js.typedarray.Uint8Array], hash: typingsSlinky.asmcryptoJs.sha256Mod.Sha256) = this()
  def this(key: js.Array[js.typedarray.Uint8Array], hash: typingsSlinky.asmcryptoJs.sha512Mod.Sha512) = this()
}

