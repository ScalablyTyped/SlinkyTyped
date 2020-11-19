package typingsSlinky.asn1js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asn1js", "Utf8String")
@js.native
class Utf8String () extends BaseBlock[LocalUtf8StringValueBlock] {
  def this(params: Utf8StringParams) = this()
  
  /**
    * Function converting ArrayBuffer into ASN.1 internal string
    * 
    * @param {ArrayBuffer} inputBuffer ASN.1 BER encoded array
    * 
    * @memberOf Utf8String
    */
  def fromBuffer(inputBuffer: js.typedarray.ArrayBuffer): Unit = js.native
  
  /**
    * Function converting JavaScript string into ASN.1 internal class
    * 
    * @param {string} inputString ASN.1 BER encoded array
    * 
    * @memberOf Utf8String
    */
  def fromString(inputString: String): Unit = js.native
}
