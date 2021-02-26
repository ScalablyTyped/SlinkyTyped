package typingsSlinky.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteClusterSubnetGroupMessage extends StObject {
  
  /**
    * The name of the cluster subnet group name to be deleted.
    */
  var ClusterSubnetGroupName: String = js.native
}
object DeleteClusterSubnetGroupMessage {
  
  @scala.inline
  def apply(ClusterSubnetGroupName: String): DeleteClusterSubnetGroupMessage = {
    val __obj = js.Dynamic.literal(ClusterSubnetGroupName = ClusterSubnetGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteClusterSubnetGroupMessage]
  }
  
  @scala.inline
  implicit class DeleteClusterSubnetGroupMessageMutableBuilder[Self <: DeleteClusterSubnetGroupMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterSubnetGroupName(value: String): Self = StObject.set(x, "ClusterSubnetGroupName", value.asInstanceOf[js.Any])
  }
}
