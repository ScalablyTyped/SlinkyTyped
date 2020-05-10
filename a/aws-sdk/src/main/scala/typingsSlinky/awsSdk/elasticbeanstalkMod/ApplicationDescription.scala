package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationDescription extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the application.
    */
  var ApplicationArn: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.ApplicationArn] = js.native
  /**
    * The name of the application.
    */
  var ApplicationName: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.ApplicationName] = js.native
  /**
    * The names of the configuration templates associated with this application.
    */
  var ConfigurationTemplates: js.UndefOr[ConfigurationTemplateNamesList] = js.native
  /**
    * The date when the application was created.
    */
  var DateCreated: js.UndefOr[js.Date] = js.native
  /**
    * The date when the application was last modified.
    */
  var DateUpdated: js.UndefOr[js.Date] = js.native
  /**
    * User-defined description of the application.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.Description] = js.native
  /**
    * The lifecycle settings for the application.
    */
  var ResourceLifecycleConfig: js.UndefOr[ApplicationResourceLifecycleConfig] = js.native
  /**
    * The names of the versions for this application.
    */
  var Versions: js.UndefOr[VersionLabelsList] = js.native
}

object ApplicationDescription {
  @scala.inline
  def apply(): ApplicationDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationDescription]
  }
  @scala.inline
  implicit class ApplicationDescriptionOps[Self <: ApplicationDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationArn(value: ApplicationArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationArn")(js.undefined)
        ret
    }
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
    def withConfigurationTemplates(value: ConfigurationTemplateNamesList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationTemplates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurationTemplates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationTemplates")(js.undefined)
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
    def withResourceLifecycleConfig(value: ApplicationResourceLifecycleConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceLifecycleConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceLifecycleConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceLifecycleConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withVersions(value: VersionLabelsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Versions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Versions")(js.undefined)
        ret
    }
  }
  
}

