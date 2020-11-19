package typingsSlinky.asmcryptoJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asmcrypto.js", "RSA_OAEP")
@js.native
class RSA_OAEP protected ()
  extends typingsSlinky.asmcryptoJs.pkcs1Mod.RSA_OAEP {
  def this(key: js.Array[js.typedarray.Uint8Array], hash: typingsSlinky.asmcryptoJs.sha1Mod.Sha1) = this()
  def this(key: js.Array[js.typedarray.Uint8Array], hash: typingsSlinky.asmcryptoJs.sha256Mod.Sha256) = this()
  def this(key: js.Array[js.typedarray.Uint8Array], hash: typingsSlinky.asmcryptoJs.sha512Mod.Sha512) = this()
  def this(
    key: js.Array[js.typedarray.Uint8Array],
    hash: typingsSlinky.asmcryptoJs.sha1Mod.Sha1,
    label: js.typedarray.Uint8Array
  ) = this()
  def this(
    key: js.Array[js.typedarray.Uint8Array],
    hash: typingsSlinky.asmcryptoJs.sha256Mod.Sha256,
    label: js.typedarray.Uint8Array
  ) = this()
  def this(
    key: js.Array[js.typedarray.Uint8Array],
    hash: typingsSlinky.asmcryptoJs.sha512Mod.Sha512,
    label: js.typedarray.Uint8Array
  ) = this()
}
