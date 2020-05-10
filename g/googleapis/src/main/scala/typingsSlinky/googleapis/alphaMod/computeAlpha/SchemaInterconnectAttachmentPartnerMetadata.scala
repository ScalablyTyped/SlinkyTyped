package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Informational metadata about Partner attachments from Partners to display
  * to customers. These fields are propagated from PARTNER_PROVIDER attachments
  * to their corresponding PARTNER attachments.
  */
@js.native
trait SchemaInterconnectAttachmentPartnerMetadata extends js.Object {
  /**
    * Plain text name of the Interconnect this attachment is connected to, as
    * displayed in the Partner?s portal. For instance &quot;Chicago 1&quot;.
    * This value may be validated to match approved Partner values.
    */
  var interconnectName: js.UndefOr[String] = js.native
  /**
    * Plain text name of the Partner providing this attachment. This value may
    * be validated to match approved Partner values.
    */
  var partnerName: js.UndefOr[String] = js.native
  /**
    * URL of the Partner?s portal for this Attachment. Partners may customise
    * this to be a deep-link to the specific resource on the Partner portal.
    * This value may be validated to match approved Partner values.
    */
  var portalUrl: js.UndefOr[String] = js.native
}

object SchemaInterconnectAttachmentPartnerMetadata {
  @scala.inline
  def apply(): SchemaInterconnectAttachmentPartnerMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInterconnectAttachmentPartnerMetadata]
  }
  @scala.inline
  implicit class SchemaInterconnectAttachmentPartnerMetadataOps[Self <: SchemaInterconnectAttachmentPartnerMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInterconnectName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interconnectName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterconnectName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interconnectName")(js.undefined)
        ret
    }
    @scala.inline
    def withPartnerName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partnerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartnerName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partnerName")(js.undefined)
        ret
    }
    @scala.inline
    def withPortalUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portalUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPortalUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portalUrl")(js.undefined)
        ret
    }
  }
  
}

