package typingsSlinky.awsSdk.opsworkscmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateNodeResponse extends StObject {
  
  /**
    * Contains a token which can be passed to the DescribeNodeAssociationStatus API call to get the status of the association request. 
    */
  var NodeAssociationStatusToken: js.UndefOr[typingsSlinky.awsSdk.opsworkscmMod.NodeAssociationStatusToken] = js.native
}
object AssociateNodeResponse {
  
  @scala.inline
  def apply(): AssociateNodeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateNodeResponse]
  }
  
  @scala.inline
  implicit class AssociateNodeResponseMutableBuilder[Self <: AssociateNodeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodeAssociationStatusToken(value: NodeAssociationStatusToken): Self = StObject.set(x, "NodeAssociationStatusToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeAssociationStatusTokenUndefined: Self = StObject.set(x, "NodeAssociationStatusToken", js.undefined)
  }
}
