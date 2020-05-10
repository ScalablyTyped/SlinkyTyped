package typingsSlinky.awsSdk.appconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConfigurationRequest extends js.Object {
  /**
    * The application to get. Specify either the application name or the application ID.
    */
  var Application: StringWithLengthBetween1And64 = js.native
  /**
    * The configuration version returned in the most recent GetConfiguration response.
    */
  var ClientConfigurationVersion: js.UndefOr[Version] = js.native
  /**
    * A unique ID to identify the client for the configuration. This ID enables AppConfig to deploy the configuration in intervals, as defined in the deployment strategy.
    */
  var ClientId: StringWithLengthBetween1And64 = js.native
  /**
    * The configuration to get. Specify either the configuration name or the configuration ID.
    */
  var Configuration: StringWithLengthBetween1And64 = js.native
  /**
    * The environment to get. Specify either the environment name or the environment ID.
    */
  var Environment: StringWithLengthBetween1And64 = js.native
}

object GetConfigurationRequest {
  @scala.inline
  def apply(
    Application: StringWithLengthBetween1And64,
    ClientId: StringWithLengthBetween1And64,
    Configuration: StringWithLengthBetween1And64,
    Environment: StringWithLengthBetween1And64
  ): GetConfigurationRequest = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], ClientId = ClientId.asInstanceOf[js.Any], Configuration = Configuration.asInstanceOf[js.Any], Environment = Environment.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConfigurationRequest]
  }
  @scala.inline
  implicit class GetConfigurationRequestOps[Self <: GetConfigurationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: StringWithLengthBetween1And64): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientId(value: StringWithLengthBetween1And64): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfiguration(value: StringWithLengthBetween1And64): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Configuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnvironment(value: StringWithLengthBetween1And64): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Environment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientConfigurationVersion(value: Version): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientConfigurationVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientConfigurationVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientConfigurationVersion")(js.undefined)
        ret
    }
  }
  
}

