package typingsSlinky.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatePublicDnsNamespaceResponse extends js.Object {
  
  /**
    * A value that you can use to determine whether the request completed successfully. To get the status of the operation, see GetOperation.
    */
  var OperationId: js.UndefOr[typingsSlinky.awsSdk.servicediscoveryMod.OperationId] = js.native
}
object CreatePublicDnsNamespaceResponse {
  
  @scala.inline
  def apply(): CreatePublicDnsNamespaceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePublicDnsNamespaceResponse]
  }
  
  @scala.inline
  implicit class CreatePublicDnsNamespaceResponseOps[Self <: CreatePublicDnsNamespaceResponse] (val x: Self) extends AnyVal {
    
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
    def setOperationId(value: OperationId): Self = this.set("OperationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationId: Self = this.set("OperationId", js.undefined)
  }
}
