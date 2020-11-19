package typingsSlinky.jsrsasign.mod.KJUR.asn1.x509

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ASN.1 TBSCertificate structure class
  * @param params associative array of parameters (ex. {})
  * @example
  *  var o = new KJUR.asn1.x509.TBSCertificate();
  *  o.setSerialNumberByParam({'int': 4});
  *  o.setSignatureAlgByParam({'name': 'SHA1withRSA'});
  *  o.setIssuerByParam({'str': '/C=US/O=a'});
  *  o.setNotBeforeByParam({'str': '130504235959Z'});
  *  o.setNotAfterByParam({'str': '140504235959Z'});
  *  o.setSubjectByParam({'str': '/C=US/CN=b'});
  *  o.setSubjectPublicKey(rsaPubKey);
  *  o.appendExtension(new KJUR.asn1.x509.BasicConstraints({'cA':true}));
  *  o.appendExtension(new KJUR.asn1.x509.KeyUsage({'bin':'11'}));
  */
@JSImport("jsrsasign", "KJUR.asn1.x509.TBSCertificate")
@js.native
class TBSCertificate ()
  extends typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.x509.TBSCertificate
