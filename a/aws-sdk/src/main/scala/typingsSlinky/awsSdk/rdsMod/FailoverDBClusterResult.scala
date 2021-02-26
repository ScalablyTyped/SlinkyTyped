package typingsSlinky.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FailoverDBClusterResult extends StObject {
  
  var DBCluster: js.UndefOr[typingsSlinky.awsSdk.rdsMod.DBCluster] = js.native
}
object FailoverDBClusterResult {
  
  @scala.inline
  def apply(): FailoverDBClusterResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailoverDBClusterResult]
  }
  
  @scala.inline
  implicit class FailoverDBClusterResultMutableBuilder[Self <: FailoverDBClusterResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBCluster(value: DBCluster): Self = StObject.set(x, "DBCluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBClusterUndefined: Self = StObject.set(x, "DBCluster", js.undefined)
  }
}
