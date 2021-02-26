package typingsSlinky.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asn1js", "BmpString")
@js.native
class BmpString () extends BaseBlock[LocalBmpStringValueBlock] {
  def this(params: BmpStringParams) = this()
  
  /**
    * Function converting ArrayBuffer into ASN.1 internal string
    * 
    * @param {ArrayBuffer} inputBuffer ASN.1 BER encoded array
    * 
    * @memberOf BmpString
    */
  def fromBuffer(inputBuffer: js.typedarray.ArrayBuffer): Unit = js.native
  
  /**
    * Function converting JavaScript string into ASN.1 internal class
    * 
    * @param {string} inputString ASN.1 BER encoded array
    * 
    * @memberOf BmpString
    */
  def fromString(inputString: String): Unit = js.native
}
