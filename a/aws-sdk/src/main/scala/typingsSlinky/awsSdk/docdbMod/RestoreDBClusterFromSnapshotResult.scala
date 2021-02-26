package typingsSlinky.awsSdk.docdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestoreDBClusterFromSnapshotResult extends StObject {
  
  var DBCluster: js.UndefOr[typingsSlinky.awsSdk.docdbMod.DBCluster] = js.native
}
object RestoreDBClusterFromSnapshotResult {
  
  @scala.inline
  def apply(): RestoreDBClusterFromSnapshotResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreDBClusterFromSnapshotResult]
  }
  
  @scala.inline
  implicit class RestoreDBClusterFromSnapshotResultMutableBuilder[Self <: RestoreDBClusterFromSnapshotResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBCluster(value: DBCluster): Self = StObject.set(x, "DBCluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBClusterUndefined: Self = StObject.set(x, "DBCluster", js.undefined)
  }
}
