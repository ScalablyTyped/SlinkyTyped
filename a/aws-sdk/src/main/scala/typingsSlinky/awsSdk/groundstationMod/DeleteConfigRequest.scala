package typingsSlinky.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteConfigRequest extends js.Object {
  /**
    * UUID of a Config.
    */
  var configId: String = js.native
  /**
    * Type of a Config.
    */
  var configType: ConfigCapabilityType = js.native
}

object DeleteConfigRequest {
  @scala.inline
  def apply(configId: String, configType: ConfigCapabilityType): DeleteConfigRequest = {
    val __obj = js.Dynamic.literal(configId = configId.asInstanceOf[js.Any], configType = configType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteConfigRequest]
  }
  @scala.inline
  implicit class DeleteConfigRequestOps[Self <: DeleteConfigRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}

