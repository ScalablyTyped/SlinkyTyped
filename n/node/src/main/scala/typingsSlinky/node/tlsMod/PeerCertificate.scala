package typingsSlinky.node.tlsMod

import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.Dict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PeerCertificate extends js.Object {
  var exponent: String = js.native
  var ext_key_usage: js.Array[String] = js.native
  var fingerprint: String = js.native
  var fingerprint256: String = js.native
  var infoAccess: Dict[js.Array[String]] = js.native
  var issuer: Certificate = js.native
  var modulus: String = js.native
  var raw: Buffer = js.native
  var serialNumber: String = js.native
  var subject: Certificate = js.native
  var subjectaltname: String = js.native
  var valid_from: String = js.native
  var valid_to: String = js.native
}

object PeerCertificate {
  @scala.inline
  def apply(
    exponent: String,
    ext_key_usage: js.Array[String],
    fingerprint: String,
    fingerprint256: String,
    infoAccess: Dict[js.Array[String]],
    issuer: Certificate,
    modulus: String,
    raw: Buffer,
    serialNumber: String,
    subject: Certificate,
    subjectaltname: String,
    valid_from: String,
    valid_to: String
  ): PeerCertificate = {
    val __obj = js.Dynamic.literal(exponent = exponent.asInstanceOf[js.Any], ext_key_usage = ext_key_usage.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], fingerprint256 = fingerprint256.asInstanceOf[js.Any], infoAccess = infoAccess.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], modulus = modulus.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], subjectaltname = subjectaltname.asInstanceOf[js.Any], valid_from = valid_from.asInstanceOf[js.Any], valid_to = valid_to.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeerCertificate]
  }
  @scala.inline
  implicit class PeerCertificateOps[Self <: PeerCertificate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExponent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExt_key_usage(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ext_key_usage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFingerprint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFingerprint256(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerprint256")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfoAccess(value: Dict[js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infoAccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIssuer(value: Certificate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModulus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modulus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRaw(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSerialNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubject(value: Certificate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubjectaltname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subjectaltname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValid_from(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valid_from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValid_to(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valid_to")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

