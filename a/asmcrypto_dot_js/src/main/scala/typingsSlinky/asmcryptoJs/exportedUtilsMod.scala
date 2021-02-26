package typingsSlinky.asmcryptoJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exportedUtilsMod {
  
  @JSImport("asmcrypto.js/dist_es8/other/exportedUtils", "base64_to_bytes")
  @js.native
  def base64ToBytes(str: String): js.typedarray.Uint8Array = js.native
  
  @JSImport("asmcrypto.js/dist_es8/other/exportedUtils", "bytes_to_base64")
  @js.native
  def bytesToBase64(arr: js.typedarray.Uint8Array): String = js.native
  
  @JSImport("asmcrypto.js/dist_es8/other/exportedUtils", "bytes_to_hex")
  @js.native
  def bytesToHex(arr: js.typedarray.Uint8Array): String = js.native
  
  @JSImport("asmcrypto.js/dist_es8/other/exportedUtils", "bytes_to_string")
  @js.native
  def bytesToString(bytes: js.typedarray.Uint8Array): String = js.native
  @JSImport("asmcrypto.js/dist_es8/other/exportedUtils", "bytes_to_string")
  @js.native
  def bytesToString(bytes: js.typedarray.Uint8Array, utf8: Boolean): String = js.native
  
  @JSImport("asmcrypto.js/dist_es8/other/exportedUtils", "hex_to_bytes")
  @js.native
  def hexToBytes(str: String): js.typedarray.Uint8Array = js.native
  
  @JSImport("asmcrypto.js/dist_es8/other/exportedUtils", "string_to_bytes")
  @js.native
  def stringToBytes(str: String): js.typedarray.Uint8Array = js.native
  @JSImport("asmcrypto.js/dist_es8/other/exportedUtils", "string_to_bytes")
  @js.native
  def stringToBytes(str: String, utf8: Boolean): js.typedarray.Uint8Array = js.native
}
