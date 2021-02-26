package typingsSlinky.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteClusterParameterGroupMessage extends StObject {
  
  /**
    * The name of the parameter group to be deleted. Constraints:   Must be the name of an existing cluster parameter group.   Cannot delete a default cluster parameter group.  
    */
  var ParameterGroupName: String = js.native
}
object DeleteClusterParameterGroupMessage {
  
  @scala.inline
  def apply(ParameterGroupName: String): DeleteClusterParameterGroupMessage = {
    val __obj = js.Dynamic.literal(ParameterGroupName = ParameterGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteClusterParameterGroupMessage]
  }
  
  @scala.inline
  implicit class DeleteClusterParameterGroupMessageMutableBuilder[Self <: DeleteClusterParameterGroupMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameterGroupName(value: String): Self = StObject.set(x, "ParameterGroupName", value.asInstanceOf[js.Any])
  }
}
