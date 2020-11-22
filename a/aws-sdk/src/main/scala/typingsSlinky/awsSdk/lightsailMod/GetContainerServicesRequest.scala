package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetContainerServicesRequest extends js.Object {
  
  /**
    * The name of the container service for which to return information. When omitted, the response includes all of your container services in the AWS Region where the request is made.
    */
  var serviceName: js.UndefOr[ContainerServiceName] = js.native
}
object GetContainerServicesRequest {
  
  @scala.inline
  def apply(): GetContainerServicesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetContainerServicesRequest]
  }
  
  @scala.inline
  implicit class GetContainerServicesRequestOps[Self <: GetContainerServicesRequest] (val x: Self) extends AnyVal {
    
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
    def setServiceName(value: ContainerServiceName): Self = this.set("serviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceName: Self = this.set("serviceName", js.undefined)
  }
}
