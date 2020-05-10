package typingsSlinky.pulumiAws.methodSettingsMod

import typingsSlinky.pulumiAws.inputMod.apigateway.MethodSettingsSettings
import typingsSlinky.pulumiAws.restApiMod.RestApi
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MethodSettingsArgs extends js.Object {
  /**
    * Method path defined as `{resource_path}/{http_method}` for an individual method override, or `*&#47;*` for overriding all methods in the stage.
    */
  val methodPath: Input[String] = js.native
  /**
    * The ID of the REST API
    */
  val restApi: Input[String | RestApi] = js.native
  /**
    * The settings block, see below.
    */
  val settings: Input[MethodSettingsSettings] = js.native
  /**
    * The name of the stage
    */
  val stageName: Input[String] = js.native
}

object MethodSettingsArgs {
  @scala.inline
  def apply(
    methodPath: Input[String],
    restApi: Input[String | RestApi],
    settings: Input[MethodSettingsSettings],
    stageName: Input[String]
  ): MethodSettingsArgs = {
    val __obj = js.Dynamic.literal(methodPath = methodPath.asInstanceOf[js.Any], restApi = restApi.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], stageName = stageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodSettingsArgs]
  }
  @scala.inline
  implicit class MethodSettingsArgsOps[Self <: MethodSettingsArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMethodPath(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methodPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRestApi(value: Input[String | RestApi]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restApi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSettings(value: Input[MethodSettingsSettings]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStageName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stageName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

