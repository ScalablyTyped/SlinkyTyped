package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Windows10TeamGeneralConfiguration extends DeviceConfiguration {
  // Indicates whether or not to Block Azure Operational Insights.
  var azureOperationalInsightsBlockTelemetry: js.UndefOr[Boolean] = js.native
  // The Azure Operational Insights workspace id.
  var azureOperationalInsightsWorkspaceId: js.UndefOr[String] = js.native
  // The Azure Operational Insights Workspace key.
  var azureOperationalInsightsWorkspaceKey: js.UndefOr[String] = js.native
  // Specifies whether to automatically launch the Connect app whenever a projection is initiated.
  var connectAppBlockAutoLaunch: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to Block setting a maintenance window for device updates.
  var maintenanceWindowBlocked: js.UndefOr[Boolean] = js.native
  // Maintenance window duration for device updates. Valid values 0 to 5
  var maintenanceWindowDurationInHours: js.UndefOr[Double] = js.native
  // Maintenance window start time for device updates.
  var maintenanceWindowStartTime: js.UndefOr[String] = js.native
  // Indicates whether or not to Block wireless projection.
  var miracastBlocked: js.UndefOr[Boolean] = js.native
  /**
    * The channel. Possible values are: userDefined, one, two, three, four, five, six, seven, eight, nine, ten, eleven,
    * thirtySix, forty, fortyFour, fortyEight, oneHundredFortyNine, oneHundredFiftyThree, oneHundredFiftySeven,
    * oneHundredSixtyOne, oneHundredSixtyFive.
    */
  var miracastChannel: js.UndefOr[MiracastChannel] = js.native
  // Indicates whether or not to require a pin for wireless projection.
  var miracastRequirePin: js.UndefOr[Boolean] = js.native
  /**
    * Specifies whether to disable the 'My meetings and files' feature in the Start menu, which shows the signed-in user's
    * meetings and files from Office 365.
    */
  var settingsBlockMyMeetingsAndFiles: js.UndefOr[Boolean] = js.native
  // Specifies whether to allow the ability to resume a session when the session times out.
  var settingsBlockSessionResume: js.UndefOr[Boolean] = js.native
  // Specifies whether to disable auto-populating of the sign-in dialog with invitees from scheduled meetings.
  var settingsBlockSigninSuggestions: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the default volume value for a new session. Permitted values are 0-100. The default is 45. Valid values 0 to
    * 100
    */
  var settingsDefaultVolume: js.UndefOr[Double] = js.native
  // Specifies the number of minutes until the Hub screen turns off.
  var settingsScreenTimeoutInMinutes: js.UndefOr[Double] = js.native
  // Specifies the number of minutes until the session times out.
  var settingsSessionTimeoutInMinutes: js.UndefOr[Double] = js.native
  // Specifies the number of minutes until the Hub enters sleep mode.
  var settingsSleepTimeoutInMinutes: js.UndefOr[Double] = js.native
  // The welcome screen background image URL. The URL must use the HTTPS protocol and return a PNG image.
  var welcomeScreenBackgroundImageUrl: js.UndefOr[String] = js.native
  // Indicates whether or not to Block the welcome screen from waking up automatically when someone enters the room.
  var welcomeScreenBlockAutomaticWakeUp: js.UndefOr[Boolean] = js.native
  /**
    * The welcome screen meeting information shown. Possible values are: userDefined, showOrganizerAndTimeOnly,
    * showOrganizerAndTimeAndSubject.
    */
  var welcomeScreenMeetingInformation: js.UndefOr[WelcomeScreenMeetingInformation] = js.native
}

object Windows10TeamGeneralConfiguration {
  @scala.inline
  def apply(): Windows10TeamGeneralConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Windows10TeamGeneralConfiguration]
  }
  @scala.inline
  implicit class Windows10TeamGeneralConfigurationOps[Self <: Windows10TeamGeneralConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAzureOperationalInsightsBlockTelemetry(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("azureOperationalInsightsBlockTelemetry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAzureOperationalInsightsBlockTelemetry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("azureOperationalInsightsBlockTelemetry")(js.undefined)
        ret
    }
    @scala.inline
    def withAzureOperationalInsightsWorkspaceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("azureOperationalInsightsWorkspaceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAzureOperationalInsightsWorkspaceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("azureOperationalInsightsWorkspaceId")(js.undefined)
        ret
    }
    @scala.inline
    def withAzureOperationalInsightsWorkspaceKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("azureOperationalInsightsWorkspaceKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAzureOperationalInsightsWorkspaceKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("azureOperationalInsightsWorkspaceKey")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectAppBlockAutoLaunch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectAppBlockAutoLaunch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectAppBlockAutoLaunch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectAppBlockAutoLaunch")(js.undefined)
        ret
    }
    @scala.inline
    def withMaintenanceWindowBlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maintenanceWindowBlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaintenanceWindowBlocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maintenanceWindowBlocked")(js.undefined)
        ret
    }
    @scala.inline
    def withMaintenanceWindowDurationInHours(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maintenanceWindowDurationInHours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaintenanceWindowDurationInHours: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maintenanceWindowDurationInHours")(js.undefined)
        ret
    }
    @scala.inline
    def withMaintenanceWindowStartTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maintenanceWindowStartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaintenanceWindowStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maintenanceWindowStartTime")(js.undefined)
        ret
    }
    @scala.inline
    def withMiracastBlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("miracastBlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMiracastBlocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("miracastBlocked")(js.undefined)
        ret
    }
    @scala.inline
    def withMiracastChannel(value: MiracastChannel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("miracastChannel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMiracastChannel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("miracastChannel")(js.undefined)
        ret
    }
    @scala.inline
    def withMiracastRequirePin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("miracastRequirePin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMiracastRequirePin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("miracastRequirePin")(js.undefined)
        ret
    }
    @scala.inline
    def withSettingsBlockMyMeetingsAndFiles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingsBlockMyMeetingsAndFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettingsBlockMyMeetingsAndFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingsBlockMyMeetingsAndFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withSettingsBlockSessionResume(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingsBlockSessionResume")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettingsBlockSessionResume: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingsBlockSessionResume")(js.undefined)
        ret
    }
    @scala.inline
    def withSettingsBlockSigninSuggestions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingsBlockSigninSuggestions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettingsBlockSigninSuggestions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingsBlockSigninSuggestions")(js.undefined)
        ret
    }
    @scala.inline
    def withSettingsDefaultVolume(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingsDefaultVolume")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettingsDefaultVolume: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingsDefaultVolume")(js.undefined)
        ret
    }
    @scala.inline
    def withSettingsScreenTimeoutInMinutes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingsScreenTimeoutInMinutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettingsScreenTimeoutInMinutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingsScreenTimeoutInMinutes")(js.undefined)
        ret
    }
    @scala.inline
    def withSettingsSessionTimeoutInMinutes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingsSessionTimeoutInMinutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettingsSessionTimeoutInMinutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingsSessionTimeoutInMinutes")(js.undefined)
        ret
    }
    @scala.inline
    def withSettingsSleepTimeoutInMinutes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingsSleepTimeoutInMinutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettingsSleepTimeoutInMinutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingsSleepTimeoutInMinutes")(js.undefined)
        ret
    }
    @scala.inline
    def withWelcomeScreenBackgroundImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("welcomeScreenBackgroundImageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWelcomeScreenBackgroundImageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("welcomeScreenBackgroundImageUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withWelcomeScreenBlockAutomaticWakeUp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("welcomeScreenBlockAutomaticWakeUp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWelcomeScreenBlockAutomaticWakeUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("welcomeScreenBlockAutomaticWakeUp")(js.undefined)
        ret
    }
    @scala.inline
    def withWelcomeScreenMeetingInformation(value: WelcomeScreenMeetingInformation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("welcomeScreenMeetingInformation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWelcomeScreenMeetingInformation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("welcomeScreenMeetingInformation")(js.undefined)
        ret
    }
  }
  
}

