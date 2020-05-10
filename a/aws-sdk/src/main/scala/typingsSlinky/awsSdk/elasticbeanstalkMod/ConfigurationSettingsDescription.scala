package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationSettingsDescription extends js.Object {
  /**
    * The name of the application associated with this configuration set.
    */
  var ApplicationName: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.ApplicationName] = js.native
  /**
    * The date (in UTC time) when this configuration set was created.
    */
  var DateCreated: js.UndefOr[js.Date] = js.native
  /**
    * The date (in UTC time) when this configuration set was last modified.
    */
  var DateUpdated: js.UndefOr[js.Date] = js.native
  /**
    *  If this configuration set is associated with an environment, the DeploymentStatus parameter indicates the deployment status of this configuration set:     null: This configuration is not associated with a running environment.    pending: This is a draft configuration that is not deployed to the associated environment but is in the process of deploying.    deployed: This is the configuration that is currently deployed to the associated running environment.    failed: This is a draft configuration that failed to successfully deploy.  
    */
  var DeploymentStatus: js.UndefOr[ConfigurationDeploymentStatus] = js.native
  /**
    * Describes this configuration set.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.Description] = js.native
  /**
    *  If not null, the name of the environment for this configuration set. 
    */
  var EnvironmentName: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.EnvironmentName] = js.native
  /**
    * A list of the configuration options and their values in this configuration set.
    */
  var OptionSettings: js.UndefOr[ConfigurationOptionSettingsList] = js.native
  /**
    * The ARN of the platform.
    */
  var PlatformArn: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.PlatformArn] = js.native
  /**
    * The name of the solution stack this configuration set uses.
    */
  var SolutionStackName: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.SolutionStackName] = js.native
  /**
    *  If not null, the name of the configuration template for this configuration set. 
    */
  var TemplateName: js.UndefOr[ConfigurationTemplateName] = js.native
}

object ConfigurationSettingsDescription {
  @scala.inline
  def apply(): ConfigurationSettingsDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationSettingsDescription]
  }
  @scala.inline
  implicit class ConfigurationSettingsDescriptionOps[Self <: ConfigurationSettingsDescription] (val x: Self) extends AnyVal {
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
    def withoutApplicationName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationName")(js.undefined)
        ret
    }
    @scala.inline
    def withDateCreated(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DateCreated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DateCreated")(js.undefined)
        ret
    }
    @scala.inline
    def withDateUpdated(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DateUpdated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DateUpdated")(js.undefined)
        ret
    }
    @scala.inline
    def withDeploymentStatus(value: ConfigurationDeploymentStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeploymentStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeploymentStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeploymentStatus")(js.undefined)
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
    def withPlatformArn(value: PlatformArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlatformArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatformArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlatformArn")(js.undefined)
        ret
    }
    @scala.inline
    def withSolutionStackName(value: SolutionStackName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SolutionStackName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSolutionStackName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SolutionStackName")(js.undefined)
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

