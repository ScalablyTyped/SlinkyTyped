package typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.x509

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * BasicConstraints ASN.1 structure class
  * @param params associative array of parameters (ex. {'cA': true, 'critical': true})
  */
@js.native
trait BasicConstraints extends Extension {
  
  def getExtnValueHex(): String = js.native
}
object BasicConstraints {
  
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
    isModified: String
  ): BasicConstraints = {
    val __obj = js.Dynamic.literal(getEncodedHex = js.Any.fromFunction0(getEncodedHex), getExtnValueHex = js.Any.fromFunction0(getExtnValueHex), getFreshValueHex = js.Any.fromFunction0(getFreshValueHex), getLengthHexFromValue = js.Any.fromFunction0(getLengthHexFromValue), getValueHex = js.Any.fromFunction0(getValueHex), hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasicConstraints]
  }
  
  @scala.inline
  implicit class BasicConstraintsMutableBuilder[Self <: BasicConstraints] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetExtnValueHex(value: () => String): Self = StObject.set(x, "getExtnValueHex", js.Any.fromFunction0(value))
  }
}
