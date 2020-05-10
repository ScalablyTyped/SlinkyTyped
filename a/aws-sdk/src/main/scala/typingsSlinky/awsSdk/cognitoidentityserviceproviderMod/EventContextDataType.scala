package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventContextDataType extends js.Object {
  /**
    * The user's city.
    */
  var City: js.UndefOr[StringType] = js.native
  /**
    * The user's country.
    */
  var Country: js.UndefOr[StringType] = js.native
  /**
    * The user's device name.
    */
  var DeviceName: js.UndefOr[StringType] = js.native
  /**
    * The user's IP address.
    */
  var IpAddress: js.UndefOr[StringType] = js.native
  /**
    * The user's time zone.
    */
  var Timezone: js.UndefOr[StringType] = js.native
}

object EventContextDataType {
  @scala.inline
  def apply(): EventContextDataType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventContextDataType]
  }
  @scala.inline
  implicit class EventContextDataTypeOps[Self <: EventContextDataType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCity(value: StringType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("City")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("City")(js.undefined)
        ret
    }
    @scala.inline
    def withCountry(value: StringType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Country")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceName(value: StringType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceName")(js.undefined)
        ret
    }
    @scala.inline
    def withIpAddress(value: StringType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IpAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IpAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withTimezone(value: StringType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timezone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimezone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timezone")(js.undefined)
        ret
    }
  }
  
}

