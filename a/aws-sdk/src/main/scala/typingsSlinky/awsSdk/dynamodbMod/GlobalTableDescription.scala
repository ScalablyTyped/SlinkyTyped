package typingsSlinky.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalTableDescription extends StObject {
  
  /**
    * The creation time of the global table.
    */
  var CreationDateTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The unique identifier of the global table.
    */
  var GlobalTableArn: js.UndefOr[GlobalTableArnString] = js.native
  
  /**
    * The global table name.
    */
  var GlobalTableName: js.UndefOr[TableName] = js.native
  
  /**
    * The current state of the global table:    CREATING - The global table is being created.    UPDATING - The global table is being updated.    DELETING - The global table is being deleted.    ACTIVE - The global table is ready for use.  
    */
  var GlobalTableStatus: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.GlobalTableStatus] = js.native
  
  /**
    * The Regions where the global table has replicas.
    */
  var ReplicationGroup: js.UndefOr[ReplicaDescriptionList] = js.native
}
object GlobalTableDescription {
  
  @scala.inline
  def apply(): GlobalTableDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalTableDescription]
  }
  
  @scala.inline
  implicit class GlobalTableDescriptionMutableBuilder[Self <: GlobalTableDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationDateTime(value: js.Date): Self = StObject.set(x, "CreationDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateTimeUndefined: Self = StObject.set(x, "CreationDateTime", js.undefined)
    
    @scala.inline
    def setGlobalTableArn(value: GlobalTableArnString): Self = StObject.set(x, "GlobalTableArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalTableArnUndefined: Self = StObject.set(x, "GlobalTableArn", js.undefined)
    
    @scala.inline
    def setGlobalTableName(value: TableName): Self = StObject.set(x, "GlobalTableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalTableNameUndefined: Self = StObject.set(x, "GlobalTableName", js.undefined)
    
    @scala.inline
    def setGlobalTableStatus(value: GlobalTableStatus): Self = StObject.set(x, "GlobalTableStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalTableStatusUndefined: Self = StObject.set(x, "GlobalTableStatus", js.undefined)
    
    @scala.inline
    def setReplicationGroup(value: ReplicaDescriptionList): Self = StObject.set(x, "ReplicationGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationGroupUndefined: Self = StObject.set(x, "ReplicationGroup", js.undefined)
    
    @scala.inline
    def setReplicationGroupVarargs(value: ReplicaDescription*): Self = StObject.set(x, "ReplicationGroup", js.Array(value :_*))
  }
}
