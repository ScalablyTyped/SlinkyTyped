package typingsSlinky.hiBase32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hi-base32", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hi-base32", "decode")
  @js.native
  def decode: Decode_ = js.native
  @scala.inline
  def decode_=(x: Decode_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decode")(x.asInstanceOf[js.Any])
  
  @JSImport("hi-base32", "encode")
  @js.native
  def encode(input: Input): String = js.native
  @JSImport("hi-base32", "encode")
  @js.native
  def encode(input: Input, asciiOnly: Boolean): String = js.native
  
  @js.native
  trait Decode_ extends StObject {
    
    /**
      * Decode base32 string and return string
      *
      * @param base32Str The base32 string you want to decode.
      * @param ascciOnly decode as ASCII or decode as UTF-8 string. Default is false.
      */
    def apply(base32Str: String): String = js.native
    def apply(base32Str: String, asciiOnly: Boolean): String = js.native
    
    /**
      * Decode base32 string and return byte array
      *
      * @param base32Str The base32 string you want to decode.
      */
    def asBytes(base32Str: String): js.Array[Double] = js.native
  }
  
  type Input = String | js.Array[Double] | js.typedarray.ArrayBuffer | js.typedarray.Uint8Array
}
