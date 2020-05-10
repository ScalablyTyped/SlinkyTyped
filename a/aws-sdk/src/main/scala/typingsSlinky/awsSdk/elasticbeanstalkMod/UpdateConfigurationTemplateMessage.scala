package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateConfigurationTemplateMessage extends js.Object {
  /**
    * The name of the application associated with the configuration template to update.  If no application is found with this name, UpdateConfigurationTemplate returns an InvalidParameterValue error. 
    */
  var ApplicationName: typingsSlinky.awsSdk.elasticbeanstalkMod.ApplicationName = js.native
  /**
    * A new description for the configuration.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.Description] = js.native
  /**
    * A list of configuration option settings to update with the new specified option value.
    */
  var OptionSettings: js.UndefOr[ConfigurationOptionSettingsList] = js.native
  /**
    * A list of configuration options to remove from the configuration set.  Constraint: You can remove only UserDefined configuration options. 
    */
  var OptionsToRemove: js.UndefOr[OptionsSpecifierList] = js.native
  /**
    * The name of the configuration template to update.  If no configuration template is found with this name, UpdateConfigurationTemplate returns an InvalidParameterValue error. 
    */
  var TemplateName: ConfigurationTemplateName = js.native
}

object UpdateConfigurationTemplateMessage {
  @scala.inline
  def apply(ApplicationName: ApplicationName, TemplateName: ConfigurationTemplateName): UpdateConfigurationTemplateMessage = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], TemplateName = TemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConfigurationTemplateMessage]
  }
  @scala.inline
  implicit class UpdateConfigurationTemplateMessageOps[Self <: UpdateConfigurationTemplateMessage] (val x: Self) extends AnyVal {
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
    def withTemplateName(value: ConfigurationTemplateName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: Description): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionSettings(value: ConfigurationOptionSettingsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptionSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptionSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptionSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionsToRemove(value: OptionsSpecifierList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptionsToRemove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptionsToRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptionsToRemove")(js.undefined)
        ret
    }
  }
  
}

