package typingsSlinky.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateConfigRequest extends js.Object {
  /**
    * Parameters of a Config.
    */
  var configData: ConfigTypeData = js.native
  /**
    * UUID of a Config.
    */
  var configId: String = js.native
  /**
    * Type of a Config.
    */
  var configType: ConfigCapabilityType = js.native
  /**
    * Name of a Config.
    */
  var name: SafeName = js.native
}

object UpdateConfigRequest {
  @scala.inline
  def apply(configData: ConfigTypeData, configId: String, configType: ConfigCapabilityType, name: SafeName): UpdateConfigRequest = {
    val __obj = js.Dynamic.literal(configData = configData.asInstanceOf[js.Any], configId = configId.asInstanceOf[js.Any], configType = configType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConfigRequest]
  }
  @scala.inline
  implicit class UpdateConfigRequestOps[Self <: UpdateConfigRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigData(value: ConfigTypeData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfigId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfigType(value: ConfigCapabilityType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: SafeName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

