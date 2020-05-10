package typingsSlinky.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Misc/stringTools", JSImport.Namespace)
@js.native
object stringToolsMod extends js.Object {
  @js.native
  class StringTools () extends js.Object
  
  /* static members */
  @js.native
  object StringTools extends js.Object {
    def Decode(buffer: js.typedarray.Uint16Array): String = js.native
    /**
      * Decodes a buffer into a string
      * @param buffer The buffer to decode
      * @returns The decoded string
      */
    def Decode(buffer: js.typedarray.Uint8Array): String = js.native
    /**
      * Encode a buffer to a base64 string
      * @param buffer defines the buffer to encode
      * @returns the encoded string
      */
    def EncodeArrayBufferToBase64(buffer: js.typedarray.ArrayBuffer): String = js.native
    def EncodeArrayBufferToBase64(buffer: js.typedarray.ArrayBufferView): String = js.native
    /**
      * Checks for a matching suffix at the end of a string (for ES5 and lower)
      * @param str Source string
      * @param suffix Suffix to search for in the source string
      * @returns Boolean indicating whether the suffix was found (true) or not (false)
      */
    def EndsWith(str: String, suffix: String): Boolean = js.native
    /**
      * Checks for a matching suffix at the beginning of a string (for ES5 and lower)
      * @param str Source string
      * @param suffix Suffix to search for in the source string
      * @returns Boolean indicating whether the suffix was found (true) or not (false)
      */
    def StartsWith(str: String, suffix: String): Boolean = js.native
  }
  
}

