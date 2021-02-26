package typingsSlinky.awsSdk.daxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteParameterGroupRequest extends StObject {
  
  /**
    * The name of the parameter group to delete.
    */
  var ParameterGroupName: String = js.native
}
object DeleteParameterGroupRequest {
  
  @scala.inline
  def apply(ParameterGroupName: String): DeleteParameterGroupRequest = {
    val __obj = js.Dynamic.literal(ParameterGroupName = ParameterGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParameterGroupRequest]
  }
  
  @scala.inline
  implicit class DeleteParameterGroupRequestMutableBuilder[Self <: DeleteParameterGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameterGroupName(value: String): Self = StObject.set(x, "ParameterGroupName", value.asInstanceOf[js.Any])
  }
}
