package typingsSlinky.maximMazurokGapiClientIam.gapi.client.iam

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationsResource extends js.Object {
  
  var workloadIdentityPools: WorkloadIdentityPoolsResource = js.native
}
object LocationsResource {
  
  @scala.inline
  def apply(workloadIdentityPools: WorkloadIdentityPoolsResource): LocationsResource = {
    val __obj = js.Dynamic.literal(workloadIdentityPools = workloadIdentityPools.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationsResource]
  }
  
  @scala.inline
  implicit class LocationsResourceOps[Self <: LocationsResource] (val x: Self) extends AnyVal {
    
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
    def setWorkloadIdentityPools(value: WorkloadIdentityPoolsResource): Self = this.set("workloadIdentityPools", value.asInstanceOf[js.Any])
  }
}
