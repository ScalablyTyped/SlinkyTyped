package typingsSlinky.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    def withAddress(value: SchemaAccountAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomerService(value: SchemaAccountCustomerService): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerService")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomerService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerService")(js.undefined)
        ret
    }
    @scala.inline
    def withPhoneNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhoneNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneNumber")(js.undefined)
        ret
    }
  }
  
}

