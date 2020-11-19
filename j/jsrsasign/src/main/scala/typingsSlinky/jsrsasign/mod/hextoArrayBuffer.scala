package typingsSlinky.jsrsasign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsrsasign", "hextoArrayBuffer")
@js.native
object hextoArrayBuffer extends js.Object {
  
  /**
    * convert a hexadecimal string to an ArrayBuffer
    * @param hex hexadecimal string
    * @return ArrayBuffer
    * @description
    * This function converts from a hexadecimal string to an ArrayBuffer.
    * @example
    * hextoArrayBuffer("fffa01") → ArrayBuffer of [255, 250, 1]
    */
  def apply(hex: String): js.typedarray.ArrayBuffer = js.native
}
