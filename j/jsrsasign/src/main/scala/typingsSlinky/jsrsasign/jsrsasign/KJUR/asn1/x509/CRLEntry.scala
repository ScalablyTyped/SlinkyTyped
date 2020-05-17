package typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.x509

import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object
import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.IntegerParam
import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.StringParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@js.native
trait CRLEntry extends ASN1Object {
  /**
    * set DERInteger parameter for serial number of revoked certificate
    * @param intParam DERInteger parameter for certificate serial number
    * @example
    * entry.setCertSerial({'int': 3});
    */
  def setCertSerial(intParam: IntegerParam): Unit = js.native
  /**
    * set Time parameter for revocation date
    * @param timeParam Time parameter for revocation date
    * @example
    * entry.setRevocationDate({'str': '130508235959Z'});
    */
  def setRevocationDate(timeParam: StringParam): Unit = js.native
}

object CRLEntry {
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
    setCertSerial: IntegerParam => Unit,
    setRevocationDate: StringParam => Unit
  ): CRLEntry = {
    val __obj = js.Dynamic.literal(getEncodedHex = js.Any.fromFunction0(getEncodedHex), getFreshValueHex = js.Any.fromFunction0(getFreshValueHex), getLengthHexFromValue = js.Any.fromFunction0(getLengthHexFromValue), getValueHex = js.Any.fromFunction0(getValueHex), hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], setCertSerial = js.Any.fromFunction1(setCertSerial), setRevocationDate = js.Any.fromFunction1(setRevocationDate))
    __obj.asInstanceOf[CRLEntry]
  }
  @scala.inline
  implicit class CRLEntryOps[Self <: CRLEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSetCertSerial(value: IntegerParam => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCertSerial")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetRevocationDate(value: StringParam => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRevocationDate")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

