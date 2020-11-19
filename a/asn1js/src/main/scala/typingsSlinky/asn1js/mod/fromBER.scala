package typingsSlinky.asn1js.mod

import typingsSlinky.asn1js.anon.Offset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asn1js", "fromBER")
@js.native
object fromBER extends js.Object {
  
  /**
    * Major function for decoding ASN.1 BER array into internal library structuries
    * 
    * @param {ArrayBuffer} inputBuffer ASN.1 BER encoded array of bytes
    * @returns {{ offset: number; result: LocalBaseBlock }}
    */
  def apply(inputBuffer: js.typedarray.ArrayBuffer): Offset = js.native
}
