package typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.x509

import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.HexParam
import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.NameParam
import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.ObjectIdentifierParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * KeyUsage ASN.1 structure class
  * @param params associative array of parameters (ex. {'bin': '11', 'critical': true})
  */
@js.native
trait KeyUsage extends Extension {
  
  def getExtnValueHex(): String = js.native
  
  def setPurposeArray(purposeArray: js.Array[ObjectIdentifierParam | HexParam | NameParam]): Unit = js.native
}
object KeyUsage {
  
  @scala.inline
  def apply(
    getEncodedHex: () => String,
    getExtnValueHex: () => String,
    getFreshValueHex: () => String,
    getLengthHexFromValue: () => String,
    getValueHex: () => String,
    hL: String,
    hT: String,
    hTLV: String,
    hV: String,
    isModified: String,
    setPurposeArray: js.Array[ObjectIdentifierParam | HexParam | NameParam] => Unit
  ): KeyUsage = {
    val __obj = js.Dynamic.literal(getEncodedHex = js.Any.fromFunction0(getEncodedHex), getExtnValueHex = js.Any.fromFunction0(getExtnValueHex), getFreshValueHex = js.Any.fromFunction0(getFreshValueHex), getLengthHexFromValue = js.Any.fromFunction0(getLengthHexFromValue), getValueHex = js.Any.fromFunction0(getValueHex), hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], setPurposeArray = js.Any.fromFunction1(setPurposeArray))
    __obj.asInstanceOf[KeyUsage]
  }
  
  @scala.inline
  implicit class KeyUsageMutableBuilder[Self <: KeyUsage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetExtnValueHex(value: () => String): Self = StObject.set(x, "getExtnValueHex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetPurposeArray(value: js.Array[ObjectIdentifierParam | HexParam | NameParam] => Unit): Self = StObject.set(x, "setPurposeArray", js.Any.fromFunction1(value))
  }
}
