package typingsSlinky.awsSdk.neptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDBClusterSnapshotMessage extends StObject {
  
  /**
    * The identifier of the DB cluster to create a snapshot for. This parameter is not case-sensitive. Constraints:   Must match the identifier of an existing DBCluster.   Example: my-cluster1 
    */
  var DBClusterIdentifier: String = js.native
  
  /**
    * The identifier of the DB cluster snapshot. This parameter is stored as a lowercase string. Constraints:   Must contain from 1 to 63 letters, numbers, or hyphens.   First character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.   Example: my-cluster1-snapshot1 
    */
  var DBClusterSnapshotIdentifier: String = js.native
  
  /**
    * The tags to be assigned to the DB cluster snapshot.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object CreateDBClusterSnapshotMessage {
  
  @scala.inline
  def apply(DBClusterIdentifier: String, DBClusterSnapshotIdentifier: String): CreateDBClusterSnapshotMessage = {
    val __obj = js.Dynamic.literal(DBClusterIdentifier = DBClusterIdentifier.asInstanceOf[js.Any], DBClusterSnapshotIdentifier = DBClusterSnapshotIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDBClusterSnapshotMessage]
  }
  
  @scala.inline
  implicit class CreateDBClusterSnapshotMessageMutableBuilder[Self <: CreateDBClusterSnapshotMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBClusterIdentifier(value: String): Self = StObject.set(x, "DBClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBClusterSnapshotIdentifier(value: String): Self = StObject.set(x, "DBClusterSnapshotIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
