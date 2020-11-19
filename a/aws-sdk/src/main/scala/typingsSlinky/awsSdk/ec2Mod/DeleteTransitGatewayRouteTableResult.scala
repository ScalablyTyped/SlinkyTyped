package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteTransitGatewayRouteTableResult extends js.Object {
  
  /**
    * Information about the deleted transit gateway route table.
    */
  var TransitGatewayRouteTable: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.TransitGatewayRouteTable] = js.native
}
object DeleteTransitGatewayRouteTableResult {
  
  @scala.inline
  def apply(): DeleteTransitGatewayRouteTableResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTransitGatewayRouteTableResult]
  }
  
  @scala.inline
  implicit class DeleteTransitGatewayRouteTableResultOps[Self <: DeleteTransitGatewayRouteTableResult] (val x: Self) extends AnyVal {
    
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
    def setTransitGatewayRouteTable(value: TransitGatewayRouteTable): Self = this.set("TransitGatewayRouteTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitGatewayRouteTable: Self = this.set("TransitGatewayRouteTable", js.undefined)
  }
}
