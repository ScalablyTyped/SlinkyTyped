package typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.x509

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * GeneralName ASN.1 structure class
  * @description
  * As for argument 'params' for constructor, you can specify one of
  * following properties:
  *
  * - rfc822 - rfc822Name[1] (ex. user1@foo.com)
  * - dns - dNSName[2] (ex. foo.com)
  * - uri - uniformResourceIdentifier[6] (ex. http://foo.com/)
  * - dn - directoryName[4] (ex. /C=US/O=Test)
  * - ldapdn - directoryName[4] (ex. O=Test,C=US)
  * - certissuer - directoryName[4] (PEM or hex string of cert)
  * - certsubj - directoryName[4] (PEM or hex string of cert)
  *
  * NOTE1: certissuer and certsubj were supported since asn1x509 1.0.10.
  * NOTE2: dn and ldapdn were supported since jsrsasign 6.2.3 asn1x509 1.0.19.
  *
  * Here is definition of the ASN.1 syntax:
  * ```
  * -- NOTE: under the CHOICE, it will always be explicit.
  * GeneralName ::= CHOICE {
  *   otherName                  [0] OtherName,
  *   rfc822Name                 [1] IA5String,
  *   dNSName                    [2] IA5String,
  *   x400Address                [3] ORAddress,
  *   directoryName              [4] Name,
  *   ediPartyName               [5] EDIPartyName,
  *   uniformResourceIdentifier  [6] IA5String,
  *   iPAddress                  [7] OCTET STRING,
  *   registeredID               [8] OBJECT IDENTIFIER }
  * ```
  *
  * @example
  * gn = new KJUR.asn1.x509.GeneralName({rfc822:     'test@aaa.com'});
  * gn = new KJUR.asn1.x509.GeneralName({dns:        'aaa.com'});
  * gn = new KJUR.asn1.x509.GeneralName({uri:        'http://aaa.com/'});
  * gn = new KJUR.asn1.x509.GeneralName({dn:         '/C=US/O=Test'});
  * gn = new KJUR.asn1.x509.GeneralName({ldapdn:     'O=Test,C=US'});
  * gn = new KJUR.asn1.x509.GeneralName({certissuer: certPEM});
  * gn = new KJUR.asn1.x509.GeneralName({certsubj:   certPEM});
  */
@js.native
trait GeneralName extends StObject {
  
  def getEncodedHex(): String = js.native
  
  def setByParam(params: js.Array[String]): Unit = js.native
}
object GeneralName {
  
  @scala.inline
  def apply(getEncodedHex: () => String, setByParam: js.Array[String] => Unit): GeneralName = {
    val __obj = js.Dynamic.literal(getEncodedHex = js.Any.fromFunction0(getEncodedHex), setByParam = js.Any.fromFunction1(setByParam))
    __obj.asInstanceOf[GeneralName]
  }
  
  @scala.inline
  implicit class GeneralNameMutableBuilder[Self <: GeneralName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetEncodedHex(value: () => String): Self = StObject.set(x, "getEncodedHex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetByParam(value: js.Array[String] => Unit): Self = StObject.set(x, "setByParam", js.Any.fromFunction1(value))
  }
}
