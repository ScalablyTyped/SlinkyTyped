package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InterconnectAttachmentPartnerMetadata extends js.Object {
  
  /**
    * Plain text name of the Interconnect this attachment is connected to, as displayed in the Partner's portal. For instance "Chicago 1". This value may be validated to match approved
    * Partner values.
    */
  var interconnectName: js.UndefOr[String] = js.native
  
  /** Plain text name of the Partner providing this attachment. This value may be validated to match approved Partner values. */
  var partnerName: js.UndefOr[String] = js.native
  
  /**
    * URL of the Partner's portal for this Attachment. Partners may customise this to be a deep link to the specific resource on the Partner portal. This value may be validated to match
    * approved Partner values.
    */
  var portalUrl: js.UndefOr[String] = js.native
}
object InterconnectAttachmentPartnerMetadata {
  
  @scala.inline
  def apply(): InterconnectAttachmentPartnerMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InterconnectAttachmentPartnerMetadata]
  }
  
  @scala.inline
  implicit class InterconnectAttachmentPartnerMetadataOps[Self <: InterconnectAttachmentPartnerMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInterconnectName(value: String): Self = this.set("interconnectName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterconnectName: Self = this.set("interconnectName", js.undefined)
    
    @scala.inline
    def setPartnerName(value: String): Self = this.set("partnerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartnerName: Self = this.set("partnerName", js.undefined)
    
    @scala.inline
    def setPortalUrl(value: String): Self = this.set("portalUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePortalUrl: Self = this.set("portalUrl", js.undefined)
  }
}
