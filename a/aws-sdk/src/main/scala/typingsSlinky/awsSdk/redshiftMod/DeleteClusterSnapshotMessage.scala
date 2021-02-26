package typingsSlinky.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteClusterSnapshotMessage extends StObject {
  
  /**
    * The unique identifier of the cluster the snapshot was created from. This parameter is required if your IAM user has a policy containing a snapshot resource element that specifies anything other than * for the cluster name. Constraints: Must be the name of valid cluster.
    */
  var SnapshotClusterIdentifier: js.UndefOr[String] = js.native
  
  /**
    * The unique identifier of the manual snapshot to be deleted. Constraints: Must be the name of an existing snapshot that is in the available, failed, or cancelled state.
    */
  var SnapshotIdentifier: String = js.native
}
object DeleteClusterSnapshotMessage {
  
  @scala.inline
  def apply(SnapshotIdentifier: String): DeleteClusterSnapshotMessage = {
    val __obj = js.Dynamic.literal(SnapshotIdentifier = SnapshotIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteClusterSnapshotMessage]
  }
  
  @scala.inline
  implicit class DeleteClusterSnapshotMessageMutableBuilder[Self <: DeleteClusterSnapshotMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSnapshotClusterIdentifier(value: String): Self = StObject.set(x, "SnapshotClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotClusterIdentifierUndefined: Self = StObject.set(x, "SnapshotClusterIdentifier", js.undefined)
    
    @scala.inline
    def setSnapshotIdentifier(value: String): Self = StObject.set(x, "SnapshotIdentifier", value.asInstanceOf[js.Any])
  }
}
