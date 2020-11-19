package typingsSlinky.firebaseUtil

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/util/dist/src/crypt", JSImport.Namespace)
@js.native
object cryptMod extends js.Object {
  
  val base64: Base64_ = js.native
  
  def base64Decode(str: String): String | Null = js.native
  
  def base64Encode(str: String): String = js.native
  
  @js.native
  trait Base64_ extends js.Object {
    
    val ENCODED_VALS: String = js.native
    
    var ENCODED_VALS_BASE: String = js.native
    
    val ENCODED_VALS_WEBSAFE: String = js.native
    
    var HAS_NATIVE_SUPPORT: Boolean = js.native
    
    var byteToCharMapWebSafe_ : NumberDictionary[String] | Null = js.native
    
    var byteToCharMap_ : NumberDictionary[String] | Null = js.native
    
    var charToByteMapWebSafe_ : StringDictionary[Double] | Null = js.native
    
    var charToByteMap_ : StringDictionary[Double] | Null = js.native
    
    def decodeString(input: String, webSafe: Boolean): String = js.native
    
    def decodeStringToByteArray(input: String, webSafe: Boolean): js.Array[Double] = js.native
    
    def encodeByteArray(input: js.Array[Double]): String = js.native
    def encodeByteArray(input: js.Array[Double], webSafe: Boolean): String = js.native
    def encodeByteArray(input: js.typedarray.Uint8Array): String = js.native
    def encodeByteArray(input: js.typedarray.Uint8Array, webSafe: Boolean): String = js.native
    
    def encodeString(input: String): String = js.native
    def encodeString(input: String, webSafe: Boolean): String = js.native
    
    def init_(): Unit = js.native
  }
}
