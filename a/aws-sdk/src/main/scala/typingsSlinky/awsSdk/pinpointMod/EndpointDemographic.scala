package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointDemographic extends js.Object {
  /**
    * The version of the app that's associated with the endpoint.
    */
  var AppVersion: js.UndefOr[string] = js.native
  /**
    * The locale of the endpoint, in the following format: the ISO 639-1 alpha-2 code, followed by an underscore (_), followed by an ISO 3166-1 alpha-2 value.
    */
  var Locale: js.UndefOr[string] = js.native
  /**
    * The manufacturer of the endpoint device, such as apple or samsung.
    */
  var Make: js.UndefOr[string] = js.native
  /**
    * The model name or number of the endpoint device, such as iPhone or SM-G900F.
    */
  var Model: js.UndefOr[string] = js.native
  /**
    * The model version of the endpoint device.
    */
  var ModelVersion: js.UndefOr[string] = js.native
  /**
    * The platform of the endpoint device, such as ios.
    */
  var Platform: js.UndefOr[string] = js.native
  /**
    * The platform version of the endpoint device.
    */
  var PlatformVersion: js.UndefOr[string] = js.native
  /**
    * The time zone of the endpoint, specified as a tz database name value, such as America/Los_Angeles.
    */
  var Timezone: js.UndefOr[string] = js.native
}

object EndpointDemographic {
  @scala.inline
  def apply(): EndpointDemographic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointDemographic]
  }
  @scala.inline
  implicit class EndpointDemographicOps[Self <: EndpointDemographic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppVersion(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AppVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AppVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Locale")(js.undefined)
        ret
    }
    @scala.inline
    def withMake(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Make")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMake: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Make")(js.undefined)
        ret
    }
    @scala.inline
    def withModel(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Model")(js.undefined)
        ret
    }
    @scala.inline
    def withModelVersion(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModelVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModelVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModelVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatform(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Platform")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatformVersion(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlatformVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatformVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlatformVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withTimezone(value: string): Self = {
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

