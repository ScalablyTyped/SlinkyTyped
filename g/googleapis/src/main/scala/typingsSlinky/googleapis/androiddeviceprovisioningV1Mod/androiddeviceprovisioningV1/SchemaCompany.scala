package typingsSlinky.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A reseller, vendor, or customer in the zero-touch reseller and customer
  * APIs.
  */
@js.native
trait SchemaCompany extends js.Object {
  
  /**
    * Input only. Optional. Email address of customer&#39;s users in the admin
    * role. Each email address must be associated with a Google Account.
    */
  var adminEmails: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Output only. The ID of the company. Assigned by the server.
    */
  var companyId: js.UndefOr[String] = js.native
  
  /**
    * Required. The name of the company. For example _XYZ Corp_. Displayed to
    * the company&#39;s employees in the zero-touch enrollment portal.
    */
  var companyName: js.UndefOr[String] = js.native
  
  /**
    * Output only. The API resource name of the company. The resource name is
    * one of the following formats:  *
    * `partners/[PARTNER_ID]/customers/[CUSTOMER_ID]` *
    * `partners/[PARTNER_ID]/vendors/[VENDOR_ID]` *
    * `partners/[PARTNER_ID]/vendors/[VENDOR_ID]/customers/[CUSTOMER_ID]`
    * Assigned by the server.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Input only. Email address of customer&#39;s users in the owner role. At
    * least one `owner_email` is required. Each email address must be
    * associated with a Google Account. Owners share the same access as admins
    * but can also add, delete, and edit your organization&#39;s portal users.
    */
  var ownerEmails: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Output only. Whether any user from the company has accepted the latest
    * Terms of Service (ToS). See TermsStatus.
    */
  var termsStatus: js.UndefOr[String] = js.native
}
object SchemaCompany {
  
  @scala.inline
  def apply(): SchemaCompany = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCompany]
  }
  
  @scala.inline
  implicit class SchemaCompanyOps[Self <: SchemaCompany] (val x: Self) extends AnyVal {
    
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
    def setAdminEmailsVarargs(value: String*): Self = this.set("adminEmails", js.Array(value :_*))
    
    @scala.inline
    def setAdminEmails(value: js.Array[String]): Self = this.set("adminEmails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdminEmails: Self = this.set("adminEmails", js.undefined)
    
    @scala.inline
    def setCompanyId(value: String): Self = this.set("companyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompanyId: Self = this.set("companyId", js.undefined)
    
    @scala.inline
    def setCompanyName(value: String): Self = this.set("companyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompanyName: Self = this.set("companyName", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOwnerEmailsVarargs(value: String*): Self = this.set("ownerEmails", js.Array(value :_*))
    
    @scala.inline
    def setOwnerEmails(value: js.Array[String]): Self = this.set("ownerEmails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerEmails: Self = this.set("ownerEmails", js.undefined)
    
    @scala.inline
    def setTermsStatus(value: String): Self = this.set("termsStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTermsStatus: Self = this.set("termsStatus", js.undefined)
  }
}
