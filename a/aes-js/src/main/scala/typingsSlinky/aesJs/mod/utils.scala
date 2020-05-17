package typingsSlinky.aesJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aes-js", "utils")
@js.native
object utils extends js.Object {
  @js.native
  object hex extends js.Object {
    /**
      * Convert an array-like object to a hexadecimal string.
      * @param data The input data.
      */
    def fromBytes(data: ByteSource): String = js.native
    /**
      * Convert a hexadecimal string to a Uint8Array.
      * @param data The input string.
      */
    def toBytes(data: String): js.typedarray.Uint8Array = js.native
  }
  
  @js.native
  object utf8 extends js.Object {
    /**
      * Convert an array-like object containing UTF8 data to a string.
      * @param data The input data.
      */
    def fromBytes(data: ByteSource): String = js.native
    /**
      * Convert a UTF8 encoded string to a Uint8Array.
      * @param data The input string.
      */
    def toBytes(data: String): js.typedarray.Uint8Array = js.native
  }
  
}

