package typingsSlinky.node.tlsMod

import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.Dict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetailedPeerCertificate extends PeerCertificate {
  
  var issuerCertificate: DetailedPeerCertificate = js.native
}
object DetailedPeerCertificate {
  
  @scala.inline
  def apply(
    exponent: String,
    ext_key_usage: js.Array[String],
    fingerprint: String,
    fingerprint256: String,
    infoAccess: Dict[js.Array[String]],
    issuer: Certificate,
    issuerCertificate: DetailedPeerCertificate,
    modulus: String,
    raw: Buffer,
    serialNumber: String,
    subject: Certificate,
    subjectaltname: String,
    valid_from: String,
    valid_to: String
  ): DetailedPeerCertificate = {
    val __obj = js.Dynamic.literal(exponent = exponent.asInstanceOf[js.Any], ext_key_usage = ext_key_usage.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], fingerprint256 = fingerprint256.asInstanceOf[js.Any], infoAccess = infoAccess.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], issuerCertificate = issuerCertificate.asInstanceOf[js.Any], modulus = modulus.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], subjectaltname = subjectaltname.asInstanceOf[js.Any], valid_from = valid_from.asInstanceOf[js.Any], valid_to = valid_to.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetailedPeerCertificate]
  }
  
  @scala.inline
  implicit class DetailedPeerCertificateMutableBuilder[Self <: DetailedPeerCertificate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIssuerCertificate(value: DetailedPeerCertificate): Self = StObject.set(x, "issuerCertificate", value.asInstanceOf[js.Any])
  }
}
