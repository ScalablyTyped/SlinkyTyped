package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Certificates associated with security profiles
  */
@js.native
trait CapabilityStatementRestSecurityCertificate extends BackboneElement {
  /**
    * Contains extended information for property 'blob'.
    */
  var _blob: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.native
  /**
    * Actual certificate
    */
  var blob: js.UndefOr[base64Binary] = js.native
  /**
    * Mime type for certificates
    */
  var `type`: js.UndefOr[code] = js.native
}

object CapabilityStatementRestSecurityCertificate {
  @scala.inline
  def apply(): CapabilityStatementRestSecurityCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CapabilityStatementRestSecurityCertificate]
  }
  @scala.inline
  implicit class CapabilityStatementRestSecurityCertificateOps[Self <: CapabilityStatementRestSecurityCertificate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_blob(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_blob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_blob: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_blob")(js.undefined)
        ret
    }
    @scala.inline
    def with_type(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_type")(js.undefined)
        ret
    }
    @scala.inline
    def withBlob(value: base64Binary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlob: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blob")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

