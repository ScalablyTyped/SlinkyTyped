package typingsSlinky.chromeApps.chrome.networking.onc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertPattern extends js.Object {
  /**
    * List of URIs to which the user can be directed in case
    * no certificates that match this pattern are found.
    */
  var EnrollmentURI: js.UndefOr[js.Array[String]] = js.native
  /**
    * If set, pattern against which X.509 issuer settings should be matched.
    */
  var Issuer: js.UndefOr[IssuerSubjectPattern] = js.native
  /**
    * List of certificate issuer CA certificates.
    * A certificate must be signed by one of them in order to match this pattern.
    */
  var IssuerCARef: js.UndefOr[js.Array[String]] = js.native
  /**
    * If set, pattern against which X.509 subject settings should be matched.
    */
  var IssuerSubjectPattern: js.UndefOr[typingsSlinky.chromeApps.chrome.networking.onc.IssuerSubjectPattern] = js.native
}

object CertPattern {
  @scala.inline
  def apply(): CertPattern = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertPattern]
  }
  @scala.inline
  implicit class CertPatternOps[Self <: CertPattern] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnrollmentURI(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnrollmentURI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnrollmentURI: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnrollmentURI")(js.undefined)
        ret
    }
    @scala.inline
    def withIssuer(value: IssuerSubjectPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Issuer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIssuer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Issuer")(js.undefined)
        ret
    }
    @scala.inline
    def withIssuerCARef(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IssuerCARef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIssuerCARef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IssuerCARef")(js.undefined)
        ret
    }
    @scala.inline
    def withIssuerSubjectPattern(value: IssuerSubjectPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IssuerSubjectPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIssuerSubjectPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IssuerSubjectPattern")(js.undefined)
        ret
    }
  }
  
}

