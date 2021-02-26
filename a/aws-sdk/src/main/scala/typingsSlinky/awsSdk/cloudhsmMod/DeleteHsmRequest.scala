package typingsSlinky.awsSdk.cloudhsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteHsmRequest extends StObject {
  
  /**
    * The ARN of the HSM to delete.
    */
  var HsmArn: typingsSlinky.awsSdk.cloudhsmMod.HsmArn = js.native
}
object DeleteHsmRequest {
  
  @scala.inline
  def apply(HsmArn: HsmArn): DeleteHsmRequest = {
    val __obj = js.Dynamic.literal(HsmArn = HsmArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteHsmRequest]
  }
  
  @scala.inline
  implicit class DeleteHsmRequestMutableBuilder[Self <: DeleteHsmRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHsmArn(value: HsmArn): Self = StObject.set(x, "HsmArn", value.asInstanceOf[js.Any])
  }
}
