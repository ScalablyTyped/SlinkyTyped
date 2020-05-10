package typingsSlinky.gapiClientCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntryPoint extends js.Object {
  /**
    * The access code to access the conference. The maximum length is 128 characters.
    * When creating new conference data, populate only the subset of {meetingCode, accessCode, passcode, password, pin} fields that match the terminology
    * that the conference provider uses. Only the populated fields should be displayed.
    * Optional.
    */
  var accessCode: js.UndefOr[String] = js.native
  /**
    * Features of the entry point, such as being toll or toll-free. One entry point can have multiple features. However, toll and toll-free cannot be both
    * set on the same entry point.
    */
  var entryPointFeatures: js.UndefOr[js.Array[String]] = js.native
  /**
    * The type of the conference entry point.
    * Possible values are:
    * - "video" - joining a conference over HTTP. A conference can have zero or one video entry point.
    * - "phone" - joining a conference by dialing a phone number. A conference can have zero or more phone entry points.
    * - "sip" - joining a conference over SIP. A conference can have zero or one sip entry point.
    * - "more" - further conference joining instructions, for example additional phone numbers. A conference can have zero or one more entry point. A
    * conference with only a more entry point is not a valid conference.
    */
  var entryPointType: js.UndefOr[String] = js.native
  /**
    * The label for the URI. Visible to end users. Not localized. The maximum length is 512 characters.
    * Examples:
    * - for video: meet.google.com/aaa-bbbb-ccc
    * - for phone: +1 123 268 2601
    * - for sip: 12345678@altostrat.com
    * - for more: should not be filled
    * Optional.
    */
  var label: js.UndefOr[String] = js.native
  /**
    * The meeting code to access the conference. The maximum length is 128 characters.
    * When creating new conference data, populate only the subset of {meetingCode, accessCode, passcode, password, pin} fields that match the terminology
    * that the conference provider uses. Only the populated fields should be displayed.
    * Optional.
    */
  var meetingCode: js.UndefOr[String] = js.native
  /**
    * The passcode to access the conference. The maximum length is 128 characters.
    * When creating new conference data, populate only the subset of {meetingCode, accessCode, passcode, password, pin} fields that match the terminology
    * that the conference provider uses. Only the populated fields should be displayed.
    */
  var passcode: js.UndefOr[String] = js.native
  /**
    * The password to access the conference. The maximum length is 128 characters.
    * When creating new conference data, populate only the subset of {meetingCode, accessCode, passcode, password, pin} fields that match the terminology
    * that the conference provider uses. Only the populated fields should be displayed.
    * Optional.
    */
  var password: js.UndefOr[String] = js.native
  /**
    * The PIN to access the conference. The maximum length is 128 characters.
    * When creating new conference data, populate only the subset of {meetingCode, accessCode, passcode, password, pin} fields that match the terminology
    * that the conference provider uses. Only the populated fields should be displayed.
    * Optional.
    */
  var pin: js.UndefOr[String] = js.native
  /**
    * The CLDR/ISO 3166 region code for the country associated with this phone access. Example: "SE" for Sweden.
    * Calendar backend will populate this field only for EntryPointType.PHONE.
    */
  var regionCode: js.UndefOr[String] = js.native
  /**
    * The URI of the entry point. The maximum length is 1300 characters.
    * Format:
    * - for video, http: or https: schema is required.
    * - for phone, tel: schema is required. The URI should include the entire dial sequence (e.g., tel:+12345678900,,,123456789;1234).
    * - for sip, sip: schema is required, e.g., sip:12345678@myprovider.com.
    * - for more, http: or https: schema is required.
    */
  var uri: js.UndefOr[String] = js.native
}

object EntryPoint {
  @scala.inline
  def apply(): EntryPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntryPoint]
  }
  @scala.inline
  implicit class EntryPointOps[Self <: EntryPoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessCode")(js.undefined)
        ret
    }
    @scala.inline
    def withEntryPointFeatures(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entryPointFeatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntryPointFeatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entryPointFeatures")(js.undefined)
        ret
    }
    @scala.inline
    def withEntryPointType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entryPointType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntryPointType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entryPointType")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withMeetingCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meetingCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeetingCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meetingCode")(js.undefined)
        ret
    }
    @scala.inline
    def withPasscode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passcode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasscode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passcode")(js.undefined)
        ret
    }
    @scala.inline
    def withPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(js.undefined)
        ret
    }
    @scala.inline
    def withPin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pin")(js.undefined)
        ret
    }
    @scala.inline
    def withRegionCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regionCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegionCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regionCode")(js.undefined)
        ret
    }
    @scala.inline
    def withUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(js.undefined)
        ret
    }
  }
  
}

