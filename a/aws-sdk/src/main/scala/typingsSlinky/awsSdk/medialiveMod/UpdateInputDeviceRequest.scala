package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateInputDeviceRequest extends js.Object {
  
  /**
    * The settings that you want to apply to the input device.
    */
  var HdDeviceSettings: js.UndefOr[InputDeviceConfigurableSettings] = js.native
  
  /**
    * The unique ID of the input device. For example, hd-123456789abcdef.
    */
  var InputDeviceId: string = js.native
  
  /**
    * The name that you assigned to this input device (not the unique ID).
    */
  var Name: js.UndefOr[string] = js.native
}
object UpdateInputDeviceRequest {
  
  @scala.inline
  def apply(InputDeviceId: string): UpdateInputDeviceRequest = {
    val __obj = js.Dynamic.literal(InputDeviceId = InputDeviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateInputDeviceRequest]
  }
  
  @scala.inline
  implicit class UpdateInputDeviceRequestOps[Self <: UpdateInputDeviceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInputDeviceId(value: string): Self = this.set("InputDeviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHdDeviceSettings(value: InputDeviceConfigurableSettings): Self = this.set("HdDeviceSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHdDeviceSettings: Self = this.set("HdDeviceSettings", js.undefined)
    
    @scala.inline
    def setName(value: string): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
}
