package typingsSlinky.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyDBClusterParameterGroupMessage extends StObject {
  
  /**
    * The name of the DB cluster parameter group to modify.
    */
  var DBClusterParameterGroupName: String = js.native
  
  /**
    * A list of parameters in the DB cluster parameter group to modify.
    */
  var Parameters: ParametersList = js.native
}
object ModifyDBClusterParameterGroupMessage {
  
  @scala.inline
  def apply(DBClusterParameterGroupName: String, Parameters: ParametersList): ModifyDBClusterParameterGroupMessage = {
    val __obj = js.Dynamic.literal(DBClusterParameterGroupName = DBClusterParameterGroupName.asInstanceOf[js.Any], Parameters = Parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyDBClusterParameterGroupMessage]
  }
  
  @scala.inline
  implicit class ModifyDBClusterParameterGroupMessageMutableBuilder[Self <: ModifyDBClusterParameterGroupMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBClusterParameterGroupName(value: String): Self = StObject.set(x, "DBClusterParameterGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameters(value: ParametersList): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersVarargs(value: Parameter*): Self = StObject.set(x, "Parameters", js.Array(value :_*))
  }
}
