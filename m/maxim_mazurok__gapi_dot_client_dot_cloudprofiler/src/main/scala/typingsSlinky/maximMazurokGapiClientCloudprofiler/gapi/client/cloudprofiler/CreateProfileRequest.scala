package typingsSlinky.maximMazurokGapiClientCloudprofiler.gapi.client.cloudprofiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateProfileRequest extends js.Object {
  
  /** Deployment details. */
  var deployment: js.UndefOr[Deployment] = js.native
  
  /** One or more profile types that the agent is capable of providing. */
  var profileType: js.UndefOr[js.Array[String]] = js.native
}
object CreateProfileRequest {
  
  @scala.inline
  def apply(): CreateProfileRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateProfileRequest]
  }
  
  @scala.inline
  implicit class CreateProfileRequestOps[Self <: CreateProfileRequest] (val x: Self) extends AnyVal {
    
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
    def setDeployment(value: Deployment): Self = this.set("deployment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeployment: Self = this.set("deployment", js.undefined)
    
    @scala.inline
    def setProfileTypeVarargs(value: String*): Self = this.set("profileType", js.Array(value :_*))
    
    @scala.inline
    def setProfileType(value: js.Array[String]): Self = this.set("profileType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfileType: Self = this.set("profileType", js.undefined)
  }
}
