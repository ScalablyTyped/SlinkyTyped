package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationVersionDescription extends js.Object {
  /**
    * The name of the application to which the application version belongs.
    */
  var ApplicationName: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.ApplicationName] = js.native
  /**
    * The Amazon Resource Name (ARN) of the application version.
    */
  var ApplicationVersionArn: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.ApplicationVersionArn] = js.native
  /**
    * Reference to the artifact from the AWS CodeBuild build.
    */
  var BuildArn: js.UndefOr[String] = js.native
  /**
    * The creation date of the application version.
    */
  var DateCreated: js.UndefOr[js.Date] = js.native
  /**
    * The last modified date of the application version.
    */
  var DateUpdated: js.UndefOr[js.Date] = js.native
  /**
    * The description of the application version.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.Description] = js.native
  /**
    * If the version's source code was retrieved from AWS CodeCommit, the location of the source code for the application version.
    */
  var SourceBuildInformation: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.SourceBuildInformation] = js.native
  /**
    * The storage location of the application version's source bundle in Amazon S3.
    */
  var SourceBundle: js.UndefOr[S3Location] = js.native
  /**
    * The processing status of the application version. Reflects the state of the application version during its creation. Many of the values are only applicable if you specified True for the Process parameter of the CreateApplicationVersion action. The following list describes the possible values.    Unprocessed – Application version wasn't pre-processed or validated. Elastic Beanstalk will validate configuration files during deployment of the application version to an environment.    Processing – Elastic Beanstalk is currently processing the application version.    Building – Application version is currently undergoing an AWS CodeBuild build.    Processed – Elastic Beanstalk was successfully pre-processed and validated.    Failed – Either the AWS CodeBuild build failed or configuration files didn't pass validation. This application version isn't usable.  
    */
  var Status: js.UndefOr[ApplicationVersionStatus] = js.native
  /**
    * A unique identifier for the application version.
    */
  var VersionLabel: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.VersionLabel] = js.native
}

object ApplicationVersionDescription {
  @scala.inline
  def apply(): ApplicationVersionDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationVersionDescription]
  }
  @scala.inline
  implicit class ApplicationVersionDescriptionOps[Self <: ApplicationVersionDescription] (val x: Self) extends AnyVal {
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
    def withApplicationVersionArn(value: ApplicationVersionArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationVersionArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationVersionArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationVersionArn")(js.undefined)
        ret
    }
    @scala.inline
    def withBuildArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BuildArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuildArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BuildArn")(js.undefined)
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
    def withStatus(value: ApplicationVersionStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
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

