package typingsSlinky.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisassociateVPCFromHostedZoneRequest extends StObject {
  
  /**
    *  Optional: A comment about the disassociation request.
    */
  var Comment: js.UndefOr[DisassociateVPCComment] = js.native
  
  /**
    * The ID of the private hosted zone that you want to disassociate a VPC from.
    */
  var HostedZoneId: ResourceId = js.native
  
  /**
    * A complex type that contains information about the VPC that you're disassociating from the specified hosted zone.
    */
  var VPC: typingsSlinky.awsSdk.route53Mod.VPC = js.native
}
object DisassociateVPCFromHostedZoneRequest {
  
  @scala.inline
  def apply(HostedZoneId: ResourceId, VPC: VPC): DisassociateVPCFromHostedZoneRequest = {
    val __obj = js.Dynamic.literal(HostedZoneId = HostedZoneId.asInstanceOf[js.Any], VPC = VPC.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateVPCFromHostedZoneRequest]
  }
  
  @scala.inline
  implicit class DisassociateVPCFromHostedZoneRequestMutableBuilder[Self <: DisassociateVPCFromHostedZoneRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComment(value: DisassociateVPCComment): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "Comment", js.undefined)
    
    @scala.inline
    def setHostedZoneId(value: ResourceId): Self = StObject.set(x, "HostedZoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVPC(value: VPC): Self = StObject.set(x, "VPC", value.asInstanceOf[js.Any])
  }
}
