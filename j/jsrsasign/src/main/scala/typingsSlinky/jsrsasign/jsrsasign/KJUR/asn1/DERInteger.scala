package typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1

import typingsSlinky.jsrsasign.jsrsasign.BigInteger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * class for ASN.1 DER Integer
  * @description
  * As for argument 'params' for constructor, you can specify one of
  * following properties:
  *
  * - int - specify initial ASN.1 value(V) by integer value
  * - bigint - specify initial ASN.1 value(V) by BigInteger object
  * - hex - specify initial ASN.1 value(V) by a hexadecimal string
  *
  * NOTE: 'params' can be omitted.
  */
@js.native
trait DERInteger extends ASN1Object {
  
  /**
    * set value by Tom Wu's BigInteger object
    * @param bigIntegerValue to set
    */
  def setByBigInteger(bigIntegerValue: BigInteger): Unit = js.native
  
  /**
    * set value by integer value
    * @param integer value to set
    */
  def setByInteger(intValue: Double): Unit = js.native
  
  /**
    * set value by hex string
    * @param newHexString hexadecimal string of integer value
    * @description
    * NOTE: Value shall be represented by minimum octet length of
    * two's complement representation.
    * @example
    * new KJUR.asn1.DERInteger(123);
    * new KJUR.asn1.DERInteger({'int': 123});
    * new KJUR.asn1.DERInteger({'hex': '1fad'});
    */
  def setValueHex(newHexString: String): Unit = js.native
}
object DERInteger {
  
  @scala.inline
  def apply(
    getEncodedHex: () => String,
    getFreshValueHex: () => String,
    getLengthHexFromValue: () => String,
    getValueHex: () => String,
    hL: String,
    hT: String,
    hTLV: String,
    hV: String,
    isModified: String,
    setByBigInteger: BigInteger => Unit,
    setByInteger: Double => Unit,
    setValueHex: String => Unit
  ): DERInteger = {
    val __obj = js.Dynamic.literal(getEncodedHex = js.Any.fromFunction0(getEncodedHex), getFreshValueHex = js.Any.fromFunction0(getFreshValueHex), getLengthHexFromValue = js.Any.fromFunction0(getLengthHexFromValue), getValueHex = js.Any.fromFunction0(getValueHex), hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], setByBigInteger = js.Any.fromFunction1(setByBigInteger), setByInteger = js.Any.fromFunction1(setByInteger), setValueHex = js.Any.fromFunction1(setValueHex))
    __obj.asInstanceOf[DERInteger]
  }
  
  @scala.inline
  implicit class DERIntegerOps[Self <: DERInteger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSetByBigInteger(value: BigInteger => Unit): Self = this.set("setByBigInteger", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetByInteger(value: Double => Unit): Self = this.set("setByInteger", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetValueHex(value: String => Unit): Self = this.set("setValueHex", js.Any.fromFunction1(value))
  }
}
