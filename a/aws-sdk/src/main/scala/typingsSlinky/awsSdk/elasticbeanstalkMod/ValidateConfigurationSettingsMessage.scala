package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidateConfigurationSettingsMessage extends js.Object {
  /**
    * The name of the application that the configuration template or environment belongs to.
    */
  var ApplicationName: typingsSlinky.awsSdk.elasticbeanstalkMod.ApplicationName = js.native
  /**
    * The name of the environment to validate the settings against. Condition: You cannot specify both this and a configuration template name.
    */
  var EnvironmentName: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.EnvironmentName] = js.native
  /**
    * A list of the options and desired values to evaluate.
    */
  var OptionSettings: ConfigurationOptionSettingsList = js.native
  /**
    * The name of the configuration template to validate the settings against. Condition: You cannot specify both this and an environment name.
    */
  var TemplateName: js.UndefOr[ConfigurationTemplateName] = js.native
}

object ValidateConfigurationSettingsMessage {
  @scala.inline
  def apply(ApplicationName: ApplicationName, OptionSettings: ConfigurationOptionSettingsList): ValidateConfigurationSettingsMessage = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], OptionSettings = OptionSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidateConfigurationSettingsMessage]
  }
  @scala.inline
  implicit class ValidateConfigurationSettingsMessageOps[Self <: ValidateConfigurationSettingsMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationName(value: ApplicationName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptionSettings(value: ConfigurationOptionSettingsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptionSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnvironmentName(value: EnvironmentName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnvironmentName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironmentName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnvironmentName")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateName(value: ConfigurationTemplateName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateName")(js.undefined)
        ret
    }
  }
  
}

