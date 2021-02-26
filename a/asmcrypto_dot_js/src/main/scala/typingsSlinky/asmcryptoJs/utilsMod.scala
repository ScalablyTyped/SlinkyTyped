package typingsSlinky.asmcryptoJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("asmcrypto.js/dist_es8/other/utils", "base64_to_bytes")
  @js.native
  def base64ToBytes(str: String): js.typedarray.Uint8Array = js.native
  
  @JSImport("asmcrypto.js/dist_es8/other/utils", "bytes_to_base64")
  @js.native
  def bytesToBase64(arr: js.typedarray.Uint8Array): String = js.native
  
  @JSImport("asmcrypto.js/dist_es8/other/utils", "bytes_to_hex")
  @js.native
  def bytesToHex(arr: js.typedarray.Uint8Array): String = js.native
  
  @JSImport("asmcrypto.js/dist_es8/other/utils", "bytes_to_string")
  @js.native
  def bytesToString(bytes: js.typedarray.Uint8Array): String = js.native
  @JSImport("asmcrypto.js/dist_es8/other/utils", "bytes_to_string")
  @js.native
  def bytesToString(bytes: js.typedarray.Uint8Array, utf8: Boolean): String = js.native
  
  @JSImport("asmcrypto.js/dist_es8/other/utils", "_heap_init")
  @js.native
  def heapInit(): js.typedarray.Uint8Array = js.native
  @JSImport("asmcrypto.js/dist_es8/other/utils", "_heap_init")
  @js.native
  def heapInit(heap: js.UndefOr[scala.Nothing], heapSize: Double): js.typedarray.Uint8Array = js.native
  @JSImport("asmcrypto.js/dist_es8/other/utils", "_heap_init")
  @js.native
  def heapInit(heap: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  @JSImport("asmcrypto.js/dist_es8/other/utils", "_heap_init")
  @js.native
  def heapInit(heap: js.typedarray.Uint8Array, heapSize: Double): js.typedarray.Uint8Array = js.native
  
  @JSImport("asmcrypto.js/dist_es8/other/utils", "_heap_write")
  @js.native
  def heapWrite(
    heap: js.typedarray.Uint8Array,
    hpos: Double,
    data: js.typedarray.Uint8Array,
    dpos: Double,
    dlen: Double
  ): Double = js.native
  
  @JSImport("asmcrypto.js/dist_es8/other/utils", "hex_to_bytes")
  @js.native
  def hexToBytes(str: String): js.typedarray.Uint8Array = js.native
  
  @JSImport("asmcrypto.js/dist_es8/other/utils", "is_buffer")
  @js.native
  def isBuffer(a: js.typedarray.ArrayBuffer): Boolean = js.native
  
  @JSImport("asmcrypto.js/dist_es8/other/utils", "is_bytes")
  @js.native
  def isBytes(a: js.typedarray.Uint8Array): Boolean = js.native
  
  @JSImport("asmcrypto.js/dist_es8/other/utils", "is_number")
  @js.native
  def isNumber(a: Double): Boolean = js.native
  
  @JSImport("asmcrypto.js/dist_es8/other/utils", "is_string")
  @js.native
  def isString(a: String): Boolean = js.native
  
  @JSImport("asmcrypto.js/dist_es8/other/utils", "is_typed_array")
  @js.native
  def isTypedArray(a: js.Any): Boolean = js.native
  
  @JSImport("asmcrypto.js/dist_es8/other/utils", "joinBytes")
  @js.native
  def joinBytes(arg: js.typedarray.Uint8Array*): js.typedarray.Uint8Array = js.native
  
  @JSImport("asmcrypto.js/dist_es8/other/utils", "pow2_ceil")
  @js.native
  def pow2Ceil(a: Double): Double = js.native
  
  @JSImport("asmcrypto.js/dist_es8/other/utils", "string_to_bytes")
  @js.native
  def stringToBytes(str: String): js.typedarray.Uint8Array = js.native
  @JSImport("asmcrypto.js/dist_es8/other/utils", "string_to_bytes")
  @js.native
  def stringToBytes(str: String, utf8: Boolean): js.typedarray.Uint8Array = js.native
}
