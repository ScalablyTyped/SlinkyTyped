package typingsSlinky.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DemoteMasterContext extends StObject {
  
  /** This is always *sql#demoteMasterContext*. */
  var kind: js.UndefOr[String] = js.native
  
  /** The name of the instance which will act as on-premises primary instance in the replication setup. */
  var masterInstanceName: js.UndefOr[String] = js.native
  
  /** Configuration specific to read-replicas replicating from the on-premises primary instance. */
  var replicaConfiguration: js.UndefOr[DemoteMasterConfiguration] = js.native
  
  /**
    * Verify GTID consistency for demote operation. Default value: *True*. Second Generation instances only. Setting this flag to false enables you to bypass GTID consistency check
    * between on-premises primary instance and Cloud SQL instance during the demotion operation but also exposes you to the risk of future replication failures. Change the value only if
    * you know the reason for the GTID divergence and are confident that doing so will not cause any replication issues.
    */
  var verifyGtidConsistency: js.UndefOr[Boolean] = js.native
}
object DemoteMasterContext {
  
  @scala.inline
  def apply(): DemoteMasterContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DemoteMasterContext]
  }
  
  @scala.inline
  implicit class DemoteMasterContextMutableBuilder[Self <: DemoteMasterContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setMasterInstanceName(value: String): Self = StObject.set(x, "masterInstanceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterInstanceNameUndefined: Self = StObject.set(x, "masterInstanceName", js.undefined)
    
    @scala.inline
    def setReplicaConfiguration(value: DemoteMasterConfiguration): Self = StObject.set(x, "replicaConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicaConfigurationUndefined: Self = StObject.set(x, "replicaConfiguration", js.undefined)
    
    @scala.inline
    def setVerifyGtidConsistency(value: Boolean): Self = StObject.set(x, "verifyGtidConsistency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerifyGtidConsistencyUndefined: Self = StObject.set(x, "verifyGtidConsistency", js.undefined)
  }
}
