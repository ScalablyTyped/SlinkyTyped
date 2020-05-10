package typingsSlinky.awsSdk.importexportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetShippingLabelInput extends js.Object {
  var APIVersion: js.UndefOr[APIVersion_] = js.native
  var city: js.UndefOr[typingsSlinky.awsSdk.importexportMod.city] = js.native
  var company: js.UndefOr[typingsSlinky.awsSdk.importexportMod.company] = js.native
  var country: js.UndefOr[typingsSlinky.awsSdk.importexportMod.country] = js.native
  var jobIds: JobIdList = js.native
  var name: js.UndefOr[typingsSlinky.awsSdk.importexportMod.name] = js.native
  var phoneNumber: js.UndefOr[typingsSlinky.awsSdk.importexportMod.phoneNumber] = js.native
  var postalCode: js.UndefOr[typingsSlinky.awsSdk.importexportMod.postalCode] = js.native
  var stateOrProvince: js.UndefOr[typingsSlinky.awsSdk.importexportMod.stateOrProvince] = js.native
  var street1: js.UndefOr[typingsSlinky.awsSdk.importexportMod.street1] = js.native
  var street2: js.UndefOr[typingsSlinky.awsSdk.importexportMod.street2] = js.native
  var street3: js.UndefOr[typingsSlinky.awsSdk.importexportMod.street3] = js.native
}

object GetShippingLabelInput {
  @scala.inline
  def apply(jobIds: JobIdList): GetShippingLabelInput = {
    val __obj = js.Dynamic.literal(jobIds = jobIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetShippingLabelInput]
  }
  @scala.inline
  implicit class GetShippingLabelInputOps[Self <: GetShippingLabelInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJobIds(value: JobIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAPIVersion(value: APIVersion_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("APIVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAPIVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("APIVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withCity(value: city): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("city")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("city")(js.undefined)
        ret
    }
    @scala.inline
    def withCompany(value: company): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("company")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompany: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("company")(js.undefined)
        ret
    }
    @scala.inline
    def withCountry(value: country): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPhoneNumber(value: phoneNumber): Self = {
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
    @scala.inline
    def withPostalCode(value: postalCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postalCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostalCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postalCode")(js.undefined)
        ret
    }
    @scala.inline
    def withStateOrProvince(value: stateOrProvince): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateOrProvince")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateOrProvince: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateOrProvince")(js.undefined)
        ret
    }
    @scala.inline
    def withStreet1(value: street1): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("street1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreet1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("street1")(js.undefined)
        ret
    }
    @scala.inline
    def withStreet2(value: street2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("street2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreet2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("street2")(js.undefined)
        ret
    }
    @scala.inline
    def withStreet3(value: street3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("street3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreet3: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("street3")(js.undefined)
        ret
    }
  }
  
}

