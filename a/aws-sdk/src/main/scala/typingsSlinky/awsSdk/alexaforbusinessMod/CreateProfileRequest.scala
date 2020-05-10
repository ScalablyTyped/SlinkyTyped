package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateProfileRequest extends js.Object {
  /**
    * The valid address for the room.
    */
  var Address: typingsSlinky.awsSdk.alexaforbusinessMod.Address = js.native
  /**
    * The user-specified token that is used during the creation of a profile.
    */
  var ClientRequestToken: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.ClientRequestToken] = js.native
  /**
    * The distance unit to be used by devices in the profile.
    */
  var DistanceUnit: typingsSlinky.awsSdk.alexaforbusinessMod.DistanceUnit = js.native
  /**
    * The locale of the room profile. (This is currently only available to a limited preview audience.)
    */
  var Locale: js.UndefOr[DeviceLocale] = js.native
  /**
    * The maximum volume limit for a room profile.
    */
  var MaxVolumeLimit: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.MaxVolumeLimit] = js.native
  /**
    * The meeting room settings of a room profile.
    */
  var MeetingRoomConfiguration: js.UndefOr[CreateMeetingRoomConfiguration] = js.native
  /**
    * Whether PSTN calling is enabled.
    */
  var PSTNEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The name of a room profile.
    */
  var ProfileName: typingsSlinky.awsSdk.alexaforbusinessMod.ProfileName = js.native
  /**
    * Whether room profile setup is enabled.
    */
  var SetupModeDisabled: js.UndefOr[Boolean] = js.native
  /**
    * The temperature unit to be used by devices in the profile.
    */
  var TemperatureUnit: typingsSlinky.awsSdk.alexaforbusinessMod.TemperatureUnit = js.native
  /**
    * The time zone used by a room profile.
    */
  var Timezone: typingsSlinky.awsSdk.alexaforbusinessMod.Timezone = js.native
  /**
    * A wake word for Alexa, Echo, Amazon, or a computer.
    */
  var WakeWord: typingsSlinky.awsSdk.alexaforbusinessMod.WakeWord = js.native
}

object CreateProfileRequest {
  @scala.inline
  def apply(
    Address: Address,
    DistanceUnit: DistanceUnit,
    ProfileName: ProfileName,
    TemperatureUnit: TemperatureUnit,
    Timezone: Timezone,
    WakeWord: WakeWord
  ): CreateProfileRequest = {
    val __obj = js.Dynamic.literal(Address = Address.asInstanceOf[js.Any], DistanceUnit = DistanceUnit.asInstanceOf[js.Any], ProfileName = ProfileName.asInstanceOf[js.Any], TemperatureUnit = TemperatureUnit.asInstanceOf[js.Any], Timezone = Timezone.asInstanceOf[js.Any], WakeWord = WakeWord.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProfileRequest]
  }
  @scala.inline
  implicit class CreateProfileRequestOps[Self <: CreateProfileRequest] (val x: Self) extends AnyVal {
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
    def withDistanceUnit(value: DistanceUnit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DistanceUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProfileName(value: ProfileName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProfileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemperatureUnit(value: TemperatureUnit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemperatureUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimezone(value: Timezone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timezone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWakeWord(value: WakeWord): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WakeWord")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientRequestToken(value: ClientRequestToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientRequestToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientRequestToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientRequestToken")(js.undefined)
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
    def withMeetingRoomConfiguration(value: CreateMeetingRoomConfiguration): Self = {
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
  }
  
}

