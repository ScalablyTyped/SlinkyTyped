package typingsSlinky.maximMazurokGapiClientSasportal.gapi.client.sasportal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SasPortalCustomer extends js.Object {
  
  /** Required. Name of the organization that the customer entity represents. */
  var displayName: js.UndefOr[String] = js.native
  
  /** Output only. Resource name of the customer. */
  var name: js.UndefOr[String] = js.native
  
  /** User IDs used by the devices belonging to this customer. */
  var sasUserIds: js.UndefOr[js.Array[String]] = js.native
}
object SasPortalCustomer {
  
  @scala.inline
  def apply(): SasPortalCustomer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SasPortalCustomer]
  }
  
  @scala.inline
  implicit class SasPortalCustomerOps[Self <: SasPortalCustomer] (val x: Self) extends AnyVal {
    
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSasUserIdsVarargs(value: String*): Self = this.set("sasUserIds", js.Array(value :_*))
    
    @scala.inline
    def setSasUserIds(value: js.Array[String]): Self = this.set("sasUserIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSasUserIds: Self = this.set("sasUserIds", js.undefined)
  }
}
