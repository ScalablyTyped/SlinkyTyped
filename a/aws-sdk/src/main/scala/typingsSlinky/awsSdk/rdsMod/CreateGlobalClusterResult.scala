package typingsSlinky.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateGlobalClusterResult extends StObject {
  
  var GlobalCluster: js.UndefOr[typingsSlinky.awsSdk.rdsMod.GlobalCluster] = js.native
}
object CreateGlobalClusterResult {
  
  @scala.inline
  def apply(): CreateGlobalClusterResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateGlobalClusterResult]
  }
  
  @scala.inline
  implicit class CreateGlobalClusterResultMutableBuilder[Self <: CreateGlobalClusterResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGlobalCluster(value: GlobalCluster): Self = StObject.set(x, "GlobalCluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalClusterUndefined: Self = StObject.set(x, "GlobalCluster", js.undefined)
  }
}
