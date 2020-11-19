package typingsSlinky.devtoolsProtocol.mod.Protocol.Memory

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSamplingProfileResponse extends js.Object {
  
  var profile: SamplingProfile = js.native
}
object GetSamplingProfileResponse {
  
  @scala.inline
  def apply(profile: SamplingProfile): GetSamplingProfileResponse = {
    val __obj = js.Dynamic.literal(profile = profile.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSamplingProfileResponse]
  }
  
  @scala.inline
  implicit class GetSamplingProfileResponseOps[Self <: GetSamplingProfileResponse] (val x: Self) extends AnyVal {
    
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
    def setProfile(value: SamplingProfile): Self = this.set("profile", value.asInstanceOf[js.Any])
  }
}
