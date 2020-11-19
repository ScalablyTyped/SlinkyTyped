package typingsSlinky.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetConfigRequest extends js.Object {
  
  /**
    * UUID of a Config.
    */
  var configId: String = js.native
  
  /**
    * Type of a Config.
    */
  var configType: ConfigCapabilityType = js.native
}
object GetConfigRequest {
  
  @scala.inline
  def apply(configId: String, configType: ConfigCapabilityType): GetConfigRequest = {
    val __obj = js.Dynamic.literal(configId = configId.asInstanceOf[js.Any], configType = configType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConfigRequest]
  }
  
  @scala.inline
  implicit class GetConfigRequestOps[Self <: GetConfigRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConfigId(value: String): Self = this.set("configId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigType(value: ConfigCapabilityType): Self = this.set("configType", value.asInstanceOf[js.Any])
  }
}
