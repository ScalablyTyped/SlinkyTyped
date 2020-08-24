package typingsSlinky.asmcryptoJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asmcrypto.js", "AES_CBC")
@js.native
class AES_CBC protected ()
  extends typingsSlinky.asmcryptoJs.cbcMod.AES_CBC {
  def this(key: js.typedarray.Uint8Array) = this()
  def this(key: js.typedarray.Uint8Array, iv: js.typedarray.Uint8Array) = this()
  def this(key: js.typedarray.Uint8Array, iv: js.UndefOr[scala.Nothing], padding: Boolean) = this()
  def this(key: js.typedarray.Uint8Array, iv: js.typedarray.Uint8Array, padding: Boolean) = this()
}

/* static members */
@JSImport("asmcrypto.js", "AES_CBC")
@js.native
object AES_CBC extends js.Object {
  def decrypt(data: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  def decrypt(
    data: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    padding: js.UndefOr[scala.Nothing],
    iv: js.typedarray.Uint8Array
  ): js.typedarray.Uint8Array = js.native
  def decrypt(data: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array, padding: Boolean): js.typedarray.Uint8Array = js.native
  def decrypt(
    data: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    padding: Boolean,
    iv: js.typedarray.Uint8Array
  ): js.typedarray.Uint8Array = js.native
  def encrypt(data: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  def encrypt(
    data: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    padding: js.UndefOr[scala.Nothing],
    iv: js.typedarray.Uint8Array
  ): js.typedarray.Uint8Array = js.native
  def encrypt(data: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array, padding: Boolean): js.typedarray.Uint8Array = js.native
  def encrypt(
    data: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    padding: Boolean,
    iv: js.typedarray.Uint8Array
  ): js.typedarray.Uint8Array = js.native
}

