package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhoneNumber extends js.Object {
  /**
    * The phone number associations.
    */
  var Associations: js.UndefOr[PhoneNumberAssociationList] = js.native
  /**
    * The outbound calling name associated with the phone number.
    */
  var CallingName: js.UndefOr[typingsSlinky.awsSdk.chimeMod.CallingName] = js.native
  /**
    * The outbound calling name status.
    */
  var CallingNameStatus: js.UndefOr[typingsSlinky.awsSdk.chimeMod.CallingNameStatus] = js.native
  /**
    * The phone number capabilities.
    */
  var Capabilities: js.UndefOr[PhoneNumberCapabilities] = js.native
  /**
    * The phone number creation timestamp, in ISO 8601 format.
    */
  var CreatedTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * The deleted phone number timestamp, in ISO 8601 format.
    */
  var DeletionTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * The phone number, in E.164 format.
    */
  var E164PhoneNumber: js.UndefOr[typingsSlinky.awsSdk.chimeMod.E164PhoneNumber] = js.native
  /**
    * The phone number ID.
    */
  var PhoneNumberId: js.UndefOr[String] = js.native
  /**
    * The phone number product type.
    */
  var ProductType: js.UndefOr[PhoneNumberProductType] = js.native
  /**
    * The phone number status.
    */
  var Status: js.UndefOr[PhoneNumberStatus] = js.native
  /**
    * The phone number type.
    */
  var Type: js.UndefOr[PhoneNumberType] = js.native
  /**
    * The updated phone number timestamp, in ISO 8601 format.
    */
  var UpdatedTimestamp: js.UndefOr[js.Date] = js.native
}

object PhoneNumber {
  @scala.inline
  def apply(): PhoneNumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhoneNumber]
  }
  @scala.inline
  implicit class PhoneNumberOps[Self <: PhoneNumber] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssociations(value: PhoneNumberAssociationList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Associations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Associations")(js.undefined)
        ret
    }
    @scala.inline
    def withCallingName(value: CallingName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CallingName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallingName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CallingName")(js.undefined)
        ret
    }
    @scala.inline
    def withCallingNameStatus(value: CallingNameStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CallingNameStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallingNameStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CallingNameStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withCapabilities(value: PhoneNumberCapabilities): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Capabilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapabilities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Capabilities")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withDeletionTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeletionTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeletionTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeletionTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withE164PhoneNumber(value: E164PhoneNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("E164PhoneNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutE164PhoneNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("E164PhoneNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withPhoneNumberId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PhoneNumberId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhoneNumberId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PhoneNumberId")(js.undefined)
        ret
    }
    @scala.inline
    def withProductType(value: PhoneNumberProductType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductType")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: PhoneNumberStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: PhoneNumberType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdatedTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdatedTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdatedTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdatedTimestamp")(js.undefined)
        ret
    }
  }
  
}

