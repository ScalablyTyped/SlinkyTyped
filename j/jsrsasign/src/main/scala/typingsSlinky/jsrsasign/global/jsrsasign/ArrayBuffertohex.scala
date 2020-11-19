package typingsSlinky.jsrsasign.global.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("jsrsasign.ArrayBuffertohex")
@js.native
object ArrayBuffertohex extends js.Object {
  
  /**
    * convert an ArrayBuffer to a hexadecimal string
    * @param buffer ArrayBuffer
    * @return hexadecimal string
    * @description
    * This function converts from an ArrayBuffer to a hexadecimal string.
    * @example
    * var buffer = new ArrayBuffer(3);
    * var view = new DataView(buffer);
    * view.setUint8(0, 0xfa);
    * view.setUint8(1, 0xfb);
    * view.setUint8(2, 0x01);
    * ArrayBuffertohex(buffer) → "fafb01"
    */
  def apply(buffer: js.typedarray.ArrayBuffer): String = js.native
}
