package typingsSlinky.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResumeClusterResult extends StObject {
  
  var Cluster: js.UndefOr[typingsSlinky.awsSdk.redshiftMod.Cluster] = js.native
}
object ResumeClusterResult {
  
  @scala.inline
  def apply(): ResumeClusterResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResumeClusterResult]
  }
  
  @scala.inline
  implicit class ResumeClusterResultMutableBuilder[Self <: ResumeClusterResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCluster(value: Cluster): Self = StObject.set(x, "Cluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterUndefined: Self = StObject.set(x, "Cluster", js.undefined)
  }
}
