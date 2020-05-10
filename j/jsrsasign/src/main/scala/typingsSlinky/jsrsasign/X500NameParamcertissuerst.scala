package typingsSlinky.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined jsrsasign.jsrsasign.KJUR.asn1.x509.X500NameParam & {  certissuer ? :string,   certsubject ? :string} */
@js.native
trait X500NameParamcertissuerst extends js.Object {
  var C: String = js.native
  var CN: String = js.native
  var O: String = js.native
  var certissuer: js.UndefOr[String] = js.native
  var certsubject: js.UndefOr[String] = js.native
}

object X500NameParamcertissuerst {
  @scala.inline
  def apply(C: String, CN: String, O: String): X500NameParamcertissuerst = {
    val __obj = js.Dynamic.literal(C = C.asInstanceOf[js.Any], CN = CN.asInstanceOf[js.Any], O = O.asInstanceOf[js.Any])
    __obj.asInstanceOf[X500NameParamcertissuerst]
  }
  @scala.inline
  implicit class X500NameParamcertissuerstOps[Self <: X500NameParamcertissuerst] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withC(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("C")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCN(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withO(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("O")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCertissuer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certissuer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertissuer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certissuer")(js.undefined)
        ret
    }
    @scala.inline
    def withCertsubject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certsubject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertsubject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certsubject")(js.undefined)
        ret
    }
  }
  
}

