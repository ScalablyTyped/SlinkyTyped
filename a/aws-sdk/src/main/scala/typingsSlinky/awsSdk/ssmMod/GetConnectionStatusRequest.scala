package typingsSlinky.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetConnectionStatusRequest extends StObject {
  
  /**
    * The ID of the instance.
    */
  var Target: SessionTarget = js.native
}
object GetConnectionStatusRequest {
  
  @scala.inline
  def apply(Target: SessionTarget): GetConnectionStatusRequest = {
    val __obj = js.Dynamic.literal(Target = Target.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConnectionStatusRequest]
  }
  
  @scala.inline
  implicit class GetConnectionStatusRequestMutableBuilder[Self <: GetConnectionStatusRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTarget(value: SessionTarget): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
  }
}
