package typingsSlinky.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBackendEnvironmentResult extends js.Object {
  
  /**
    *  Describes the backend environment for an Amplify app. 
    */
  var backendEnvironment: BackendEnvironment = js.native
}
object GetBackendEnvironmentResult {
  
  @scala.inline
  def apply(backendEnvironment: BackendEnvironment): GetBackendEnvironmentResult = {
    val __obj = js.Dynamic.literal(backendEnvironment = backendEnvironment.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBackendEnvironmentResult]
  }
  
  @scala.inline
  implicit class GetBackendEnvironmentResultOps[Self <: GetBackendEnvironmentResult] (val x: Self) extends AnyVal {
    
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
    def setBackendEnvironment(value: BackendEnvironment): Self = this.set("backendEnvironment", value.asInstanceOf[js.Any])
  }
}
