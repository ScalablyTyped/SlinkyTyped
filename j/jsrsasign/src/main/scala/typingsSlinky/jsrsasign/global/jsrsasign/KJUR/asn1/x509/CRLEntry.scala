package typingsSlinky.jsrsasign.global.jsrsasign.KJUR.asn1.x509

import typingsSlinky.jsrsasign.anon.Sn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ASN.1 CRLEntry structure class for CRL
  * @param params associative array of parameters (ex. {})
  * @example
  * var e = new KJUR.asn1.x509.CRLEntry({'time': {'str': '130514235959Z'}, 'sn': {'int': 234}});
  *
  * // revokedCertificates     SEQUENCE OF SEQUENCE  {
  * //     userCertificate         CertificateSerialNumber,
  * //     revocationDate          Time,
  * //     crlEntryExtensions      Extensions OPTIONAL
  * //                             -- if present, version MUST be v2 }
  */
@JSGlobal("jsrsasign.KJUR.asn1.x509.CRLEntry")
@js.native
class CRLEntry ()
  extends typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.x509.CRLEntry {
  def this(params: Sn) = this()
}
