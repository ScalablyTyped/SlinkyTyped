package typingsSlinky.asn1js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.asn1js.mod.ILocalHexBlock because var conflicts: isHexOnly, valueHex. Inlined 
- typingsSlinky.asn1js.mod.LocalHexBlock because Inheritance from two classes. Inlined isHexOnly, valueHex, fromBER, toBER, toBER, toJSON */ @JSImport("asn1js", "LocalUniversalStringValueBlock")
@js.native
class LocalUniversalStringValueBlock () extends LocalBaseBlock {
  def this(params: LocalUniversalStringValueParams) = this()
  
  /**
    * Base function for converting block from BER encoded array of bytes
    * 
    * @param {ArrayBuffer} inputBuffer ASN.1 BER encoded array
    * @param {number} inputOffset Offset in ASN.1 BER encoded array where decoding should be started
    * @param {number} inputLength Maximum length of array of bytes which can be using in this function
    * @returns {number} Offset after least decoded byte
    * 
    * @memberOf LocalHexBlockMixin
    */
  def fromBER(inputBuffer: js.typedarray.ArrayBuffer, inputOffset: Double, inputLength: Double): Double = js.native
  
  var isHexOnly: scala.Boolean = js.native
  
  /**
    * Encoding of current ASN.1 block into ASN.1 encoded array (BER rules)
    * 
    * @param {boolean} [sizeOnly=false] Flag that we need only a size of encoding, not a real array of bytes
    * @returns {ArrayBuffer}
    * 
    * @memberOf LocalHexBlockMixin
    */
  def toBER(): js.typedarray.ArrayBuffer = js.native
  def toBER(sizeOnly: scala.Boolean): js.typedarray.ArrayBuffer = js.native
  
  var value: String = js.native
  
  var valueHex: js.typedarray.ArrayBuffer = js.native
}
