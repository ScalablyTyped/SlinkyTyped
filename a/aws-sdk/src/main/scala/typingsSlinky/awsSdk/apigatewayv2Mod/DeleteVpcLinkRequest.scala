package typingsSlinky.awsSdk.apigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteVpcLinkRequest extends StObject {
  
  /**
    * The ID of the VPC link.
    */
  var VpcLinkId: string = js.native
}
object DeleteVpcLinkRequest {
  
  @scala.inline
  def apply(VpcLinkId: string): DeleteVpcLinkRequest = {
    val __obj = js.Dynamic.literal(VpcLinkId = VpcLinkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVpcLinkRequest]
  }
  
  @scala.inline
  implicit class DeleteVpcLinkRequestMutableBuilder[Self <: DeleteVpcLinkRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVpcLinkId(value: string): Self = StObject.set(x, "VpcLinkId", value.asInstanceOf[js.Any])
  }
}
