package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MacOSCustomConfiguration extends DeviceConfiguration {
  
  // Payload. (UTF8 encoded byte array)
  var payload: js.UndefOr[Double] = js.native
  
  // Payload file name (.mobileconfig
  var payloadFileName: js.UndefOr[NullableOption[String]] = js.native
  
  // Name that is displayed to the user.
  var payloadName: js.UndefOr[String] = js.native
}
object MacOSCustomConfiguration {
  
  @scala.inline
  def apply(): MacOSCustomConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MacOSCustomConfiguration]
  }
  
  @scala.inline
  implicit class MacOSCustomConfigurationOps[Self <: MacOSCustomConfiguration] (val x: Self) extends AnyVal {
    
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
    def setPayload(value: Double): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
    
    @scala.inline
    def setPayloadFileName(value: NullableOption[String]): Self = this.set("payloadFileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayloadFileName: Self = this.set("payloadFileName", js.undefined)
    
    @scala.inline
    def setPayloadFileNameNull: Self = this.set("payloadFileName", null)
    
    @scala.inline
    def setPayloadName(value: String): Self = this.set("payloadName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayloadName: Self = this.set("payloadName", js.undefined)
  }
}
