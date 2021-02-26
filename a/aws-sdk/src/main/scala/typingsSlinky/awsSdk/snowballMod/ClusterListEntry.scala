package typingsSlinky.awsSdk.snowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterListEntry extends StObject {
  
  /**
    * The 39-character ID for the cluster that you want to list, for example CID123e4567-e89b-12d3-a456-426655440000.
    */
  var ClusterId: js.UndefOr[String] = js.native
  
  /**
    * The current state of this cluster. For information about the state of a specific node, see JobListEntry$JobState.
    */
  var ClusterState: js.UndefOr[typingsSlinky.awsSdk.snowballMod.ClusterState] = js.native
  
  /**
    * The creation date for this cluster.
    */
  var CreationDate: js.UndefOr[js.Date] = js.native
  
  /**
    * Defines an optional description of the cluster, for example Environmental Data Cluster-01.
    */
  var Description: js.UndefOr[String] = js.native
}
object ClusterListEntry {
  
  @scala.inline
  def apply(): ClusterListEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterListEntry]
  }
  
  @scala.inline
  implicit class ClusterListEntryMutableBuilder[Self <: ClusterListEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterId(value: String): Self = StObject.set(x, "ClusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterIdUndefined: Self = StObject.set(x, "ClusterId", js.undefined)
    
    @scala.inline
    def setClusterState(value: ClusterState): Self = StObject.set(x, "ClusterState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterStateUndefined: Self = StObject.set(x, "ClusterState", js.undefined)
    
    @scala.inline
    def setCreationDate(value: js.Date): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
  }
}
