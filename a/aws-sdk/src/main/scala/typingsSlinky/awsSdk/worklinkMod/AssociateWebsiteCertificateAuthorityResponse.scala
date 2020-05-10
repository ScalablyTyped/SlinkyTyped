package typingsSlinky.awsSdk.worklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateWebsiteCertificateAuthorityResponse extends js.Object {
  /**
    * A unique identifier for the CA.
    */
  var WebsiteCaId: js.UndefOr[Id] = js.native
}

object AssociateWebsiteCertificateAuthorityResponse {
  @scala.inline
  def apply(): AssociateWebsiteCertificateAuthorityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateWebsiteCertificateAuthorityResponse]
  }
  @scala.inline
  implicit class AssociateWebsiteCertificateAuthorityResponseOps[Self <: AssociateWebsiteCertificateAuthorityResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWebsiteCaId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebsiteCaId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebsiteCaId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebsiteCaId")(js.undefined)
        ret
    }
  }
  
}

