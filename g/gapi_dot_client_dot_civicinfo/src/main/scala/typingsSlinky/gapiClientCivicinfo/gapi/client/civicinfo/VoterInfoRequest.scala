package typingsSlinky.gapiClientCivicinfo.gapi.client.civicinfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VoterInfoRequest extends js.Object {
  
  var contextParams: js.UndefOr[ContextParams] = js.native
  
  var voterInfoSegmentResult: js.UndefOr[VoterInfoSegmentResult] = js.native
}
object VoterInfoRequest {
  
  @scala.inline
  def apply(): VoterInfoRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VoterInfoRequest]
  }
  
  @scala.inline
  implicit class VoterInfoRequestOps[Self <: VoterInfoRequest] (val x: Self) extends AnyVal {
    
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
    def setContextParams(value: ContextParams): Self = this.set("contextParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextParams: Self = this.set("contextParams", js.undefined)
    
    @scala.inline
    def setVoterInfoSegmentResult(value: VoterInfoSegmentResult): Self = this.set("voterInfoSegmentResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVoterInfoSegmentResult: Self = this.set("voterInfoSegmentResult", js.undefined)
  }
}
