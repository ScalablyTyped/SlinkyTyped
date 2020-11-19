package typingsSlinky.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaAccountBusinessInformation extends js.Object {
  
  /**
    * The address of the business.
    */
  var address: js.UndefOr[SchemaAccountAddress] = js.native
  
  /**
    * The customer service information of the business.
    */
  var customerService: js.UndefOr[SchemaAccountCustomerService] = js.native
  
  /**
    * The phone number of the business.
    */
  var phoneNumber: js.UndefOr[String] = js.native
}
object SchemaAccountBusinessInformation {
  
  @scala.inline
  def apply(): SchemaAccountBusinessInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountBusinessInformation]
  }
  
  @scala.inline
  implicit class SchemaAccountBusinessInformationOps[Self <: SchemaAccountBusinessInformation] (val x: Self) extends AnyVal {
    
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
    def setAddress(value: SchemaAccountAddress): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    
    @scala.inline
    def setCustomerService(value: SchemaAccountCustomerService): Self = this.set("customerService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomerService: Self = this.set("customerService", js.undefined)
    
    @scala.inline
    def setPhoneNumber(value: String): Self = this.set("phoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhoneNumber: Self = this.set("phoneNumber", js.undefined)
  }
}
