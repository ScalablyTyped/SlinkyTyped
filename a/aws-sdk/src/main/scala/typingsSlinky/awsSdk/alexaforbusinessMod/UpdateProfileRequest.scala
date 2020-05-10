package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateProfileRequest extends js.Object {
  /**
    * The updated address for the room profile.
    */
  var Address: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.Address] = js.native
  /**
    * The updated distance unit for the room profile.
    */
  var DistanceUnit: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.DistanceUnit] = js.native
  /**
    * Sets the profile as default if selected. If this is missing, no update is done to the default status.
    */
  var IsDefault: js.UndefOr[Boolean] = js.native
  /**
    * The updated locale for the room profile. (This is currently only available to a limited preview audience.)
    */
  var Locale: js.UndefOr[DeviceLocale] = js.native
  /**
    * The updated maximum volume limit for the room profile.
    */
  var MaxVolumeLimit: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.MaxVolumeLimit] = js.native
  /**
    * The updated meeting room settings of a room profile.
    */
  var MeetingRoomConfiguration: js.UndefOr[UpdateMeetingRoomConfiguration] = js.native
  /**
    * Whether the PSTN setting of the room profile is enabled.
    */
  var PSTNEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The ARN of the room profile to update. Required.
    */
  var ProfileArn: js.UndefOr[Arn] = js.native
  /**
    * The updated name for the room profile.
    */
  var ProfileName: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.ProfileName] = js.native
  /**
    * Whether the setup mode of the profile is enabled.
    */
  var SetupModeDisabled: js.UndefOr[Boolean] = js.native
  /**
    * The updated temperature unit for the room profile.
    */
  var TemperatureUnit: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.TemperatureUnit] = js.native
  /**
    * The updated timezone for the room profile.
    */
  var Timezone: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.Timezone] = js.native
  /**
    * The updated wake word for the room profile.
    */
  var WakeWord: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.WakeWord] = js.native
}

object UpdateProfileRequest {
  @scala.inline
  def apply(): UpdateProfileRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateProfileRequest]
  }
  @scala.inline
  implicit class UpdateProfileRequestOps[Self <: UpdateProfileRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: Address): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Address")(js.undefined)
        ret
    }
    @scala.inline
    def withDistanceUnit(value: DistanceUnit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DistanceUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistanceUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DistanceUnit")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsDefault")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: DeviceLocale): Self = {
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
    def withMaxVolumeLimit(value: MaxVolumeLimit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxVolumeLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxVolumeLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxVolumeLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withMeetingRoomConfiguration(value: UpdateMeetingRoomConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MeetingRoomConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeetingRoomConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MeetingRoomConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withPSTNEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PSTNEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPSTNEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PSTNEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withProfileArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProfileArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfileArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProfileArn")(js.undefined)
        ret
    }
    @scala.inline
    def withProfileName(value: ProfileName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProfileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfileName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProfileName")(js.undefined)
        ret
    }
    @scala.inline
    def withSetupModeDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetupModeDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetupModeDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetupModeDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withTemperatureUnit(value: TemperatureUnit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemperatureUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemperatureUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemperatureUnit")(js.undefined)
        ret
    }
    @scala.inline
    def withTimezone(value: Timezone): Self = {
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
    @scala.inline
    def withWakeWord(value: WakeWord): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WakeWord")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWakeWord: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WakeWord")(js.undefined)
        ret
    }
  }
  
}

