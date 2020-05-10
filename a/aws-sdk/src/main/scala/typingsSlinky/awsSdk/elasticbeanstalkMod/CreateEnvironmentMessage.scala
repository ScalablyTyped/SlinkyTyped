package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateEnvironmentMessage extends js.Object {
  /**
    * The name of the application that contains the version to be deployed.  If no application is found with this name, CreateEnvironment returns an InvalidParameterValue error. 
    */
  var ApplicationName: typingsSlinky.awsSdk.elasticbeanstalkMod.ApplicationName = js.native
  /**
    * If specified, the environment attempts to use this value as the prefix for the CNAME. If not specified, the CNAME is generated automatically by appending a random alphanumeric string to the environment name.
    */
  var CNAMEPrefix: js.UndefOr[DNSCnamePrefix] = js.native
  /**
    * Describes this environment.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.Description] = js.native
  /**
    * A unique name for the deployment environment. Used in the application URL. Constraint: Must be from 4 to 40 characters in length. The name can contain only letters, numbers, and hyphens. It cannot start or end with a hyphen. This name must be unique within a region in your account. If the specified name already exists in the region, AWS Elastic Beanstalk returns an InvalidParameterValue error.  Default: If the CNAME parameter is not specified, the environment name becomes part of the CNAME, and therefore part of the visible URL for your application.
    */
  var EnvironmentName: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.EnvironmentName] = js.native
  /**
    * The name of the group to which the target environment belongs. Specify a group name only if the environment's name is specified in an environment manifest and not with the environment name parameter. See Environment Manifest (env.yaml) for details.
    */
  var GroupName: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.GroupName] = js.native
  /**
    * If specified, AWS Elastic Beanstalk sets the specified configuration options to the requested value in the configuration set for the new environment. These override the values obtained from the solution stack or the configuration template.
    */
  var OptionSettings: js.UndefOr[ConfigurationOptionSettingsList] = js.native
  /**
    * A list of custom user-defined configuration options to remove from the configuration set for this new environment.
    */
  var OptionsToRemove: js.UndefOr[OptionsSpecifierList] = js.native
  /**
    * The ARN of the platform.
    */
  var PlatformArn: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.PlatformArn] = js.native
  /**
    * This is an alternative to specifying a template name. If specified, AWS Elastic Beanstalk sets the configuration values to the default values associated with the specified solution stack. For a list of current solution stacks, see Elastic Beanstalk Supported Platforms.
    */
  var SolutionStackName: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.SolutionStackName] = js.native
  /**
    * Specifies the tags applied to resources in the environment.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.Tags] = js.native
  /**
    *  The name of the configuration template to use in deployment. If no configuration template is found with this name, AWS Elastic Beanstalk returns an InvalidParameterValue error. 
    */
  var TemplateName: js.UndefOr[ConfigurationTemplateName] = js.native
  /**
    * This specifies the tier to use for creating this environment.
    */
  var Tier: js.UndefOr[EnvironmentTier] = js.native
  /**
    * The name of the application version to deploy.  If the specified application has no associated application versions, AWS Elastic Beanstalk UpdateEnvironment returns an InvalidParameterValue error.  Default: If not specified, AWS Elastic Beanstalk attempts to launch the sample application in the container.
    */
  var VersionLabel: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.VersionLabel] = js.native
}

object CreateEnvironmentMessage {
  @scala.inline
  def apply(ApplicationName: ApplicationName): CreateEnvironmentMessage = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEnvironmentMessage]
  }
  @scala.inline
  implicit class CreateEnvironmentMessageOps[Self <: CreateEnvironmentMessage] (val x: Self) extends AnyVal {
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
    def withCNAMEPrefix(value: DNSCnamePrefix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CNAMEPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCNAMEPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CNAMEPrefix")(js.undefined)
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
    def withGroupName(value: GroupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupName")(js.undefined)
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
    def withTags(value: Tags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
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
    @scala.inline
    def withTier(value: EnvironmentTier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tier")(js.undefined)
        ret
    }
    @scala.inline
    def withVersionLabel(value: VersionLabel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersionLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersionLabel")(js.undefined)
        ret
    }
  }
  
}

