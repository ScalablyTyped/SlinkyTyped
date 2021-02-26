package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisassociateIamInstanceProfileRequest extends StObject {
  
  /**
    * The ID of the IAM instance profile association.
    */
  var AssociationId: IamInstanceProfileAssociationId = js.native
}
object DisassociateIamInstanceProfileRequest {
  
  @scala.inline
  def apply(AssociationId: IamInstanceProfileAssociationId): DisassociateIamInstanceProfileRequest = {
    val __obj = js.Dynamic.literal(AssociationId = AssociationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateIamInstanceProfileRequest]
  }
  
  @scala.inline
  implicit class DisassociateIamInstanceProfileRequestMutableBuilder[Self <: DisassociateIamInstanceProfileRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociationId(value: IamInstanceProfileAssociationId): Self = StObject.set(x, "AssociationId", value.asInstanceOf[js.Any])
  }
}
