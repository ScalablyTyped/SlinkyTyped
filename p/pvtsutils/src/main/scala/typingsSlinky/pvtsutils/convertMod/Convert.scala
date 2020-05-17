package typingsSlinky.pvtsutils.convertMod

import typingsSlinky.std.BufferSource
import typingsSlinky.std.SharedArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pvtsutils/build/types/convert", "Convert")
@js.native
class Convert () extends js.Object

/* static members */
@JSImport("pvtsutils/build/types/convert", "Convert")
@js.native
object Convert extends js.Object {
  /* protected */ def Base64Padding(base64: String): String = js.native
  def FromBase64(base64Text: String): js.typedarray.ArrayBuffer | SharedArrayBuffer = js.native
  def FromBase64Url(base64url: String): js.typedarray.ArrayBuffer | SharedArrayBuffer = js.native
  def FromBinary(text: String): js.typedarray.ArrayBuffer | SharedArrayBuffer = js.native
  /**
    * Converts HEX string to buffer
    *
    * @static
    * @param {string} hexString
    * @returns {Uint8Array}
    *
    * @memberOf Convert
    */
  def FromHex(hexString: String): js.typedarray.ArrayBuffer | SharedArrayBuffer = js.native
  def FromString(str: String): js.typedarray.ArrayBuffer | SharedArrayBuffer = js.native
  def FromString(str: String, enc: BufferEncoding): js.typedarray.ArrayBuffer | SharedArrayBuffer = js.native
  def FromUtf8String(text: String): js.typedarray.ArrayBuffer | SharedArrayBuffer = js.native
  def ToBase64(buffer: BufferSource): String = js.native
  def ToBase64Url(data: BufferSource): String = js.native
  def ToBinary(buffer: BufferSource): String = js.native
  /**
    * Converts buffer to HEX string
    * @param  {BufferSource} buffer Incoming buffer
    * @returns string
    */
  def ToHex(buffer: BufferSource): String = js.native
  def ToString(buffer: BufferSource): String = js.native
  def ToString(buffer: BufferSource, enc: BufferEncoding): String = js.native
  def ToUtf8String(buffer: BufferSource): String = js.native
}

