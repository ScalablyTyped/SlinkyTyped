package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListProvisionedProductPlansInput extends js.Object {
  
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.AcceptLanguage] = js.native
  
  /**
    * The access level to use to obtain results. The default is User.
    */
  var AccessLevelFilter: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.AccessLevelFilter] = js.native
  
  /**
    * The maximum number of items to return with this call.
    */
  var PageSize: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.PageSize] = js.native
  
  /**
    * The page token for the next set of results. To retrieve the first set of results, use null.
    */
  var PageToken: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.PageToken] = js.native
  
  /**
    * The product identifier.
    */
  var ProvisionProductId: js.UndefOr[Id] = js.native
}
object ListProvisionedProductPlansInput {
  
  @scala.inline
  def apply(): ListProvisionedProductPlansInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProvisionedProductPlansInput]
  }
  
  @scala.inline
  implicit class ListProvisionedProductPlansInputOps[Self <: ListProvisionedProductPlansInput] (val x: Self) extends AnyVal {
    
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
    def setAcceptLanguage(value: AcceptLanguage): Self = this.set("AcceptLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcceptLanguage: Self = this.set("AcceptLanguage", js.undefined)
    
    @scala.inline
    def setAccessLevelFilter(value: AccessLevelFilter): Self = this.set("AccessLevelFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessLevelFilter: Self = this.set("AccessLevelFilter", js.undefined)
    
    @scala.inline
    def setPageSize(value: PageSize): Self = this.set("PageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageSize: Self = this.set("PageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: PageToken): Self = this.set("PageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageToken: Self = this.set("PageToken", js.undefined)
    
    @scala.inline
    def setProvisionProductId(value: Id): Self = this.set("ProvisionProductId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvisionProductId: Self = this.set("ProvisionProductId", js.undefined)
  }
}
