package typingsSlinky.powerappsComponentFramework.ComponentFramework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * The entire property bag interface available to control via Context Object
	 */
@js.native
trait Context[TInputs] extends js.Object {
  var client: Client = js.native
  var device: Device = js.native
  var factory: Factory = js.native
  var formatting: Formatting = js.native
  var mode: Mode = js.native
  var navigation: Navigation = js.native
  var parameters: TInputs = js.native
  var resources: Resources = js.native
  var updatedProperties: js.Array[String] = js.native
  var userSettings: UserSettings = js.native
  var utils: Utility = js.native
  var webAPI: WebApi = js.native
}

object Context {
  @scala.inline
  def apply[TInputs](
    client: Client,
    device: Device,
    factory: Factory,
    formatting: Formatting,
    mode: Mode,
    navigation: Navigation,
    parameters: TInputs,
    resources: Resources,
    updatedProperties: js.Array[String],
    userSettings: UserSettings,
    utils: Utility,
    webAPI: WebApi
  ): Context[TInputs] = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any], factory = factory.asInstanceOf[js.Any], formatting = formatting.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], updatedProperties = updatedProperties.asInstanceOf[js.Any], userSettings = userSettings.asInstanceOf[js.Any], utils = utils.asInstanceOf[js.Any], webAPI = webAPI.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context[TInputs]]
  }
  @scala.inline
  implicit class ContextOps[Self[tinputs] <: Context[tinputs], TInputs] (val x: Self[TInputs]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TInputs] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TInputs]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TInputs] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TInputs] with Other]
    @scala.inline
    def withClient(value: Client): Self[TInputs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDevice(value: Device): Self[TInputs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFactory(value: Factory): Self[TInputs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormatting(value: Formatting): Self[TInputs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMode(value: Mode): Self[TInputs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNavigation(value: Navigation): Self[TInputs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParameters(value: TInputs): Self[TInputs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResources(value: Resources): Self[TInputs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdatedProperties(value: js.Array[String]): Self[TInputs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserSettings(value: UserSettings): Self[TInputs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUtils(value: Utility): Self[TInputs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utils")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebAPI(value: WebApi): Self[TInputs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webAPI")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

