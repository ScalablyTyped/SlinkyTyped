package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteTransitGatewayResult extends js.Object {
  
  /**
    * Information about the deleted transit gateway.
    */
  var TransitGateway: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.TransitGateway] = js.native
}
object DeleteTransitGatewayResult {
  
  @scala.inline
  def apply(): DeleteTransitGatewayResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTransitGatewayResult]
  }
  
  @scala.inline
  implicit class DeleteTransitGatewayResultOps[Self <: DeleteTransitGatewayResult] (val x: Self) extends AnyVal {
    
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
    def setTransitGateway(value: TransitGateway): Self = this.set("TransitGateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitGateway: Self = this.set("TransitGateway", js.undefined)
  }
}
