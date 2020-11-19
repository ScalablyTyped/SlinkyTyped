package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateVpcEndpointConnectionNotificationResult extends js.Object {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var ClientToken: js.UndefOr[String] = js.native
  
  /**
    * Information about the notification.
    */
  var ConnectionNotification: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.ConnectionNotification] = js.native
}
object CreateVpcEndpointConnectionNotificationResult {
  
  @scala.inline
  def apply(): CreateVpcEndpointConnectionNotificationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVpcEndpointConnectionNotificationResult]
  }
  
  @scala.inline
  implicit class CreateVpcEndpointConnectionNotificationResultOps[Self <: CreateVpcEndpointConnectionNotificationResult] (val x: Self) extends AnyVal {
    
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
    def setClientToken(value: String): Self = this.set("ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientToken: Self = this.set("ClientToken", js.undefined)
    
    @scala.inline
    def setConnectionNotification(value: ConnectionNotification): Self = this.set("ConnectionNotification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionNotification: Self = this.set("ConnectionNotification", js.undefined)
  }
}
