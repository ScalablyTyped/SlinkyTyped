package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPhoneNumberSettingsResponse extends js.Object {
  /**
    * The default outbound calling name for the account.
    */
  var CallingName: js.UndefOr[typingsSlinky.awsSdk.chimeMod.CallingName] = js.native
  /**
    * The updated outbound calling name timestamp, in ISO 8601 format.
    */
  var CallingNameUpdatedTimestamp: js.UndefOr[js.Date] = js.native
}

object GetPhoneNumberSettingsResponse {
  @scala.inline
  def apply(): GetPhoneNumberSettingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPhoneNumberSettingsResponse]
  }
  @scala.inline
  implicit class GetPhoneNumberSettingsResponseOps[Self <: GetPhoneNumberSettingsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withCallingNameUpdatedTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CallingNameUpdatedTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallingNameUpdatedTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CallingNameUpdatedTimestamp")(js.undefined)
        ret
    }
  }
  
}

