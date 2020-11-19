package typingsSlinky.asmcryptoJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asmcrypto.js/dist_es8/other/exportedUtils", JSImport.Namespace)
@js.native
object exportedUtilsMod extends js.Object {
  
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
  
  @JSName("hex_to_bytes")
  def hexToBytes(str: String): js.typedarray.Uint8Array = js.native
  
  @JSName("string_to_bytes")
  def stringToBytes(str: String): js.typedarray.Uint8Array = js.native
  @JSName("string_to_bytes")
  def stringToBytes(str: String, utf8: Boolean): js.typedarray.Uint8Array = js.native
}
