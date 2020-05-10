package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateApplicationVersionMessage extends js.Object {
  /**
    *  The name of the application. If no application is found with this name, and AutoCreateApplication is false, returns an InvalidParameterValue error. 
    */
  var ApplicationName: typingsSlinky.awsSdk.elasticbeanstalkMod.ApplicationName = js.native
  /**
    * Set to true to create an application with the specified name if it doesn't already exist.
    */
  var AutoCreateApplication: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.AutoCreateApplication] = js.native
  /**
    * Settings for an AWS CodeBuild build.
    */
  var BuildConfiguration: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.BuildConfiguration] = js.native
  /**
    * Describes this version.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.Description] = js.native
  /**
    * Pre-processes and validates the environment manifest (env.yaml) and configuration files (*.config files in the .ebextensions folder) in the source bundle. Validating configuration files can identify issues prior to deploying the application version to an environment. You must turn processing on for application versions that you create using AWS CodeBuild or AWS CodeCommit. For application versions built from a source bundle in Amazon S3, processing is optional.  The Process option validates Elastic Beanstalk configuration files. It doesn't validate your application's configuration files, like proxy server or Docker configuration. 
    */
  var Process: js.UndefOr[ApplicationVersionProccess] = js.native
  /**
    * Specify a commit in an AWS CodeCommit Git repository to use as the source code for the application version.
    */
  var SourceBuildInformation: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.SourceBuildInformation] = js.native
  /**
    * The Amazon S3 bucket and key that identify the location of the source bundle for this version.  The Amazon S3 bucket must be in the same region as the environment.  Specify a source bundle in S3 or a commit in an AWS CodeCommit repository (with SourceBuildInformation), but not both. If neither SourceBundle nor SourceBuildInformation are provided, Elastic Beanstalk uses a sample application.
    */
  var SourceBundle: js.UndefOr[S3Location] = js.native
  /**
    * Specifies the tags applied to the application version. Elastic Beanstalk applies these tags only to the application version. Environments that use the application version don't inherit the tags.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.Tags] = js.native
  /**
    * A label identifying this version. Constraint: Must be unique per application. If an application version already exists with this label for the specified application, AWS Elastic Beanstalk returns an InvalidParameterValue error. 
    */
  var VersionLabel: typingsSlinky.awsSdk.elasticbeanstalkMod.VersionLabel = js.native
}

object CreateApplicationVersionMessage {
  @scala.inline
  def apply(ApplicationName: ApplicationName, VersionLabel: VersionLabel): CreateApplicationVersionMessage = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], VersionLabel = VersionLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApplicationVersionMessage]
  }
  @scala.inline
  implicit class CreateApplicationVersionMessageOps[Self <: CreateApplicationVersionMessage] (val x: Self) extends AnyVal {
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
    def withVersionLabel(value: VersionLabel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersionLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoCreateApplication(value: AutoCreateApplication): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoCreateApplication")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoCreateApplication: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoCreateApplication")(js.undefined)
        ret
    }
    @scala.inline
    def withBuildConfiguration(value: BuildConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BuildConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuildConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BuildConfiguration")(js.undefined)
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
    def withProcess(value: ApplicationVersionProccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Process")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Process")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceBuildInformation(value: SourceBuildInformation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceBuildInformation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceBuildInformation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceBuildInformation")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceBundle(value: S3Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceBundle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceBundle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceBundle")(js.undefined)
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
  }
  
}

