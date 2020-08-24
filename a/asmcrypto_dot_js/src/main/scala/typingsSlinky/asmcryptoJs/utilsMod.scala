package typingsSlinky.asmcryptoJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asmcrypto.js/dist_es8/other/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  @JSName("base64_to_bytes")
  def base64ToBytes(str: String): js.typedarray.Uint8Array = js.native
  @JSName("bytes_to_base64")
  def bytesToBase64(arr: js.typedarray.Uint8Array): String = js.native
  @JSName("bytes_to_hex")
  def bytesToHex(arr: js.typedarray.Uint8Array): String = js.native
  @JSName("bytes_to_string")
  def bytesToString(bytes: js.typedarray.Uint8Array): String = js.native
  @JSName("bytes_to_string")
  def bytesToString(bytes: js.typedarray.Uint8Array, utf8: Boolean): String = js.native
  @JSName("_heap_init")
  def heapInit(): js.typedarray.Uint8Array = js.native
  @JSName("_heap_init")
  def heapInit(heap: js.UndefOr[scala.Nothing], heapSize: Double): js.typedarray.Uint8Array = js.native
  @JSName("_heap_init")
  def heapInit(heap: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  @JSName("_heap_init")
  def heapInit(heap: js.typedarray.Uint8Array, heapSize: Double): js.typedarray.Uint8Array = js.native
  @JSName("_heap_write")
  def heapWrite(
    heap: js.typedarray.Uint8Array,
    hpos: Double,
    data: js.typedarray.Uint8Array,
    dpos: Double,
    dlen: Double
  ): Double = js.native
  @JSName("hex_to_bytes")
  def hexToBytes(str: String): js.typedarray.Uint8Array = js.native
  @JSName("is_buffer")
  def isBuffer(a: js.typedarray.ArrayBuffer): Boolean = js.native
  @JSName("is_bytes")
  def isBytes(a: js.typedarray.Uint8Array): Boolean = js.native
  @JSName("is_number")
  def isNumber(a: Double): Boolean = js.native
  @JSName("is_string")
  def isString(a: String): Boolean = js.native
  @JSName("is_typed_array")
  def isTypedArray(a: js.Any): Boolean = js.native
  def joinBytes(arg: js.typedarray.Uint8Array*): js.typedarray.Uint8Array = js.native
  @JSName("pow2_ceil")
  def pow2Ceil(a: Double): Double = js.native
  @JSName("string_to_bytes")
  def stringToBytes(str: String): js.typedarray.Uint8Array = js.native
  @JSName("string_to_bytes")
  def stringToBytes(str: String, utf8: Boolean): js.typedarray.Uint8Array = js.native
}

