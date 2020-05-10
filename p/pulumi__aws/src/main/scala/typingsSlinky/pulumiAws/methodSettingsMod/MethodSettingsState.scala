package typingsSlinky.pulumiAws.methodSettingsMod

import typingsSlinky.pulumiAws.inputMod.apigateway.MethodSettingsSettings
import typingsSlinky.pulumiAws.restApiMod.RestApi
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MethodSettingsState extends js.Object {
  /**
    * Method path defined as `{resource_path}/{http_method}` for an individual method override, or `*&#47;*` for overriding all methods in the stage.
    */
  val methodPath: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the REST API
    */
  val restApi: js.UndefOr[Input[String | RestApi]] = js.native
  /**
    * The settings block, see below.
    */
  val settings: js.UndefOr[Input[MethodSettingsSettings]] = js.native
  /**
    * The name of the stage
    */
  val stageName: js.UndefOr[Input[String]] = js.native
}

object MethodSettingsState {
  @scala.inline
  def apply(): MethodSettingsState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MethodSettingsState]
  }
  @scala.inline
  implicit class MethodSettingsStateOps[Self <: MethodSettingsState] (val x: Self) extends AnyVal {
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
    def withoutMethodPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methodPath")(js.undefined)
        ret
    }
    @scala.inline
    def withRestApi(value: Input[String | RestApi]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restApi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestApi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restApi")(js.undefined)
        ret
    }
    @scala.inline
    def withSettings(value: Input[MethodSettingsSettings]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(js.undefined)
        ret
    }
    @scala.inline
    def withStageName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stageName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStageName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stageName")(js.undefined)
        ret
    }
  }
  
}

