package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetVoiceConnectorOriginationResponse extends js.Object {
  
  /**
    * The origination setting details.
    */
  var Origination: js.UndefOr[typingsSlinky.awsSdk.chimeMod.Origination] = js.native
}
object GetVoiceConnectorOriginationResponse {
  
  @scala.inline
  def apply(): GetVoiceConnectorOriginationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVoiceConnectorOriginationResponse]
  }
  
  @scala.inline
  implicit class GetVoiceConnectorOriginationResponseOps[Self <: GetVoiceConnectorOriginationResponse] (val x: Self) extends AnyVal {
    
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
    def setOrigination(value: Origination): Self = this.set("Origination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrigination: Self = this.set("Origination", js.undefined)
  }
}
