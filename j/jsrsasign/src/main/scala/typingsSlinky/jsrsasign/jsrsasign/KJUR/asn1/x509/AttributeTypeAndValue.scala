package typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.x509

import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object
import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.DERIA5String
import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.DERPrintableString
import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.DERTeletexString
import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.DERUTF8String
import typingsSlinky.jsrsasign.jsrsasignStrings.ia5
import typingsSlinky.jsrsasign.jsrsasignStrings.prn
import typingsSlinky.jsrsasign.jsrsasignStrings.tel
import typingsSlinky.jsrsasign.jsrsasignStrings.utf8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * AttributeTypeAndValue ASN.1 structure class
  * @param params associative array of parameters (ex. {'str': 'C=US'})
  * @see KJUR.asn1.x509.X500Name
  * @see KJUR.asn1.x509.RDN
  * @see KJUR.asn1.x509.AttributeTypeAndValue
  */
@js.native
trait AttributeTypeAndValue extends ASN1Object {
  
  @JSName("getValueObj")
  def getValueObj_ia5(dsType: ia5, valueStr: String): DERIA5String = js.native
  @JSName("getValueObj")
  def getValueObj_prn(dsType: prn, valueStr: String): DERPrintableString = js.native
  @JSName("getValueObj")
  def getValueObj_tel(dsType: tel, valueStr: String): DERTeletexString = js.native
  @JSName("getValueObj")
  def getValueObj_utf8(dsType: utf8, valueStr: String): DERUTF8String = js.native
  
  def setByAttrTypeAndValueStr(shortAttrType: String, valueStr: String): Unit = js.native
  
  def setByString(attrTypeAndValueStr: String): Unit = js.native
}
