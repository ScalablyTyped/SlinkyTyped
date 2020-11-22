package typingsSlinky.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddressInformationInput extends js.Object {
  
  /**
    * A complex type that contains the following information for the new account: `address1`, `address2`, `city`, `country`, `fax`, `phone`, `postalCode` and `stateOrProvince`.
    *
    * The maximum characters for the strings are:
    * * `address1`, `address2`, `city`, `country` and `stateOrProvince`: 100 characters
    * * `postalCode`, `phone`, and `fax`: 20 characters
    *
    * **Note:** If country is US (United States), `stateOrProvince` codes are validated. Otherwise, `stateOrProvince` is treated as a non-validated string used to specify a state,
    * province, or region.
    */
  var addressInformation: js.UndefOr[/* Contains address information. */ AddressInformation] = js.native
  
  /**
    * Specifies the display level for the recipient. Valid values are:
    * * `ReadOnly`
    * * `Editable`
    * * `DoNotDisplay`
    */
  var displayLevelCode: js.UndefOr[String] = js.native
  
  /**
    * A Boolean value that specifies whether the information must be returned in the response.
    */
  var receiveInResponse: js.UndefOr[String] = js.native
}
object AddressInformationInput {
  
  @scala.inline
  def apply(): AddressInformationInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddressInformationInput]
  }
  
  @scala.inline
  implicit class AddressInformationInputOps[Self <: AddressInformationInput] (val x: Self) extends AnyVal {
    
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
    def setAddressInformation(value: /* Contains address information. */ AddressInformation): Self = this.set("addressInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddressInformation: Self = this.set("addressInformation", js.undefined)
    
    @scala.inline
    def setDisplayLevelCode(value: String): Self = this.set("displayLevelCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayLevelCode: Self = this.set("displayLevelCode", js.undefined)
    
    @scala.inline
    def setReceiveInResponse(value: String): Self = this.set("receiveInResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReceiveInResponse: Self = this.set("receiveInResponse", js.undefined)
  }
}
