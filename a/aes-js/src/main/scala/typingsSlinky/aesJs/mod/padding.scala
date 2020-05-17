package typingsSlinky.aesJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aes-js", "padding")
@js.native
object padding extends js.Object {
  @js.native
  object pkcs7 extends js.Object {
    /**
      * Add standard PKCS7 padding to an array.
      * @param data The input data.
      */
    def pad(data: ByteSource): js.typedarray.Uint8Array = js.native
    /**
      * Remove standard PKCS7 padding from an array.
      * @param data The input data.
      */
    def strip(data: ByteSource): js.typedarray.Uint8Array = js.native
  }
  
}

