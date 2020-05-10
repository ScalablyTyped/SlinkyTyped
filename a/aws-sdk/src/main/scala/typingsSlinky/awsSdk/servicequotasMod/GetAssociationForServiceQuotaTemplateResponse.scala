package typingsSlinky.awsSdk.servicequotasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAssociationForServiceQuotaTemplateResponse extends js.Object {
  /**
    * Specifies whether the template is ASSOCIATED or DISASSOCIATED. If the template is ASSOCIATED, then it requests service quota increases for all new accounts created in your organization. 
    */
  var ServiceQuotaTemplateAssociationStatus: js.UndefOr[typingsSlinky.awsSdk.servicequotasMod.ServiceQuotaTemplateAssociationStatus] = js.native
}

object GetAssociationForServiceQuotaTemplateResponse {
  @scala.inline
  def apply(): GetAssociationForServiceQuotaTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAssociationForServiceQuotaTemplateResponse]
  }
  @scala.inline
  implicit class GetAssociationForServiceQuotaTemplateResponseOps[Self <: GetAssociationForServiceQuotaTemplateResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withServiceQuotaTemplateAssociationStatus(value: ServiceQuotaTemplateAssociationStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceQuotaTemplateAssociationStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceQuotaTemplateAssociationStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceQuotaTemplateAssociationStatus")(js.undefined)
        ret
    }
  }
  
}

