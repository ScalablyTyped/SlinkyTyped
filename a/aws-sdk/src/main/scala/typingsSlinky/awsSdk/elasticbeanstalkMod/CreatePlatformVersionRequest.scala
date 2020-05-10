package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePlatformVersionRequest extends js.Object {
  /**
    * The name of the builder environment.
    */
  var EnvironmentName: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.EnvironmentName] = js.native
  /**
    * The configuration option settings to apply to the builder environment.
    */
  var OptionSettings: js.UndefOr[ConfigurationOptionSettingsList] = js.native
  /**
    * The location of the platform definition archive in Amazon S3.
    */
  var PlatformDefinitionBundle: S3Location = js.native
  /**
    * The name of your custom platform.
    */
  var PlatformName: typingsSlinky.awsSdk.elasticbeanstalkMod.PlatformName = js.native
  /**
    * The number, such as 1.0.2, for the new platform version.
    */
  var PlatformVersion: typingsSlinky.awsSdk.elasticbeanstalkMod.PlatformVersion = js.native
  /**
    * Specifies the tags applied to the new platform version. Elastic Beanstalk applies these tags only to the platform version. Environments that you create using the platform version don't inherit the tags.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.Tags] = js.native
}

object CreatePlatformVersionRequest {
  @scala.inline
  def apply(PlatformDefinitionBundle: S3Location, PlatformName: PlatformName, PlatformVersion: PlatformVersion): CreatePlatformVersionRequest = {
    val __obj = js.Dynamic.literal(PlatformDefinitionBundle = PlatformDefinitionBundle.asInstanceOf[js.Any], PlatformName = PlatformName.asInstanceOf[js.Any], PlatformVersion = PlatformVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePlatformVersionRequest]
  }
  @scala.inline
  implicit class CreatePlatformVersionRequestOps[Self <: CreatePlatformVersionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPlatformDefinitionBundle(value: S3Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlatformDefinitionBundle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlatformName(value: PlatformName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlatformName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlatformVersion(value: PlatformVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlatformVersion")(value.asInstanceOf[js.Any])
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

